package com.avito.android.auto_loans_composite_broker.v2;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsCompositeBrokerV2Blueprint_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/f;", "Ldagger/internal/h;", "Lcom/avito/android/auto_loans_composite_broker/v2/e;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.auto_loans_composite_broker.v2.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28717f implements dagger.internal.h<C28716e> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f95636c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f95637a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.text.a> f95638b;

    /* compiled from: AdvertDetailsCompositeBrokerV2Blueprint_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/f$a;", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.auto_loans_composite_broker.v2.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C28717f(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f95637a = uVar;
        this.f95638b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28718g interfaceC28718g = (InterfaceC28718g) this.f95637a.get();
        com.avito.android.util.text.a aVar = this.f95638b.get();
        f95636c.getClass();
        return new C28716e(interfaceC28718g, aVar);
    }
}
