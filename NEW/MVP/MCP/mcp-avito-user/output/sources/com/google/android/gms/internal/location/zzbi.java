package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzbi implements InterfaceC37020c {
    public final /* synthetic */ C37028k zza;

    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public final Object then(Task task) {
        C37028k c37028k = this.zza;
        C36616a.g gVar = zzbp.f350458k;
        if (task.r()) {
            c37028k.d((Location) task.n());
            return null;
        }
        Exception excM = task.m();
        excM.getClass();
        c37028k.c(excM);
        return null;
    }
}
