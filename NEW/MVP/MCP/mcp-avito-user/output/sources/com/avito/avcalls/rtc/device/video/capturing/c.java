package com.avito.avcalls.rtc.device.video.capturing;

import Y61.k;
import com.avito.avcalls.call.models.CameraPosition;
import kotlin.Metadata;

/* compiled from: CameraVideoCapturerLogsWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/device/video/capturing/c;", "Lcom/avito/avcalls/utils/logs/b;", "Lcom/avito/avcalls/rtc/device/video/capturing/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends com.avito.avcalls.utils.logs.b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f333099b;

    public c(@k a aVar) {
        this.f333099b = aVar;
    }

    @Override // com.avito.avcalls.utils.logs.b
    @k
    public final String G() {
        return "CameraVideoCapturer";
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.a
    public final boolean a() {
        return this.f333099b.a();
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.a
    public final void d(@k CameraPosition cameraPosition) {
        F().b("switchCamera", cameraPosition);
        this.f333099b.d(cameraPosition);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f333099b;
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.a
    public final void j(@k CameraPosition cameraPosition) {
        F().b("startCapture", cameraPosition);
        this.f333099b.j(cameraPosition);
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.a
    public final void stopCapture() {
        F().b("stopCapture", new Object[0]);
        this.f333099b.stopCapture();
    }
}
