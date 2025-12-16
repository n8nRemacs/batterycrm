package com.avito.android.publish.view;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import yc.C50213a;

/* compiled from: ItemDetailsParameterClickListenerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245666a;

    /* renamed from: b, reason: collision with root package name */
    public final u f245667b;

    public k(u uVar, u uVar2) {
        this.f245666a = uVar;
        this.f245667b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((a) this.f245666a.get(), (C50213a) this.f245667b.get());
    }
}
