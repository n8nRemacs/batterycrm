package com.avito.android.active_orders_common.items.diff;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.active_orders_common.items.all_orders.AllOrdersItem;
import com.avito.android.active_orders_common.items.all_orders.Icon;
import com.avito.android.active_orders_common.items.order.OrderItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.L3;
import com.avito.android.util.M3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActiveOrdersDiffCallback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/active_orders_common/items/diff/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "a", "b", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends C23424o.f<TV0.a> {

    /* compiled from: ActiveOrdersDiffCallback.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/diff/a$a;", "", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.active_orders_common.items.diff.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2138a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final L3<String> f68349a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final L3<DeepLink> f68350b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final L3<Icon> f68351c;

        public C2138a(@k L3<String> l32, @k L3<DeepLink> l33, @k L3<Icon> l34) {
            this.f68349a = l32;
            this.f68350b = l33;
            this.f68351c = l34;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2138a)) {
                return false;
            }
            C2138a c2138a = (C2138a) obj;
            return L.f(this.f68349a, c2138a.f68349a) && L.f(this.f68350b, c2138a.f68350b) && L.f(this.f68351c, c2138a.f68351c);
        }

        public final int hashCode() {
            return this.f68351c.hashCode() + com.avito.android.actions_sheet.a.k(this.f68350b, this.f68349a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "AllOrdersItemPayload(title=" + this.f68349a + ", deepLink=" + this.f68350b + ", icon=" + this.f68351c + ')';
        }
    }

    /* compiled from: ActiveOrdersDiffCallback.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/diff/a$b;", "", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final L3<String> f68352a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final L3<AttributedText> f68353b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final L3<Image> f68354c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final L3<Boolean> f68355d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final L3<DeepLink> f68356e;

        public b(@k L3<String> l32, @k L3<AttributedText> l33, @k L3<Image> l34, @k L3<Boolean> l35, @k L3<DeepLink> l36) {
            this.f68352a = l32;
            this.f68353b = l33;
            this.f68354c = l34;
            this.f68355d = l35;
            this.f68356e = l36;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f68352a, bVar.f68352a) && L.f(this.f68353b, bVar.f68353b) && L.f(this.f68354c, bVar.f68354c) && L.f(this.f68355d, bVar.f68355d) && L.f(this.f68356e, bVar.f68356e);
        }

        public final int hashCode() {
            return this.f68356e.hashCode() + com.avito.android.actions_sheet.a.k(this.f68355d, com.avito.android.actions_sheet.a.k(this.f68354c, com.avito.android.actions_sheet.a.k(this.f68353b, this.f68352a.hashCode() * 31, 31), 31), 31);
        }

        @k
        public final String toString() {
            return "OrderItemPayload(title=" + this.f68352a + ", description=" + this.f68353b + ", image=" + this.f68354c + ", isMultipleItems=" + this.f68355d + ", deepLink=" + this.f68356e + ')';
        }
    }

    @Inject
    public a() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF80070b() == aVar4.getF80070b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (aVar3.getF80070b() != aVar4.getF80070b()) {
            return null;
        }
        if (!(aVar3 instanceof OrderItem) || !(aVar4 instanceof OrderItem)) {
            if (!(aVar3 instanceof AllOrdersItem) || !(aVar4 instanceof AllOrdersItem)) {
                return null;
            }
            AllOrdersItem allOrdersItem = (AllOrdersItem) aVar4;
            return new C2138a(M3.a(new i(aVar3), allOrdersItem.getF68296c()), M3.a(new c(aVar3), allOrdersItem.getF68297d()), M3.a(new e(aVar3), allOrdersItem.getF68298e()));
        }
        OrderItem orderItem = (OrderItem) aVar4;
        return new b(M3.a(new h(aVar3), orderItem.getF68367c()), M3.a(new d(aVar3), orderItem.getF68368d()), M3.a(new f(aVar3), orderItem.getF68369e()), M3.a(new g(aVar3), Boolean.valueOf(orderItem.getF68371g())), M3.a(new com.avito.android.active_orders_common.items.diff.b(aVar3), orderItem.getF68370f()));
    }
}
