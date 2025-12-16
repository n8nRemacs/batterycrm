package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info;

import Mf0.C14483c;
import Mf0.InterfaceC14484d;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesMethodsV2LimitsInfoItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C14483c f158428a;

    /* renamed from: b, reason: collision with root package name */
    public final l f158429b;

    public e(C14483c c14483c, l lVar) {
        this.f158428a = c14483c;
        this.f158429b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC14484d) this.f158428a.get(), (Y41.l) this.f158429b.f393949a);
    }
}
