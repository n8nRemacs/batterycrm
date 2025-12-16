package Nv0;

import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Location;
import com.avito.android.replace_main.toggle.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsInternalAction.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u001a\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"LNv0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "LNv0/b$a;", "LNv0/b$b;", "LNv0/b$c;", "LNv0/b$d;", "LNv0/b$e;", "LNv0/b$f;", "LNv0/b$g;", "LNv0/b$h;", "LNv0/b$i;", "LNv0/b$j;", "LNv0/b$k;", "LNv0/b$l;", "LNv0/b$m;", "LNv0/b$n;", "LNv0/b$o;", "LNv0/b$p;", "LNv0/b$q;", "LNv0/b$r;", "LNv0/b$s;", "LNv0/b$t;", "LNv0/b$u;", "LNv0/b$v;", "LNv0/b$w;", "LNv0/b$x;", "LNv0/b$y;", "LNv0/b$z;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14617b {

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/b$a;", "LNv0/b;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$a */
    public static final /* data */ class a implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ApiError f11817a;

        public a(@Y61.l ApiError apiError) {
            this.f11817a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f11817a, ((a) obj).f11817a);
        }

        public final int hashCode() {
            ApiError apiError = this.f11817a;
            if (apiError == null) {
                return 0;
            }
            return apiError.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("ClearSearchHistoryFailure(error="), this.f11817a, ')');
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/b$b;", "LNv0/b;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0771b implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11818a;

        public C0771b(boolean z12) {
            this.f11818a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0771b) && this.f11818a == ((C0771b) obj).f11818a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11818a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ClearSearchHistoryStatus(isInProgress="), this.f11818a, ')');
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$c;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$c */
    public static final /* data */ class c implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f11819a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 686632233;
        }

        @Y61.k
        public final String toString() {
            return "ClearSearchHistorySuccess";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$d;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$d */
    public static final /* data */ class d implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f11820a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1654169623;
        }

        @Y61.k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$e;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$e */
    public static final /* data */ class e implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f11821a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -163700047;
        }

        @Y61.k
        public final String toString() {
            return "DataLoadingError";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$f;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$f */
    public static final /* data */ class f implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f11822a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1179847402;
        }

        @Y61.k
        public final String toString() {
            return "DataLoadingStarted";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/b$g;", "LNv0/b;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$g */
    public static final /* data */ class g implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.replace_main.toggle.d f11823a;

        public g(@Y61.l com.avito.android.replace_main.toggle.d dVar) {
            this.f11823a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f11823a, ((g) obj).f11823a);
        }

        public final int hashCode() {
            com.avito.android.replace_main.toggle.d dVar = this.f11823a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DataLoadingSuccess(replaceMainToggle=" + this.f11823a + ')';
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/b$h;", "LNv0/b;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$h */
    public static final /* data */ class h implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Location f11824a;

        public h(@Y61.l Location location) {
            this.f11824a = location;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f11824a, ((h) obj).f11824a);
        }

        public final int hashCode() {
            Location location = this.f11824a;
            if (location == null) {
                return 0;
            }
            return location.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LocationUpdate(location=" + this.f11824a + ')';
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$i;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$i */
    public static final /* data */ class i implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f11825a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -877197114;
        }

        @Y61.k
        public final String toString() {
            return "OpenAppsLicenceScreen";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$j;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$j */
    public static final /* data */ class j implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f11826a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 856795899;
        }

        @Y61.k
        public final String toString() {
            return "OpenAvitoCare";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$k;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$k */
    public static final /* data */ class k implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f11827a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 711831592;
        }

        @Y61.k
        public final String toString() {
            return "OpenB2bHub";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$l;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$l */
    public static final /* data */ class l implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f11828a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 156925146;
        }

        @Y61.k
        public final String toString() {
            return "OpenDebugScreen";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$m;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$m */
    public static final /* data */ class m implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f11829a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 527752027;
        }

        @Y61.k
        public final String toString() {
            return "OpenHelpCenter";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$n;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$n */
    public static final /* data */ class n implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f11830a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1970013188;
        }

        @Y61.k
        public final String toString() {
            return "OpenLanguageSelector";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/b$o;", "LNv0/b;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$o */
    public static final /* data */ class o implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Location f11831a;

        public o(@Y61.k Location location) {
            this.f11831a = location;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f11831a, ((o) obj).f11831a);
        }

        public final int hashCode() {
            return this.f11831a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenLocationScreen(location=" + this.f11831a + ')';
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$p;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$p */
    public static final /* data */ class p implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f11832a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -62327197;
        }

        @Y61.k
        public final String toString() {
            return "OpenNotifications";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$q;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$q */
    public static final /* data */ class q implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f11833a = new q();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 2086344227;
        }

        @Y61.k
        public final String toString() {
            return "OpenOfferScreen";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$r;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$r */
    public static final /* data */ class r implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f11834a = new r();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return 69658133;
        }

        @Y61.k
        public final String toString() {
            return "OpenRecTechnologies";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$s;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$s */
    public static final /* data */ class s implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final s f11835a = new s();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 1819554414;
        }

        @Y61.k
        public final String toString() {
            return "OpenSourceLicencesScreen";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$t;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$t */
    public static final /* data */ class t implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f11836a = new t();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 2111381127;
        }

        @Y61.k
        public final String toString() {
            return "OpenThemeSettings";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$u;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$u */
    public static final /* data */ class u implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final u f11837a = new u();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return -1415297786;
        }

        @Y61.k
        public final String toString() {
            return "OpenUserAgreementScreen";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/b$v;", "LNv0/b;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$v */
    public static final /* data */ class v implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f11838a;

        public v(@Y61.k ApiError apiError) {
            this.f11838a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && L.f(this.f11838a, ((v) obj).f11838a);
        }

        public final int hashCode() {
            return this.f11838a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("ReplaceMainRequestError(error="), this.f11838a, ')');
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$w;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$w */
    public static final /* data */ class w implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final w f11839a = new w();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return 1653276197;
        }

        @Y61.k
        public final String toString() {
            return "ReplaceMainRequestStart";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/b$x;", "LNv0/b;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$x */
    public static final /* data */ class x implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BottomNavigationSpace f11840a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final d.c f11841b;

        public x(@Y61.k BottomNavigationSpace bottomNavigationSpace, @Y61.k d.c cVar) {
            this.f11840a = bottomNavigationSpace;
            this.f11841b = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.f11840a == xVar.f11840a && L.f(this.f11841b, xVar.f11841b);
        }

        public final int hashCode() {
            return this.f11841b.hashCode() + (this.f11840a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ReplaceMainRequestSuccess(main=" + this.f11840a + ", toastData=" + this.f11841b + ')';
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/b$y;", "LNv0/b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$y */
    public static final /* data */ class y implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final y f11842a = new y();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -301110953;
        }

        @Y61.k
        public final String toString() {
            return "ToggleVersionInfo";
        }
    }

    /* compiled from: SettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/b$z;", "LNv0/b;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.b$z */
    public static final /* data */ class z implements InterfaceC14617b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BottomNavigationSpace f11843a;

        public z(@Y61.k BottomNavigationSpace bottomNavigationSpace) {
            this.f11843a = bottomNavigationSpace;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && this.f11843a == ((z) obj).f11843a;
        }

        public final int hashCode() {
            return this.f11843a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateReplaceMain(main=" + this.f11843a + ')';
        }
    }
}
