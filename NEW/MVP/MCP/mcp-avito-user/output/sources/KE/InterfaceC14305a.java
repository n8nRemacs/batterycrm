package Ke;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_loans_cabinet.mvi.entity.BannerType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoLoansCabinetAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LKe/a;", "", "a", "b", "c", "d", "e", "f", "g", "LKe/a$a;", "LKe/a$b;", "LKe/a$c;", "LKe/a$d;", "LKe/a$e;", "LKe/a$f;", "LKe/a$g;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ke.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14305a {

    /* compiled from: AutoLoansCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKe/a$a;", "LKe/a;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0584a implements InterfaceC14305a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0584a f9564a = new C0584a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0584a);
        }

        public final int hashCode() {
            return 731896534;
        }

        @k
        public final String toString() {
            return "AppBarButtonClick";
        }
    }

    /* compiled from: AutoLoansCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKe/a$b;", "LKe/a;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke.a$b */
    public static final /* data */ class b implements InterfaceC14305a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f9565a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1381429067;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: AutoLoansCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe/a$c;", "LKe/a;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke.a$c */
    public static final /* data */ class c implements InterfaceC14305a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BannerType f9566a;

        public c(@k BannerType bannerType) {
            this.f9566a = bannerType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f9566a == ((c) obj).f9566a;
        }

        public final int hashCode() {
            return this.f9566a.hashCode();
        }

        @k
        public final String toString() {
            return "BannerClick(type=" + this.f9566a + ')';
        }
    }

    /* compiled from: AutoLoansCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKe/a$d;", "LKe/a;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke.a$d */
    public static final /* data */ class d implements InterfaceC14305a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f9567a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1143898132;
        }

        @k
        public final String toString() {
            return "CloseLoanDetailsBottomSheet";
        }
    }

    /* compiled from: AutoLoansCabinetAction.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe/a$e;", "LKe/a;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke.a$e */
    public static final /* data */ class e implements InterfaceC14305a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f9568a;

        public e() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f9568a, ((e) obj).f9568a);
        }

        public final int hashCode() {
            return this.f9568a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("ReadMoreAboutAutoLoans(uri="), this.f9568a, ')');
        }

        public e(Uri uri, int i12, C42822w c42822w) {
            this.f9568a = (i12 & 1) != 0 ? Uri.parse("https://support.avito.ru/articles/3080") : uri;
        }
    }

    /* compiled from: AutoLoansCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKe/a$f;", "LKe/a;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke.a$f */
    public static final /* data */ class f implements InterfaceC14305a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f9569a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1866572522;
        }

        @k
        public final String toString() {
            return "ReloadPage";
        }
    }

    /* compiled from: AutoLoansCabinetAction.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe/a$g;", "LKe/a;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke.a$g */
    public static final /* data */ class g implements InterfaceC14305a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f9570a;

        public g() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f9570a, ((g) obj).f9570a);
        }

        public final int hashCode() {
            return this.f9570a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("ViewLoanDetailsOnPartnerSite(uri="), this.f9570a, ')');
        }

        public g(Uri uri, int i12, C42822w c42822w) {
            this.f9570a = (i12 & 1) != 0 ? Uri.parse("https://lk.vanta.ru/auth/login") : uri;
        }
    }
}
