package com.avito.android.auto_loans_composite_broker.v1;

import com.avito.android.credits.x;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsCompositeBrokerBlueprint_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/f;", "Ldagger/internal/h;", "Lcom/avito/android/auto_loans_composite_broker/v1/d;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f95544c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f95545a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<x> f95546b;

    /* compiled from: AdvertDetailsCompositeBrokerBlueprint_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/f$a;", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k u uVar, @Y61.k Provider provider) {
        this.f95545a = uVar;
        this.f95546b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f95545a.get();
        x xVar = this.f95546b.get();
        f95544c.getClass();
        return new d(gVar, xVar);
    }
}
