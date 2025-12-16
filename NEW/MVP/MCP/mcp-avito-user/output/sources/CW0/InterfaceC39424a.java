package cw0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcw0/a;", "", "a", "b", "c", "d", "e", "f", "g", "Lcw0/a$a;", "Lcw0/a$b;", "Lcw0/a$c;", "Lcw0/a$d;", "Lcw0/a$e;", "Lcw0/a$f;", "Lcw0/a$g;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39424a {

    /* compiled from: BookingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcw0/a$a;", "Lcw0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11000a implements InterfaceC39424a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11000a f393053a = new C11000a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11000a);
        }

        public final int hashCode() {
            return 1287803134;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: BookingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcw0/a$b;", "Lcw0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.a$b */
    public static final /* data */ class b implements InterfaceC39424a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f393054a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1751859727;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: BookingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/a$c;", "Lcw0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.a$c */
    public static final /* data */ class c implements InterfaceC39424a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f393055a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f393056b;

        public c(@k DeepLink deepLink, @l Bundle bundle) {
            this.f393055a = deepLink;
            this.f393056b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f393055a, cVar.f393055a) && L.f(this.f393056b, cVar.f393056b);
        }

        public final int hashCode() {
            int iHashCode = this.f393055a.hashCode() * 31;
            Bundle bundle = this.f393056b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f393055a);
            sb2.append(", bundle=");
            return H.m(sb2, this.f393056b, ')');
        }
    }

    /* compiled from: BookingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/a$d;", "Lcw0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.a$d */
    public static final /* data */ class d implements InterfaceC39424a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f393057a;

        public d(@k DeepLink deepLink) {
            this.f393057a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f393057a.equals(((d) obj).f393057a) && L.f(null, null);
            }
            return false;
        }

        public final int hashCode() {
            return this.f393057a.hashCode() * 31;
        }

        @k
        public final String toString() {
            return "OpenDeepLinkAndCloseScreen(deepLink=" + this.f393057a + ", bundle=null)";
        }
    }

    /* compiled from: BookingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/a$e;", "Lcw0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.a$e */
    public static final /* data */ class e implements InterfaceC39424a {

        /* renamed from: a, reason: collision with root package name */
        public final int f393058a;

        /* renamed from: b, reason: collision with root package name */
        public final int f393059b;

        public e(int i12, int i13) {
            this.f393058a = i12;
            this.f393059b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f393058a == eVar.f393058a && this.f393059b == eVar.f393059b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f393059b) + (Integer.hashCode(this.f393058a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScrollToItem(pageIndex=");
            sb2.append(this.f393058a);
            sb2.append(", itemPosition=");
            return r.t(sb2, this.f393059b, ')');
        }
    }

    /* compiled from: BookingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/a$f;", "Lcw0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.a$f */
    public static final /* data */ class f implements InterfaceC39424a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RetroBadgeItemHint f393060a;

        public f(@k RetroBadgeItemHint retroBadgeItemHint) {
            this.f393060a = retroBadgeItemHint;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f393060a, ((f) obj).f393060a);
        }

        public final int hashCode() {
            return this.f393060a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowRetroBadgeHint(retroBadgeHint=" + this.f393060a + ')';
        }
    }

    /* compiled from: BookingFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/a$g;", "Lcw0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.a$g */
    public static final /* data */ class g implements InterfaceC39424a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f393061a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.component.toast.f f393062b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f393063c;

        public g(@k PrintableText printableText, @k com.avito.android.component.toast.f fVar, boolean z12) {
            this.f393061a = printableText;
            this.f393062b = fVar;
            this.f393063c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f393061a, gVar.f393061a) && L.f(this.f393062b, gVar.f393062b) && this.f393063c == gVar.f393063c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f393063c) + ((this.f393062b.hashCode() + (this.f393061a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSnackbar(message=");
            sb2.append(this.f393061a);
            sb2.append(", type=");
            sb2.append(this.f393062b);
            sb2.append(", performHapticFeedback=");
            return r.x(sb2, this.f393063c, ')');
        }

        public /* synthetic */ g(PrintableText printableText, com.avito.android.component.toast.f fVar, boolean z12, int i12, C42822w c42822w) {
            this(printableText, fVar, (i12 & 4) != 0 ? false : z12);
        }
    }
}
