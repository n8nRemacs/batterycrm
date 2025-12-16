package com.google.android.gms.internal.appset;

import NX0.a;
import NX0.b;
import NX0.f;
import android.content.Context;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes6.dex */
public final class zzp extends h<C36616a.d.C10620d> implements a {

    /* renamed from: m, reason: collision with root package name */
    public static final C36616a<C36616a.d.C10620d> f349958m = new C36616a<>("AppSet.API", new zzn(), new C36616a.g());

    /* renamed from: k, reason: collision with root package name */
    public final Context f349959k;

    /* renamed from: l, reason: collision with root package name */
    public final C36688g f349960l;

    public zzp(Context context, C36688g c36688g) {
        super(context, f349958m, C36616a.d.f348913j2, h.a.f348930c);
        this.f349959k = context;
        this.f349960l = c36688g;
    }

    @Override // NX0.a
    public final Task<b> getAppSetIdInfo() {
        if (this.f349960l.c(212800000, this.f349959k) != 0) {
            return C37030m.e(new ApiException(new Status(17, null, null, null)));
        }
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{f.f11539a};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.appset.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzd) obj).getService()).zzc(new com.google.android.gms.appset.zza(null, null), new zzo((C37028k) obj2));
            }
        };
        aVarA.f348953b = false;
        aVarA.f348955d = 27601;
        return doRead(aVarA.a());
    }
}
