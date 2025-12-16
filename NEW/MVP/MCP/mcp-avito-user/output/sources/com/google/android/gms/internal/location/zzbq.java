package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzbq implements InterfaceC37022e {
    public final /* synthetic */ C36634e.b zza;

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public final void onComplete(Task task) {
        C36634e.b bVar = this.zza;
        if (task.r()) {
            bVar.setResult(Status.f348900f);
            return;
        }
        if (task.p()) {
            bVar.setFailedResult(Status.f348904j);
            return;
        }
        Exception excM = task.m();
        if (excM instanceof ApiException) {
            bVar.setFailedResult(((ApiException) excM).f348894b);
        } else {
            bVar.setFailedResult(Status.f348902h);
        }
    }
}
