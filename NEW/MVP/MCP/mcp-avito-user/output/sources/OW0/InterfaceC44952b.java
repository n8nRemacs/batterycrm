package ow0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.guests_selector.io.GuestsSelectorInput;
import com.avito.android.select.Arguments;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogOpenParams;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSoftBookingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Low0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Low0/b$a;", "Low0/b$b;", "Low0/b$c;", "Low0/b$d;", "Low0/b$e;", "Low0/b$f;", "Low0/b$g;", "Low0/b$h;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ow0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC44952b {

    /* compiled from: StrSoftBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/b$a;", "Low0/b;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.b$a */
    public static final /* data */ class a implements InterfaceC44952b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f422364a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1645747106;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSoftBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/b$b;", "Low0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12249b implements InterfaceC44952b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f422365a;

        public C12249b(@l DeepLink deepLink) {
            this.f422365a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12249b) && L.f(this.f422365a, ((C12249b) obj).f422365a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f422365a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f422365a, ')');
        }
    }

    /* compiled from: StrSoftBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/b$c;", "Low0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.b$c */
    public static final /* data */ class c implements InterfaceC44952b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f422366a;

        public c(@l String str) {
            this.f422366a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f422366a, ((c) obj).f422366a);
        }

        public final int hashCode() {
            String str = this.f422366a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PaymentByUrl(paymentUrl="), this.f422366a, ')');
        }
    }

    /* compiled from: StrSoftBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/b$d;", "Low0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.b$d */
    public static final /* data */ class d implements InterfaceC44952b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrSoftBookingContactFieldType f422367a;

        public d(@k StrSoftBookingContactFieldType strSoftBookingContactFieldType) {
            this.f422367a = strSoftBookingContactFieldType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f422367a == ((d) obj).f422367a;
        }

        public final int hashCode() {
            return this.f422367a.hashCode();
        }

        @k
        public final String toString() {
            return "Scroll(field=" + this.f422367a + ')';
        }
    }

    /* compiled from: StrSoftBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/b$e;", "Low0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.b$e */
    public static final /* data */ class e implements InterfaceC44952b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Arguments f422368a;

        public e(@l Arguments arguments) {
            this.f422368a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f422368a, ((e) obj).f422368a);
        }

        public final int hashCode() {
            Arguments arguments = this.f422368a;
            if (arguments == null) {
                return 0;
            }
            return arguments.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.p(new StringBuilder("ShowGuestOptions(args="), this.f422368a, ')');
        }
    }

    /* compiled from: StrSoftBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/b$f;", "Low0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.b$f */
    public static final /* data */ class f implements InterfaceC44952b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GuestsSelectorInput f422369a;

        public f(@k GuestsSelectorInput guestsSelectorInput) {
            this.f422369a = guestsSelectorInput;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f422369a, ((f) obj).f422369a);
        }

        public final int hashCode() {
            return this.f422369a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowGuestSelector(input=" + this.f422369a + ')';
        }
    }

    /* compiled from: StrSoftBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/b$g;", "Low0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.b$g */
    public static final /* data */ class g implements InterfaceC44952b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrSoftBookingPromoCodesDialogOpenParams f422370a;

        public g(@k StrSoftBookingPromoCodesDialogOpenParams strSoftBookingPromoCodesDialogOpenParams) {
            this.f422370a = strSoftBookingPromoCodesDialogOpenParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f422370a, ((g) obj).f422370a);
        }

        public final int hashCode() {
            return this.f422370a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowPromoCodesDialog(openParams=" + this.f422370a + ')';
        }
    }

    /* compiled from: StrSoftBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Low0/b$h;", "Low0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow0.b$h */
    public static final /* data */ class h implements InterfaceC44952b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f422371a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.component.toast.f f422372b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f422373c;

        public h(@k com.avito.android.component.toast.f fVar, @k String str, boolean z12) {
            this.f422371a = str;
            this.f422372b = fVar;
            this.f422373c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f422371a, hVar.f422371a) && L.f(this.f422372b, hVar.f422372b) && this.f422373c == hVar.f422373c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f422373c) + ((this.f422372b.hashCode() + (this.f422371a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSnackbar(text=");
            sb2.append(this.f422371a);
            sb2.append(", type=");
            sb2.append(this.f422372b);
            sb2.append(", performHapticFeedback=");
            return r.x(sb2, this.f422373c, ')');
        }

        public /* synthetic */ h(String str, com.avito.android.component.toast.f fVar, boolean z12, int i12, C42822w c42822w) {
            this(fVar, str, (i12 & 4) != 0 ? false : z12);
        }
    }
}
