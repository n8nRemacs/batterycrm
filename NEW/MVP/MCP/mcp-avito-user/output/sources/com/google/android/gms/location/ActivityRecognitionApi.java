package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import j.a0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@Deprecated
/* loaded from: classes6.dex */
public interface ActivityRecognitionApi {
    @j.N
    @a0
    com.google.android.gms.common.api.m<Status> removeActivityUpdates(@j.N com.google.android.gms.common.api.i iVar, @j.N PendingIntent pendingIntent);

    @j.N
    @a0
    com.google.android.gms.common.api.m<Status> requestActivityUpdates(@j.N com.google.android.gms.common.api.i iVar, long j12, @j.N PendingIntent pendingIntent);
}
