package pg;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import og.C44772a;

/* compiled from: AvitoFinanceBlockInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lpg/c;", "", "a", "b", "c", "d", "e", "f", "g", "Lpg/c$a;", "Lpg/c$b;", "Lpg/c$c;", "Lpg/c$d;", "Lpg/c$e;", "Lpg/c$f;", "Lpg/c$g;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pg.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC47077c {

    /* compiled from: AvitoFinanceBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg/c$a;", "Lpg/c;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.c$a */
    public static final /* data */ class a implements InterfaceC47077c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ApiError f428721a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f428722b;

        public a(@l ApiError apiError, @l Throwable th2) {
            this.f428721a = apiError;
            this.f428722b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f428721a, aVar.f428721a) && L.f(this.f428722b, aVar.f428722b);
        }

        public final int hashCode() {
            ApiError apiError = this.f428721a;
            int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
            Throwable th2 = this.f428722b;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(apiError=");
            sb2.append(this.f428721a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f428722b, ')');
        }
    }

    /* compiled from: AvitoFinanceBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg/c$b;", "Lpg/c;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.c$b */
    public static final /* data */ class b implements InterfaceC47077c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C44772a f428723a;

        public b(@k C44772a c44772a) {
            this.f428723a = c44772a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f428723a, ((b) obj).f428723a);
        }

        public final int hashCode() {
            return this.f428723a.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(blockData=" + this.f428723a + ')';
        }
    }

    /* compiled from: AvitoFinanceBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg/c$c;", "Lpg/c;", "<init>", "()V", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12283c implements InterfaceC47077c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12283c f428724a = new C12283c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12283c);
        }

        public final int hashCode() {
            return 1607166102;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: AvitoFinanceBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg/c$d;", "Lpg/c;", "<init>", "()V", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.c$d */
    public static final /* data */ class d implements InterfaceC47077c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f428725a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 912743607;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: AvitoFinanceBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg/c$e;", "Lpg/c;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.c$e */
    public static final /* data */ class e implements InterfaceC47077c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f428726a;

        public e(@k DeepLink deepLink) {
            this.f428726a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f428726a, ((e) obj).f428726a);
        }

        public final int hashCode() {
            return this.f428726a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f428726a, ')');
        }
    }

    /* compiled from: AvitoFinanceBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg/c$f;", "Lpg/c;", "<init>", "()V", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.c$f */
    public static final /* data */ class f implements InterfaceC47077c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f428727a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 301904681;
        }

        @k
        public final String toString() {
            return "Reset";
        }
    }

    /* compiled from: AvitoFinanceBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg/c$g;", "Lpg/c;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.c$g */
    public static final /* data */ class g implements InterfaceC47077c {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "StartLoading(sessionId=null)";
        }
    }
}
