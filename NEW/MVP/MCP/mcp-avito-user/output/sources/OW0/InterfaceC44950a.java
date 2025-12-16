package ow0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.short_term_rent.common.entity.PromoCode;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSoftBookingAction.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Low0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "Low0/a$a;", "Low0/a$b;", "Low0/a$c;", "Low0/a$d;", "Low0/a$e;", "Low0/a$f;", "Low0/a$g;", "Low0/a$h;", "Low0/a$i;", "Low0/a$j;", "Low0/a$k;", "Low0/a$l;", "Low0/a$m;", "Low0/a$n;", "Low0/a$o;", "Low0/a$p;", "Low0/a$q;", "Low0/a$r;", "Low0/a$s;", "Low0/a$t;", "Low0/a$u;", "Low0/a$v;", "Low0/a$w;", "Low0/a$x;", "Low0/a$y;", "Low0/a$z;", "Low0/a$A;", "Low0/a$B;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ow0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC44950a {

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$A;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$A */
    public static final /* data */ class A implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final A f422330a = new A();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof A);
        }

        public final int hashCode() {
            return 1749241928;
        }

        @Y61.k
        public final String toString() {
            return "TrustItemsClicked";
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$B;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$B */
    public static final /* data */ class B implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final B f422331a = new B();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof B);
        }

        public final int hashCode() {
            return -113125006;
        }

        @Y61.k
        public final String toString() {
            return "TrustItemsShown";
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$a;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$a, reason: collision with other inner class name */
    public static final class C12248a implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12248a f422332a = new C12248a();
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$b;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$b, reason: case insensitive filesystem */
    public static final /* data */ class C44951b implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f422333a;

        public C44951b(@Y61.k DeepLink deepLink) {
            this.f422333a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C44951b) && L.f(this.f422333a, ((C44951b) obj).f422333a);
        }

        public final int hashCode() {
            return this.f422333a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("BonusesInfoClick(deepLink="), this.f422333a, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$c;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$c */
    public static final class c implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f422334a = new c();
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$d;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$d */
    public static final /* data */ class d implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f422335a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final StrSoftBookingContactFieldType f422336b;

        public d(@Y61.k StrSoftBookingContactFieldType strSoftBookingContactFieldType, @Y61.k String str) {
            this.f422335a = str;
            this.f422336b = strSoftBookingContactFieldType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f422335a, dVar.f422335a) && this.f422336b == dVar.f422336b;
        }

        public final int hashCode() {
            return this.f422336b.hashCode() + (this.f422335a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ContactFieldChanged(text=" + this.f422335a + ", type=" + this.f422336b + ')';
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$e;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$e */
    public static final class e implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f422337a = new e();
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$f;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$f */
    public static final /* data */ class f implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CalendarLink.b.C3988b f422338a;

        public f(@Y61.k CalendarLink.b.C3988b c3988b) {
            this.f422338a = c3988b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f422338a, ((f) obj).f422338a);
        }

        public final int hashCode() {
            return this.f422338a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DateRangeFieldChanged(result=" + this.f422338a + ')';
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$g;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$g */
    public static final class g implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f422339a = new g();
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$h;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$h */
    public static final /* data */ class h implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f422340a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<ParcelableEntity<String>> f422341b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f422342c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(@Y61.k String str, @Y61.k List<? extends ParcelableEntity<String>> list, @Y61.l String str2) {
            this.f422340a = str;
            this.f422341b = list;
            this.f422342c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f422340a, hVar.f422340a) && L.f(this.f422341b, hVar.f422341b) && L.f(this.f422342c, hVar.f422342c);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f422340a.hashCode() * 31, 31, this.f422341b);
            String str = this.f422342c;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GuestCountSelected(requestId=");
            sb2.append(this.f422340a);
            sb2.append(", selectedItems=");
            sb2.append(this.f422341b);
            sb2.append(", sectionTitle=");
            return C22026a.c(sb2, this.f422342c, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$i;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$i */
    public static final /* data */ class i implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final GuestsSelectorOutput f422343a;

        public i(@Y61.k GuestsSelectorOutput guestsSelectorOutput) {
            this.f422343a = guestsSelectorOutput;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f422343a, ((i) obj).f422343a);
        }

        public final int hashCode() {
            return this.f422343a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "GuestsSelectorResult(output=" + this.f422343a + ')';
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$j;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$j */
    public static final class j implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f422344a = new j();
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$k;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$k */
    public static final /* data */ class k implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f422345a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1487056924;
        }

        @Y61.k
        public final String toString() {
            return "LoadingAnimationLoaded";
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$l;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$l */
    public static final /* data */ class l implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final rw0.j f422346a;

        public l(@Y61.k rw0.j jVar) {
            this.f422346a = jVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f422346a, ((l) obj).f422346a);
        }

        public final int hashCode() {
            return this.f422346a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PaymentClick(selectedPayment=" + this.f422346a + ')';
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$m;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$m */
    public static final /* data */ class m implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f422347a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 785325584;
        }

        @Y61.k
        public final String toString() {
            return "PaymentDetailsShow";
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$n;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$n */
    public static final /* data */ class n implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f422348a;

        public n(@Y61.k String str) {
            this.f422348a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f422348a, ((n) obj).f422348a);
        }

        public final int hashCode() {
            return this.f422348a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PaymentMethodChanged(paymentType="), this.f422348a, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$o;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$o */
    public static final /* data */ class o implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f422349a;

        public o(@Y61.k DeepLink deepLink) {
            this.f422349a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f422349a, ((o) obj).f422349a);
        }

        public final int hashCode() {
            return this.f422349a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("PaymentMethodsDeeplinkClick(deepLink="), this.f422349a, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$p;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$p */
    public static final /* data */ class p implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f422350a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -206006001;
        }

        @Y61.k
        public final String toString() {
            return "PaymentMethodsVisible";
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$q;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$q */
    public static final /* data */ class q implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f422351a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f422352b;

        public q(@Y61.k String str, @Y61.k String str2) {
            this.f422351a = str;
            this.f422352b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return L.f(this.f422351a, qVar.f422351a) && L.f(this.f422352b, qVar.f422352b);
        }

        public final int hashCode() {
            return this.f422352b.hashCode() + (this.f422351a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PaymentPlanChanged(buttonName=");
            sb2.append(this.f422351a);
            sb2.append(", paymentPlan=");
            return C22026a.c(sb2, this.f422352b, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$r;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$r */
    public static final /* data */ class r implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f422353a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f422354b;

        public r(@Y61.l String str, @Y61.l String str2) {
            this.f422353a = str;
            this.f422354b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f422353a, rVar.f422353a) && L.f(this.f422354b, rVar.f422354b);
        }

        public final int hashCode() {
            String str = this.f422353a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f422354b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PromoCodeApply(code=");
            sb2.append(this.f422353a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f422354b, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$s;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$s */
    public static final /* data */ class s implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f422355a;

        public s(@Y61.l String str) {
            this.f422355a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f422355a, ((s) obj).f422355a);
        }

        public final int hashCode() {
            String str = this.f422355a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PromoCodeDisable(message="), this.f422355a, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$t;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$t */
    public static final class t implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f422356a = new t();
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$u;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$u */
    public static final /* data */ class u implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PromoCode f422357a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f422358b;

        public u(@Y61.k PromoCode promoCode, @Y61.l String str) {
            this.f422357a = promoCode;
            this.f422358b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return L.f(this.f422357a, uVar.f422357a) && L.f(this.f422358b, uVar.f422358b);
        }

        public final int hashCode() {
            int iHashCode = this.f422357a.hashCode() * 31;
            String str = this.f422358b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PromoCodeSelect(promoCode=");
            sb2.append(this.f422357a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f422358b, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$v;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$v */
    public static final /* data */ class v implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f422359a;

        public v(@Y61.k String str) {
            this.f422359a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && L.f(this.f422359a, ((v) obj).f422359a);
        }

        public final int hashCode() {
            return this.f422359a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("RefundToggleClick(toggleId="), this.f422359a, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$w;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$w */
    public static final /* data */ class w implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f422360a;

        public w(@Y61.k DeepLink deepLink) {
            this.f422360a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && L.f(this.f422360a, ((w) obj).f422360a);
        }

        public final int hashCode() {
            return this.f422360a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("RefundToggleTooltipClick(deepLink="), this.f422360a, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$x;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$x */
    public static final class x implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final x f422361a = new x();
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/a$y;", "Low0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$y */
    public static final /* data */ class y implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f422362a;

        public y(@Y61.l DeepLink deepLink) {
            this.f422362a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && L.f(this.f422362a, ((y) obj).f422362a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f422362a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("RulesInfoClick(deepLink="), this.f422362a, ')');
        }
    }

    /* compiled from: StrSoftBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a$z;", "Low0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.a$z */
    public static final class z implements InterfaceC44950a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final z f422363a = new z();
    }
}
