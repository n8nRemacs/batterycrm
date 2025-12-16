package com.avito.android.rating.details.answer.text.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerTextBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f246870a;

    /* renamed from: b, reason: collision with root package name */
    public final l f246871b;

    /* renamed from: c, reason: collision with root package name */
    public final l f246872c;

    public d(l lVar, l lVar2, Provider provider) {
        this.f246870a = provider;
        this.f246871b = lVar;
        this.f246872c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f246870a.get(), (Long) this.f246871b.f393949a, ((Boolean) this.f246872c.f393949a).booleanValue());
    }
}
