package com.avito.android.profile.pro.impl.di;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.profile.pro.impl.screen.D;
import com.avito.android.profile.pro.impl.screen.E;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: ProfileProModule_ProvideProfileTabViewModel$_avito_profile_pro_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final f f222642a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f222643b;

    /* renamed from: c, reason: collision with root package name */
    public final E f222644c;

    public k(f fVar, dagger.internal.l lVar, E e12) {
        this.f222642a = fVar;
        this.f222643b = lVar;
        this.f222644c = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f222643b.f393949a;
        D.a aVar = (D.a) this.f222644c.get();
        this.f222642a.getClass();
        return (D) new P0(t02, new C13243a(new g(aVar))).c(m0.f406844a.b(D.class));
    }
}
