package com.avito.android.messenger.conversation.mvi.message_menu.elements.quote;

import com.avito.android.messenger.conversation.mvi.message_menu.elements.quote.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QuoteMessageElementProvider_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a.InterfaceC5665a> f191740a;

    public c(Provider<a.InterfaceC5665a> provider) {
        this.f191740a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f191740a.get());
    }
}
