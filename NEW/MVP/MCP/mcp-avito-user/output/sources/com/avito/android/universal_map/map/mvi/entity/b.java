package com.avito.android.universal_map.map.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qG0.C47293d;

/* compiled from: UniversalMapState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/b;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f305558a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C47293d f305559b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Map<String, Object> f305560c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f305561d;

    /* compiled from: UniversalMapState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/b$a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/universal_map/map/mvi/entity/b$a$a;", "Lcom/avito/android/universal_map/map/mvi/entity/b$a$b;", "Lcom/avito/android/universal_map/map/mvi/entity/b$a$c;", "Lcom/avito/android/universal_map/map/mvi/entity/b$a$d;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/b$a$b;", "Lcom/avito/android/universal_map/map/mvi/entity/b$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.universal_map.map.mvi.entity.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C9380b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f305569a;

            public C9380b(@k ApiError apiError) {
                super(null);
                this.f305569a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9380b) && L.f(this.f305569a, ((C9380b) obj).f305569a);
            }

            public final int hashCode() {
                return this.f305569a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Error(error="), this.f305569a, ')');
            }
        }

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/b$a$c;", "Lcom/avito/android/universal_map/map/mvi/entity/b$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final List<BeduinAction> f305570a;

            /* JADX WARN: Multi-variable type inference failed */
            public c() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f305570a, ((c) obj).f305570a);
            }

            public final int hashCode() {
                List<BeduinAction> list = this.f305570a;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Hidden(onNativeCloseActions="), this.f305570a, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public c(@l List<? extends BeduinAction> list) {
                super(null);
                this.f305570a = list;
            }

            public /* synthetic */ c(List list, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : list);
            }
        }

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/b$a$d;", "Lcom/avito/android/universal_map/map/mvi/entity/b$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f305571a = new d();

            public d() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/b$a$a;", "Lcom/avito/android/universal_map/map/mvi/entity/b$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.universal_map.map.mvi.entity.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9379a extends a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f305562a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f305563b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f305564c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305565d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305566e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305567f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final List<BeduinAction> f305568g;

            public C9379a(String str, String str2, String str3, List list, List list2, List list3, List list4, int i12, C42822w c42822w) {
                this(str, str2, str3, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? C42784z0.f406748b : list2, (i12 & 32) != 0 ? C42784z0.f406748b : list3, list4);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9379a)) {
                    return false;
                }
                C9379a c9379a = (C9379a) obj;
                return L.f(this.f305562a, c9379a.f305562a) && L.f(this.f305563b, c9379a.f305563b) && L.f(this.f305564c, c9379a.f305564c) && L.f(this.f305565d, c9379a.f305565d) && L.f(this.f305566e, c9379a.f305566e) && L.f(this.f305567f, c9379a.f305567f) && L.f(this.f305568g, c9379a.f305568g);
            }

            public final int hashCode() {
                String str = this.f305562a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f305563b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f305564c;
                int iE2 = H.e(H.e(H.e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f305565d), 31, this.f305566e), 31, this.f305567f);
                List<BeduinAction> list = this.f305568g;
                return iE2 + (list != null ? list.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(topFormId=");
                sb2.append(this.f305562a);
                sb2.append(", mainFormId=");
                sb2.append(this.f305563b);
                sb2.append(", bottomFormId=");
                sb2.append(this.f305564c);
                sb2.append(", topComponents=");
                sb2.append(this.f305565d);
                sb2.append(", mainComponents=");
                sb2.append(this.f305566e);
                sb2.append(", bottomComponents=");
                sb2.append(this.f305567f);
                sb2.append(", onNativeCloseActions=");
                return H.p(sb2, this.f305568g, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C9379a(@l String str, @l String str2, @l String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, @l List<? extends BeduinAction> list4) {
                super(null);
                this.f305562a = str;
                this.f305563b = str2;
                this.f305564c = str3;
                this.f305565d = list;
                this.f305566e = list2;
                this.f305567f = list3;
                this.f305568g = list4;
            }
        }
    }

    public b() {
        this(false, null, null, null, 15, null);
    }

    public static b a(b bVar, C47293d c47293d, a aVar, int i12) {
        boolean z12 = bVar.f305558a;
        if ((i12 & 2) != 0) {
            c47293d = bVar.f305559b;
        }
        Map<String, Object> map = bVar.f305560c;
        if ((i12 & 8) != 0) {
            aVar = bVar.f305561d;
        }
        bVar.getClass();
        return new b(z12, c47293d, map, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f305558a == bVar.f305558a && L.f(this.f305559b, bVar.f305559b) && L.f(this.f305560c, bVar.f305560c) && L.f(this.f305561d, bVar.f305561d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f305558a) * 31;
        C47293d c47293d = this.f305559b;
        int iHashCode2 = (iHashCode + (c47293d == null ? 0 : c47293d.hashCode())) * 31;
        Map<String, Object> map = this.f305560c;
        return this.f305561d.hashCode() + ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "FiltersViewState(hasSelectedFilters=" + this.f305558a + ", tooltipData=" + this.f305559b + ", checkedFiltersParameters=" + this.f305560c + ", contentState=" + this.f305561d + ')';
    }

    public b(boolean z12, @l C47293d c47293d, @l Map<String, ? extends Object> map, @k a aVar) {
        this.f305558a = z12;
        this.f305559b = c47293d;
        this.f305560c = map;
        this.f305561d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(boolean z12, C47293d c47293d, Map map, a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : c47293d, (i12 & 4) != 0 ? null : map, (i12 & 8) != 0 ? new a.c(null, 1, 0 == true ? 1 : 0) : aVar);
    }
}
