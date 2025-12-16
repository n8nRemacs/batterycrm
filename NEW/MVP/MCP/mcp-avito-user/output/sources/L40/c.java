package l40;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.component.accordion.s;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import j40.C42193c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OAuthState.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Ll40/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "Ll40/c$b;", "Ll40/c$d;", "Ll40/c$e;", "Ll40/c$g;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f413473b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final e f413474c = e.f413497d;

    /* compiled from: OAuthState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll40/c$a;", "", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OAuthState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll40/c$b;", "Ll40/c;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final com.avito.android.oauth.repository.a f413475d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final C11772c f413476e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f413477f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<String> f413478g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f413479h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final List<C42193c> f413480i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final f f413481j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f413482k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f413483l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final Integer f413484m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final Integer f413485n;

        public /* synthetic */ b(com.avito.android.oauth.repository.a aVar, C11772c c11772c, String str, List list, boolean z12, List list2, f fVar, boolean z13, boolean z14, Integer num, Integer num2, int i12, C42822w c42822w) {
            this(aVar, c11772c, str, list, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? null : list2, (i12 & 64) != 0 ? null : fVar, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? false : z14, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : num2);
        }

        public static b a(b bVar, C11772c c11772c, f fVar, boolean z12, Integer num, Integer num2, int i12) {
            com.avito.android.oauth.repository.a aVar = bVar.f413475d;
            C11772c c11772c2 = (i12 & 2) != 0 ? bVar.f413476e : c11772c;
            String str = bVar.f413477f;
            List<String> list = bVar.f413478g;
            boolean z13 = bVar.f413479h;
            List<C42193c> list2 = bVar.f413480i;
            f fVar2 = (i12 & 64) != 0 ? bVar.f413481j : fVar;
            boolean z14 = (i12 & 128) != 0 ? bVar.f413482k : z12;
            boolean z15 = bVar.f413483l;
            Integer num3 = (i12 & 512) != 0 ? bVar.f413484m : num;
            Integer num4 = (i12 & 1024) != 0 ? bVar.f413485n : num2;
            bVar.getClass();
            return new b(aVar, c11772c2, str, list, z13, list2, fVar2, z14, z15, num3, num4);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f413475d, bVar.f413475d) && L.f(this.f413476e, bVar.f413476e) && L.f(this.f413477f, bVar.f413477f) && L.f(this.f413478g, bVar.f413478g) && this.f413479h == bVar.f413479h && L.f(this.f413480i, bVar.f413480i) && L.f(this.f413481j, bVar.f413481j) && this.f413482k == bVar.f413482k && this.f413483l == bVar.f413483l && L.f(this.f413484m, bVar.f413484m) && L.f(this.f413485n, bVar.f413485n);
        }

        public final int hashCode() {
            int i12 = r.i(H.e(H.d((this.f413476e.hashCode() + (this.f413475d.hashCode() * 31)) * 31, 31, this.f413477f), 31, this.f413478g), 31, this.f413479h);
            List<C42193c> list = this.f413480i;
            int iHashCode = (i12 + (list == null ? 0 : list.hashCode())) * 31;
            f fVar = this.f413481j;
            int i13 = r.i(r.i((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f413482k), 31, this.f413483l);
            Integer num = this.f413484m;
            int iHashCode2 = (i13 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f413485n;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExtendedForm(accountData=");
            sb2.append(this.f413475d);
            sb2.append(", formData=");
            sb2.append(this.f413476e);
            sb2.append(", clientName=");
            sb2.append(this.f413477f);
            sb2.append(", scope=");
            sb2.append(this.f413478g);
            sb2.append(", showScopeDialog=");
            sb2.append(this.f413479h);
            sb2.append(", permissionTypes=");
            sb2.append(this.f413480i);
            sb2.append(", permissionTypeHintState=");
            sb2.append(this.f413481j);
            sb2.append(", submitButtonIsLoading=");
            sb2.append(this.f413482k);
            sb2.append(", changeAccountButtonIsLoading=");
            sb2.append(this.f413483l);
            sb2.append(", fioInputErrorTextResId=");
            sb2.append(this.f413484m);
            sb2.append(", phoneInputErrorTextResId=");
            return s.j(sb2, this.f413485n, ')');
        }

        public b(@k com.avito.android.oauth.repository.a aVar, @k C11772c c11772c, @k String str, @k List<String> list, boolean z12, @l List<C42193c> list2, @l f fVar, boolean z13, boolean z14, @l Integer num, @l Integer num2) {
            super(null);
            this.f413475d = aVar;
            this.f413476e = c11772c;
            this.f413477f = str;
            this.f413478g = list;
            this.f413479h = z12;
            this.f413480i = list2;
            this.f413481j = fVar;
            this.f413482k = z13;
            this.f413483l = z14;
            this.f413484m = num;
            this.f413485n = num2;
        }
    }

    /* compiled from: OAuthState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll40/c$c;", "", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l40.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11772c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f413486a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f413487b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f413488c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f413489d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Long f413490e;

        public /* synthetic */ C11772c(String str, boolean z12, String str2, boolean z13, Long l12, int i12, C42822w c42822w) {
            this(str, z12, z13, str2, (i12 & 16) != 0 ? null : l12);
        }

        public static C11772c a(C11772c c11772c, String str, String str2, Long l12, int i12) {
            if ((i12 & 1) != 0) {
                str = c11772c.f413486a;
            }
            String str3 = str;
            boolean z12 = c11772c.f413487b;
            if ((i12 & 4) != 0) {
                str2 = c11772c.f413488c;
            }
            String str4 = str2;
            boolean z13 = c11772c.f413489d;
            if ((i12 & 16) != 0) {
                l12 = c11772c.f413490e;
            }
            c11772c.getClass();
            return new C11772c(str3, z12, z13, str4, l12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11772c)) {
                return false;
            }
            C11772c c11772c = (C11772c) obj;
            return L.f(this.f413486a, c11772c.f413486a) && this.f413487b == c11772c.f413487b && L.f(this.f413488c, c11772c.f413488c) && this.f413489d == c11772c.f413489d && L.f(this.f413490e, c11772c.f413490e);
        }

        public final int hashCode() {
            int i12 = r.i(H.d(r.i(this.f413486a.hashCode() * 31, 31, this.f413487b), 31, this.f413488c), 31, this.f413489d);
            Long l12 = this.f413490e;
            return i12 + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FormData(fio=");
            sb2.append(this.f413486a);
            sb2.append(", fioInputEnabled=");
            sb2.append(this.f413487b);
            sb2.append(", phone=");
            sb2.append(this.f413488c);
            sb2.append(", phoneInputIsEnabled=");
            sb2.append(this.f413489d);
            sb2.append(", selectedPermissionType=");
            return m.m(sb2, this.f413490e, ')');
        }

        public C11772c(@k String str, boolean z12, boolean z13, @k String str2, @l Long l12) {
            this.f413486a = str;
            this.f413487b = z12;
            this.f413488c = str2;
            this.f413489d = z13;
            this.f413490e = l12;
        }
    }

    /* compiled from: OAuthState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll40/c$d;", "Ll40/c;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: d, reason: collision with root package name */
        public final int f413491d;

        /* renamed from: e, reason: collision with root package name */
        public final int f413492e;

        /* renamed from: f, reason: collision with root package name */
        public final int f413493f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final InterfaceC43542a f413494g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f413495h;

        /* renamed from: i, reason: collision with root package name */
        public final int f413496i;

        public /* synthetic */ d(int i12, int i13, int i14, InterfaceC43542a interfaceC43542a, boolean z12, int i15, int i16, C42822w c42822w) {
            this(i12, i13, i14, interfaceC43542a, z12, (i16 & 32) != 0 ? R.drawable.placeholders_img_unknown_error : i15);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f413491d == dVar.f413491d && this.f413492e == dVar.f413492e && this.f413493f == dVar.f413493f && L.f(this.f413494g, dVar.f413494g) && this.f413495h == dVar.f413495h && this.f413496i == dVar.f413496i;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f413496i) + r.i((this.f413494g.hashCode() + r.e(this.f413493f, r.e(this.f413492e, Integer.hashCode(this.f413491d) * 31, 31), 31)) * 31, 31, this.f413495h);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FullScreenError(titleStringRes=");
            sb2.append(this.f413491d);
            sb2.append(", subtitle=");
            sb2.append(this.f413492e);
            sb2.append(", buttonText=");
            sb2.append(this.f413493f);
            sb2.append(", onButtonClick=");
            sb2.append(this.f413494g);
            sb2.append(", isLoading=");
            sb2.append(this.f413495h);
            sb2.append(", drawableRes=");
            return r.t(sb2, this.f413496i, ')');
        }

        public d(int i12, int i13, int i14, @k InterfaceC43542a interfaceC43542a, boolean z12, int i15) {
            super(null);
            this.f413491d = i12;
            this.f413492e = i13;
            this.f413493f = i14;
            this.f413494g = interfaceC43542a;
            this.f413495h = z12;
            this.f413496i = i15;
        }
    }

    /* compiled from: OAuthState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll40/c$e;", "Ll40/c;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final e f413497d = new e();

        public e() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -434309357;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: OAuthState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll40/c$f;", "", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f413498a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f413499b;

        public f(@k String str, @k String str2) {
            this.f413498a = str;
            this.f413499b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f413498a, fVar.f413498a) && L.f(this.f413499b, fVar.f413499b);
        }

        public final int hashCode() {
            return this.f413499b.hashCode() + (this.f413498a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PermissionTypeHintState(title=");
            sb2.append(this.f413498a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f413499b, ')');
        }
    }

    /* compiled from: OAuthState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll40/c$g;", "Ll40/c;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final com.avito.android.oauth.repository.a f413500d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f413501e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<String> f413502f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f413503g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f413504h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f413505i;

        public /* synthetic */ g(com.avito.android.oauth.repository.a aVar, String str, List list, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
            this(aVar, str, list, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? false : z14);
        }

        public static g a(g gVar, boolean z12, boolean z13, int i12) {
            com.avito.android.oauth.repository.a aVar = gVar.f413500d;
            String str = gVar.f413501e;
            List<String> list = gVar.f413502f;
            if ((i12 & 8) != 0) {
                z12 = gVar.f413503g;
            }
            boolean z14 = z12;
            if ((i12 & 16) != 0) {
                z13 = gVar.f413504h;
            }
            boolean z15 = gVar.f413505i;
            gVar.getClass();
            return new g(aVar, str, list, z14, z13, z15);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f413500d, gVar.f413500d) && L.f(this.f413501e, gVar.f413501e) && L.f(this.f413502f, gVar.f413502f) && this.f413503g == gVar.f413503g && this.f413504h == gVar.f413504h && this.f413505i == gVar.f413505i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f413505i) + r.i(r.i(H.e(H.d(this.f413500d.hashCode() * 31, 31, this.f413501e), 31, this.f413502f), 31, this.f413503g), 31, this.f413504h);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShortForm(accountData=");
            sb2.append(this.f413500d);
            sb2.append(", clientName=");
            sb2.append(this.f413501e);
            sb2.append(", scope=");
            sb2.append(this.f413502f);
            sb2.append(", showScopeDialog=");
            sb2.append(this.f413503g);
            sb2.append(", submitButtonIsLoading=");
            sb2.append(this.f413504h);
            sb2.append(", changeAccountButtonIsLoading=");
            return r.x(sb2, this.f413505i, ')');
        }

        public g(@k com.avito.android.oauth.repository.a aVar, @k String str, @k List<String> list, boolean z12, boolean z13, boolean z14) {
            super(null);
            this.f413500d = aVar;
            this.f413501e = str;
            this.f413502f = list;
            this.f413503g = z12;
            this.f413504h = z13;
            this.f413505i = z14;
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
