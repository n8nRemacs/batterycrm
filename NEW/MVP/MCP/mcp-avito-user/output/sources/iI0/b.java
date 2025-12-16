package II0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PanelConfigInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LII0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LII0/b$a;", "LII0/b$b;", "LII0/b$c;", "LII0/b$d;", "LII0/b$e;", "LII0/b$f;", "LII0/b$g;", "LII0/b$h;", "LII0/b$i;", "LII0/b$j;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII0/b$a;", "LII0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f8086a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f8087b;

        public a(@k ApiError apiError, @l Throwable th2) {
            this.f8086a = apiError;
            this.f8087b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f8086a, aVar.f8086a) && L.f(this.f8087b, aVar.f8087b);
        }

        public final int hashCode() {
            int iHashCode = this.f8086a.hashCode() * 31;
            Throwable th2 = this.f8087b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingError(error=");
            sb2.append(this.f8086a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f8087b, ')');
        }
    }

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII0/b$b;", "LII0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: II0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0455b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GI0.a f8088a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8089b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final b.a f8090c;

        public C0455b(@k GI0.a aVar, boolean z12, @l b.a aVar2) {
            this.f8088a = aVar;
            this.f8089b = z12;
            this.f8090c = aVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0455b)) {
                return false;
            }
            C0455b c0455b = (C0455b) obj;
            return L.f(this.f8088a, c0455b.f8088a) && this.f8089b == c0455b.f8089b && L.f(this.f8090c, c0455b.f8090c);
        }

        public final int hashCode() {
            int i12 = r.i(this.f8088a.hashCode() * 31, 31, this.f8089b);
            b.a aVar = this.f8090c;
            return i12 + (aVar == null ? 0 : aVar.f313259a.hashCode());
        }

        @k
        public final String toString() {
            return "LoadingResult(itemsConfig=" + this.f8088a + ", shouldShowStatsOnboarding=" + this.f8089b + ", servicesNps=" + this.f8090c + ')';
        }
    }

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LII0/b$c;", "LII0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f8091a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1329213648;
        }

        @k
        public final String toString() {
            return "LoadingStart";
        }
    }

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LII0/b$d;", "LII0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f8092a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 856196635;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII0/b$e;", "LII0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f8093a;

        public e(@k DeepLink deepLink) {
            this.f8093a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f8093a, ((e) obj).f8093a);
        }

        public final int hashCode() {
            return this.f8093a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f8093a, ')');
        }
    }

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LII0/b$f;", "LII0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f8094a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1485946340;
        }

        @k
        public final String toString() {
            return "OpenVasPlanBalanceLack";
        }
    }

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LII0/b$g;", "LII0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f8095a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 945333317;
        }

        @k
        public final String toString() {
            return "Reset";
        }
    }

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LII0/b$h;", "LII0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f8096a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -316371222;
        }

        @k
        public final String toString() {
            return "ServiceNpsRemove";
        }
    }

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LII0/b$i;", "LII0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f8097a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -926120750;
        }

        @k
        public final String toString() {
            return "StatsTooltipRemove";
        }
    }

    /* compiled from: PanelConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LII0/b$j;", "LII0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f8098a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 2130028250;
        }

        @k
        public final String toString() {
            return "UxFeedbackDeepLinkDone";
        }
    }
}
