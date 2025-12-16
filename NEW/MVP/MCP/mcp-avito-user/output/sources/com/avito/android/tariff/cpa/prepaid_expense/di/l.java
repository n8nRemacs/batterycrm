package com.avito.android.tariff.cpa.prepaid_expense.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p;
import com.avito.android.tariff.cpa.prepaid_expense.viewmodel.q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublicationAdvanceModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f295005a;

    /* renamed from: b, reason: collision with root package name */
    public final u f295006b;

    public l(dagger.internal.l lVar, u uVar) {
        this.f295005a = lVar;
        this.f295006b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f295005a.f393949a;
        P0.c cVar = (P0.c) this.f295006b.get();
        g gVar = g.f294998a;
        return (p) new P0(fragment, cVar).a(q.class);
    }
}
