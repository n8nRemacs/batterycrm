package com.avito.android.messenger.conversation.mvi.message_scrollable_suggests;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessageScrollSuggestsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f191860a;

    /* renamed from: b, reason: collision with root package name */
    public final u f191861b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f191862c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191863d;

    public m(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f191860a = provider;
        this.f191861b = uVar;
        this.f191862c = provider2;
        this.f191863d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f191860a.get(), (a) this.f191861b.get(), this.f191862c.get(), this.f191863d.get());
    }
}
