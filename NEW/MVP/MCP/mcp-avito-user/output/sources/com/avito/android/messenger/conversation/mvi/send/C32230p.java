package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import w80.C49468b;

/* compiled from: PhotoPickerResultHandlerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.send.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32230p implements dagger.internal.h<C32228o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f194540a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32200a> f194541b;

    /* renamed from: c, reason: collision with root package name */
    public final C49468b f194542c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194543d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f194544e;

    public C32230p(Provider provider, Provider provider2, C49468b c49468b, Provider provider3, Provider provider4) {
        this.f194540a = provider;
        this.f194541b = provider2;
        this.f194542c = c49468b;
        this.f194543d = provider3;
        this.f194544e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32228o(this.f194540a.get(), this.f194541b.get(), (SharedPhotosStorage) this.f194542c.get(), this.f194543d.get(), this.f194544e.get());
    }
}
