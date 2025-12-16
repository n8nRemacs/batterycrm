package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing.f;
import com.avito.avcalls.call.J;
import com.avito.avcalls.call.models.CameraPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;

/* compiled from: CameraVideoCapturerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/d;", "Lcom/avito/avcalls/rtc/device/video/capturing/a;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.avcalls.rtc.device.video.capturing.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final com.avito.avcalls.utils.logs.a f164412e;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final zJ.k f164413a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f164414b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders.orders_seller.d f164415c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public f f164416d;

    /* compiled from: CameraVideoCapturerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/d$a;", "", "<init>", "()V", "Lcom/avito/avcalls/utils/logs/a;", "logs", "Lcom/avito/avcalls/utils/logs/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f164412e = new com.avito.avcalls.utils.logs.a("CameraVideoCapturer");
    }

    public d(@k zJ.k kVar, @k Context context, @k com.avito.android.str_seller_orders.orders_seller.d dVar) {
        this.f164413a = kVar;
        this.f164414b = context;
        this.f164415c = dVar;
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.a
    public final boolean a() {
        return this.f164416d != null;
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.a
    public final void d(@k CameraPosition cameraPosition) {
        G0 g02;
        f fVar = this.f164416d;
        if (fVar != null) {
            com.avito.avcalls.utils.logs.a aVar = f.f164420g;
            aVar.b("switchCamera", "cameraPosition");
            f.a aVar2 = f.f164419f;
            CameraEnumerator cameraEnumerator = fVar.f164422b;
            aVar2.getClass();
            e eVarA = f.a.a(cameraPosition, cameraEnumerator);
            if (L.f(fVar.f164425e, eVarA)) {
                aVar.c("currentDevice is equal to newDevice. No switch needed. currentDevice=" + fVar.f164425e, "switchCamera", new Object[0]);
            } else if (eVarA == null) {
                aVar.c("switchCamera: newDevice is null. No switch needed. currentDevice=" + fVar.f164425e, "switchCamera", new Object[0]);
            } else {
                aVar.c("switchCamera: newDevice=" + eVarA, "switchCamera", new Object[0]);
                fVar.f164421a.switchCamera(new b(new g(fVar, eVarA)), eVarA.f164418b);
            }
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            f164412e.c("ignore, cause rtcCapturerWrapper is not capturing yet", "startCapture", new Object[0]);
        }
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.a
    public final void j(@k CameraPosition cameraPosition) {
        CameraEnumerator camera1Enumerator;
        if (this.f164416d != null) {
            f164412e.c("ignore, cause rtcCapturerWrapper is already capturing", "startCapture", new Object[0]);
            return;
        }
        f.f164419f.getClass();
        Context context = this.f164414b;
        f fVar = null;
        if (Camera2Enumerator.isSupported(context)) {
            camera1Enumerator = new Camera2Enumerator(context);
        } else {
            f.f164420g.a("createAndStart", "Camera2 is not supported. Camera1 will be used", null);
            camera1Enumerator = new Camera1Enumerator();
        }
        CameraEnumerator cameraEnumerator = camera1Enumerator;
        e eVarA = f.a.a(cameraPosition, cameraEnumerator);
        if (eVarA == null) {
            f.f164420g.a("createAndStart", "Failed to open camera. No devices found.", null);
        } else {
            fVar = new f(eVarA, cameraEnumerator.createCapturer(eVarA.f164418b, new com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing.a()), cameraEnumerator, context, this.f164413a, this.f164415c);
        }
        this.f164416d = fVar;
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.a
    public final void stopCapture() {
        f fVar = this.f164416d;
        G0 g02 = null;
        if (fVar != null) {
            fVar.f164421a.stopCapture();
            ((J) fVar.f164424d.f289247c).f332584a.K5(null);
            fVar.f164425e = null;
            this.f164416d = null;
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            f164412e.c("ignore, cause rtcCapturerWrapper is already not capturing", "startCapture", new Object[0]);
        }
    }
}
