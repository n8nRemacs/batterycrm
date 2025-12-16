package com.avito.android.profile.user_profile.cards.active_orders;

import com.avito.android.activeOrders.OrdersNeedActionResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActiveOrdersDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/active_orders/q;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/profile/user_profile/cards/active_orders/q$a;", "Lcom/avito/android/profile/user_profile/cards/active_orders/q$b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
abstract class q {

    /* compiled from: ActiveOrdersDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/active_orders/q$a;", "Lcom/avito/android/profile/user_profile/cards/active_orders/q;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f224674a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: ActiveOrdersDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/active_orders/q$b;", "Lcom/avito/android/profile/user_profile/cards/active_orders/q;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final OrdersNeedActionResponse f224675a;

        public b(@Y61.k OrdersNeedActionResponse ordersNeedActionResponse) {
            super(null);
            this.f224675a = ordersNeedActionResponse;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f224675a, ((b) obj).f224675a);
        }

        public final int hashCode() {
            return this.f224675a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Update(response=" + this.f224675a + ')';
        }
    }

    public /* synthetic */ q(C42822w c42822w) {
        this();
    }

    public q() {
    }
}
