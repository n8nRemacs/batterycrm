package com.avito.android.code_confirmation.code_confirmation.timer;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RxTimerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f119637a;

    public e(Provider<InterfaceC35745a5> provider) {
        this.f119637a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f119637a.get());
    }
}
