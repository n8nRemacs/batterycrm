package com.avito.android.tariff.detailssheet.di;

import androidx.view.P0;
import com.avito.android.tariff.detailssheet.TariffDetailsSheetDialogFragment;
import com.avito.android.tariff.detailssheet.vm.l;
import com.avito.android.tariff.detailssheet.vm.m;
import com.avito.android.tariff.detailssheet.vm.n;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffDetailsSheetModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final n f297421a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f297422b;

    public g(n nVar, dagger.internal.l lVar) {
        this.f297421a = nVar;
        this.f297422b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f297421a.get();
        TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment = (TariffDetailsSheetDialogFragment) this.f297422b.f393949a;
        int i12 = f.f297420a;
        return (l) new P0(tariffDetailsSheetDialogFragment, mVar).a(l.class);
    }
}
