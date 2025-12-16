package Nf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPaymentAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LNf/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LNf/a$a;", "LNf/a$b;", "LNf/a$c;", "LNf/a$d;", "LNf/a$e;", "LNf/a$f;", "LNf/a$g;", "LNf/a$h;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14568a {

    /* compiled from: AutotekaPaymentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNf/a$a;", "LNf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0753a implements InterfaceC14568a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11684a;

        public C0753a(boolean z12) {
            this.f11684a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0753a) && this.f11684a == ((C0753a) obj).f11684a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11684a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnContestAgreementChecked(isChecked="), this.f11684a, ')');
        }
    }

    /* compiled from: AutotekaPaymentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNf/a$b;", "LNf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nf.a$b */
    public static final /* data */ class b implements InterfaceC14568a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f11685a;

        public b(@k DeepLink deepLink) {
            this.f11685a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f11685a, ((b) obj).f11685a);
        }

        public final int hashCode() {
            return this.f11685a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenLicenseAgreement(deepLink="), this.f11685a, ')');
        }
    }

    /* compiled from: AutotekaPaymentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNf/a$c;", "LNf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nf.a$c */
    public static final /* data */ class c implements InterfaceC14568a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f11686a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1829586212;
        }

        @k
        public final String toString() {
            return "PayButtonClick";
        }
    }

    /* compiled from: AutotekaPaymentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNf/a$d;", "LNf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nf.a$d */
    public static final /* data */ class d implements InterfaceC14568a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f11687a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 603068720;
        }

        @k
        public final String toString() {
            return "PromoCodeButtonClick";
        }
    }

    /* compiled from: AutotekaPaymentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNf/a$e;", "LNf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nf.a$e */
    public static final /* data */ class e implements InterfaceC14568a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11688a;

        public e(@k String str) {
            this.f11688a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f11688a, ((e) obj).f11688a);
        }

        public final int hashCode() {
            return this.f11688a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PromoCodeChange(promoCode="), this.f11688a, ')');
        }
    }

    /* compiled from: AutotekaPaymentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNf/a$f;", "LNf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nf.a$f */
    public static final /* data */ class f implements InterfaceC14568a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f11689a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1155199806;
        }

        @k
        public final String toString() {
            return "RemovePromoCode";
        }
    }

    /* compiled from: AutotekaPaymentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNf/a$g;", "LNf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nf.a$g */
    public static final /* data */ class g implements InterfaceC14568a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f11690a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1869384535;
        }

        @k
        public final String toString() {
            return "ShowPaymentFailedToast";
        }
    }

    /* compiled from: AutotekaPaymentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNf/a$h;", "LNf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nf.a$h */
    public static final /* data */ class h implements InterfaceC14568a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11691a;

        public h(boolean z12) {
            this.f11691a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f11691a == ((h) obj).f11691a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11691a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateItems(isCheckAuth="), this.f11691a, ')');
        }
    }
}
