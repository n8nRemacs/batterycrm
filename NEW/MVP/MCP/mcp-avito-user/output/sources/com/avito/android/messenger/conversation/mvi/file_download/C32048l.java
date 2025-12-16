package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.messenger.conversation.mvi.file_download.C32037a;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import ru.avito.messenger.C0;

/* compiled from: FileDownloadRequestCallProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32048l implements dagger.internal.h<C32047k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OkHttpClient> f190937a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f190938b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.service.d> f190939c;

    public C32048l(Provider<OkHttpClient> provider, Provider<C0> provider2, Provider<com.avito.android.messenger.service.d> provider3) {
        this.f190937a = provider;
        this.f190938b = provider2;
        this.f190939c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32047k(dagger.internal.g.a(dagger.internal.w.a(this.f190937a)), ((C32037a.c.i) this.f190938b).f190904a.li(), (com.avito.android.messenger.service.d) ((C32037a.c.e) this.f190939c).get());
    }
}
