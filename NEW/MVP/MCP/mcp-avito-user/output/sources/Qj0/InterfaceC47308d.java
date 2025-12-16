package qJ0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinNavBar;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FiltersDelegateState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LqJ0/d;", "", "a", "b", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qJ0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC47308d {

    /* compiled from: FiltersDelegateState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqJ0/d$b;", "LqJ0/d;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qJ0.d$b */
    public static final /* data */ class b implements InterfaceC47308d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f429187a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1919409349;
        }

        @k
        public final String toString() {
            return "None";
        }
    }

    /* compiled from: FiltersDelegateState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LqJ0/d$a;", "LqJ0/d;", "a", "b", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qJ0.d$a */
    public static final /* data */ class a implements InterfaceC47308d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAdvertsFiltersBeduinModel f429175a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Object> f429176b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, Object> f429177c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<C12320a> f429178d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final b f429179e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f429180f;

        /* compiled from: FiltersDelegateState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqJ0/d$a$a;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qJ0.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12320a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f429181a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<BeduinModel> f429182b;

            /* JADX WARN: Multi-variable type inference failed */
            public C12320a(@l String str, @k List<? extends BeduinModel> list) {
                this.f429181a = str;
                this.f429182b = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12320a)) {
                    return false;
                }
                C12320a c12320a = (C12320a) obj;
                return L.f(this.f429181a, c12320a.f429181a) && L.f(this.f429182b, c12320a.f429182b);
            }

            public final int hashCode() {
                String str = this.f429181a;
                return this.f429182b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BackChange(formId=");
                sb2.append(this.f429181a);
                sb2.append(", backToModels=");
                return H.p(sb2, this.f429182b, ')');
            }
        }

        public a(@k UserAdvertsFiltersBeduinModel userAdvertsFiltersBeduinModel, @k Map<String, ? extends Object> map, @k Map<String, ? extends Object> map2, @k List<C12320a> list, @k b bVar, @l String str) {
            this.f429175a = userAdvertsFiltersBeduinModel;
            this.f429176b = map;
            this.f429177c = map2;
            this.f429178d = list;
            this.f429179e = bVar;
            this.f429180f = str;
        }

        public static a a(a aVar, Map map, Map map2, List list, b bVar, int i12) {
            UserAdvertsFiltersBeduinModel userAdvertsFiltersBeduinModel = aVar.f429175a;
            if ((i12 & 2) != 0) {
                map = aVar.f429176b;
            }
            Map map3 = map;
            if ((i12 & 4) != 0) {
                map2 = aVar.f429177c;
            }
            Map map4 = map2;
            if ((i12 & 8) != 0) {
                list = aVar.f429178d;
            }
            List list2 = list;
            if ((i12 & 16) != 0) {
                bVar = aVar.f429179e;
            }
            String str = aVar.f429180f;
            aVar.getClass();
            return new a(userAdvertsFiltersBeduinModel, map3, map4, list2, bVar, str);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f429175a, aVar.f429175a) && L.f(this.f429176b, aVar.f429176b) && L.f(this.f429177c, aVar.f429177c) && L.f(this.f429178d, aVar.f429178d) && L.f(this.f429179e, aVar.f429179e) && L.f(this.f429180f, aVar.f429180f);
        }

        public final int hashCode() {
            int iHashCode = (this.f429179e.hashCode() + H.e(AK.c.c(AK.c.c(this.f429175a.hashCode() * 31, 31, this.f429176b), 31, this.f429177c), 31, this.f429178d)) * 31;
            String str = this.f429180f;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(initialModel=");
            sb2.append(this.f429175a);
            sb2.append(", appliedFilterParams=");
            sb2.append(this.f429176b);
            sb2.append(", defaultFilterParams=");
            sb2.append(this.f429177c);
            sb2.append(", backChanges=");
            sb2.append(this.f429178d);
            sb2.append(", viewState=");
            sb2.append(this.f429179e);
            sb2.append(", profileTab=");
            return C22026a.c(sb2, this.f429180f, ')');
        }

        /* compiled from: FiltersDelegateState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqJ0/d$a$b;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qJ0.d$a$b */
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UserAdvertsFiltersBeduinNavBar f429183a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f429184b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f429185c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f429186d;

            /* JADX WARN: Multi-variable type inference failed */
            public b(@k UserAdvertsFiltersBeduinNavBar userAdvertsFiltersBeduinNavBar, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
                this.f429183a = userAdvertsFiltersBeduinNavBar;
                this.f429184b = list;
                this.f429185c = list2;
                this.f429186d = list3;
            }

            public static b a(b bVar, UserAdvertsFiltersBeduinNavBar userAdvertsFiltersBeduinNavBar, List list, List list2, List list3, int i12) {
                if ((i12 & 1) != 0) {
                    userAdvertsFiltersBeduinNavBar = bVar.f429183a;
                }
                if ((i12 & 2) != 0) {
                    list = bVar.f429184b;
                }
                if ((i12 & 4) != 0) {
                    list2 = bVar.f429185c;
                }
                if ((i12 & 8) != 0) {
                    list3 = bVar.f429186d;
                }
                bVar.getClass();
                return new b(userAdvertsFiltersBeduinNavBar, list, list2, list3);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f429183a, bVar.f429183a) && L.f(this.f429184b, bVar.f429184b) && L.f(this.f429185c, bVar.f429185c) && L.f(this.f429186d, bVar.f429186d);
            }

            public final int hashCode() {
                return this.f429186d.hashCode() + H.e(H.e(this.f429183a.hashCode() * 31, 31, this.f429184b), 31, this.f429185c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ViewState(navBar=");
                sb2.append(this.f429183a);
                sb2.append(", topComponents=");
                sb2.append(this.f429184b);
                sb2.append(", mainComponents=");
                sb2.append(this.f429185c);
                sb2.append(", bottomComponents=");
                return H.p(sb2, this.f429186d, ')');
            }

            public b(UserAdvertsFiltersBeduinNavBar userAdvertsFiltersBeduinNavBar, List list, List list2, List list3, int i12, C42822w c42822w) {
                this(userAdvertsFiltersBeduinNavBar, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? C42784z0.f406748b : list2, (i12 & 8) != 0 ? C42784z0.f406748b : list3);
            }
        }

        public a(UserAdvertsFiltersBeduinModel userAdvertsFiltersBeduinModel, Map map, Map map2, List list, b bVar, String str, int i12, C42822w c42822w) {
            this(userAdvertsFiltersBeduinModel, (i12 & 2) != 0 ? P0.c() : map, (i12 & 4) != 0 ? P0.c() : map2, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? new b(UserAdvertsFiltersBeduinNavBar.a(userAdvertsFiltersBeduinModel.f316054b, false), null, null, null, 14, null) : bVar, (i12 & 32) != 0 ? null : str);
        }
    }
}
