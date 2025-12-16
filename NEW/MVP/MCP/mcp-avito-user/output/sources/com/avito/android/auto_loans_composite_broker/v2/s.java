package com.avito.android.auto_loans_composite_broker.v2;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsCompositeBrokerV2PresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/s;", "Ldagger/internal/h;", "Lcom/avito/android/auto_loans_composite_broker/v2/r;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f95643d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f95644a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.advert_core.advert_badge_bar.j> f95645b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<Me.i> f95646c;

    /* compiled from: AdvertDetailsCompositeBrokerV2PresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/s$a;", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public s(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f95644a = uVar;
        this.f95645b = provider;
        this.f95646c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = (C) this.f95644a.get();
        com.avito.android.advert_core.advert_badge_bar.j jVar = this.f95645b.get();
        Me.i iVar = this.f95646c.get();
        f95643d.getClass();
        return new r(c12, jVar, iVar);
    }
}
