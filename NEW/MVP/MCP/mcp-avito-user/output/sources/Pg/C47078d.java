package pg;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import mg.InterfaceC44078b;

/* compiled from: AvitoFinanceBlockState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lpg/d;", "", "a", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pg.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47078d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final InterfaceC44078b f428728a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f428729b;

    /* compiled from: AvitoFinanceBlockState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lpg/d$a;", "", "a", "b", "c", "d", "Lpg/d$a$a;", "Lpg/d$a$b;", "Lpg/d$a$c;", "Lpg/d$a$d;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.d$a */
    public interface a {

        /* compiled from: AvitoFinanceBlockState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg/d$a$a;", "Lpg/d$a;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: pg.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12284a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.android.avito_finance_user_profile.view.item.a f428730a;

            public C12284a(@k com.avito.android.avito_finance_user_profile.view.item.a aVar) {
                this.f428730a = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12284a) && L.f(this.f428730a, ((C12284a) obj).f428730a);
            }

            public final int hashCode() {
                return this.f428730a.hashCode();
            }

            @k
            public final String toString() {
                return "Data(item=" + this.f428730a + ')';
            }
        }

        /* compiled from: AvitoFinanceBlockState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg/d$a$b;", "Lpg/d$a;", "<init>", "()V", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: pg.d$a$b */
        public static final /* data */ class b implements a {
            static {
                new b();
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1059784825;
            }

            @k
            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: AvitoFinanceBlockState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg/d$a$c;", "Lpg/d$a;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: pg.d$a$c */
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final ApiError f428731a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f428732b;

            public c(@l ApiError apiError, @l Throwable th2) {
                this.f428731a = apiError;
                this.f428732b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f428731a, cVar.f428731a) && L.f(this.f428732b, cVar.f428732b);
            }

            public final int hashCode() {
                ApiError apiError = this.f428731a;
                int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
                Throwable th2 = this.f428732b;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f428731a);
                sb2.append(", cause=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f428732b, ')');
            }
        }

        /* compiled from: AvitoFinanceBlockState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg/d$a$d;", "Lpg/d$a;", "<init>", "()V", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: pg.d$a$d, reason: collision with other inner class name */
        public static final /* data */ class C12285d implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12285d f428733a = new C12285d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C12285d);
            }

            public final int hashCode() {
                return 727193228;
            }

            @k
            public final String toString() {
                return "None";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47078d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47078d)) {
            return false;
        }
        C47078d c47078d = (C47078d) obj;
        return L.f(this.f428728a, c47078d.f428728a) && L.f(this.f428729b, c47078d.f428729b);
    }

    public final int hashCode() {
        InterfaceC44078b interfaceC44078b = this.f428728a;
        return this.f428729b.hashCode() + ((interfaceC44078b == null ? 0 : interfaceC44078b.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "AvitoFinanceBlockState(initialData=" + this.f428728a + ", viewState=" + this.f428729b + ')';
    }

    public C47078d(@l InterfaceC44078b interfaceC44078b, @k a aVar) {
        this.f428728a = interfaceC44078b;
        this.f428729b = aVar;
    }

    public /* synthetic */ C47078d(InterfaceC44078b interfaceC44078b, a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : interfaceC44078b, (i12 & 2) != 0 ? a.C12285d.f428733a : aVar);
    }
}
