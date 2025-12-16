package org.webrtc;

import android.hardware.Camera;
import android.os.SystemClock;
import androidx.camera.camera2.internal.G;
import j.P;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes9.dex */
public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator() {
        this(true);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i12) {
        int i13;
        Logging.d(TAG, "Get supported formats for camera index " + i12 + ".");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Camera cameraOpen = null;
        try {
            try {
                Logging.d(TAG, "Opening camera with index " + i12);
                cameraOpen = Camera.open(i12);
                Camera.Parameters parameters = cameraOpen.getParameters();
                cameraOpen.release();
                ArrayList arrayList = new ArrayList();
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i14 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i14 = iArr[0];
                        i13 = iArr[1];
                    } else {
                        i13 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i14, i13));
                    }
                } catch (Exception e12) {
                    Logging.e(TAG, "getSupportedFormats() failed on camera index " + i12, e12);
                }
                Logging.d(TAG, "Get supported formats for camera index " + i12 + " done. Time spent: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms.");
                return arrayList;
            } catch (RuntimeException e13) {
                Logging.e(TAG, "Open camera failed on camera index " + i12, e13);
                ArrayList arrayList2 = new ArrayList();
                if (cameraOpen != null) {
                    cameraOpen.release();
                }
                return arrayList2;
            }
        } catch (Throwable th2) {
            if (cameraOpen != null) {
                cameraOpen.release();
            }
            throw th2;
        }
    }

    public static int getCameraIndex(String str) {
        Logging.d(TAG, "getCameraIndex: " + str);
        for (int i12 = 0; i12 < Camera.getNumberOfCameras(); i12++) {
            if (str.equals(getDeviceName(i12))) {
                return i12;
            }
        }
        throw new IllegalArgumentException(G.f("No such camera: ", str));
    }

    @P
    private static Camera.CameraInfo getCameraInfo(int i12) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i12, cameraInfo);
            return cameraInfo;
        } catch (Exception e12) {
            Logging.e(TAG, "getCameraInfo failed on index " + i12, e12);
            return null;
        }
    }

    @P
    public static String getDeviceName(int i12) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i12);
        if (cameraInfo == null) {
            return null;
        }
        return "Camera " + i12 + ", Facing " + (cameraInfo.facing == 1 ? "front" : "back") + ", Orientation " + cameraInfo.orientation;
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < Camera.getNumberOfCameras(); i12++) {
            String deviceName = getDeviceName(i12);
            if (deviceName != null) {
                arrayList.add(deviceName);
                Logging.d(TAG, "Index: " + i12 + ". " + deviceName);
            } else {
                Logging.e(TAG, "Index: " + i12 + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 1;
    }

    public Camera1Enumerator(boolean z12) {
        this.captureToTexture = z12;
    }

    public static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i12) {
        try {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i13 = 0; i13 < Camera.getNumberOfCameras(); i13++) {
                    cachedSupportedFormats.add(enumerateFormats(i13));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cachedSupportedFormats.get(i12);
    }
}
