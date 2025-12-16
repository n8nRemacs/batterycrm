package com.avito.android.gig_apply.mvi;

import com.avito.android.gig_apply.ui.GigApplyOpenParams;
import javax.inject.Provider;
import mH.C43962a;
import mH.C43963b;

/* compiled from: GigApplyOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f159734a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f159735b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f159736c;

    /* renamed from: d, reason: collision with root package name */
    public final C43963b f159737d;

    public i(dagger.internal.l lVar, Provider provider, Provider provider2, C43963b c43963b) {
        this.f159734a = lVar;
        this.f159735b = provider;
        this.f159736c = provider2;
        this.f159737d = c43963b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((GigApplyOpenParams) this.f159734a.f393949a, this.f159735b.get(), this.f159736c.get(), (C43962a) this.f159737d.get());
    }
}
