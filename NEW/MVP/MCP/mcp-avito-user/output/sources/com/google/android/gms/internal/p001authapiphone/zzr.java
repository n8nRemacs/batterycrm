package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.b;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes6.dex */
public final class zzr extends h implements b {

    /* renamed from: k, reason: collision with root package name */
    public static final C36616a f349968k = new C36616a("SmsCodeAutofill.API", new zzn(), new C36616a.g());

    public zzr(Activity activity) {
        super(activity, (C36616a<C36616a.d.C10620d>) f349968k, C36616a.d.f348913j2, h.a.f348930c);
    }

    public final Task<Integer> checkPermissionState() {
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zzac.zza};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp((C37028k) obj2));
            }
        };
        aVarA.f348955d = 1564;
        return doRead(aVarA.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        C36729v.j(str);
        C36729v.a("The package name cannot be empty.", !str.isEmpty());
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zzac.zza};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq((C37028k) obj2));
            }
        };
        aVarA.f348955d = 1565;
        return doRead(aVarA.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zzac.zza};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo((C37028k) obj2));
            }
        };
        aVarA.f348955d = 1563;
        return doWrite(aVarA.a());
    }

    public zzr(Context context) {
        super(context, (C36616a<C36616a.d.C10620d>) f349968k, C36616a.d.f348913j2, h.a.f348930c);
    }
}
