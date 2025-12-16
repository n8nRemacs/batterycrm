package tz0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersOpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Ltz0/b;", "", "a", "b", "c", "Ltz0/b$a;", "Ltz0/b$b;", "Ltz0/b$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC48746b {

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltz0/b$a;", "Ltz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.b$a */
    public static final /* data */ class a implements InterfaceC48746b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f439712a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 981628780;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz0/b$b;", "Ltz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12698b implements InterfaceC48746b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f439713a;

        public C12698b(@k DeepLink deepLink) {
            this.f439713a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12698b) && L.f(this.f439713a, ((C12698b) obj).f439713a);
        }

        public final int hashCode() {
            return this.f439713a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f439713a, ')');
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz0/b$c;", "Ltz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.b$c */
    public static final /* data */ class c implements InterfaceC48746b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrOrdersFiltersOpenParams f439714a;

        public c(@k StrOrdersFiltersOpenParams strOrdersFiltersOpenParams) {
            this.f439714a = strOrdersFiltersOpenParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f439714a, ((c) obj).f439714a);
        }

        public final int hashCode() {
            return this.f439714a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenFilters(openParams=" + this.f439714a + ')';
        }
    }
}
