package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.avcalls.call.J;
import com.avito.avcalls.call.models.CameraPosition;
import com.avito.avcalls.rtc.media.j;
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
import xJ.C49846a;

/* compiled from: CameraVideoCapturerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/f;", "", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class f {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f164419f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final com.avito.avcalls.utils.logs.a f164420g = new com.avito.avcalls.utils.logs.a("RtcCameraCapturerWrapper");

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CameraVideoCapturer f164421a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CameraEnumerator f164422b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j f164423c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders.orders_seller.d f164424d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public e f164425e;

    /* compiled from: CameraVideoCapturerImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/f$a;", "", "<init>", "()V", "", "HD_VIDEO_HEIGHT", "I", "HD_VIDEO_WIDTH", "VIDEO_FPS", "Lcom/avito/avcalls/utils/logs/a;", "logs", "Lcom/avito/avcalls/utils/logs/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @l
        public static e a(@k CameraPosition cameraPosition, @k CameraEnumerator cameraEnumerator) {
            e eVar;
            String[] deviceNames = cameraEnumerator.getDeviceNames();
            ArrayList arrayList = new ArrayList();
            int length = deviceNames.length;
            int i12 = 0;
            while (true) {
                eVar = null;
                if (i12 >= length) {
                    break;
                }
                String str = deviceNames[i12];
                if (cameraEnumerator.isFrontFacing(str)) {
                    eVar = new e(CameraPosition.FRONT, str);
                } else if (cameraEnumerator.isBackFacing(str)) {
                    eVar = new e(CameraPosition.BACK, str);
                }
                if (eVar != null) {
                    arrayList.add(eVar);
                }
                i12++;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((e) next).f164417a == cameraPosition) {
                    eVar = next;
                    break;
                }
            }
            e eVar2 = eVar;
            if (eVar2 == null) {
                eVar2 = (e) C42745f0.G(arrayList);
            }
            f.f164420g.c("position=" + cameraPosition + ", allDevices=" + arrayList + " -> device=" + eVar2, "getDeviceByCameraPosition", new Object[0]);
            return eVar2;
        }

        public a() {
        }
    }

    public f(@k e eVar, @k CameraVideoCapturer cameraVideoCapturer, @k CameraEnumerator cameraEnumerator, @k Context context, @k j jVar, @k com.avito.android.str_seller_orders.orders_seller.d dVar) {
        this.f164421a = cameraVideoCapturer;
        this.f164422b = cameraEnumerator;
        this.f164423c = jVar;
        this.f164424d = dVar;
        com.avito.avcalls.utils.logs.a aVar = f164420g;
        aVar.b("init", "initialDevice=" + eVar);
        cameraVideoCapturer.initialize(SurfaceTextureHelper.create("CaptureThread", C49846a.f442334a.a().getEglBaseContext()), context, ((zJ.k) jVar).f444018a.getCapturerObserver());
        List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = cameraEnumerator.getSupportedFormats(eVar.f164418b);
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
        aVar.c("closest format(" + closestSupportedSize.width + 'x' + closestSupportedSize.height + '@' + iMax + "). Supported formats: " + supportedFormats, "init", new Object[0]);
        this.f164421a.startCapture(closestSupportedSize.width, closestSupportedSize.height, iMax);
        ((J) this.f164424d.f289247c).f332584a.K5(eVar.f164417a);
        this.f164425e = eVar;
    }

    @k
    public final String toString() {
        return f164420g.f333693a + "(currentDevice=" + this.f164425e + ')';
    }
}
