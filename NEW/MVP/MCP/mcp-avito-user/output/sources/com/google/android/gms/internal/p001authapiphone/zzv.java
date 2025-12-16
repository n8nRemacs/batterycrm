package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes6.dex */
public final class zzv extends h implements c {

    /* renamed from: k, reason: collision with root package name */
    public static final C36616a f349970k = new C36616a("SmsCodeBrowser.API", new zzt(), new C36616a.g());

    public zzv(Activity activity) {
        super(activity, (C36616a<C36616a.d.C10620d>) f349970k, C36616a.d.f348913j2, h.a.f348930c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zzac.zzb};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu((C37028k) obj2));
            }
        };
        aVarA.f348955d = 1566;
        return doWrite(aVarA.a());
    }

    public zzv(Context context) {
        super(context, (C36616a<C36616a.d.C10620d>) f349970k, C36616a.d.f348913j2, h.a.f348930c);
    }
}
