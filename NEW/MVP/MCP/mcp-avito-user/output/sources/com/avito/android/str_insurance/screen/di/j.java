package com.avito.android.str_insurance.screen.di;

import Xy0.AbstractC17061a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.StrInsuranceConfirmationScreen;
import com.avito.android.analytics.screens.StrInsuranceFlatFormScreen;
import com.avito.android.analytics.screens.StrInsuranceOfferScreen;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StrInsuranceFragmentTrackerModule_ProvideScreenFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<Screen> {

    /* renamed from: a, reason: collision with root package name */
    public final h f288707a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f288708b;

    public j(h hVar, dagger.internal.l lVar) {
        this.f288707a = hVar;
        this.f288708b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        AbstractC17061a abstractC17061a = (AbstractC17061a) this.f288708b.f393949a;
        this.f288707a.getClass();
        if (abstractC17061a.equals(AbstractC17061a.d.f19176e)) {
            obj = StrInsuranceOfferScreen.f90514d;
        } else if (abstractC17061a.equals(AbstractC17061a.c.f19175e)) {
            obj = StrInsuranceFlatFormScreen.f90513d;
        } else {
            if (!abstractC17061a.equals(AbstractC17061a.b.f19174e)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = StrInsuranceConfirmationScreen.f90512d;
        }
        t.d(obj);
        return obj;
    }
}
