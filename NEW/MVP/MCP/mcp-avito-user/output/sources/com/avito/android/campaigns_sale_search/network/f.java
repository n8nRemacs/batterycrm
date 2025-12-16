package com.avito.android.campaigns_sale_search.network;

import com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import om.InterfaceC44818a;

/* compiled from: CampaignsSaleSearchInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44818a> f114843a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f114844b;

    /* renamed from: c, reason: collision with root package name */
    public final l f114845c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f114843a = provider;
        this.f114844b = provider2;
        this.f114845c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f114843a), this.f114844b.get(), (CampaignsSaleSearchArguments) this.f114845c.f393949a);
    }
}
