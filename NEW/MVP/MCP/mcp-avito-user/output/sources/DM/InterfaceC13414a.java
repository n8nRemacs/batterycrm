package Dm;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarNavigatorAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LDm/a;", "", "a", "b", "c", "d", "e", "f", "g", "LDm/a$a;", "LDm/a$b;", "LDm/a$c;", "LDm/a$d;", "LDm/a$e;", "LDm/a$f;", "LDm/a$g;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13414a {

    /* compiled from: CarNavigatorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDm/a$a;", "LDm/a;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0189a implements InterfaceC13414a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3418a;

        public C0189a() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0189a) && this.f3418a == ((C0189a) obj).f3418a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3418a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CancelScreen(reload="), this.f3418a, ')');
        }

        public C0189a(boolean z12) {
            this.f3418a = z12;
        }

        public /* synthetic */ C0189a(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: CarNavigatorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDm/a$b;", "LDm/a;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.a$b */
    public static final /* data */ class b implements InterfaceC13414a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3419a;

        public b(@k String str) {
            this.f3419a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3419a, ((b) obj).f3419a);
        }

        public final int hashCode() {
            return this.f3419a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadUrl(url="), this.f3419a, ')');
        }
    }

    /* compiled from: CarNavigatorAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDm/a$c;", "LDm/a;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.a$c */
    public static final /* data */ class c implements InterfaceC13414a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f3420a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1910606089;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: CarNavigatorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDm/a$d;", "LDm/a;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.a$d */
    public static final /* data */ class d implements InterfaceC13414a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f3421a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f3422b;

        public d(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            str = (i12 & 2) != 0 ? null : str;
            this.f3421a = deepLink;
            this.f3422b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f3421a, dVar.f3421a) && L.f(this.f3422b, dVar.f3422b);
        }

        public final int hashCode() {
            int iHashCode = this.f3421a.hashCode() * 31;
            String str = this.f3422b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deepLink=");
            sb2.append(this.f3421a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f3422b, ')');
        }
    }

    /* compiled from: CarNavigatorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDm/a$e;", "LDm/a;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.a$e */
    public static final /* data */ class e implements InterfaceC13414a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f3423a;

        public e(@k Uri uri) {
            this.f3423a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f3423a, ((e) obj).f3423a);
        }

        public final int hashCode() {
            return this.f3423a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("OpenExternalUri(externalUri="), this.f3423a, ')');
        }
    }

    /* compiled from: CarNavigatorAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDm/a$f;", "LDm/a;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.a$f */
    public static final /* data */ class f implements InterfaceC13414a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f3424a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1244379497;
        }

        @k
        public final String toString() {
            return "ShowContent";
        }
    }

    /* compiled from: CarNavigatorAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDm/a$g;", "LDm/a;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.a$g */
    public static final /* data */ class g implements InterfaceC13414a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f3425a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1781003982;
        }

        @k
        public final String toString() {
            return "ShowLoadingError";
        }
    }
}
