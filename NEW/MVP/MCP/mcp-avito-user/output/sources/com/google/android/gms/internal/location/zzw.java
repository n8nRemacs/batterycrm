package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.location.ActivityRecognitionApi;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzw implements ActivityRecognitionApi {
    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final m<Status> removeActivityUpdates(i iVar, PendingIntent pendingIntent) {
        return iVar.g(new zzu(iVar, pendingIntent));
    }

    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final m<Status> requestActivityUpdates(i iVar, long j12, PendingIntent pendingIntent) {
        return iVar.g(new zzt(iVar, j12, pendingIntent));
    }
}
