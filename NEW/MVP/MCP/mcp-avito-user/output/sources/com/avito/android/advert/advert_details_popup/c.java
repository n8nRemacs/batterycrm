package com.avito.android.advert.advert_details_popup;

import com.avito.android.P;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* compiled from: AdvertDetailsGetDownloadInfoInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f68613a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P> f68614b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f68615c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<OkHttpClient> f68616d;

    public c(Provider<Gson> provider, Provider<P> provider2, Provider<InterfaceC35745a5> provider3, Provider<OkHttpClient> provider4) {
        this.f68613a = provider;
        this.f68614b = provider2;
        this.f68615c = provider3;
        this.f68616d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f68613a.get(), this.f68614b.get(), this.f68615c.get(), dagger.internal.g.a(w.a(this.f68616d)));
    }
}
