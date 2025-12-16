package MI0;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PanelSoaInternalAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LMI0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "LMI0/b$a;", "LMI0/b$b;", "LMI0/b$c;", "LMI0/b$d;", "LMI0/b$e;", "LMI0/b$f;", "LMI0/b$g;", "LMI0/b$h;", "LMI0/b$i;", "LMI0/b$j;", "LMI0/b$k;", "LMI0/b$l;", "LMI0/b$m;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/b$a;", "LMI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f10556a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f10557b;

        public a(@Y61.k ApiError apiError, @Y61.l Throwable th2) {
            this.f10556a = apiError;
            this.f10557b = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f10556a, aVar.f10556a) && L.f(this.f10557b, aVar.f10557b);
        }

        public final int hashCode() {
            int iHashCode = this.f10556a.hashCode() * 31;
            Throwable th2 = this.f10557b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingError(error=");
            sb2.append(this.f10556a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f10557b, ')');
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/b$b;", "LMI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: MI0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0671b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final KI0.b f10558a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f10559b;

        public C0671b(@Y61.k KI0.b bVar, boolean z12) {
            this.f10558a = bVar;
            this.f10559b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0671b)) {
                return false;
            }
            C0671b c0671b = (C0671b) obj;
            return L.f(this.f10558a, c0671b.f10558a) && this.f10559b == c0671b.f10559b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10559b) + (this.f10558a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingResult(soaStatInfo=");
            sb2.append(this.f10558a);
            sb2.append(", showSoaPopup=");
            return r.x(sb2, this.f10559b, ')');
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMI0/b$c;", "LMI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f10560a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -385667376;
        }

        @Y61.k
        public final String toString() {
            return "LoadingStart";
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMI0/b$d;", "LMI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f10561a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1526692837;
        }

        @Y61.k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/b$e;", "LMI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final KI0.a f10562a;

        public e(@Y61.k KI0.a aVar) {
            this.f10562a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f10562a, ((e) obj).f10562a);
        }

        public final int hashCode() {
            return this.f10562a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenInfoDialog(soaInfoDialog=" + this.f10562a + ')';
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/b$f;", "LMI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f10563a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f10564b;

        public f(@Y61.k ApiError apiError, @Y61.l Throwable th2) {
            this.f10563a = apiError;
            this.f10564b = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f10563a, fVar.f10563a) && L.f(this.f10564b, fVar.f10564b);
        }

        public final int hashCode() {
            int iHashCode = this.f10563a.hashCode() * 31;
            Throwable th2 = this.f10564b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInfoDialogError(error=");
            sb2.append(this.f10563a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f10564b, ')');
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/b$g;", "LMI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final KI0.a f10565a;

        public g(@Y61.k KI0.a aVar) {
            this.f10565a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f10565a, ((g) obj).f10565a);
        }

        public final int hashCode() {
            return this.f10565a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenInfoDialogLoaded(soaInfoDialog=" + this.f10565a + ')';
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMI0/b$h;", "LMI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f10566a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1282316731;
        }

        @Y61.k
        public final String toString() {
            return "Reset";
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMI0/b$i;", "LMI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f10567a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -332239663;
        }

        @Y61.k
        public final String toString() {
            return "TooltipDismiss";
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMI0/b$j;", "LMI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f10568a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 296218622;
        }

        @Y61.k
        public final String toString() {
            return "UpdateCancelled";
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/b$k;", "LMI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f10569a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f10570b;

        public k(@Y61.k ApiError apiError, @Y61.l Throwable th2) {
            this.f10569a = apiError;
            this.f10570b = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f10569a, kVar.f10569a) && L.f(this.f10570b, kVar.f10570b);
        }

        public final int hashCode() {
            int iHashCode = this.f10569a.hashCode() * 31;
            Throwable th2 = this.f10570b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateError(error=");
            sb2.append(this.f10569a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f10570b, ')');
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/b$l;", "LMI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final KI0.b f10571a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f10572b;

        public l(@Y61.k KI0.b bVar, boolean z12) {
            this.f10571a = bVar;
            this.f10572b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f10571a, lVar.f10571a) && this.f10572b == lVar.f10572b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10572b) + (this.f10571a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateResult(soaStatInfo=");
            sb2.append(this.f10571a);
            sb2.append(", showSoaPopup=");
            return r.x(sb2, this.f10572b, ')');
        }
    }

    /* compiled from: PanelSoaInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/b$m;", "LMI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f10573a;

        public m(@Y61.l String str) {
            this.f10573a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f10573a, ((m) obj).f10573a);
        }

        public final int hashCode() {
            String str = this.f10573a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateStart(updatingInfoMsg="), this.f10573a, ')');
        }
    }
}
