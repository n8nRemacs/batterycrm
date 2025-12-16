package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeleteLocalMessageElementProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f191647a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f191648b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191649c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<a.InterfaceC5663a> f191650d;

    public e(Provider<f> provider, Provider<InterfaceC28373a> provider2, Provider<InterfaceC35745a5> provider3, Provider<a.InterfaceC5663a> provider4) {
        this.f191647a = provider;
        this.f191648b = provider2;
        this.f191649c = provider3;
        this.f191650d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f191647a.get(), this.f191648b.get(), this.f191649c.get(), this.f191650d.get());
    }
}
