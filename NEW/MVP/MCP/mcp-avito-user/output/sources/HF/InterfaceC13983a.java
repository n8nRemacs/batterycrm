package Hf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaChoosingPurchaseAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LHf/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LHf/a$a;", "LHf/a$b;", "LHf/a$c;", "LHf/a$d;", "LHf/a$e;", "LHf/a$f;", "LHf/a$g;", "LHf/a$h;", "LHf/a$i;", "LHf/a$j;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13983a {

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHf/a$a;", "LHf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0429a implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0429a f7567a = new C0429a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0429a);
        }

        public final int hashCode() {
            return -713182352;
        }

        @k
        public final String toString() {
            return "BuyReportViaPackage";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/a$b;", "LHf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$b */
    public static final /* data */ class b implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7568a;

        public b(@k String str) {
            this.f7568a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f7568a, ((b) obj).f7568a);
        }

        public final int hashCode() {
            return this.f7568a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("BuyReportViaProduct(productId="), this.f7568a, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHf/a$c;", "LHf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$c */
    public static final /* data */ class c implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f7569a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -3796226;
        }

        @k
        public final String toString() {
            return "BuyReportViaSelectedProduct";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/a$d;", "LHf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$d */
    public static final /* data */ class d implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7570a;

        public d(@k String str) {
            this.f7570a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f7570a, ((d) obj).f7570a);
        }

        public final int hashCode() {
            return this.f7570a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("BuyReportViaStandalone(url="), this.f7570a, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHf/a$e;", "LHf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$e */
    public static final /* data */ class e implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f7571a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -754076638;
        }

        @k
        public final String toString() {
            return "OpenChoosingProductState";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/a$f;", "LHf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$f */
    public static final /* data */ class f implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f7572a;

        public f(@k DeepLink deepLink) {
            this.f7572a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f7572a, ((f) obj).f7572a);
        }

        public final int hashCode() {
            return this.f7572a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f7572a, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/a$g;", "LHf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$g */
    public static final /* data */ class g implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7573a;

        public g(@k String str) {
            this.f7573a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f7573a, ((g) obj).f7573a);
        }

        public final int hashCode() {
            return this.f7573a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenStandalone(url="), this.f7573a, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/a$h;", "LHf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$h */
    public static final /* data */ class h implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7574a;

        public h(@k String str) {
            this.f7574a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f7574a, ((h) obj).f7574a);
        }

        public final int hashCode() {
            return this.f7574a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectProduct(productId="), this.f7574a, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/a$i;", "LHf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$i */
    public static final /* data */ class i implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7575a;

        public i(boolean z12) {
            this.f7575a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f7575a == ((i) obj).f7575a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f7575a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateItems(isCheckAuth="), this.f7575a, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHf/a$j;", "LHf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.a$j */
    public static final /* data */ class j implements InterfaceC13983a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f7576a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1665298011;
        }

        @k
        public final String toString() {
            return "ViewReport";
        }
    }
}
