package com.avito.avcalls.android.video;

import android.content.Context;
import com.avito.avcalls.android.logger.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: CameraVideoCapturer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/video/i;", "", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class i {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CameraVideoCapturer f332486a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CameraEnumerator f332487b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.utils.coroutines.h<CameraPosition> f332488c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public f f332489d;

    /* compiled from: CameraVideoCapturer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/avcalls/android/video/i$a;", "", "<init>", "()V", "", "HD_VIDEO_HEIGHT", "I", "HD_VIDEO_WIDTH", "", "TAG", "Ljava/lang/String;", "VIDEO_FPS", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.video.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Y61.l
        public static f a(@Y61.k CameraPosition cameraPosition, @Y61.k CameraEnumerator cameraEnumerator) {
            f fVar;
            String[] deviceNames = cameraEnumerator.getDeviceNames();
            ArrayList arrayList = new ArrayList();
            int length = deviceNames.length;
            int i12 = 0;
            while (true) {
                fVar = null;
                if (i12 >= length) {
                    break;
                }
                String str = deviceNames[i12];
                if (cameraEnumerator.isFrontFacing(str)) {
                    fVar = new f(CameraPosition.f332471b, str);
                } else if (cameraEnumerator.isBackFacing(str)) {
                    fVar = new f(CameraPosition.f332472c, str);
                }
                if (fVar != null) {
                    arrayList.add(fVar);
                }
                i12++;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((f) next).f332482a == cameraPosition) {
                    fVar = next;
                    break;
                }
            }
            f fVar2 = fVar;
            if (fVar2 == null) {
                fVar2 = (f) C42745f0.G(arrayList);
            }
            com.avito.avcalls.android.logger.g.INSTANCE.getClass();
            g.Companion.c("RtcCameraCapturerWrapper", "getDeviceByCameraPosition(position=" + cameraPosition + "): device=" + fVar2 + ", allDevices=" + arrayList);
            return fVar2;
        }

        public Companion() {
        }
    }

    public i(@Y61.k f fVar, @Y61.k CameraVideoCapturer cameraVideoCapturer, @Y61.k CameraEnumerator cameraEnumerator, @Y61.k Context context, @Y61.k x xVar, @Y61.k com.avito.avcalls.android.utils.coroutines.h<CameraPosition> hVar) {
        this.f332486a = cameraVideoCapturer;
        this.f332487b = cameraEnumerator;
        this.f332488c = hVar;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("RtcCameraCapturerWrapper", "init(initialDevice=" + fVar + ')');
        cameraVideoCapturer.initialize(SurfaceTextureHelper.create("CaptureThread", g.f332484a.a().getEglBaseContext()), context, xVar.f332534a.getCapturerObserver());
        List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = cameraEnumerator.getSupportedFormats(fVar.f332483b);
        List<CameraEnumerationAndroid.CaptureFormat> list = supportedFormats;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (CameraEnumerationAndroid.CaptureFormat captureFormat : list) {
            arrayList.add(new Size(captureFormat.width, captureFormat.height));
        }
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(arrayList, 1280, 720);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) obj;
            if (captureFormat2.width == closestSupportedSize.width && captureFormat2.height == closestSupportedSize.height) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((CameraEnumerationAndroid.CaptureFormat) it.next()).framerate);
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(arrayList3, 30);
        int iMax = Math.max(closestSupportedFramerateRange.min, closestSupportedFramerateRange.max);
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String str = "init: closest format(" + closestSupportedSize.width + 'x' + closestSupportedSize.height + '@' + iMax + "). Supported formats: " + supportedFormats;
        companion.getClass();
        g.Companion.c("RtcCameraCapturerWrapper", str);
        this.f332486a.startCapture(closestSupportedSize.width, closestSupportedSize.height, iMax);
        a(fVar);
    }

    public final void a(f fVar) {
        CameraPosition cameraPosition = fVar != null ? fVar.f332482a : null;
        com.avito.avcalls.android.utils.coroutines.h<CameraPosition> hVar = this.f332488c;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraPositionFlow", "tryEmit: " + cameraPosition);
        hVar.f332463b.K5(cameraPosition);
        this.f332489d = fVar;
    }

    @Y61.k
    public final String toString() {
        return "RtcCameraCapturerWrapper(currentDevice=" + this.f332489d + ')';
    }
}
