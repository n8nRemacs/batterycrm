package com.avito.android.orders.badge_counter;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.internal.operators.observable.L;
import iz.C42140a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.rx3.y;

/* compiled from: OrdersBadgeCounterRepositoryImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orders/badge_counter/f;", "Lcom/avito/android/orders/badge_counter/e;", "LW40/b;", "c", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e, W40.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f209944e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<X40.a> f209945a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f209946b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f209947c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<OrdersBadgeState> f209948d = com.jakewharton.rxrelay3.b.N0(OrdersBadgeState.f209935b);

    /* compiled from: OrdersBadgeCounterRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljz/b;", "it", "Lkotlin/G0;", "accept", "(Ljz/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            f.this.invalidate();
        }
    }

    /* compiled from: OrdersBadgeCounterRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f209950b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Employee mode changes error in orders counter", (Throwable) obj);
        }
    }

    /* compiled from: OrdersBadgeCounterRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/orders/badge_counter/f$c;", "", "<init>", "()V", "", "GONE_BADGE_COUNT", "I", "VIEW_BADGE_COUNT", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: OrdersBadgeCounterRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[OrdersBadgeState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OrdersBadgeState ordersBadgeState = OrdersBadgeState.f209935b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OrdersBadgeState ordersBadgeState2 = OrdersBadgeState.f209935b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new c(null);
    }

    @Inject
    public f(@Y61.k h31.e<X40.a> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k E e12, @Y61.k InterfaceC41196a interfaceC41196a) {
        this.f209945a = eVar;
        this.f209946b = interfaceC35745a5;
        this.f209947c = e12;
        y.b(interfaceC41196a.g(new C42140a(false, false, 3, null))).j0(interfaceC35745a5.e()).u0(new a(), b.f209950b);
    }

    @Override // com.avito.android.orders.badge_counter.e
    @Y61.k
    public final L a() {
        return this.f209948d.T(new g(this), Integer.MAX_VALUE).d0(new h(this)).x0(this.f209946b.a()).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // W40.b
    public final void b() {
        this.f209948d.accept(OrdersBadgeState.f209937d);
    }

    @Override // com.avito.android.orders.badge_counter.e
    public final void invalidate() {
        this.f209948d.accept(OrdersBadgeState.f209935b);
    }
}
