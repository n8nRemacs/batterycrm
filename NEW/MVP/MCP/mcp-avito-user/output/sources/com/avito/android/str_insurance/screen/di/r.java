package com.avito.android.str_insurance.screen.di;

import Xy0.AbstractC17061a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m0;

/* compiled from: StrInsuranceOfferModule_ProvideStrInsuranceItemConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<com.avito.android.str_insurance.converters.f> {

    /* renamed from: a, reason: collision with root package name */
    public final p f288722a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f288723b;

    /* renamed from: c, reason: collision with root package name */
    public final A f288724c;

    public r(p pVar, dagger.internal.l lVar, A a12) {
        this.f288722a = pVar;
        this.f288723b = lVar;
        this.f288724c = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        kotlin.reflect.d dVarB;
        AbstractC17061a abstractC17061a = (AbstractC17061a) this.f288723b.f393949a;
        Set set = (Set) this.f288724c.get();
        this.f288722a.getClass();
        if (abstractC17061a.equals(AbstractC17061a.d.f19176e)) {
            dVarB = m0.f406844a.b(com.avito.android.str_insurance.converters.g.class);
        } else if (abstractC17061a.equals(AbstractC17061a.c.f19175e)) {
            dVarB = m0.f406844a.b(com.avito.android.str_insurance.converters.c.class);
        } else {
            if (!abstractC17061a.equals(AbstractC17061a.b.f19174e)) {
                throw new NoWhenBranchMatchedException();
            }
            dVarB = m0.f406844a.b(com.avito.android.str_insurance.converters.a.class);
        }
        Object obj = null;
        boolean z12 = false;
        for (Object obj2 : set) {
            if (m0.f406844a.b(((com.avito.android.str_insurance.converters.f) obj2).getClass()).equals(dVarB)) {
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
        com.avito.android.str_insurance.converters.f fVar = (com.avito.android.str_insurance.converters.f) obj;
        t.d(fVar);
        return fVar;
    }
}
