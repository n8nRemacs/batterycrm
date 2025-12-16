package qz0;

import Y61.k;
import Y61.l;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lqz0/b;", "", "a", "b", "Lqz0/b$a;", "Lqz0/b$b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47468b {

    /* compiled from: StrOrdersFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqz0/b$a;", "Lqz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qz0.b$a */
    public static final /* data */ class a implements InterfaceC47468b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f429545a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 658886472;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: StrOrdersFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqz0/b$b;", "Lqz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qz0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12349b implements InterfaceC47468b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrOrdersFiltersResult f429546a;

        public C12349b(@k StrOrdersFiltersResult strOrdersFiltersResult) {
            this.f429546a = strOrdersFiltersResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12349b) && L.f(this.f429546a, ((C12349b) obj).f429546a);
        }

        public final int hashCode() {
            return this.f429546a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(result=" + this.f429546a + ')';
        }
    }
}
