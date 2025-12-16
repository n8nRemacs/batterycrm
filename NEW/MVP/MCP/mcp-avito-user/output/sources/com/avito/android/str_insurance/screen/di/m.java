package com.avito.android.str_insurance.screen.di;

import Xy0.AbstractC17061a;
import com.avito.android.str_insurance.screen.mvi.A;
import com.avito.android.str_insurance.screen.mvi.B;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m0;

/* compiled from: StrInsuranceFragmentTrackerModule_ProvideStrInsuranceTrackerWrapperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final h f288714a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f288715b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.A f288716c;

    public m(h hVar, dagger.internal.l lVar, dagger.internal.A a12) {
        this.f288714a = hVar;
        this.f288715b = lVar;
        this.f288716c = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        kotlin.reflect.d dVarB;
        AbstractC17061a abstractC17061a = (AbstractC17061a) this.f288715b.f393949a;
        Set set = (Set) this.f288716c.get();
        this.f288714a.getClass();
        if (abstractC17061a.equals(AbstractC17061a.d.f19176e)) {
            dVarB = m0.f406844a.b(B.class);
        } else if (abstractC17061a.equals(AbstractC17061a.c.f19175e)) {
            dVarB = m0.f406844a.b(com.avito.android.str_insurance.screen.mvi.k.class);
        } else {
            if (!abstractC17061a.equals(AbstractC17061a.b.f19174e)) {
                throw new NoWhenBranchMatchedException();
            }
            dVarB = m0.f406844a.b(B.class);
        }
        Object obj = null;
        boolean z12 = false;
        for (Object obj2 : set) {
            if (m0.f406844a.b(((A) obj2).getClass()).equals(dVarB)) {
                if (z12) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z12 = true;
                obj = obj2;
            }
        }
        if (!z12) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        A a12 = (A) obj;
        t.d(a12);
        return a12;
    }
}
