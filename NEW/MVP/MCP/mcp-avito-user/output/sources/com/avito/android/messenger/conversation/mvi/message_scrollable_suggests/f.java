package com.avito.android.messenger.conversation.mvi.message_scrollable_suggests;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessageScrollSuggestsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f191843a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f191844b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f191845c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191846d;

    public f(Provider<String> provider, Provider<InterfaceC47842z> provider2, Provider<InterfaceC31987a> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f191843a = provider;
        this.f191844b = provider2;
        this.f191845c = provider3;
        this.f191846d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f191843a.get(), this.f191844b.get(), this.f191845c.get(), this.f191846d.get());
    }
}
