package PF0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsStatusAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LPF0/a;", "", "a", "b", "c", "d", "LPF0/a$a;", "LPF0/a$b;", "LPF0/a$c;", "LPF0/a$d;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TrxPromoGoodsStatusAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPF0/a$a;", "LPF0/a;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PF0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0836a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0836a f12913a = new C0836a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0836a);
        }

        public final int hashCode() {
            return 284434103;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: TrxPromoGoodsStatusAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPF0/a$b;", "LPF0/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f12914a;

        public b(@k DeepLink deepLink) {
            this.f12914a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f12914a, ((b) obj).f12914a);
        }

        public final int hashCode() {
            return this.f12914a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplinkClicked(deeplink="), this.f12914a, ')');
        }
    }

    /* compiled from: TrxPromoGoodsStatusAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPF0/a$c;", "LPF0/a;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f12915a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -276102946;
        }

        @k
        public final String toString() {
            return "OnNextButtonClicked";
        }
    }

    /* compiled from: TrxPromoGoodsStatusAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPF0/a$d;", "LPF0/a;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f12916a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 455444067;
        }

        @k
        public final String toString() {
            return "OnRetryClicked";
        }
    }
}
