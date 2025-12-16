package OE;

import com.avito.android.forceupdate.domain.dto.UpdateSource;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ForceUpdateRootOneTimeEvent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LOE/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "LOE/b$a;", "LOE/b$b;", "LOE/b$c;", "LOE/b$d;", "LOE/b$e;", "LOE/b$f;", "LOE/b$g;", "LOE/b$h;", "LOE/b$i;", "LOE/b$j;", "LOE/b$k;", "LOE/b$l;", "LOE/b$m;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$a;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f12082a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1135617032;
        }

        @Y61.k
        public final String toString() {
            return "DismissDialog";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$b;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: OE.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0780b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0780b f12083a = new C0780b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0780b);
        }

        public final int hashCode() {
            return 1344811453;
        }

        @Y61.k
        public final String toString() {
            return "Finish";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOE/b$c;", "LOE/b;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UpdateSource f12084a;

        public c(@Y61.k UpdateSource updateSource) {
            this.f12084a = updateSource;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12084a, ((c) obj).f12084a);
        }

        public final int hashCode() {
            return this.f12084a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenMarket(updateSource=" + this.f12084a + ')';
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$d;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f12085a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 96441350;
        }

        @Y61.k
        public final String toString() {
            return "OpenMavInWebView";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOE/b$e;", "LOE/b;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UpdateSource f12086a;

        public e(@Y61.k UpdateSource updateSource) {
            this.f12086a = updateSource;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f12086a, ((e) obj).f12086a);
        }

        public final int hashCode() {
            return this.f12086a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenUpdateRequiredScreen(updateSource=" + this.f12086a + ')';
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$f;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f12087a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1884843387;
        }

        @Y61.k
        public final String toString() {
            return "RequestStoragePermission";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$g;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f12088a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -252756971;
        }

        @Y61.k
        public final String toString() {
            return "ShowDownloadStartedToast";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$h;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f12089a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1923402399;
        }

        @Y61.k
        public final String toString() {
            return "ShowProposalDialog";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$i;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f12090a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -944576477;
        }

        @Y61.k
        public final String toString() {
            return "TrackClosedWithNoPermission";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$j;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f12091a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1663068153;
        }

        @Y61.k
        public final String toString() {
            return "TrackClosedWithRefuse";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$k;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f12092a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1567100740;
        }

        @Y61.k
        public final String toString() {
            return "TrackClosedWithUpdate";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$l;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f12093a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -228794344;
        }

        @Y61.k
        public final String toString() {
            return "TrackShownDialog";
        }
    }

    /* compiled from: ForceUpdateRootOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/b$m;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f12094a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 2022412218;
        }

        @Y61.k
        public final String toString() {
            return "TrackWebViewGoToMavWithForceRedirect";
        }
    }
}
