package com.avito.android.orders_aggregation;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import i50.AbstractC41226a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OrdersAggregationViewModelImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/orders_aggregation/x;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/orders_aggregation/x$a;", "Lcom/avito/android/orders_aggregation/x$b;", "Lcom/avito/android/orders_aggregation/x$c;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class x {

    /* compiled from: OrdersAggregationViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/x$a;", "Lcom/avito/android/orders_aggregation/x;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f210363a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f210364b;

        public a(@Y61.k String str, @Y61.l String str2) {
            super(null);
            this.f210363a = str;
            this.f210364b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f210363a, aVar.f210363a) && L.f(this.f210364b, aVar.f210364b);
        }

        public final int hashCode() {
            int iHashCode = this.f210363a.hashCode() * 31;
            String str = this.f210364b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FullScreenError(message=");
            sb2.append(this.f210363a);
            sb2.append(", activeTabShortcut=");
            return C22026a.c(sb2, this.f210364b, ')');
        }

        public /* synthetic */ a(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }
    }

    /* compiled from: OrdersAggregationViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orders_aggregation/x$c;", "Lcom/avito/android/orders_aggregation/x;", "<init>", "()V", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f210371a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ x(C42822w c42822w) {
        this();
    }

    /* compiled from: OrdersAggregationViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/x$b;", "Lcom/avito/android/orders_aggregation/x;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f210365a;

        /* renamed from: b, reason: collision with root package name */
        public final int f210366b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<AbstractC41226a> f210367c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f210368d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f210369e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f210370f;

        public /* synthetic */ b(String str, int i12, List list, String str2, boolean z12, boolean z13, int i13, C42822w c42822w) {
            this(i12, str, (i13 & 8) != 0 ? "" : str2, list, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? false : z13);
        }

        public static b a(b bVar, int i12, String str, boolean z12, int i13) {
            if ((i13 & 2) != 0) {
                i12 = bVar.f210366b;
            }
            int i14 = i12;
            if ((i13 & 8) != 0) {
                str = bVar.f210368d;
            }
            String str2 = str;
            if ((i13 & 16) != 0) {
                z12 = bVar.f210369e;
            }
            return new b(i14, bVar.f210365a, str2, bVar.f210367c, z12, (i13 & 32) != 0 ? bVar.f210370f : true);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f210365a, bVar.f210365a) && this.f210366b == bVar.f210366b && L.f(this.f210367c, bVar.f210367c) && L.f(this.f210368d, bVar.f210368d) && this.f210369e == bVar.f210369e && this.f210370f == bVar.f210370f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f210370f) + androidx.appcompat.app.r.i(H.d(H.e(androidx.appcompat.app.r.e(this.f210366b, this.f210365a.hashCode() * 31, 31), 31, this.f210367c), 31, this.f210368d), 31, this.f210369e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(title=");
            sb2.append(this.f210365a);
            sb2.append(", activeTabPosition=");
            sb2.append(this.f210366b);
            sb2.append(", tabItems=");
            sb2.append(this.f210367c);
            sb2.append(", generalOrdersSearchQuery=");
            sb2.append(this.f210368d);
            sb2.append(", generalOrdersSearchExpanded=");
            sb2.append(this.f210369e);
            sb2.append(", generalContentLoaded=");
            return androidx.appcompat.app.r.x(sb2, this.f210370f, ')');
        }

        public b(int i12, @Y61.k String str, @Y61.k String str2, @Y61.k List list, boolean z12, boolean z13) {
            super(null);
            this.f210365a = str;
            this.f210366b = i12;
            this.f210367c = list;
            this.f210368d = str2;
            this.f210369e = z12;
            this.f210370f = z13;
        }
    }

    public x() {
    }
}
