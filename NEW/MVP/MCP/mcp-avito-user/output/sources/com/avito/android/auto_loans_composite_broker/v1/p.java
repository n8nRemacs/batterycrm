package com.avito.android.auto_loans_composite_broker.v1;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CompositeBrokerViewModelFactory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/p;", "Ldagger/internal/h;", "Lcom/avito/android/auto_loans_composite_broker/v1/o;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f95579b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f95580a;

    /* compiled from: CompositeBrokerViewModelFactory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/p$a;", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public p(@Y61.k u uVar) {
        this.f95580a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.auto_loans_composite_broker.v1.a aVar = (com.avito.android.auto_loans_composite_broker.v1.a) this.f95580a.get();
        f95579b.getClass();
        return new o(aVar);
    }
}
