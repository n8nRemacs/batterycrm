package com.avito.android.serp.adapter.replace_main_widget;

import Em0.InterfaceC13506b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReplaceMainWidgetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f270684a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC13506b> f270685b;

    public c(u uVar, Provider provider) {
        this.f270684a = uVar;
        this.f270685b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((j) this.f270684a.get(), this.f270685b.get());
    }
}
