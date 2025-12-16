package com.avito.avcalls.rtc.device.video.capturing;

import Y61.k;
import com.avito.avcalls.call.models.CameraPosition;
import kotlin.Metadata;

/* compiled from: VideoCapturerController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/device/video/capturing/d;", "Lcom/avito/avcalls/utils/logs/c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d extends com.avito.avcalls.utils.logs.c {

    /* compiled from: VideoCapturerController.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void b(@k String str);

    void d(@k CameraPosition cameraPosition);

    void r(@k CameraPosition cameraPosition, @k String str);
}
