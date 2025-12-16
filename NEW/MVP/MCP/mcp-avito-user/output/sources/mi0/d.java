package MI0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PanelSoaState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMI0/d;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final KI0.b f10577a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final KI0.a f10578b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f10579c;

    /* compiled from: PanelSoaState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LMI0/d$a;", "", "a", "b", "c", "d", "e", "LMI0/d$a$a;", "LMI0/d$a$b;", "LMI0/d$a$c;", "LMI0/d$a$d;", "LMI0/d$a$e;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: PanelSoaState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMI0/d$a$a;", "LMI0/d$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: MI0.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0672a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0672a f10580a = new C0672a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0672a);
            }

            public final int hashCode() {
                return -806438691;
            }

            @k
            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: PanelSoaState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/d$a$b;", "LMI0/d$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f10581a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f10582b;

            public b(@k ApiError apiError, @l Throwable th2) {
                this.f10581a = apiError;
                this.f10582b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f10581a, bVar.f10581a) && L.f(this.f10582b, bVar.f10582b);
            }

            public final int hashCode() {
                int iHashCode = this.f10581a.hashCode() * 31;
                Throwable th2 = this.f10582b;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(error=");
                sb2.append(this.f10581a);
                sb2.append(", cause=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f10582b, ')');
            }
        }

        /* compiled from: PanelSoaState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/d$a$c;", "LMI0/d$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final LI0.a f10583a;

            public c(@k LI0.a aVar) {
                this.f10583a = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f10583a, ((c) obj).f10583a);
            }

            public final int hashCode() {
                return this.f10583a.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(item=" + this.f10583a + ')';
            }
        }

        /* compiled from: PanelSoaState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/d$a$d;", "LMI0/d$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: MI0.d$a$d, reason: collision with other inner class name */
        public static final /* data */ class C0673d implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final LI0.b f10584a;

            public C0673d(@l LI0.b bVar) {
                this.f10584a = bVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0673d) && L.f(this.f10584a, ((C0673d) obj).f10584a);
            }

            public final int hashCode() {
                return this.f10584a == null ? 0 : -839751437;
            }

            @k
            public final String toString() {
                return "Loading(item=" + this.f10584a + ')';
            }
        }

        /* compiled from: PanelSoaState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMI0/d$a$e;", "LMI0/d$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final e f10585a = new e();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -857028184;
            }

            @k
            public final String toString() {
                return "None";
            }
        }
    }

    public d() {
        this(null, null, null, 7, null);
    }

    public static d a(d dVar, KI0.b bVar, KI0.a aVar, a aVar2, int i12) {
        if ((i12 & 1) != 0) {
            bVar = dVar.f10577a;
        }
        if ((i12 & 2) != 0) {
            aVar = dVar.f10578b;
        }
        if ((i12 & 4) != 0) {
            aVar2 = dVar.f10579c;
        }
        dVar.getClass();
        return new d(bVar, aVar, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f10577a, dVar.f10577a) && L.f(this.f10578b, dVar.f10578b) && L.f(this.f10579c, dVar.f10579c);
    }

    public final int hashCode() {
        int iHashCode = this.f10577a.hashCode() * 31;
        KI0.a aVar = this.f10578b;
        return this.f10579c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "PanelSoaState(soaStatInfo=" + this.f10577a + ", soaInfoDialog=" + this.f10578b + ", viewState=" + this.f10579c + ')';
    }

    public d(@k KI0.b bVar, @l KI0.a aVar, @k a aVar2) {
        this.f10577a = bVar;
        this.f10578b = aVar;
        this.f10579c = aVar2;
    }

    public /* synthetic */ d(KI0.b bVar, KI0.a aVar, a aVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new KI0.b(null, null, 3, null) : bVar, (i12 & 2) != 0 ? null : aVar, (i12 & 4) != 0 ? a.e.f10585a : aVar2);
    }
}
