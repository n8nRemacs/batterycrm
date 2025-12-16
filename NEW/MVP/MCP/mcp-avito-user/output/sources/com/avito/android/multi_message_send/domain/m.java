package com.avito.android.multi_message_send.domain;

import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;

/* compiled from: SendMessagesUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A20.a> f206723a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A> f206724b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f206725c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f206726d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<F0> f206727e;

    public m(Provider<A20.a> provider, Provider<A> provider2, Provider<InterfaceC35863o4> provider3, Provider<R0> provider4, Provider<F0> provider5) {
        this.f206723a = provider;
        this.f206724b = provider2;
        this.f206725c = provider3;
        this.f206726d = provider4;
        this.f206727e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f206723a.get(), this.f206724b.get(), this.f206725c.get(), this.f206726d.get(), this.f206727e.get());
    }
}
