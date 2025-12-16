package com.avito.android.auto_loans_composite_broker.v1;

import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsCompositeBrokerPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/k;", "Ldagger/internal/h;", "Lcom/avito/android/auto_loans_composite_broker/v1/j;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f95556d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Me.i> f95557a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f95558b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f95559c;

    /* compiled from: AdvertDetailsCompositeBrokerPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/k$a;", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k dagger.internal.f fVar, @Y61.k u uVar, @Y61.k Provider provider) {
        this.f95557a = provider;
        this.f95558b = fVar;
        this.f95559c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Me.i iVar = this.f95557a.get();
        Me.p pVar = (Me.p) this.f95558b.get();
        n nVar = (n) this.f95559c.get();
        f95556d.getClass();
        return new j(iVar, pVar, nVar);
    }
}
