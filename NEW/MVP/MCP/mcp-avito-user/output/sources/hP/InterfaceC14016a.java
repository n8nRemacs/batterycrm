package Hp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.ranges.o;

/* compiled from: EndDealAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LHp/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LHp/a$a;", "LHp/a$b;", "LHp/a$c;", "LHp/a$d;", "LHp/a$e;", "LHp/a$f;", "LHp/a$g;", "LHp/a$h;", "LHp/a$i;", "LHp/a$j;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14016a {

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHp/a$a;", "LHp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0440a implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0440a f7710a = new C0440a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0440a);
        }

        public final int hashCode() {
            return 1941683486;
        }

        @k
        public final String toString() {
            return "CloseClick";
        }
    }

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/a$b;", "LHp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$b */
    public static final /* data */ class b implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f7711a;

        public b(@k DeepLink deepLink) {
            this.f7711a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f7711a, ((b) obj).f7711a);
        }

        public final int hashCode() {
            return this.f7711a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f7711a, ')');
        }
    }

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/a$c;", "LHp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$c */
    public static final /* data */ class c implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7712a;

        public c(@k String str) {
            this.f7712a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f7712a, ((c) obj).f7712a);
        }

        public final int hashCode() {
            return this.f7712a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f7712a, ')');
        }
    }

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHp/a$d;", "LHp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$d */
    public static final /* data */ class d implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f7713a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -453913785;
        }

        @k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/a$e;", "LHp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$e */
    public static final /* data */ class e implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final o f7714a;

        public e(@k o oVar) {
            this.f7714a = oVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f7714a, ((e) obj).f7714a);
        }

        public final int hashCode() {
            return this.f7714a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectDate(date=" + this.f7714a + ')';
        }
    }

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHp/a$f;", "LHp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$f */
    public static final /* data */ class f implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f7715a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -410807866;
        }

        @k
        public final String toString() {
            return "Submit";
        }
    }

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/a$g;", "LHp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$g */
    public static final /* data */ class g implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7716a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f7717b;

        public g(@k String str, @k String str2) {
            this.f7716a = str;
            this.f7717b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f7716a, gVar.f7716a) && L.f(this.f7717b, gVar.f7717b);
        }

        public final int hashCode() {
            return this.f7717b.hashCode() + (this.f7716a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateChipValue(id=");
            sb2.append(this.f7716a);
            sb2.append(", chipId=");
            return C22026a.c(sb2, this.f7717b, ')');
        }
    }

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/a$h;", "LHp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$h */
    public static final /* data */ class h implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7718a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f7719b;

        public h(@k String str, @k String str2) {
            this.f7718a = str;
            this.f7719b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f7718a, hVar.f7718a) && L.f(this.f7719b, hVar.f7719b);
        }

        public final int hashCode() {
            return this.f7719b.hashCode() + (this.f7718a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateCommentValue(id=");
            sb2.append(this.f7718a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f7719b, ')');
        }
    }

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/a$i;", "LHp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$i */
    public static final /* data */ class i implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7720a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f7721b;

        public i(@k String str, @k String str2) {
            this.f7720a = str;
            this.f7721b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f7720a, iVar.f7720a) && L.f(this.f7721b, iVar.f7721b);
        }

        public final int hashCode() {
            return this.f7721b.hashCode() + (this.f7720a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateDataValue(id=");
            sb2.append(this.f7720a);
            sb2.append(", chipId=");
            return C22026a.c(sb2, this.f7721b, ')');
        }
    }

    /* compiled from: EndDealAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/a$j;", "LHp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.a$j */
    public static final /* data */ class j implements InterfaceC14016a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7722a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f7723b;

        public j(@k String str, @k String str2) {
            this.f7722a = str;
            this.f7723b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f7722a, jVar.f7722a) && L.f(this.f7723b, jVar.f7723b);
        }

        public final int hashCode() {
            return this.f7723b.hashCode() + (this.f7722a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInputValue(id=");
            sb2.append(this.f7722a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f7723b, ')');
        }
    }
}
