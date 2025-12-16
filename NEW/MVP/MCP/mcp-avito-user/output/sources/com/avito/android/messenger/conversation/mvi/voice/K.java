package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: VoiceMessageClickInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class K implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f195069a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f195070b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32038b> f195071c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f195072d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f> f195073e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.u> f195074f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195075g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f195076h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<P> f195077i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<C30277e1> f195078j;

    public K(Provider<String> provider, Provider<com.avito.android.server_time.f> provider2, Provider<InterfaceC32038b> provider3, Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> provider4, Provider<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f> provider5, Provider<com.avito.android.permissions.u> provider6, Provider<InterfaceC35745a5> provider7, Provider<InterfaceC32024m> provider8, Provider<P> provider9, Provider<C30277e1> provider10) {
        this.f195069a = provider;
        this.f195070b = provider2;
        this.f195071c = provider3;
        this.f195072d = provider4;
        this.f195073e = provider5;
        this.f195074f = provider6;
        this.f195075g = provider7;
        this.f195076h = provider8;
        this.f195077i = provider9;
        this.f195078j = provider10;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E(this.f195069a.get(), this.f195070b.get(), this.f195071c.get(), this.f195072d.get(), this.f195073e.get(), this.f195074f.get(), this.f195075g.get(), this.f195076h.get(), this.f195077i.get(), this.f195078j.get());
    }
}
