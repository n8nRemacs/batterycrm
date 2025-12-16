package yz0;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lyz0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "Lyz0/b$a;", "Lyz0/b$b;", "Lyz0/b$c;", "Lyz0/b$d;", "Lyz0/b$e;", "Lyz0/b$f;", "Lyz0/b$g;", "Lyz0/b$h;", "Lyz0/b$i;", "Lyz0/b$j;", "Lyz0/b$k;", "Lyz0/b$l;", "Lyz0/b$m;", "Lyz0/b$n;", "Lyz0/b$o;", "Lyz0/b$p;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50328b {

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/b$a;", "Lyz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$a */
    public static final /* data */ class a implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f443630a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 477677147;
        }

        @Y61.k
        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/b$b;", "Lyz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12935b implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f443631a;

        public C12935b(@Y61.k DeepLink deepLink) {
            this.f443631a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12935b) && L.f(this.f443631a, ((C12935b) obj).f443631a);
        }

        public final int hashCode() {
            return this.f443631a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("BannerClicked(deeplink="), this.f443631a, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/b$c;", "Lyz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$c */
    public static final /* data */ class c implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f443632a;

        public c(@Y61.k DeepLink deepLink) {
            this.f443632a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f443632a, ((c) obj).f443632a);
        }

        public final int hashCode() {
            return this.f443632a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("CalendarWidgetClicked(deeplink="), this.f443632a, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/b$d;", "Lyz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$d */
    public static final /* data */ class d implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ButtonAction f443633a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f443634b;

        public d(@Y61.k ButtonAction buttonAction, @Y61.k String str) {
            this.f443633a = buttonAction;
            this.f443634b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f443633a, dVar.f443633a) && L.f(this.f443634b, dVar.f443634b);
        }

        public final int hashCode() {
            return this.f443634b.hashCode() + (this.f443633a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ConfirmationDialogApproveClick(buttonAction=");
            sb2.append(this.f443633a);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f443634b, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/b$e;", "Lyz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$e */
    public static final /* data */ class e implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ButtonAction f443635a;

        public e(@Y61.k ButtonAction buttonAction) {
            this.f443635a = buttonAction;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f443635a, ((e) obj).f443635a);
        }

        public final int hashCode() {
            return this.f443635a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ConfirmationDialogCancelClick(buttonAction=" + this.f443635a + ')';
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/b$f;", "Lyz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$f */
    public static final /* data */ class f implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f443636a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1911922441;
        }

        @Y61.k
        public final String toString() {
            return "DeeplinkClosed";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/b$g;", "Lyz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$g */
    public static final /* data */ class g implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f443637a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1212921506;
        }

        @Y61.k
        public final String toString() {
            return "ImportantToNoteDialogClosed";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/b$h;", "Lyz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$h */
    public static final /* data */ class h implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443638a;

        public h(@Y61.k String str) {
            this.f443638a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f443638a, ((h) obj).f443638a);
        }

        public final int hashCode() {
            return this.f443638a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ImportantToNoteGroupClick(groupId="), this.f443638a, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/b$i;", "Lyz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$i */
    public static final /* data */ class i implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final SuggestAnalyticsEvent f443639a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ButtonAction f443640b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f443641c;

        public i(@Y61.l SuggestAnalyticsEvent suggestAnalyticsEvent, @Y61.k ButtonAction buttonAction, @Y61.k String str) {
            this.f443639a = suggestAnalyticsEvent;
            this.f443640b = buttonAction;
            this.f443641c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f443639a, iVar.f443639a) && L.f(this.f443640b, iVar.f443640b) && L.f(this.f443641c, iVar.f443641c);
        }

        public final int hashCode() {
            SuggestAnalyticsEvent suggestAnalyticsEvent = this.f443639a;
            return this.f443641c.hashCode() + ((this.f443640b.hashCode() + ((suggestAnalyticsEvent == null ? 0 : suggestAnalyticsEvent.hashCode()) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OrderButtonClick(clickstreamEvent=");
            sb2.append(this.f443639a);
            sb2.append(", buttonAction=");
            sb2.append(this.f443640b);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f443641c, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/b$j;", "Lyz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$j */
    public static final /* data */ class j implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f443642a;

        public j(@Y61.k DeepLink deepLink) {
            this.f443642a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f443642a, ((j) obj).f443642a);
        }

        public final int hashCode() {
            return this.f443642a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OrderClicked(deeplink="), this.f443642a, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/b$k;", "Lyz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$k */
    public static final /* data */ class k implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f443643a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1916919424;
        }

        @Y61.k
        public final String toString() {
            return "RefreshSwiped";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/b$l;", "Lyz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$l */
    public static final /* data */ class l implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f443644a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1192884562;
        }

        @Y61.k
        public final String toString() {
            return "RetryButtonClicked";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/b$m;", "Lyz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$m */
    public static final /* data */ class m implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f443645a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1003872021;
        }

        @Y61.k
        public final String toString() {
            return "ReturnFromStrOrdersCalendar";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/b$n;", "Lyz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$n */
    public static final /* data */ class n implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f443646a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 511827353;
        }

        @Y61.k
        public final String toString() {
            return "ScrolledToStubs";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/b$o;", "Lyz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$o */
    public static final /* data */ class o implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443647a;

        public o(@Y61.k String str) {
            this.f443647a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f443647a, ((o) obj).f443647a);
        }

        public final int hashCode() {
            return this.f443647a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SectionSelected(sectionId="), this.f443647a, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz0/b$p;", "Lyz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yz0.b$p */
    public static final /* data */ class p implements InterfaceC50328b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f443648a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -888467136;
        }

        @Y61.k
        public final String toString() {
            return "WebViewClosed";
        }
    }
}
