package com.avito.android.comfortable_deal.client_room.seller_recall.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.client_room.seller_recall.model.SellerRecallArguments;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallState;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellerRecallFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f120003a;

    /* renamed from: b, reason: collision with root package name */
    public final h f120004b;

    /* renamed from: c, reason: collision with root package name */
    public final j f120005c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f120006d;

    /* renamed from: e, reason: collision with root package name */
    public final l f120007e;

    public f(c cVar, h hVar, j jVar, Provider provider, l lVar) {
        this.f120003a = cVar;
        this.f120004b = hVar;
        this.f120005c = jVar;
        this.f120006d = provider;
        this.f120007e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f120003a.get();
        this.f120004b.getClass();
        g gVar = new g();
        this.f120005c.getClass();
        i iVar = new i();
        ScreenPerformanceTracker screenPerformanceTracker = this.f120006d.get();
        SellerRecallArguments sellerRecallArguments = (SellerRecallArguments) this.f120007e.f393949a;
        SellerRecallState.f119996h.getClass();
        String str = sellerRecallArguments.f119977d;
        if (str == null) {
            str = "";
        }
        return new e("SellerRecall", new SellerRecallState("", "", "", sellerRecallArguments.f119975b, str, sellerRecallArguments.f119976c), new d(bVar, screenPerformanceTracker, iVar, gVar));
    }
}
