package com.avito.android.gig_apply.mvi;

import android.content.res.Resources;
import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import javax.inject.Provider;
import mH.C43964c;
import mH.C43965d;

/* compiled from: GigSlotReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f159807a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.gig_snippet.a> f159808b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f159809c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f159810d;

    /* renamed from: e, reason: collision with root package name */
    public final C43965d f159811e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f159812f;

    public z(dagger.internal.l lVar, Provider provider, Provider provider2, dagger.internal.u uVar, C43965d c43965d, Provider provider3) {
        this.f159807a = lVar;
        this.f159808b = provider;
        this.f159809c = provider2;
        this.f159810d = uVar;
        this.f159811e = c43965d;
        this.f159812f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new y((GigSlotOpenParams) this.f159807a.f393949a, this.f159808b.get(), this.f159809c.get(), (Resources) this.f159810d.get(), (C43964c) this.f159811e.get(), this.f159812f.get());
    }
}
