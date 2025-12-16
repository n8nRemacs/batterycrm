package com.avito.avcalls.android.video;

import android.content.Context;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.video.i;
import kotlin.G0;
import kotlin.Metadata;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;

/* compiled from: CameraVideoCapturer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/video/e;", "Lcom/avito/avcalls/android/video/k;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f332478a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.rtc.y f332479b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.utils.coroutines.h<CameraPosition> f332480c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public i f332481d;

    public e(@Y61.k x xVar, @Y61.k com.avito.avcalls.android.rtc.y yVar, @Y61.k com.avito.avcalls.android.utils.coroutines.h hVar) {
        this.f332478a = xVar;
        this.f332479b = yVar;
        this.f332480c = hVar;
    }

    @Override // com.avito.avcalls.android.video.k
    public final boolean a() {
        return this.f332481d != null;
    }

    @Override // com.avito.avcalls.android.video.k
    public final void b(@Y61.k CameraPosition cameraPosition) {
        CameraEnumerator camera1Enumerator;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraVideoCapturer", "startCapture(defaultCamera=" + cameraPosition + ')');
        if (this.f332481d != null) {
            g.Companion.c("CameraVideoCapturer", "startCapture: ignore, cause rtcCapturerWrapper is already capturing");
            return;
        }
        i.Companion companion = i.INSTANCE;
        com.avito.avcalls.android.rtc.y yVar = this.f332479b;
        companion.getClass();
        Context context = yVar.f331983a;
        i iVar = null;
        if (Camera2Enumerator.isSupported(context)) {
            camera1Enumerator = new Camera2Enumerator(context);
        } else {
            g.Companion.a("RtcCameraCapturerWrapper", "createAndStart: Camera2 is not supported. Camera1 will be used", null);
            camera1Enumerator = new Camera1Enumerator();
        }
        CameraEnumerator cameraEnumerator = camera1Enumerator;
        f fVarA = i.Companion.a(cameraPosition, cameraEnumerator);
        if (fVarA == null) {
            g.Companion.a("RtcCameraCapturerWrapper", "createAndStart: Failed to open camera. No devices found.", null);
        } else {
            iVar = new i(fVarA, cameraEnumerator.createCapturer(fVarA.f332483b, new c()), cameraEnumerator, context, this.f332478a, this.f332480c);
        }
        this.f332481d = iVar;
    }

    @Override // com.avito.avcalls.android.video.k
    public final void stopCapture() {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraVideoCapturer", "stopCapture()");
        i iVar = this.f332481d;
        G0 g02 = null;
        if (iVar != null) {
            iVar.f332486a.stopCapture();
            iVar.a(null);
            this.f332481d = null;
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            g.Companion.c("CameraVideoCapturer", "stopCapture: ignore, cause rtcCapturerWrapper is already not capturing ");
        }
    }
}
