package f10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.applicant_type.model.ApplicantType;
import com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption;
import com.avito.android.mortgage.root.model.SignChangeAction;
import kotlin.Metadata;

/* compiled from: MortgageRootAction.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:,\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-\u0082\u0001,./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXY¨\u0006Z"}, d2 = {"Lf10/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "Lf10/a$a;", "Lf10/a$b;", "Lf10/a$c;", "Lf10/a$d;", "Lf10/a$e;", "Lf10/a$f;", "Lf10/a$g;", "Lf10/a$h;", "Lf10/a$i;", "Lf10/a$j;", "Lf10/a$k;", "Lf10/a$l;", "Lf10/a$m;", "Lf10/a$n;", "Lf10/a$o;", "Lf10/a$p;", "Lf10/a$q;", "Lf10/a$r;", "Lf10/a$s;", "Lf10/a$t;", "Lf10/a$u;", "Lf10/a$v;", "Lf10/a$w;", "Lf10/a$x;", "Lf10/a$y;", "Lf10/a$z;", "Lf10/a$A;", "Lf10/a$B;", "Lf10/a$C;", "Lf10/a$D;", "Lf10/a$E;", "Lf10/a$F;", "Lf10/a$G;", "Lf10/a$H;", "Lf10/a$I;", "Lf10/a$J;", "Lf10/a$K;", "Lf10/a$L;", "Lf10/a$M;", "Lf10/a$N;", "Lf10/a$O;", "Lf10/a$P;", "Lf10/a$Q;", "Lf10/a$R;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC40199a {

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$A;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$A */
    public static final /* data */ class A implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395577a;

        public A(@k String str) {
            this.f395577a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && kotlin.jvm.internal.L.f(this.f395577a, ((A) obj).f395577a);
        }

        public final int hashCode() {
            return this.f395577a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RealtyObjectDetailsAddressFillByHandClicked(text="), this.f395577a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$B;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$B */
    public static final /* data */ class B implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final B f395578a = new B();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof B);
        }

        public final int hashCode() {
            return 1836308874;
        }

        @k
        public final String toString() {
            return "RealtyObjectDetailsFirstFieldFilled";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$C;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$C */
    public static final /* data */ class C implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C f395579a = new C();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C);
        }

        public final int hashCode() {
            return 1254745167;
        }

        @k
        public final String toString() {
            return "RealtyObjectDetailsFirstFieldFocused";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$D;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$D */
    public static final /* data */ class D implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395580a;

        public D(@k String str) {
            this.f395580a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof D) && kotlin.jvm.internal.L.f(this.f395580a, ((D) obj).f395580a);
        }

        public final int hashCode() {
            return this.f395580a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RealtyObjectDetailsFirstFieldUpdated(text="), this.f395580a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$E;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$E */
    public static final /* data */ class E implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395581a;

        public E(@k String str) {
            this.f395581a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof E) && kotlin.jvm.internal.L.f(this.f395581a, ((E) obj).f395581a);
        }

        public final int hashCode() {
            return this.f395581a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RealtyObjectDetailsFirstFieldUpdatedBySuggest(text="), this.f395581a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$F;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$F */
    public static final /* data */ class F implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DetailsBlockOption.Type f395582a;

        public F(@k DetailsBlockOption.Type type) {
            this.f395582a = type;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F) && this.f395582a == ((F) obj).f395582a;
        }

        public final int hashCode() {
            return this.f395582a.hashCode();
        }

        @k
        public final String toString() {
            return "RealtyObjectDetailsOptionSelected(type=" + this.f395582a + ')';
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$G;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$G */
    public static final /* data */ class G implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final G f395583a = new G();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof G);
        }

        public final int hashCode() {
            return -168830390;
        }

        @k
        public final String toString() {
            return "RealtyObjectDetailsSecondFieldFilled";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$H;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$H */
    public static final /* data */ class H implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395584a;

        public H(@k String str) {
            this.f395584a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof H) && kotlin.jvm.internal.L.f(this.f395584a, ((H) obj).f395584a);
        }

        public final int hashCode() {
            return this.f395584a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RealtyObjectDetailsSecondFieldUpdated(text="), this.f395584a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$I;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$I */
    public static final /* data */ class I implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f395585a;

        public I(boolean z12) {
            this.f395585a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof I) && this.f395585a == ((I) obj).f395585a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f395585a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RealtyObjectIsAvitoItemOptionSelected(value="), this.f395585a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$J;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$J */
    public static final /* data */ class J implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final J f395586a = new J();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof J);
        }

        public final int hashCode() {
            return 382629221;
        }

        @k
        public final String toString() {
            return "RealtyObjectMenuClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$K;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$K */
    public static final /* data */ class K implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final K f395587a = new K();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof K);
        }

        public final int hashCode() {
            return -4570123;
        }

        @k
        public final String toString() {
            return "Resumed";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$L;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$L */
    public static final /* data */ class L implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        public final int f395588a;

        /* renamed from: b, reason: collision with root package name */
        public final int f395589b;

        public L(int i12, int i13) {
            this.f395588a = i12;
            this.f395589b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof L)) {
                return false;
            }
            L l12 = (L) obj;
            return this.f395588a == l12.f395588a && this.f395589b == l12.f395589b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395589b) + (Integer.hashCode(this.f395588a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScreenScrolled(firstVisibleItem=");
            sb2.append(this.f395588a);
            sb2.append(", lastVisibleItem=");
            return r.t(sb2, this.f395589b, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$M;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$M */
    public static final /* data */ class M implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395590a;

        public M(@k String str) {
            this.f395590a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof M) && kotlin.jvm.internal.L.f(this.f395590a, ((M) obj).f395590a);
        }

        public final int hashCode() {
            return this.f395590a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectBank(bankId="), this.f395590a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$N;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$N */
    public static final /* data */ class N implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395591a;

        public N(@k String str) {
            this.f395591a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof N) && kotlin.jvm.internal.L.f(this.f395591a, ((N) obj).f395591a);
        }

        public final int hashCode() {
            return this.f395591a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectBanksTab(tabValue="), this.f395591a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$O;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$O */
    public static final /* data */ class O implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SignChangeAction f395592a;

        public O(@k SignChangeAction signChangeAction) {
            this.f395592a = signChangeAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof O) && kotlin.jvm.internal.L.f(this.f395592a, ((O) obj).f395592a);
        }

        public final int hashCode() {
            return this.f395592a.hashCode();
        }

        @k
        public final String toString() {
            return "SignChangeSelected(action=" + this.f395592a + ')';
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$P;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$P */
    public static final /* data */ class P implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final P f395593a = new P();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof P);
        }

        public final int hashCode() {
            return 781177765;
        }

        @k
        public final String toString() {
            return "StatusActionReloadClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$Q;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$Q */
    public static final /* data */ class Q implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApplicationProcessType f395594a;

        public Q(@k ApplicationProcessType applicationProcessType) {
            this.f395594a = applicationProcessType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Q) && this.f395594a == ((Q) obj).f395594a;
        }

        public final int hashCode() {
            return this.f395594a.hashCode();
        }

        @k
        public final String toString() {
            return "StepNavigationClick(actionType=" + this.f395594a + ')';
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$R;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$R */
    public static final /* data */ class R implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final R f395595a = new R();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof R);
        }

        public final int hashCode() {
            return -306644069;
        }

        @k
        public final String toString() {
            return "SupportClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$a;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11121a implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApplicantType f395596a;

        public C11121a(@k ApplicantType applicantType) {
            this.f395596a = applicantType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11121a) && this.f395596a == ((C11121a) obj).f395596a;
        }

        public final int hashCode() {
            return this.f395596a.hashCode();
        }

        @k
        public final String toString() {
            return "AddApplicant(applicantType=" + this.f395596a + ')';
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$b;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$b, reason: case insensitive filesystem */
    public static final /* data */ class C40200b implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40200b f395597a = new C40200b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40200b);
        }

        public final int hashCode() {
            return 862148039;
        }

        @k
        public final String toString() {
            return "AddBorrowerClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$c;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$c, reason: case insensitive filesystem */
    public static final /* data */ class C40201c implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395598a;

        public C40201c(@k String str) {
            this.f395598a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C40201c) && kotlin.jvm.internal.L.f(this.f395598a, ((C40201c) obj).f395598a);
        }

        public final int hashCode() {
            return this.f395598a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChatManager(bankId="), this.f395598a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$d;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$d, reason: case insensitive filesystem */
    public static final /* data */ class C40202d implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40202d f395599a = new C40202d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40202d);
        }

        public final int hashCode() {
            return -1483851671;
        }

        @k
        public final String toString() {
            return "CloseConfirmed";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$e;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$e, reason: case insensitive filesystem */
    public static final /* data */ class C40203e implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40203e f395600a = new C40203e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40203e);
        }

        public final int hashCode() {
            return -1947583004;
        }

        @k
        public final String toString() {
            return "CloseDeclined";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$f;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$f, reason: case insensitive filesystem */
    public static final /* data */ class C40204f implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40204f f395601a = new C40204f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40204f);
        }

        public final int hashCode() {
            return 1199184334;
        }

        @k
        public final String toString() {
            return "ConditionsClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$g;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$g, reason: case insensitive filesystem */
    public static final /* data */ class C40205g implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395602a;

        public C40205g(@k String str) {
            this.f395602a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C40205g) && kotlin.jvm.internal.L.f(this.f395602a, ((C40205g) obj).f395602a);
        }

        public final int hashCode() {
            return this.f395602a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeleteApplicant(applicantId="), this.f395602a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$h;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$h, reason: case insensitive filesystem */
    public static final /* data */ class C40206h implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40206h f395603a = new C40206h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40206h);
        }

        public final int hashCode() {
            return -1727531197;
        }

        @k
        public final String toString() {
            return "DeleteApplication";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$i;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$i, reason: case insensitive filesystem */
    public static final /* data */ class C40207i implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40207i f395604a = new C40207i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40207i);
        }

        public final int hashCode() {
            return -1631119096;
        }

        @k
        public final String toString() {
            return "DetailsClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$j;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$j, reason: case insensitive filesystem */
    public static final /* data */ class C40208j implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395605a;

        public C40208j(@k String str) {
            this.f395605a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C40208j) && kotlin.jvm.internal.L.f(this.f395605a, ((C40208j) obj).f395605a);
        }

        public final int hashCode() {
            return this.f395605a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("EditBorrowerClick(borrowerId="), this.f395605a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$k;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$k, reason: case insensitive filesystem */
    public static final /* data */ class C40209k implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40209k f395606a = new C40209k();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40209k);
        }

        public final int hashCode() {
            return 2016536537;
        }

        @k
        public final String toString() {
            return "FloatingNavigationNextClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$l;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$l, reason: case insensitive filesystem */
    public static final /* data */ class C40210l implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40210l f395607a = new C40210l();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40210l);
        }

        public final int hashCode() {
            return -1520388011;
        }

        @k
        public final String toString() {
            return "FloatingNavigationPreviousClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$m;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$m, reason: case insensitive filesystem */
    public static final /* data */ class C40211m implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40211m f395608a = new C40211m();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40211m);
        }

        public final int hashCode() {
            return -296245257;
        }

        @k
        public final String toString() {
            return "GoBackClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$n;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$n, reason: case insensitive filesystem */
    public static final /* data */ class C40212n implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395609a;

        public C40212n(@k DeepLink deepLink) {
            this.f395609a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C40212n) && kotlin.jvm.internal.L.f(this.f395609a, ((C40212n) obj).f395609a);
        }

        public final int hashCode() {
            return this.f395609a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleBannerClick(deeplink="), this.f395609a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$o;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$o, reason: case insensitive filesystem */
    public static final /* data */ class C40213o implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395610a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f395611b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final KZ.L f395612c;

        public C40213o(@k String str, @k DeepLink deepLink, @l KZ.L l12) {
            this.f395610a = str;
            this.f395611b = deepLink;
            this.f395612c = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C40213o)) {
                return false;
            }
            C40213o c40213o = (C40213o) obj;
            return kotlin.jvm.internal.L.f(this.f395610a, c40213o.f395610a) && kotlin.jvm.internal.L.f(this.f395611b, c40213o.f395611b) && kotlin.jvm.internal.L.f(this.f395612c, c40213o.f395612c);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f395611b, this.f395610a.hashCode() * 31, 31);
            KZ.L l12 = this.f395612c;
            return iE2 + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            return "HandleBorrowerAction(applicantId=" + this.f395610a + ", action=" + this.f395611b + ", context=" + this.f395612c + ')';
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$p;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$p, reason: case insensitive filesystem */
    public static final /* data */ class C40214p implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395613a;

        public C40214p(@k DeepLink deepLink) {
            this.f395613a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C40214p) && kotlin.jvm.internal.L.f(this.f395613a, ((C40214p) obj).f395613a);
        }

        public final int hashCode() {
            return this.f395613a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f395613a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$q;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$q, reason: case insensitive filesystem */
    public static final /* data */ class C40215q implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f395614a;

        public C40215q(@l DeepLink deepLink) {
            this.f395614a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C40215q) && kotlin.jvm.internal.L.f(this.f395614a, ((C40215q) obj).f395614a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f395614a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleIssueClick(deeplink="), this.f395614a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$r;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$r, reason: case insensitive filesystem */
    public static final /* data */ class C40216r implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C40216r f395615a = new C40216r();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C40216r);
        }

        public final int hashCode() {
            return -222231384;
        }

        @k
        public final String toString() {
            return "LoadApplication";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$s;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$s */
    public static final /* data */ class s implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final s f395616a = new s();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 169294343;
        }

        @k
        public final String toString() {
            return "MenuClick";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$t;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$t */
    public static final /* data */ class t implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final t f395617a = new t();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 280658086;
        }

        @k
        public final String toString() {
            return "NavigateNext";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$u;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$u */
    public static final /* data */ class u implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f395618a;

        public u(boolean z12) {
            this.f395618a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.f395618a == ((u) obj).f395618a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f395618a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("NavigationHideChanged(isOutOfScreen="), this.f395618a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$v;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$v */
    public static final /* data */ class v implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final v f395619a = new v();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return 1003721119;
        }

        @k
        public final String toString() {
            return "NeedReloadApplication";
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$w;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$w */
    public static final /* data */ class w implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395620a;

        public w(@k String str) {
            this.f395620a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && kotlin.jvm.internal.L.f(this.f395620a, ((w) obj).f395620a);
        }

        public final int hashCode() {
            return this.f395620a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenBankApplication(bankId="), this.f395620a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$x;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$x */
    public static final /* data */ class x implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395621a;

        public x(@k String str) {
            this.f395621a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && kotlin.jvm.internal.L.f(this.f395621a, ((x) obj).f395621a);
        }

        public final int hashCode() {
            return this.f395621a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenBankDetails(bankId="), this.f395621a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/a$y;", "Lf10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$y */
    public static final /* data */ class y implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395622a;

        public y(@k String str) {
            this.f395622a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && kotlin.jvm.internal.L.f(this.f395622a, ((y) obj).f395622a);
        }

        public final int hashCode() {
            return this.f395622a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenImmutableInfoDescription(itemId="), this.f395622a, ')');
        }
    }

    /* compiled from: MortgageRootAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/a$z;", "Lf10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.a$z */
    public static final /* data */ class z implements InterfaceC40199a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final z f395623a = new z();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -865286759;
        }

        @k
        public final String toString() {
            return "RealtyObjectDeleteClick";
        }
    }
}
