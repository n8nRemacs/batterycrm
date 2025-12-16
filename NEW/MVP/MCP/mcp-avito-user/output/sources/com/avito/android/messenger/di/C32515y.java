package com.avito.android.messenger.di;

import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: ChannelFragmentModule_ProvideGeoBubbleSnippetDefaultLocationZoom$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32515y implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196315a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f196316b;

    public C32515y(C32431e c32431e, Provider<InterfaceC49101b> provider) {
        this.f196315a = c32431e;
        this.f196316b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49101b interfaceC49101b = this.f196316b.get();
        this.f196315a.getClass();
        return interfaceC49101b.d() ? "2" : "0";
    }
}
