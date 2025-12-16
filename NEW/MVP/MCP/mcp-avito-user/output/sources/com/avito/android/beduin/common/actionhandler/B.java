package com.avito.android.beduin.common.actionhandler;

/* compiled from: BeduinCopyTextActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.util.W f100049a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f100050b;

    public B(com.avito.android.util.W w12, dagger.internal.u uVar) {
        this.f100049a = w12;
        this.f100050b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new A((com.avito.android.util.U) this.f100049a.get(), (com.avito.android.beduin.common.actionhandler.toast.a) this.f100050b.get());
    }
}
