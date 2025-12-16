package com.avito.android.validation;

import com.avito.android.analytics.InterfaceC28373a;
import yc.C50213a;

/* compiled from: ParametersListModule_ProvideTagSelectionTracker$_avito_discouraged_avito_libs_publish_commonFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36023n0 implements dagger.internal.h<jG0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f319400a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f319401b;

    public C36023n0(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f319400a = uVar;
        this.f319401b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f319400a.get();
        C50213a c50213a = (C50213a) this.f319401b.get();
        A.f319242a.getClass();
        return new jG0.c(interfaceC28373a, c50213a);
    }
}
