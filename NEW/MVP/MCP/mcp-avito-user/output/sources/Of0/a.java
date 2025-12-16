package OF0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsDatePickerAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LOF0/a;", "", "a", "b", "c", "d", "e", "LOF0/a$a;", "LOF0/a$b;", "LOF0/a$c;", "LOF0/a$d;", "LOF0/a$e;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TrxPromoGoodsDatePickerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOF0/a$a;", "LOF0/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: OF0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0781a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f12099a;

        public C0781a(@k DeepLink deepLink) {
            this.f12099a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0781a) && L.f(this.f12099a, ((C0781a) obj).f12099a);
        }

        public final int hashCode() {
            return this.f12099a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnButtonClicked(deeplink="), this.f12099a, ')');
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOF0/a$b;", "LOF0/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.lib.design.picker.k<?> f12100a;

        public b(@k com.avito.android.lib.design.picker.k<?> kVar) {
            this.f12100a = kVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f12100a, ((b) obj).f12100a);
        }

        public final int hashCode() {
            return this.f12100a.hashCode();
        }

        @k
        public final String toString() {
            return "OnDayWheelSelectionChanged(value=" + this.f12100a + ')';
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOF0/a$c;", "LOF0/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f12101a;

        public c(@k DeepLink deepLink) {
            this.f12101a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12101a, ((c) obj).f12101a);
        }

        public final int hashCode() {
            return this.f12101a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClicked(deeplink="), this.f12101a, ')');
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOF0/a$d;", "LOF0/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.lib.design.picker.k<?> f12102a;

        public d(@k com.avito.android.lib.design.picker.k<?> kVar) {
            this.f12102a = kVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f12102a, ((d) obj).f12102a);
        }

        public final int hashCode() {
            return this.f12102a.hashCode();
        }

        @k
        public final String toString() {
            return "OnMonthWheelSelectionChanged(value=" + this.f12102a + ')';
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOF0/a$e;", "LOF0/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.lib.design.picker.k<?> f12103a;

        public e(@k com.avito.android.lib.design.picker.k<?> kVar) {
            this.f12103a = kVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f12103a, ((e) obj).f12103a);
        }

        public final int hashCode() {
            return this.f12103a.hashCode();
        }

        @k
        public final String toString() {
            return "OnYearWheelSelectionChanged(value=" + this.f12103a + ')';
        }
    }
}
