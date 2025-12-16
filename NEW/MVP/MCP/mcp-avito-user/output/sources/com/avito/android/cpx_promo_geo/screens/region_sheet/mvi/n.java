package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.cpx_promo_geo.screens.region_sheet.RegionSheetData;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import us.C49106a;

/* compiled from: RegionSheetReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements u<RegionSheetInternalAction, RegionSheetState> {

    /* compiled from: RegionSheetReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128457a;

        static {
            int[] iArr = new int[RegionSheetData.Location.CheckboxState.values().length];
            try {
                iArr[RegionSheetData.Location.CheckboxState.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RegionSheetData.Location.CheckboxState.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RegionSheetData.Location.CheckboxState.PARTIAL_SELECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RegionSheetData.Location.CheckboxState.NOT_SELECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f128457a = iArr;
        }
    }

    @Inject
    public n() {
    }

    public static RegionSheetState.Location b(RegionSheetData.Location location, boolean z12) {
        RegionSheetState.Location.CheckboxState checkboxState;
        Map mapG;
        long locationId = location.getLocationId();
        String title = location.getTitle();
        int i12 = a.f128457a[location.getCheckboxState().ordinal()];
        if (i12 == 1) {
            checkboxState = RegionSheetState.Location.CheckboxState.f128405b;
        } else if (i12 == 2) {
            checkboxState = RegionSheetState.Location.CheckboxState.f128406c;
        } else if (i12 == 3) {
            checkboxState = RegionSheetState.Location.CheckboxState.f128407d;
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            checkboxState = RegionSheetState.Location.CheckboxState.f128408e;
        }
        RegionSheetState.Location.CheckboxState checkboxState2 = checkboxState;
        Boolean bool = (z12 || !location.getHaveChildren()) ? null : Boolean.FALSE;
        if (z12) {
            mapG = P0.c();
        } else {
            List<RegionSheetData.Location> listD = location.d();
            ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
            for (RegionSheetData.Location location2 : listD) {
                arrayList.add(new Q(Long.valueOf(location2.getLocationId()), b(location2, true)));
            }
            Q[] qArr = (Q[]) arrayList.toArray(new Q[0]);
            mapG = P0.g((Q[]) Arrays.copyOf(qArr, qArr.length));
        }
        return new RegionSheetState.Location(locationId, title, checkboxState2, bool, mapG, location.g(), false, false, 192, null);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.u
    public final RegionSheetState a(RegionSheetInternalAction regionSheetInternalAction, RegionSheetState regionSheetState) {
        RegionSheetState.c cVarA;
        RegionSheetInternalAction regionSheetInternalAction2 = regionSheetInternalAction;
        RegionSheetState regionSheetState2 = regionSheetState;
        boolean z12 = true;
        if (regionSheetInternalAction2 instanceof RegionSheetInternalAction.Content) {
            RegionSheetData regionSheetData = ((RegionSheetInternalAction.Content) regionSheetInternalAction2).f128369b;
            RegionSheetState.SearchState searchState = new RegionSheetState.SearchState(new RegionSheetState.SearchState.b(regionSheetData.getPlaceholder(), ""), RegionSheetState.SearchState.UiState.f128417c, new RegionSheetState.SearchState.a(new RegionSheetState.SearchState.a.C3812a(wZ.m.a(regionSheetData.getErrors().getSearchNotFound().getImage()), regionSheetData.getErrors().getSearchNotFound().getTitle(), regionSheetData.getErrors().getSearchNotFound().getDescription(), null), new RegionSheetState.SearchState.a.C3812a(wZ.m.a(regionSheetData.getErrors().getSearchError().getImage()), regionSheetData.getErrors().getSearchError().getTitle(), regionSheetData.getErrors().getSearchError().getDescription(), regionSheetData.getErrors().getSearchError().getRefreshButtonTitle())), P0.c());
            String rootLocationTitle = regionSheetData.getRootLocationTitle();
            RegionSheetState.c cVar = rootLocationTitle != null ? new RegionSheetState.c(rootLocationTitle, false) : null;
            List<RegionSheetData.Location> listE = regionSheetData.e();
            ArrayList arrayList = new ArrayList(C42745f0.q(listE, 10));
            for (RegionSheetData.Location location : listE) {
                arrayList.add(new Q(Long.valueOf(location.getLocationId()), b(location, false)));
            }
            Q[] qArr = (Q[]) arrayList.toArray(new Q[0]);
            Map mapG = P0.g((Q[]) Arrays.copyOf(qArr, qArr.length));
            RegionSheetState.a aVar = new RegionSheetState.a(regionSheetData.getButton().getTitle());
            RegionSheetState.d dVar = new RegionSheetState.d(regionSheetData.getErrors().getSubLoad().getTitle(), regionSheetData.getErrors().getSubLoad().getDescription(), regionSheetData.getErrors().getSubLoad().getRefreshButtonTitle());
            RegionSheetData.Errors.MaxRegions maxRegions = regionSheetData.getErrors().getMaxRegions();
            RegionSheetState regionSheetState3 = new RegionSheetState(searchState, cVar, mapG, aVar, dVar, maxRegions != null ? new RegionSheetState.e(maxRegions.getSubLocationsText(), maxRegions.getGlobalText(), maxRegions.getValue()) : null);
            RegionSheetState.c cVar2 = regionSheetState3.f128392c;
            if (cVar2 != null) {
                Collection<RegionSheetState.Location> collectionValues = regionSheetState3.f128393d.values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator<T> it = collectionValues.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!((RegionSheetState.Location) it.next()).b()) {
                            z12 = false;
                            break;
                        }
                    }
                }
                cVarA = RegionSheetState.c.a(cVar2, z12);
            } else {
                cVarA = null;
            }
            return RegionSheetState.a(regionSheetState3, null, cVarA, null, 61);
        }
        boolean z13 = regionSheetInternalAction2 instanceof RegionSheetInternalAction.ExpandLocation;
        Map<Long, RegionSheetState.Location> map = regionSheetState2.f128393d;
        if (z13) {
            long j12 = ((RegionSheetInternalAction.ExpandLocation) regionSheetInternalAction2).f128370b;
            RegionSheetState.Location location2 = map.get(Long.valueOf(j12));
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (location2 != null) {
                Long lValueOf = Long.valueOf(j12);
                Boolean bool = location2.f128400d;
                linkedHashMap.put(lValueOf, RegionSheetState.Location.a(location2, null, bool != null ? Boolean.valueOf(true ^ bool.booleanValue()) : null, null, false, false, 247));
            }
            return RegionSheetState.a(regionSheetState2, null, null, linkedHashMap, 59);
        }
        if (regionSheetInternalAction2 instanceof RegionSheetInternalAction.SubLoading) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
            long j13 = ((RegionSheetInternalAction.SubLoading) regionSheetInternalAction2).f128387b;
            RegionSheetState.Location location3 = (RegionSheetState.Location) linkedHashMap2.get(Long.valueOf(j13));
            if (location3 != null) {
                linkedHashMap2.put(Long.valueOf(j13), RegionSheetState.Location.a(location3, null, null, null, true, false, 63));
            }
            return RegionSheetState.a(regionSheetState2, null, null, linkedHashMap2, 59);
        }
        if (regionSheetInternalAction2 instanceof RegionSheetInternalAction.SubError) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(map);
            long j14 = ((RegionSheetInternalAction.SubError) regionSheetInternalAction2).f128385b;
            RegionSheetState.Location location4 = (RegionSheetState.Location) linkedHashMap3.get(Long.valueOf(j14));
            if (location4 != null) {
                linkedHashMap3.put(Long.valueOf(j14), RegionSheetState.Location.a(location4, null, null, null, false, true, 63));
            }
            return RegionSheetState.a(regionSheetState2, null, null, linkedHashMap3, 59);
        }
        if (regionSheetInternalAction2 instanceof RegionSheetInternalAction.SubContent) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(map);
            HashMap map2 = new HashMap();
            RegionSheetInternalAction.SubContent subContent = (RegionSheetInternalAction.SubContent) regionSheetInternalAction2;
            for (RegionSheetState.Location location5 : subContent.f128384c) {
                map2.put(Long.valueOf(location5.f128397a), location5);
            }
            long j15 = subContent.f128383b;
            RegionSheetState.Location location6 = (RegionSheetState.Location) linkedHashMap4.get(Long.valueOf(j15));
            if (location6 != null) {
                linkedHashMap4.put(Long.valueOf(j15), RegionSheetState.Location.a(location6, C49106a.a(map2, location6.f128399c), null, map2, false, false, 43));
            }
            return RegionSheetState.a(regionSheetState2, null, null, linkedHashMap4, 59);
        }
        boolean z14 = regionSheetInternalAction2 instanceof RegionSheetInternalAction.SearchValueChanged;
        RegionSheetState.SearchState searchState2 = regionSheetState2.f128391b;
        if (z14) {
            return RegionSheetState.a(regionSheetState2, RegionSheetState.SearchState.a(searchState2, new RegionSheetState.SearchState.b(searchState2.f128412a.f128428a, C43066x.t0(50, ((RegionSheetInternalAction.SearchValueChanged) regionSheetInternalAction2).f128381b)), null, null, 14), null, null, 62);
        }
        if (regionSheetInternalAction2.equals(RegionSheetInternalAction.SearchLoading.f128377b)) {
            return RegionSheetState.a(regionSheetState2, RegionSheetState.SearchState.a(searchState2, null, RegionSheetState.SearchState.UiState.f128417c, null, 13), null, null, 62);
        }
        if (regionSheetInternalAction2.equals(RegionSheetInternalAction.SearchError.f128376b)) {
            return RegionSheetState.a(regionSheetState2, RegionSheetState.SearchState.a(searchState2, null, RegionSheetState.SearchState.UiState.f128419e, null, 13), null, null, 62);
        }
        if (regionSheetInternalAction2 instanceof RegionSheetInternalAction.SearchContent) {
            ?? r02 = ((RegionSheetInternalAction.SearchContent) regionSheetInternalAction2).f128375b;
            return RegionSheetState.a(regionSheetState2, RegionSheetState.SearchState.a(searchState2, null, r02.isEmpty() ? RegionSheetState.SearchState.UiState.f128418d : RegionSheetState.SearchState.UiState.f128416b, r02, 5), null, null, 62);
        }
        if (regionSheetInternalAction2 instanceof RegionSheetInternalAction.SearchSubLoading) {
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(searchState2.f128415d);
            RegionSheetInternalAction.SearchSubLoading searchSubLoading = (RegionSheetInternalAction.SearchSubLoading) regionSheetInternalAction2;
            long j16 = searchSubLoading.f128379b;
            RegionSheetState.Location location7 = (RegionSheetState.Location) linkedHashMap5.get(Long.valueOf(j16));
            if (location7 != null) {
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(location7.f128401e);
                long j17 = searchSubLoading.f128380c;
                RegionSheetState.Location location8 = (RegionSheetState.Location) linkedHashMap6.get(Long.valueOf(j17));
                if (location8 != null) {
                    linkedHashMap6.put(Long.valueOf(j17), RegionSheetState.Location.a(location8, RegionSheetState.Location.CheckboxState.f128409f, null, null, false, false, 251));
                }
                linkedHashMap5.put(Long.valueOf(j16), RegionSheetState.Location.a(location7, null, null, linkedHashMap6, false, false, 239));
            }
            return RegionSheetState.a(regionSheetState2, RegionSheetState.SearchState.a(searchState2, null, null, linkedHashMap5, 7), null, null, 62);
        }
        if (!(regionSheetInternalAction2 instanceof RegionSheetInternalAction.ResetSearchItemState)) {
            return regionSheetInternalAction2 instanceof RegionSheetInternalAction.UpdateState ? ((RegionSheetInternalAction.UpdateState) regionSheetInternalAction2).f128388b : regionSheetState2;
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(searchState2.f128415d);
        RegionSheetInternalAction.ResetSearchItemState resetSearchItemState = (RegionSheetInternalAction.ResetSearchItemState) regionSheetInternalAction2;
        long j18 = resetSearchItemState.f128371b;
        RegionSheetState.Location location9 = (RegionSheetState.Location) linkedHashMap7.get(Long.valueOf(j18));
        if (location9 != null) {
            LinkedHashMap linkedHashMap8 = new LinkedHashMap(location9.f128401e);
            long j19 = resetSearchItemState.f128372c;
            RegionSheetState.Location location10 = (RegionSheetState.Location) linkedHashMap8.get(Long.valueOf(j19));
            if (location10 != null) {
                linkedHashMap8.put(Long.valueOf(j19), RegionSheetState.Location.a(location10, resetSearchItemState.f128373d, null, null, false, false, 251));
            }
            linkedHashMap7.put(Long.valueOf(j18), RegionSheetState.Location.a(location9, null, null, linkedHashMap8, false, false, 239));
        }
        return RegionSheetState.a(regionSheetState2, RegionSheetState.SearchState.a(searchState2, null, null, linkedHashMap7, 7), null, null, 62);
    }
}
