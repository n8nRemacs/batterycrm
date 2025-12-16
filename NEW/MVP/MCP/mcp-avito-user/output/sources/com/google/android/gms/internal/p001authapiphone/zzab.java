package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.g;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes6.dex */
public final class zzab extends g {
    public zzab(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.auth.api.phone.g, com.google.android.gms.auth.api.phone.f
    public final Task<Void> startSmsRetriever() {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz((C37028k) obj2));
            }
        };
        aVarA.f348954c = new Feature[]{zzac.zzc};
        aVarA.f348955d = 1567;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.auth.api.phone.g
    public final Task<Void> startSmsUserConsent(@P final String str) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa((C37028k) obj2));
            }
        };
        aVarA.f348954c = new Feature[]{zzac.zzd};
        aVarA.f348955d = 1568;
        return doWrite(aVarA.a());
    }

    public zzab(Context context) {
        super(context);
    }
}
