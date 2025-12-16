package com.avito.android.serp.adapter.brandspace_widget;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandspaceWidgetItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f269039a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f269040b;

    public c(dagger.internal.u uVar, Provider provider) {
        this.f269039a = provider;
        this.f269040b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f269039a.get(), (com.avito.konveyor.a) this.f269040b.get());
    }
}
