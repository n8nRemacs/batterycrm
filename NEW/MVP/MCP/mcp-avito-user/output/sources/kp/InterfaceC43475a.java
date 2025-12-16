package kp;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientsAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lkp/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lkp/a$a;", "Lkp/a$b;", "Lkp/a$c;", "Lkp/a$d;", "Lkp/a$e;", "Lkp/a$f;", "Lkp/a$g;", "Lkp/a$h;", "Lkp/a$i;", "Lkp/a$j;", "Lkp/a$k;", "Lkp/a$l;", "Lkp/a$m;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC43475a {

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/a$a;", "Lkp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11760a implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f413179a;

        public C11760a(@Y61.k DeepLink deepLink) {
            this.f413179a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11760a) && L.f(this.f413179a, ((C11760a) obj).f413179a);
        }

        public final int hashCode() {
            return this.f413179a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("BottomButtonClick(deeplink="), this.f413179a, ')');
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/a$b;", "Lkp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$b */
    public static final /* data */ class b implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ClientCardData f413180a;

        public b(@Y61.k ClientCardData clientCardData) {
            this.f413180a = clientCardData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f413180a, ((b) obj).f413180a);
        }

        public final int hashCode() {
            return this.f413180a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CardClick(card=" + this.f413180a + ')';
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/a$c;", "Lkp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$c */
    public static final /* data */ class c implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        public final int f413181a;

        public c(int i12) {
            this.f413181a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f413181a == ((c) obj).f413181a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f413181a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("ChipClick(index="), this.f413181a, ')');
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/a$d;", "Lkp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$d */
    public static final /* data */ class d implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f413182a;

        public d(boolean z12) {
            this.f413182a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f413182a == ((d) obj).f413182a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f413182a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("ClientsFilterQueryFocusChanged(hasFocus="), this.f413182a, ')');
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/a$e;", "Lkp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$e */
    public static final /* data */ class e implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f413183a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -114627478;
        }

        @Y61.k
        public final String toString() {
            return "DismissMortgageArchivingDialog";
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/a$f;", "Lkp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$f */
    public static final /* data */ class f implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f413184a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1796814845;
        }

        @Y61.k
        public final String toString() {
            return "OpenFilterClick";
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/a$g;", "Lkp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$g */
    public static final /* data */ class g implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f413185a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1096511286;
        }

        @Y61.k
        public final String toString() {
            return "ReloadMortgageScreen";
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/a$h;", "Lkp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$h */
    public static final /* data */ class h implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f413186a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1262282994;
        }

        @Y61.k
        public final String toString() {
            return "ReloadScreen";
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/a$i;", "Lkp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$i */
    public static final /* data */ class i implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f413187a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1388371927;
        }

        @Y61.k
        public final String toString() {
            return "RequestNewPage";
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/a$j;", "Lkp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$j */
    public static final /* data */ class j implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f413188a;

        public j(@Y61.k String str) {
            this.f413188a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f413188a, ((j) obj).f413188a);
        }

        public final int hashCode() {
            return this.f413188a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ReturnToWorkClick(applicationId="), this.f413188a, ')');
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/a$k;", "Lkp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$k */
    public static final /* data */ class k implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        public final int f413189a;

        public k(int i12) {
            this.f413189a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f413189a == ((k) obj).f413189a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f413189a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("TabClick(index="), this.f413189a, ')');
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/a$l;", "Lkp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$l */
    public static final /* data */ class l implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f413190a;

        public l(boolean z12) {
            this.f413190a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f413190a == ((l) obj).f413190a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f413190a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("UpdateClientsFilterArchived(isArchived="), this.f413190a, ')');
        }
    }

    /* compiled from: ClientsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/a$m;", "Lkp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.a$m */
    public static final /* data */ class m implements InterfaceC43475a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f413191a;

        public m(@Y61.k String str) {
            this.f413191a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f413191a, ((m) obj).f413191a);
        }

        public final int hashCode() {
            return this.f413191a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateClientsFilterQuery(query="), this.f413191a, ')');
        }
    }
}
