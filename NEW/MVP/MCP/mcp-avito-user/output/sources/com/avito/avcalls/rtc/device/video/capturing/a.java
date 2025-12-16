package com.avito.avcalls.rtc.device.video.capturing;

import Y61.k;
import com.avito.avcalls.call.models.CameraPosition;
import kotlin.Metadata;

/* compiled from: CameraVideoCapturer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/device/video/capturing/a;", "Lcom/avito/avcalls/utils/logs/c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a extends com.avito.avcalls.utils.logs.c {

    /* compiled from: CameraVideoCapturer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.rtc.device.video.capturing.a$a, reason: collision with other inner class name */
    public static final class C10348a {
    }

    boolean a();

    void d(@k CameraPosition cameraPosition);

    void j(@k CameraPosition cameraPosition);

    void stopCapture();
}
