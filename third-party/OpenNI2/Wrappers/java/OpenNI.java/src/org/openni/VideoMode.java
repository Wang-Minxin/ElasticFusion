package org.openni;

/**
 * <p>
 * Encapsulates a group of settings for a {@link VideoStream}. Settings stored include frame rate,
 * resolution, and pixel format.
 * </p>
 * 
 * <p>
 * This class is used as an input for changing the settings of a {@link VideoStream}, as well as an
 * output for reporting the current settings of that class. It is also used by {@link SensorInfo} to
 * report available video modes of a stream.
 * </p>
 * 
 * <p>
 * Recommended practice is to use {@link org.openni.SensorInfo#getSupportedVideoModes()} to obtain a
 * list of valid video modes, and then to use items from that list to pass new settings to
 * {@link VideoStream}. This is much less likely to produce an invalid video mode than instantiating
 * and manually changing objects of this class.
 * </p>
 */
public class VideoMode {
  /**
   * Default constructor, creates an empty VideoMode object. Application programs should, in most
   * cases, use the copy constructor to copy an existing valid video mode. This is much less error
   * prone that creating and attempting to configure a new VideoMode from scratch.
   */
  public VideoMode() {
    this.mResolutionX = 0;
    this.mResolutionY = 0;
    this.mFps = 0;
  }

  public VideoMode(int resX, int resY, int fps, int pixelFormat) {
    this.mResolutionX = resX;
    this.mResolutionY = resY;
    this.mFps = fps;
    this.mPixelFormat = PixelFormat.fromNative(pixelFormat);
  }

  /**
   * Getter function for the pixel format of this VideoMode.
   * 
   * @return Current pixel format setting of this VideoMode.
   */
  public PixelFormat getPixelFormat() {
    return mPixelFormat;
  }

  /**
   * Getter function for the X resolution of this VideoMode.
   * 
   * @return Current horizontal resolution of this VideoMode, in pixels.
   */
  public int getResolutionX() {
    return mResolutionX;
  }

  /**
   * Getter function for the Y resolution of this VideoMode.
   * 
   * @return Current vertical resolution of this VideoMode, in pixels.
   */
  public int getResolutionY() {
    return mResolutionY;
  }

  /**
   * Getter function for the frame rate of this VideoMode.
   * 
   * @return Current frame rate, measured in frames per second.
   */
  public int getFps() {
    return mFps;
  }

  /**
   * Setter function for the pixel format of this VideoMode. Application use of this function is not
   * recommended. Instead, use {@link org.openni.SensorInfo#getSupportedVideoModes()} to obtain a
   * list of valid video modes.
   * 
   * @param format Desired new pixel format for this VideoMode.
   */
  public void setPixelFormat(PixelFormat format) {
    this.mPixelFormat = format;
  }

  /**
   * Setter function for the resolution of this VideoMode. Application use of this function is not
   * recommended. Instead, use {@link org.openni.SensorInfo#getSupportedVideoModes()} to obtain a
   * list of valid video modes.
   * 
   * @param resolutionX Desired new horizontal resolution in pixels.
   * @param resolutionY Desired new vertical resolution in pixels.
   */
  public void setResolution(int resolutionX, int resolutionY) {
    this.mResolutionX = resolutionX;
    this.mResolutionY = resolutionY;
  }

  /**
   * Setter function for the frame rate. Application use of this function is not recommended.
   * Instead, use {@link org.openni.SensorInfo#getSupportedVideoModes()} to obtain a list of valid
   * video modes.
   * 
   * @param fps Desired new frame rate, measured in frames per second.
   */
  public void setFps(int fps) {
    this.mFps = fps;
  }

  private int mFps;
  private int mResolutionX, mResolutionY;
  private PixelFormat mPixelFormat;

}
