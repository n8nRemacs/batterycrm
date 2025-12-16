package defpackage;

import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.Size;

/* loaded from: classes2.dex */
public final class i52 implements CameraVideoCapturer.CaptureFormatHelper, hqa {
    public final y6d a;

    public /* synthetic */ i52(y6d y6dVar) {
        this.a = y6dVar;
    }

    @Override // org.webrtc.CameraVideoCapturer.CaptureFormatHelper
    public CameraEnumerationAndroid.CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List list, int i) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = super.getClosestSupportedFramerateRange(list, i);
        String strConcat = "available fps ranges are ".concat(ue3.N(list, ", ", null, null, null, 62));
        y6d y6dVar = this.a;
        y6dVar.log("CaptureFormatHelper", strConcat);
        y6dVar.log("CaptureFormatHelper", "closest frame rate range for requested " + i + " is " + closestSupportedFramerateRange);
        return closestSupportedFramerateRange;
    }

    @Override // org.webrtc.CameraVideoCapturer.CaptureFormatHelper
    public Size getClosestSupportedSize(List list, int i, int i2) {
        Size closestSupportedSize = super.getClosestSupportedSize(list, i, i2);
        String strConcat = "available frame sizes are ".concat(ue3.N(list, ", ", null, null, null, 62));
        y6d y6dVar = this.a;
        y6dVar.log("CaptureFormatHelper", strConcat);
        StringBuilder sb = new StringBuilder("closest frame size range for requested ");
        hf3.g(sb, i, "x", i2, " is ");
        sb.append(closestSupportedSize);
        y6dVar.log("CaptureFormatHelper", sb.toString());
        return closestSupportedSize;
    }
}
