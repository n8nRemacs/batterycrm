package com.avito.avcalls.rtc.device.video.capturing;

import Y61.k;
import com.avito.avcalls.call.models.CameraPosition;
import kotlin.Metadata;

/* compiled from: VideoCapturerControllerLogsWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/device/video/capturing/g;", "Lcom/avito/avcalls/utils/logs/b;", "Lcom/avito/avcalls/rtc/device/video/capturing/d;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.avcalls.utils.logs.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f333113b;

    public g(@k f fVar) {
        this.f333113b = fVar;
    }

    @Override // com.avito.avcalls.utils.logs.b
    @k
    public final String G() {
        return "VideoCapturerController";
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.d
    public final void b(@k String str) {
        F().b("stopCapture", str);
        this.f333113b.b(str);
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.d
    public final void d(@k CameraPosition cameraPosition) {
        F().b("switchCamera", cameraPosition);
        this.f333113b.d(cameraPosition);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f333113b;
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.d
    public final void r(@k CameraPosition cameraPosition, @k String str) {
        F().b("startCapture", str, cameraPosition);
        this.f333113b.r(cameraPosition, str);
    }
}
