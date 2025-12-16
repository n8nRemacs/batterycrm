package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RegionSheetState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "Location", "c", "SearchState", "d", "e", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RegionSheetState extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final b f128389h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final RegionSheetState f128390i = new RegionSheetState(new SearchState(new SearchState.b(null, ""), SearchState.UiState.f128416b, null, new HashMap()), null, new HashMap(), new a(""), new d("", "", ""), null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchState f128391b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final c f128392c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<Long, Location> f128393d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f128394e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final d f128395f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final e f128396g;

    /* compiled from: RegionSheetState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$SearchState;", "", "a", "b", "UiState", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchState {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final b f128412a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UiState f128413b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a f128414c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Map<Long, Location> f128415d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RegionSheetState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$SearchState$UiState;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UiState {

            /* renamed from: b, reason: collision with root package name */
            public static final UiState f128416b;

            /* renamed from: c, reason: collision with root package name */
            public static final UiState f128417c;

            /* renamed from: d, reason: collision with root package name */
            public static final UiState f128418d;

            /* renamed from: e, reason: collision with root package name */
            public static final UiState f128419e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ UiState[] f128420f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f128421g;

            static {
                UiState uiState = new UiState("DATA", 0);
                f128416b = uiState;
                UiState uiState2 = new UiState("LOADING", 1);
                f128417c = uiState2;
                UiState uiState3 = new UiState("EMPTY_ERROR", 2);
                f128418d = uiState3;
                UiState uiState4 = new UiState("LOAD_ERROR", 3);
                f128419e = uiState4;
                UiState[] uiStateArr = {uiState, uiState2, uiState3, uiState4};
                f128420f = uiStateArr;
                f128421g = kotlin.enums.c.a(uiStateArr);
            }

            public UiState() {
                throw null;
            }

            public static UiState valueOf(String str) {
                return (UiState) Enum.valueOf(UiState.class, str);
            }

            public static UiState[] values() {
                return (UiState[]) f128420f.clone();
            }
        }

        /* compiled from: RegionSheetState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$SearchState$a;", "", "a", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final C3812a f128422a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C3812a f128423b;

            /* compiled from: RegionSheetState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$SearchState$a$a;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$SearchState$a$a, reason: collision with other inner class name */
            public static final /* data */ class C3812a {

                /* renamed from: a, reason: collision with root package name */
                @l
                public final wZ.l f128424a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f128425b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f128426c;

                /* renamed from: d, reason: collision with root package name */
                @l
                public final String f128427d;

                public C3812a(@l wZ.l lVar, @k String str, @k String str2, @l String str3) {
                    this.f128424a = lVar;
                    this.f128425b = str;
                    this.f128426c = str2;
                    this.f128427d = str3;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3812a)) {
                        return false;
                    }
                    C3812a c3812a = (C3812a) obj;
                    return L.f(this.f128424a, c3812a.f128424a) && L.f(this.f128425b, c3812a.f128425b) && L.f(this.f128426c, c3812a.f128426c) && L.f(this.f128427d, c3812a.f128427d);
                }

                public final int hashCode() {
                    wZ.l lVar = this.f128424a;
                    int iD2 = H.d(H.d((lVar == null ? 0 : lVar.hashCode()) * 31, 31, this.f128425b), 31, this.f128426c);
                    String str = this.f128427d;
                    return iD2 + (str != null ? str.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("SearchError(image=");
                    sb2.append(this.f128424a);
                    sb2.append(", title=");
                    sb2.append(this.f128425b);
                    sb2.append(", description=");
                    sb2.append(this.f128426c);
                    sb2.append(", buttonTitle=");
                    return C22026a.c(sb2, this.f128427d, ')');
                }
            }

            public a(@k C3812a c3812a, @k C3812a c3812a2) {
                this.f128422a = c3812a;
                this.f128423b = c3812a2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f128422a, aVar.f128422a) && L.f(this.f128423b, aVar.f128423b);
            }

            public final int hashCode() {
                return this.f128423b.hashCode() + (this.f128422a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "Errors(emptyError=" + this.f128422a + ", loadError=" + this.f128423b + ')';
            }
        }

        /* compiled from: RegionSheetState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$SearchState$b;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f128428a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f128429b;

            public b(@l String str, @k String str2) {
                this.f128428a = str;
                this.f128429b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f128428a, bVar.f128428a) && L.f(this.f128429b, bVar.f128429b);
            }

            public final int hashCode() {
                String str = this.f128428a;
                return this.f128429b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InputState(hint=");
                sb2.append(this.f128428a);
                sb2.append(", value=");
                return C22026a.c(sb2, this.f128429b, ')');
            }
        }

        public SearchState(@k b bVar, @k UiState uiState, @l a aVar, @k Map<Long, Location> map) {
            this.f128412a = bVar;
            this.f128413b = uiState;
            this.f128414c = aVar;
            this.f128415d = map;
        }

        public static SearchState a(SearchState searchState, b bVar, UiState uiState, Map map, int i12) {
            if ((i12 & 1) != 0) {
                bVar = searchState.f128412a;
            }
            if ((i12 & 2) != 0) {
                uiState = searchState.f128413b;
            }
            a aVar = searchState.f128414c;
            if ((i12 & 8) != 0) {
                map = searchState.f128415d;
            }
            searchState.getClass();
            return new SearchState(bVar, uiState, aVar, map);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchState)) {
                return false;
            }
            SearchState searchState = (SearchState) obj;
            return L.f(this.f128412a, searchState.f128412a) && this.f128413b == searchState.f128413b && L.f(this.f128414c, searchState.f128414c) && L.f(this.f128415d, searchState.f128415d);
        }

        public final int hashCode() {
            int iHashCode = (this.f128413b.hashCode() + (this.f128412a.hashCode() * 31)) * 31;
            a aVar = this.f128414c;
            return this.f128415d.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchState(inputState=");
            sb2.append(this.f128412a);
            sb2.append(", uiState=");
            sb2.append(this.f128413b);
            sb2.append(", searchErrors=");
            sb2.append(this.f128414c);
            sb2.append(", searchLocations=");
            return r.w(sb2, this.f128415d, ')');
        }
    }

    /* compiled from: RegionSheetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$a;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f128430a;

        public a(@k String str) {
            this.f128430a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return L.f(this.f128430a, ((a) obj).f128430a);
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.f128430a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return AK.c.s(new StringBuilder("BottomBarState(buttonTitle="), this.f128430a, ", isLoading=false)");
        }
    }

    /* compiled from: RegionSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$b;", "", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: RegionSheetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$c;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f128431a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f128432b;

        public c(@k String str, boolean z12) {
            this.f128431a = str;
            this.f128432b = z12;
        }

        public static c a(c cVar, boolean z12) {
            String str = cVar.f128431a;
            cVar.getClass();
            return new c(str, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f128431a, cVar.f128431a) && this.f128432b == cVar.f128432b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f128432b) + (this.f128431a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RootRegion(title=");
            sb2.append(this.f128431a);
            sb2.append(", isChecked=");
            return r.x(sb2, this.f128432b, ')');
        }
    }

    /* compiled from: RegionSheetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$d;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f128433a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f128434b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f128435c;

        public d(@k String str, @k String str2, @k String str3) {
            this.f128433a = str;
            this.f128434b = str2;
            this.f128435c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f128433a, dVar.f128433a) && L.f(this.f128434b, dVar.f128434b) && L.f(this.f128435c, dVar.f128435c);
        }

        public final int hashCode() {
            return this.f128435c.hashCode() + H.d(this.f128433a.hashCode() * 31, 31, this.f128434b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubLoadingError(title=");
            sb2.append(this.f128433a);
            sb2.append(", description=");
            sb2.append(this.f128434b);
            sb2.append(", refreshButtonTitle=");
            return C22026a.c(sb2, this.f128435c, ')');
        }
    }

    /* compiled from: RegionSheetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$e;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f128436a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f128437b;

        /* renamed from: c, reason: collision with root package name */
        public final int f128438c;

        public e(@k String str, @k String str2, int i12) {
            this.f128436a = str;
            this.f128437b = str2;
            this.f128438c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f128436a, eVar.f128436a) && L.f(this.f128437b, eVar.f128437b) && this.f128438c == eVar.f128438c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f128438c) + H.d(this.f128436a.hashCode() * 31, 31, this.f128437b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationData(subLocationsError=");
            sb2.append(this.f128436a);
            sb2.append(", globalError=");
            sb2.append(this.f128437b);
            sb2.append(", maxCount=");
            return r.t(sb2, this.f128438c, ')');
        }
    }

    public RegionSheetState(@k SearchState searchState, @l c cVar, @k Map<Long, Location> map, @k a aVar, @k d dVar, @l e eVar) {
        this.f128391b = searchState;
        this.f128392c = cVar;
        this.f128393d = map;
        this.f128394e = aVar;
        this.f128395f = dVar;
        this.f128396g = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RegionSheetState a(RegionSheetState regionSheetState, SearchState searchState, c cVar, LinkedHashMap linkedHashMap, int i12) {
        if ((i12 & 1) != 0) {
            searchState = regionSheetState.f128391b;
        }
        SearchState searchState2 = searchState;
        if ((i12 & 2) != 0) {
            cVar = regionSheetState.f128392c;
        }
        c cVar2 = cVar;
        Map map = linkedHashMap;
        if ((i12 & 4) != 0) {
            map = regionSheetState.f128393d;
        }
        a aVar = regionSheetState.f128394e;
        d dVar = regionSheetState.f128395f;
        e eVar = regionSheetState.f128396g;
        regionSheetState.getClass();
        return new RegionSheetState(searchState2, cVar2, map, aVar, dVar, eVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionSheetState)) {
            return false;
        }
        RegionSheetState regionSheetState = (RegionSheetState) obj;
        return L.f(this.f128391b, regionSheetState.f128391b) && L.f(this.f128392c, regionSheetState.f128392c) && L.f(this.f128393d, regionSheetState.f128393d) && L.f(this.f128394e, regionSheetState.f128394e) && L.f(this.f128395f, regionSheetState.f128395f) && L.f(this.f128396g, regionSheetState.f128396g);
    }

    public final int hashCode() {
        int iHashCode = this.f128391b.hashCode() * 31;
        c cVar = this.f128392c;
        int iHashCode2 = (this.f128395f.hashCode() + ((this.f128394e.hashCode() + AK.c.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f128393d)) * 31)) * 31;
        e eVar = this.f128396g;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RegionSheetState(searchState=" + this.f128391b + ", rootRegion=" + this.f128392c + ", mainLocations=" + this.f128393d + ", bottomBarState=" + this.f128394e + ", subLoadingError=" + this.f128395f + ", validationData=" + this.f128396g + ')';
    }

    /* compiled from: RegionSheetState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$Location;", "", "CheckboxState", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Location {

        /* renamed from: a, reason: collision with root package name */
        public final long f128397a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f128398b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final CheckboxState f128399c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Boolean f128400d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Map<Long, Location> f128401e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<Long> f128402f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f128403g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f128404h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RegionSheetState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$Location$CheckboxState;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CheckboxState {

            /* renamed from: b, reason: collision with root package name */
            public static final CheckboxState f128405b;

            /* renamed from: c, reason: collision with root package name */
            public static final CheckboxState f128406c;

            /* renamed from: d, reason: collision with root package name */
            public static final CheckboxState f128407d;

            /* renamed from: e, reason: collision with root package name */
            public static final CheckboxState f128408e;

            /* renamed from: f, reason: collision with root package name */
            public static final CheckboxState f128409f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ CheckboxState[] f128410g;

            /* renamed from: h, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f128411h;

            static {
                CheckboxState checkboxState = new CheckboxState("HOME", 0);
                f128405b = checkboxState;
                CheckboxState checkboxState2 = new CheckboxState("SELECTED", 1);
                f128406c = checkboxState2;
                CheckboxState checkboxState3 = new CheckboxState("PARTIALLY_SELECTED", 2);
                f128407d = checkboxState3;
                CheckboxState checkboxState4 = new CheckboxState("NOT_SELECTED", 3);
                f128408e = checkboxState4;
                CheckboxState checkboxState5 = new CheckboxState("LOADING", 4);
                f128409f = checkboxState5;
                CheckboxState[] checkboxStateArr = {checkboxState, checkboxState2, checkboxState3, checkboxState4, checkboxState5};
                f128410g = checkboxStateArr;
                f128411h = kotlin.enums.c.a(checkboxStateArr);
            }

            public CheckboxState() {
                throw null;
            }

            public static CheckboxState valueOf(String str) {
                return (CheckboxState) Enum.valueOf(CheckboxState.class, str);
            }

            public static CheckboxState[] values() {
                return (CheckboxState[]) f128410g.clone();
            }
        }

        public Location(long j12, @k String str, @k CheckboxState checkboxState, @l Boolean bool, @k Map<Long, Location> map, @k List<Long> list, boolean z12, boolean z13) {
            this.f128397a = j12;
            this.f128398b = str;
            this.f128399c = checkboxState;
            this.f128400d = bool;
            this.f128401e = map;
            this.f128402f = list;
            this.f128403g = z12;
            this.f128404h = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Location a(Location location, CheckboxState checkboxState, Boolean bool, HashMap map, boolean z12, boolean z13, int i12) {
            return new Location(location.f128397a, location.f128398b, (i12 & 4) != 0 ? location.f128399c : checkboxState, (i12 & 8) != 0 ? location.f128400d : bool, (i12 & 16) != 0 ? location.f128401e : map, location.f128402f, (i12 & 64) != 0 ? location.f128403g : z12, (i12 & 128) != 0 ? location.f128404h : z13);
        }

        public final boolean b() {
            return C42745f0.U(CheckboxState.f128406c, CheckboxState.f128405b).contains(this.f128399c);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return this.f128397a == location.f128397a && L.f(this.f128398b, location.f128398b) && this.f128399c == location.f128399c && L.f(this.f128400d, location.f128400d) && L.f(this.f128401e, location.f128401e) && L.f(this.f128402f, location.f128402f) && this.f128403g == location.f128403g && this.f128404h == location.f128404h;
        }

        public final int hashCode() {
            int iHashCode = (this.f128399c.hashCode() + H.d(Long.hashCode(this.f128397a) * 31, 31, this.f128398b)) * 31;
            Boolean bool = this.f128400d;
            return Boolean.hashCode(this.f128404h) + r.i(H.e(AK.c.c((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f128401e), 31, this.f128402f), 31, this.f128403g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Location(locationId=");
            sb2.append(this.f128397a);
            sb2.append(", title=");
            sb2.append(this.f128398b);
            sb2.append(", checkboxState=");
            sb2.append(this.f128399c);
            sb2.append(", isExpanded=");
            sb2.append(this.f128400d);
            sb2.append(", children=");
            sb2.append(this.f128401e);
            sb2.append(", pickedLocationsIds=");
            sb2.append(this.f128402f);
            sb2.append(", subLoading=");
            sb2.append(this.f128403g);
            sb2.append(", subError=");
            return r.x(sb2, this.f128404h, ')');
        }

        public /* synthetic */ Location(long j12, String str, CheckboxState checkboxState, Boolean bool, Map map, List list, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(j12, str, checkboxState, bool, map, list, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? false : z13);
        }
    }
}
