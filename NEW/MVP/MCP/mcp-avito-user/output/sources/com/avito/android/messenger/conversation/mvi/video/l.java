package com.avito.android.messenger.conversation.mvi.video;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: VideoMessageClickInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f195022a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<String> f195023b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f> f195024c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f195025d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195026e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C30277e1> f195027f;

    public l(Provider<InterfaceC47842z> provider, Provider<String> provider2, Provider<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f> provider3, Provider<InterfaceC28373a> provider4, Provider<InterfaceC35745a5> provider5, Provider<C30277e1> provider6) {
        this.f195022a = provider;
        this.f195023b = provider2;
        this.f195024c = provider3;
        this.f195025d = provider4;
        this.f195026e = provider5;
        this.f195027f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f195022a.get(), this.f195023b.get(), this.f195024c.get(), this.f195025d.get(), this.f195026e.get(), this.f195027f.get());
    }
}
