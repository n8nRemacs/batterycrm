package com.avito.android.comfortable_deal.deal.player;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* compiled from: AudioPlayerHolderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f121783a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OkHttpClient> f121784b;

    public k(C30102l3 c30102l3, Provider provider) {
        this.f121783a = c30102l3;
        this.f121784b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Context) this.f121783a.get(), this.f121784b.get());
    }
}
