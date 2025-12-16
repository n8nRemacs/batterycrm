package Bz0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersDialogOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LBz0/b;", "", "a", "b", "c", "d", "LBz0/b$a;", "LBz0/b$b;", "LBz0/b$c;", "LBz0/b$d;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13209b {

    /* compiled from: StrSellerOrdersDialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBz0/b$a;", "LBz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.b$a */
    public static final /* data */ class a implements InterfaceC13209b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f1829a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 94042948;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: StrSellerOrdersDialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBz0/b$b;", "LBz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0083b implements InterfaceC13209b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ButtonAction f1830a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final SuggestAnalyticsEvent f1831b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f1832c;

        public C0083b(@l SuggestAnalyticsEvent suggestAnalyticsEvent, @k ButtonAction buttonAction, @k String str) {
            this.f1830a = buttonAction;
            this.f1831b = suggestAnalyticsEvent;
            this.f1832c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0083b)) {
                return false;
            }
            C0083b c0083b = (C0083b) obj;
            return L.f(this.f1830a, c0083b.f1830a) && L.f(this.f1831b, c0083b.f1831b) && L.f(this.f1832c, c0083b.f1832c);
        }

        public final int hashCode() {
            int iHashCode = this.f1830a.hashCode() * 31;
            SuggestAnalyticsEvent suggestAnalyticsEvent = this.f1831b;
            return this.f1832c.hashCode() + ((iHashCode + (suggestAnalyticsEvent == null ? 0 : suggestAnalyticsEvent.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyOrderButtonClick(buttonAction=");
            sb2.append(this.f1830a);
            sb2.append(", clickstreamEvent=");
            sb2.append(this.f1831b);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f1832c, ')');
        }
    }

    /* compiled from: StrSellerOrdersDialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBz0/b$c;", "LBz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.b$c */
    public static final /* data */ class c implements InterfaceC13209b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f1833a;

        public c(@k DeepLink deepLink) {
            this.f1833a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f1833a, ((c) obj).f1833a);
        }

        public final int hashCode() {
            return this.f1833a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("NotifyOrderClicked(deepLink="), this.f1833a, ')');
        }
    }

    /* compiled from: StrSellerOrdersDialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBz0/b$d;", "LBz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.b$d */
    public static final /* data */ class d implements InterfaceC13209b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f1834a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f1835b;

        public d(@k PrintableText printableText, @k Throwable th2) {
            this.f1834a = printableText;
            this.f1835b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f1834a, dVar.f1834a) && L.f(this.f1835b, dVar.f1835b);
        }

        public final int hashCode() {
            return this.f1835b.hashCode() + (this.f1834a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(text=");
            sb2.append(this.f1834a);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f1835b, ')');
        }
    }
}
