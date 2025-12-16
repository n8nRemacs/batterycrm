package com.avito.android.publish.view.result_handler;

import com.avito.android.Q1;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishActivityResultHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245676a;

    /* renamed from: b, reason: collision with root package name */
    public final u f245677b;

    public c(u uVar, u uVar2) {
        this.f245676a = uVar;
        this.f245677b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f245676a.get(), (Q1) this.f245677b.get());
    }
}
