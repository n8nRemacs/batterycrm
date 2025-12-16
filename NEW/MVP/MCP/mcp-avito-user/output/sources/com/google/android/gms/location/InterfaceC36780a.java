package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.tasks.Task;
import j.a0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* renamed from: com.google.android.gms.location.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36780a extends com.google.android.gms.common.api.j<C36616a.d.C10620d> {
    @j.N
    @a0
    Task<Void> removeActivityUpdates(@j.N PendingIntent pendingIntent);

    @j.N
    @a0
    Task<Void> requestActivityUpdates(long j12, @j.N PendingIntent pendingIntent);
}
