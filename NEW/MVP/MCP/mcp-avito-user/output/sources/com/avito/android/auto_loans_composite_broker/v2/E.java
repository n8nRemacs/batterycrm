package com.avito.android.auto_loans_composite_broker.v2;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CompositeBrokerV2ViewModelFactory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/E;", "Ldagger/internal/h;", "Lcom/avito/android/auto_loans_composite_broker/v2/D;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f95619d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f95620a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f95621b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.deep_linking.x> f95622c;

    /* compiled from: CompositeBrokerV2ViewModelFactory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/E$a;", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public E(@Y61.k dagger.internal.f fVar, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f95620a = uVar;
        this.f95621b = fVar;
        this.f95622c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28712a interfaceC28712a = (InterfaceC28712a) this.f95620a.get();
        Me.q qVar = (Me.q) this.f95621b.get();
        com.avito.android.deep_linking.x xVar = this.f95622c.get();
        f95619d.getClass();
        return new D(interfaceC28712a, qVar, xVar);
    }
}
