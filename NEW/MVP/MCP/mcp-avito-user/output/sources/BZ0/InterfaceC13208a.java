package Bz0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersDialogAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LBz0/a;", "", "a", "b", "c", "d", "LBz0/a$a;", "LBz0/a$b;", "LBz0/a$c;", "LBz0/a$d;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13208a {

    /* compiled from: StrSellerOrdersDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBz0/a$a;", "LBz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0081a implements InterfaceC13208a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ButtonAction f1821a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final SuggestAnalyticsEvent f1822b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f1823c;

        public C0081a(@l SuggestAnalyticsEvent suggestAnalyticsEvent, @k ButtonAction buttonAction, @k String str) {
            this.f1821a = buttonAction;
            this.f1822b = suggestAnalyticsEvent;
            this.f1823c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0081a)) {
                return false;
            }
            C0081a c0081a = (C0081a) obj;
            return L.f(this.f1821a, c0081a.f1821a) && L.f(this.f1822b, c0081a.f1822b) && L.f(this.f1823c, c0081a.f1823c);
        }

        public final int hashCode() {
            int iHashCode = this.f1821a.hashCode() * 31;
            SuggestAnalyticsEvent suggestAnalyticsEvent = this.f1822b;
            return this.f1823c.hashCode() + ((iHashCode + (suggestAnalyticsEvent == null ? 0 : suggestAnalyticsEvent.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonClick(buttonAction=");
            sb2.append(this.f1821a);
            sb2.append(", clickstreamEvent=");
            sb2.append(this.f1822b);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f1823c, ')');
        }
    }

    /* compiled from: StrSellerOrdersDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBz0/a$b;", "LBz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.a$b */
    public static final /* data */ class b implements InterfaceC13208a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f1824a;

        public b(@k DeepLink deepLink) {
            this.f1824a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f1824a, ((b) obj).f1824a);
        }

        public final int hashCode() {
            return this.f1824a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OrderClick(deeplink="), this.f1824a, ')');
        }
    }

    /* compiled from: StrSellerOrdersDialogAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LBz0/a$c;", "LBz0/a;", "<init>", "()V", "a", "b", "LBz0/a$c$a;", "LBz0/a$c$b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.a$c */
    public static abstract class c implements InterfaceC13208a {

        /* compiled from: StrSellerOrdersDialogAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBz0/a$c$a;", "LBz0/a$c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Bz0.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C0082a extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0082a f1825a = new C0082a();

            public C0082a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0082a);
            }

            public final int hashCode() {
                return -2059634019;
            }

            @k
            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: StrSellerOrdersDialogAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBz0/a$c$b;", "LBz0/a$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Bz0.a$c$b */
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f1826a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Throwable f1827b;

            public b(@k PrintableText printableText, @k Throwable th2) {
                super(null);
                this.f1826a = printableText;
                this.f1827b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f1826a, bVar.f1826a) && L.f(this.f1827b, bVar.f1827b);
            }

            public final int hashCode() {
                return this.f1827b.hashCode() + (this.f1826a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowErrorToast(text=");
                sb2.append(this.f1826a);
                sb2.append(", throwable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f1827b, ')');
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: StrSellerOrdersDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBz0/a$d;", "LBz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.a$d */
    public static final /* data */ class d implements InterfaceC13208a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrSellerOrdersDialogData f1828a;

        public d(@k StrSellerOrdersDialogData strSellerOrdersDialogData) {
            this.f1828a = strSellerOrdersDialogData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f1828a, ((d) obj).f1828a);
        }

        public final int hashCode() {
            return this.f1828a.hashCode();
        }

        @k
        public final String toString() {
            return "ReceiveNewDialogData(dialogData=" + this.f1828a + ')';
        }
    }
}
