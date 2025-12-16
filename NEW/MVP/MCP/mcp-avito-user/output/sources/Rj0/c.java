package rJ0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinResult;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MainFiltersState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LrJ0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UserAdvertsFiltersData f429740b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UserAdvertsFiltersBeduinResult f429741c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<UserAdvertsFiltersBeduinScreen, a> f429742d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UserAdvertsFiltersBeduinScreen f429743e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f429744f;

    /* compiled from: MainFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrJ0/c$a;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<String, Object> f429745a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Object> f429746b;

        public a(@k Map<String, ? extends Object> map, @k Map<String, ? extends Object> map2) {
            this.f429745a = map;
            this.f429746b = map2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f429745a, aVar.f429745a) && L.f(this.f429746b, aVar.f429746b);
        }

        public final int hashCode() {
            return this.f429746b.hashCode() + (this.f429745a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScreenParams(filterParams=");
            sb2.append(this.f429745a);
            sb2.append(", defaultFilterParams=");
            return r.w(sb2, this.f429746b, ')');
        }
    }

    /* compiled from: MainFiltersState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LrJ0/c$b;", "", "a", "b", "c", "d", "LrJ0/c$b$a;", "LrJ0/c$b$b;", "LrJ0/c$b$c;", "LrJ0/c$b$d;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: MainFiltersState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrJ0/c$b$a;", "LrJ0/c$b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UserAdvertsFiltersBeduinScreen f429747a;

            public a(@k UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen) {
                this.f429747a = userAdvertsFiltersBeduinScreen;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f429747a, ((a) obj).f429747a);
            }

            public final int hashCode() {
                return this.f429747a.f316078b.hashCode();
            }

            @k
            public final String toString() {
                return "Content(currentScreen=" + this.f429747a + ')';
            }
        }

        /* compiled from: MainFiltersState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrJ0/c$b$b;", "LrJ0/c$b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rJ0.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12370b implements b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final ApiError f429748a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f429749b;

            public C12370b(@l ApiError apiError, @l Throwable th2) {
                this.f429748a = apiError;
                this.f429749b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12370b)) {
                    return false;
                }
                C12370b c12370b = (C12370b) obj;
                return L.f(this.f429748a, c12370b.f429748a) && L.f(this.f429749b, c12370b.f429749b);
            }

            public final int hashCode() {
                ApiError apiError = this.f429748a;
                int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
                Throwable th2 = this.f429749b;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f429748a);
                sb2.append(", throwable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f429749b, ')');
            }
        }

        /* compiled from: MainFiltersState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrJ0/c$b$c;", "LrJ0/c$b;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rJ0.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C12371c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12371c f429750a = new C12371c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C12371c);
            }

            public final int hashCode() {
                return -1774229623;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: MainFiltersState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrJ0/c$b$d;", "LrJ0/c$b;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f429751a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 642421771;
            }

            @k
            public final String toString() {
                return "None";
            }
        }
    }

    public /* synthetic */ c(UserAdvertsFiltersData userAdvertsFiltersData, UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult, Map map, UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, b bVar, int i12, C42822w c42822w) {
        this(userAdvertsFiltersData, (i12 & 2) != 0 ? null : userAdvertsFiltersBeduinResult, (i12 & 4) != 0 ? P0.c() : map, (i12 & 8) != 0 ? null : userAdvertsFiltersBeduinScreen, (i12 & 16) != 0 ? b.d.f429751a : bVar);
    }

    public static c a(c cVar, UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult, Map map, UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, b bVar, int i12) {
        UserAdvertsFiltersData userAdvertsFiltersData = cVar.f429740b;
        if ((i12 & 2) != 0) {
            userAdvertsFiltersBeduinResult = cVar.f429741c;
        }
        UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult2 = userAdvertsFiltersBeduinResult;
        if ((i12 & 4) != 0) {
            map = cVar.f429742d;
        }
        Map map2 = map;
        if ((i12 & 8) != 0) {
            userAdvertsFiltersBeduinScreen = cVar.f429743e;
        }
        UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen2 = userAdvertsFiltersBeduinScreen;
        if ((i12 & 16) != 0) {
            bVar = cVar.f429744f;
        }
        cVar.getClass();
        return new c(userAdvertsFiltersData, userAdvertsFiltersBeduinResult2, map2, userAdvertsFiltersBeduinScreen2, bVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f429740b, cVar.f429740b) && L.f(this.f429741c, cVar.f429741c) && L.f(this.f429742d, cVar.f429742d) && L.f(this.f429743e, cVar.f429743e) && L.f(this.f429744f, cVar.f429744f);
    }

    public final int hashCode() {
        int iHashCode = this.f429740b.hashCode() * 31;
        UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult = this.f429741c;
        int iC2 = AK.c.c((iHashCode + (userAdvertsFiltersBeduinResult == null ? 0 : userAdvertsFiltersBeduinResult.hashCode())) * 31, 31, this.f429742d);
        UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen = this.f429743e;
        return this.f429744f.hashCode() + ((iC2 + (userAdvertsFiltersBeduinScreen != null ? userAdvertsFiltersBeduinScreen.f316078b.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "MainFiltersState(params=" + this.f429740b + ", result=" + this.f429741c + ", screenParams=" + this.f429742d + ", prevScreen=" + this.f429743e + ", viewState=" + this.f429744f + ')';
    }

    public c(@k UserAdvertsFiltersData userAdvertsFiltersData, @l UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult, @k Map<UserAdvertsFiltersBeduinScreen, a> map, @l UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, @k b bVar) {
        this.f429740b = userAdvertsFiltersData;
        this.f429741c = userAdvertsFiltersBeduinResult;
        this.f429742d = map;
        this.f429743e = userAdvertsFiltersBeduinScreen;
        this.f429744f = bVar;
    }
}
