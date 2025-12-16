package yz0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lyz0/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lyz0/c$a;", "Lyz0/c$b;", "Lyz0/c$c;", "Lyz0/c$d;", "Lyz0/c$e;", "Lyz0/c$f;", "Lyz0/c$g;", "Lyz0/c$h;", "Lyz0/c$i;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50329c {

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/c$a;", "Lyz0/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.c$a */
    public static final /* data */ class a implements InterfaceC50329c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f443649a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1860711284;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/c$b;", "Lyz0/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.c$b */
    public static final /* data */ class b implements InterfaceC50329c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f443650a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1436315728;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/c$c;", "Lyz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12936c implements InterfaceC50329c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443651a;

        public C12936c(@k DeepLink deepLink) {
            this.f443651a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12936c) && L.f(this.f443651a, ((C12936c) obj).f443651a);
        }

        public final int hashCode() {
            return this.f443651a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f443651a, ')');
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/c$d;", "Lyz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.c$d */
    public static final /* data */ class d implements InterfaceC50329c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrSellerOrdersDialogData f443652a;

        public d(@k StrSellerOrdersDialogData strSellerOrdersDialogData) {
            this.f443652a = strSellerOrdersDialogData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f443652a, ((d) obj).f443652a);
        }

        public final int hashCode() {
            return this.f443652a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenSellerOrdersDialog(dialogData=" + this.f443652a + ')';
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/c$e;", "Lyz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.c$e */
    public static final /* data */ class e implements InterfaceC50329c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443653a;

        public e(@k String str) {
            this.f443653a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f443653a, ((e) obj).f443653a);
        }

        public final int hashCode() {
            return this.f443653a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenWebView(url="), this.f443653a, ')');
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/c$f;", "Lyz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.c$f */
    public static final /* data */ class f implements InterfaceC50329c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrSellerOrdersDialogData f443654a;

        public f(@k StrSellerOrdersDialogData strSellerOrdersDialogData) {
            this.f443654a = strSellerOrdersDialogData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f443654a, ((f) obj).f443654a);
        }

        public final int hashCode() {
            return this.f443654a.hashCode();
        }

        @k
        public final String toString() {
            return "PassNewDialogData(dialogData=" + this.f443654a + ')';
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/c$g;", "Lyz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.c$g */
    public static final /* data */ class g implements InterfaceC50329c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ButtonAction f443655a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f443656b;

        public g(@k ButtonAction buttonAction, @k String str) {
            this.f443655a = buttonAction;
            this.f443656b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f443655a, gVar.f443655a) && L.f(this.f443656b, gVar.f443656b);
        }

        public final int hashCode() {
            return this.f443656b.hashCode() + (this.f443655a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowConfirmationBottomSheet(buttonAction=");
            sb2.append(this.f443655a);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f443656b, ')');
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/c$h;", "Lyz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.c$h */
    public static final /* data */ class h implements InterfaceC50329c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f443657a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f443658b;

        public h(@k PrintableText printableText, @k Throwable th2) {
            this.f443657a = printableText;
            this.f443658b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f443657a, hVar.f443657a) && L.f(this.f443658b, hVar.f443658b);
        }

        public final int hashCode() {
            return this.f443658b.hashCode() + (this.f443657a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(text=");
            sb2.append(this.f443657a);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f443658b, ')');
        }
    }

    /* compiled from: StrSellerOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/c$i;", "Lyz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.c$i */
    public static final /* data */ class i implements InterfaceC50329c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SK0.f f443659a;

        public i(@k SK0.f fVar) {
            this.f443659a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f443659a, ((i) obj).f443659a);
        }

        public final int hashCode() {
            return this.f443659a.f14906a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUxFeedback(properties=" + this.f443659a + ')';
        }
    }
}
