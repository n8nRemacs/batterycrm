package com.avito.android.service_orders.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_orders.list.blueprints.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/service_orders/mvi/entity/a$a;", "Lcom/avito/android/service_orders/mvi/entity/a$b;", "Lcom/avito/android/service_orders/mvi/entity/a$c;", "Lcom/avito/android/service_orders/mvi/entity/a$d;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    /* compiled from: ServiceOrdersListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/a$a;", "Lcom/avito/android/service_orders/mvi/entity/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_orders.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8311a extends a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f279587a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279588b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f279589c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f279590d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f279591e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f279592f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final DeepLink f279593g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final f f279594h;

        public /* synthetic */ C8311a(String str, String str2, boolean z12, String str3, DeepLink deepLink, String str4, DeepLink deepLink2, f fVar, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? false : z12, str3, deepLink, str4, deepLink2, fVar);
        }

        public static C8311a a(C8311a c8311a, boolean z12) {
            String str = c8311a.f279587a;
            String str2 = c8311a.f279588b;
            String str3 = c8311a.f279590d;
            DeepLink deepLink = c8311a.f279591e;
            String str4 = c8311a.f279592f;
            DeepLink deepLink2 = c8311a.f279593g;
            f fVar = c8311a.f279594h;
            c8311a.getClass();
            return new C8311a(str, str2, z12, str3, deepLink, str4, deepLink2, fVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8311a)) {
                return false;
            }
            C8311a c8311a = (C8311a) obj;
            return L.f(this.f279587a, c8311a.f279587a) && L.f(this.f279588b, c8311a.f279588b) && this.f279589c == c8311a.f279589c && L.f(this.f279590d, c8311a.f279590d) && L.f(this.f279591e, c8311a.f279591e) && L.f(this.f279592f, c8311a.f279592f) && L.f(this.f279593g, c8311a.f279593g) && L.f(this.f279594h, c8311a.f279594h);
        }

        public final int hashCode() {
            String str = this.f279587a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f279588b;
            int i12 = r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f279589c);
            String str3 = this.f279590d;
            int iHashCode2 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.f279591e;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str4 = this.f279592f;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            DeepLink deepLink2 = this.f279593g;
            int iHashCode5 = (iHashCode4 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
            f fVar = this.f279594h;
            return iHashCode5 + (fVar != null ? fVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Empty(title=" + this.f279587a + ", subtitle=" + this.f279588b + ", isRefreshing=" + this.f279589c + ", secondaryButtonTitle=" + this.f279590d + ", secondaryButtonLink=" + this.f279591e + ", calendarButtonTitle=" + this.f279592f + ", calendarButtonLink=" + this.f279593g + ", managementPanels=" + this.f279594h + ')';
        }

        public C8311a(@l String str, @l String str2, boolean z12, @l String str3, @l DeepLink deepLink, @l String str4, @l DeepLink deepLink2, @l f fVar) {
            super(null);
            this.f279587a = str;
            this.f279588b = str2;
            this.f279589c = z12;
            this.f279590d = str3;
            this.f279591e = deepLink;
            this.f279592f = str4;
            this.f279593g = deepLink2;
            this.f279594h = fVar;
        }
    }

    /* compiled from: ServiceOrdersListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/a$b;", "Lcom/avito/android/service_orders/mvi/entity/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f279595a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279596b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f279597c;

        public /* synthetic */ b(String str, String str2, boolean z12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? true : z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f279595a, bVar.f279595a) && L.f(this.f279596b, bVar.f279596b) && this.f279597c == bVar.f279597c;
        }

        public final int hashCode() {
            int iHashCode = this.f279595a.hashCode() * 31;
            String str = this.f279596b;
            return Boolean.hashCode(this.f279597c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FullScreenError(message=");
            sb2.append(this.f279595a);
            sb2.append(", title=");
            sb2.append(this.f279596b);
            sb2.append(", hasReloadButton=");
            return r.x(sb2, this.f279597c, ')');
        }

        public b(@k String str, @l String str2, boolean z12) {
            super(null);
            this.f279595a = str;
            this.f279596b = str2;
            this.f279597c = z12;
        }
    }

    /* compiled from: ServiceOrdersListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/a$c;", "Lcom/avito/android/service_orders/mvi/entity/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f279598a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279599b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f279600c;

        public c(@l String str, @k List list, boolean z12) {
            super(null);
            this.f279598a = list;
            this.f279599b = str;
            this.f279600c = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static c a(c cVar, ArrayList arrayList, String str, boolean z12, int i12) {
            List list = arrayList;
            if ((i12 & 1) != 0) {
                list = cVar.f279598a;
            }
            if ((i12 & 2) != 0) {
                str = cVar.f279599b;
            }
            if ((i12 & 4) != 0) {
                z12 = cVar.f279600c;
            }
            cVar.getClass();
            return new c(str, list, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f279598a, cVar.f279598a) && L.f(this.f279599b, cVar.f279599b) && this.f279600c == cVar.f279600c;
        }

        public final int hashCode() {
            int iHashCode = this.f279598a.hashCode() * 31;
            String str = this.f279599b;
            return Boolean.hashCode(this.f279600c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(items=");
            sb2.append(this.f279598a);
            sb2.append(", page=");
            sb2.append(this.f279599b);
            sb2.append(", isRefreshing=");
            return r.x(sb2, this.f279600c, ')');
        }
    }

    /* compiled from: ServiceOrdersListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/a$d;", "Lcom/avito/android/service_orders/mvi/entity/a;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends a {
        static {
            new d();
        }

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -357807633;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
