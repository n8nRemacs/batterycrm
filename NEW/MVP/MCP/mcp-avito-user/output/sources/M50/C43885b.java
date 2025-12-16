package m50;

import X41.n;
import Y61.k;
import com.avito.android.orders_aggregation_core.deeplink.OrdersAggregationLink;
import com.avito.android.orders_aggregation_core.e;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: OrdersAggregationDeeplinkHandlerModule_ProvideOrdersAggregationDeeplinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lm50/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_orders-aggregation-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m50.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C43885b implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f414309b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.orders_aggregation_core.c f414310a;

    /* compiled from: OrdersAggregationDeeplinkHandlerModule_ProvideOrdersAggregationDeeplinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm50/b$a;", "", "<init>", "()V", "_avito_orders-aggregation-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m50.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k com.avito.android.orders_aggregation_core.c cVar) {
            C43884a.f414308a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(OrdersAggregationLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(OrdersAggregationLink.class), cVar));
        }

        public a() {
        }
    }

    public C43885b(@k com.avito.android.orders_aggregation_core.c cVar) {
        this.f414310a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.orders_aggregation_core.c cVar = this.f414310a;
        f414309b.getClass();
        return a.a(cVar);
    }
}
