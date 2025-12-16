package com.avito.android.iac_problems.impl_module.problems_bottom_sheet;

import android.app.Activity;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacProblemRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35845m2> f168897a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f168898b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f168897a = provider;
        this.f168898b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f168897a.get(), (Activity) this.f168898b.f393949a);
    }
}
