package com.avito.android.comfortable_deal.deal.item.callrecord.loaded;

import androidx.view.AbstractC22973F;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CallRecordLoadedPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.comfortable_deal.deal.player.f> f121236a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f121237b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f121238c;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f121236a = provider;
        this.f121237b = lVar;
        this.f121238c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f121236a.get(), (AbstractC22973F) this.f121237b.f393949a, (Y41.l) this.f121238c.f393949a);
    }
}
