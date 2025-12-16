package com.avito.android.validation;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideSelectWithSuggestedOptionsItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36017k0 implements dagger.internal.h<com.avito.android.blueprints.withSuggestedOptions.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f319390a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f319391b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f319392c;

    public C36017k0(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f319390a = provider;
        this.f319391b = uVar;
        this.f319392c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35807h4 interfaceC35807h4 = this.f319390a.get();
        Q1 q12 = (Q1) this.f319391b.get();
        Resources resources = (Resources) this.f319392c.f393949a;
        A.f319242a.getClass();
        return new com.avito.android.blueprints.withSuggestedOptions.e(interfaceC35807h4, q12, resources);
    }
}
