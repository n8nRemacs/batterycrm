package Dz0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SharedViewModelAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LDz0/a;", "", "a", "b", "c", "d", "e", "f", "LDz0/a$a;", "LDz0/a$b;", "LDz0/a$c;", "LDz0/a$d;", "LDz0/a$e;", "LDz0/a$f;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13463a {

    /* compiled from: SharedViewModelAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDz0/a$a;", "LDz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dz0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0205a implements InterfaceC13463a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0205a f3590a = new C0205a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0205a);
        }

        public final int hashCode() {
            return -845102187;
        }

        @k
        public final String toString() {
            return "NotifyClosed";
        }
    }

    /* compiled from: SharedViewModelAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/a$b;", "LDz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dz0.a$b */
    public static final /* data */ class b implements InterfaceC13463a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final SuggestAnalyticsEvent f3591a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ButtonAction f3592b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f3593c;

        public b(@l SuggestAnalyticsEvent suggestAnalyticsEvent, @k ButtonAction buttonAction, @k String str) {
            this.f3591a = suggestAnalyticsEvent;
            this.f3592b = buttonAction;
            this.f3593c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f3591a, bVar.f3591a) && L.f(this.f3592b, bVar.f3592b) && L.f(this.f3593c, bVar.f3593c);
        }

        public final int hashCode() {
            SuggestAnalyticsEvent suggestAnalyticsEvent = this.f3591a;
            return this.f3593c.hashCode() + ((this.f3592b.hashCode() + ((suggestAnalyticsEvent == null ? 0 : suggestAnalyticsEvent.hashCode()) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyOrderButtonClicked(analyticsEvent=");
            sb2.append(this.f3591a);
            sb2.append(", buttonAction=");
            sb2.append(this.f3592b);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f3593c, ')');
        }
    }

    /* compiled from: SharedViewModelAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/a$c;", "LDz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dz0.a$c */
    public static final /* data */ class c implements InterfaceC13463a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f3594a;

        public c(@k DeepLink deepLink) {
            this.f3594a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3594a, ((c) obj).f3594a);
        }

        public final int hashCode() {
            return this.f3594a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("NotifyOrderClicked(deeplink="), this.f3594a, ')');
        }
    }

    /* compiled from: SharedViewModelAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/a$d;", "LDz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dz0.a$d */
    public static final /* data */ class d implements InterfaceC13463a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrSellerOrdersDialogData f3595a;

        public d(@k StrSellerOrdersDialogData strSellerOrdersDialogData) {
            this.f3595a = strSellerOrdersDialogData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f3595a, ((d) obj).f3595a);
        }

        public final int hashCode() {
            return this.f3595a.hashCode();
        }

        @k
        public final String toString() {
            return "PassNewDialogData(dialogData=" + this.f3595a + ')';
        }
    }

    /* compiled from: SharedViewModelAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDz0/a$e;", "LDz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dz0.a$e */
    public static final /* data */ class e implements InterfaceC13463a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f3596a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2121892910;
        }

        @k
        public final String toString() {
            return "RequestToClose";
        }
    }

    /* compiled from: SharedViewModelAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/a$f;", "LDz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dz0.a$f */
    public static final /* data */ class f implements InterfaceC13463a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f3597a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f3598b;

        public f(@k PrintableText printableText, @k Throwable th2) {
            this.f3597a = printableText;
            this.f3598b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f3597a, fVar.f3597a) && L.f(this.f3598b, fVar.f3598b);
        }

        public final int hashCode() {
            return this.f3598b.hashCode() + (this.f3597a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RequestToShowError(text=");
            sb2.append(this.f3597a);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f3598b, ')');
        }
    }
}
