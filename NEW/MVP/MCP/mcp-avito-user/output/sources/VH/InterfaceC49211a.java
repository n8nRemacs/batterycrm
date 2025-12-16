package vH;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import sH.j;

/* compiled from: MotivationPaymentAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LvH/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LvH/a$a;", "LvH/a$b;", "LvH/a$c;", "LvH/a$d;", "LvH/a$e;", "LvH/a$f;", "LvH/a$g;", "LvH/a$h;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vH.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49211a {

    /* compiled from: MotivationPaymentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvH/a$a;", "LvH/a;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12758a implements InterfaceC49211a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12758a f440626a = new C12758a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12758a);
        }

        public final int hashCode() {
            return 1691055787;
        }

        @k
        public final String toString() {
            return "OnBackClick";
        }
    }

    /* compiled from: MotivationPaymentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvH/a$b;", "LvH/a;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.a$b */
    public static final /* data */ class b implements InterfaceC49211a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440627a;

        public b(@k DeepLink deepLink) {
            this.f440627a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f440627a, ((b) obj).f440627a);
        }

        public final int hashCode() {
            return this.f440627a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnPrimaryButtonClick(deepLink="), this.f440627a, ')');
        }
    }

    /* compiled from: MotivationPaymentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvH/a$c;", "LvH/a;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.a$c */
    public static final /* data */ class c implements InterfaceC49211a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f440628a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1922246301;
        }

        @k
        public final String toString() {
            return "OnRefreshClick";
        }
    }

    /* compiled from: MotivationPaymentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvH/a$d;", "LvH/a;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.a$d */
    public static final /* data */ class d implements InterfaceC49211a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440629a;

        public d(@k DeepLink deepLink) {
            this.f440629a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f440629a, ((d) obj).f440629a);
        }

        public final int hashCode() {
            return this.f440629a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnRequisitesClick(deeplink="), this.f440629a, ')');
        }
    }

    /* compiled from: MotivationPaymentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvH/a$e;", "LvH/a;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.a$e */
    public static final /* data */ class e implements InterfaceC49211a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f440630a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final j f440631b;

        public e(@l DeepLink deepLink, @l j jVar) {
            this.f440630a = deepLink;
            this.f440631b = jVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f440630a, eVar.f440630a) && L.f(this.f440631b, eVar.f440631b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f440630a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            j jVar = this.f440631b;
            return iHashCode + (jVar != null ? jVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OnRequisitesPrimaryButtonClick(deepLink=" + this.f440630a + ", toastInfo=" + this.f440631b + ')';
        }
    }

    /* compiled from: MotivationPaymentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvH/a$f;", "LvH/a;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.a$f */
    public static final /* data */ class f implements InterfaceC49211a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f440632a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2087790390;
        }

        @k
        public final String toString() {
            return "OnRetryClick";
        }
    }

    /* compiled from: MotivationPaymentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvH/a$g;", "LvH/a;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.a$g */
    public static final /* data */ class g implements InterfaceC49211a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440633a;

        public g(@k DeepLink deepLink) {
            this.f440633a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f440633a, ((g) obj).f440633a);
        }

        public final int hashCode() {
            return this.f440633a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnSupportClick(deepLink="), this.f440633a, ')');
        }
    }

    /* compiled from: MotivationPaymentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvH/a$h;", "LvH/a;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.a$h */
    public static final /* data */ class h implements InterfaceC49211a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440634a;

        public h(@k DeepLink deepLink) {
            this.f440634a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f440634a, ((h) obj).f440634a);
        }

        public final int hashCode() {
            return this.f440634a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnToastInfoClick(deepLink="), this.f440634a, ')');
        }
    }
}
