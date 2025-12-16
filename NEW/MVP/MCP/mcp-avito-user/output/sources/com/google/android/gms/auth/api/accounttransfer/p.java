package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.internal.auth.zzap;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
abstract class p extends A {

    /* renamed from: d, reason: collision with root package name */
    public C37028k f348560d;

    public /* synthetic */ p(int i12, o oVar) {
        super(null, false, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.A
    public final /* bridge */ /* synthetic */ void b(C36616a.b bVar, C37028k c37028k) {
        this.f348560d = c37028k;
        c((zzau) ((zzap) bVar).getService());
    }

    public abstract void c(zzau zzauVar);
}
