package com.avito.android.select.new_districts.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.new_districts.SelectDistrictParams;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictInternalAction;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictState;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictViewState;
import com.avito.android.select.new_districts.mvi.entity.ui.DistrictChip;
import com.avito.android.select.new_districts.mvi.entity.ui.RegionState;
import com.avito.android.select.new_districts.mvi.entity.ui.UiItem;
import com.avito.android.select.new_location_common.ui.CheckBoxExpandableLineState;
import fq0.C40466a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: FilterSelectDistrictReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictState;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements u<SelectDistrictInternalAction, SelectDistrictState> {

    /* compiled from: FilterSelectDistrictReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CheckBoxExpandableLineState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckBoxExpandableLineState checkBoxExpandableLineState = CheckBoxExpandableLineState.f265893b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckBoxExpandableLineState checkBoxExpandableLineState2 = CheckBoxExpandableLineState.f265893b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public k() {
    }

    public static SelectDistrictState b(SelectDistrictState selectDistrictState) {
        return SelectDistrictState.a(selectDistrictState, null, SelectDistrictViewState.a(selectDistrictState.f265819c, selectDistrictState.f265818b, null, selectDistrictState.f265820d, selectDistrictState.f265821e, selectDistrictState.f265822f, selectDistrictState.f265823g, selectDistrictState.f265824h, 2), null, null, null, null, false, 125);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final SelectDistrictState a(SelectDistrictInternalAction selectDistrictInternalAction, SelectDistrictState selectDistrictState) {
        CheckBoxExpandableLineState checkBoxExpandableLineState;
        Object next;
        String f282831b;
        SelectDistrictInternalAction selectDistrictInternalAction2 = selectDistrictInternalAction;
        SelectDistrictState selectDistrictState2 = selectDistrictState;
        if (!(selectDistrictInternalAction2 instanceof SelectDistrictInternalAction.InitScreen)) {
            boolean z12 = selectDistrictInternalAction2 instanceof SelectDistrictInternalAction.DistrictSelectionChange;
            List<Boolean> list = selectDistrictState2.f265820d;
            List<RegionState> list2 = selectDistrictState2.f265821e;
            if (z12) {
                ArrayList arrayList = new ArrayList(list2);
                ArrayList arrayList2 = new ArrayList(list);
                SelectDistrictInternalAction.DistrictSelectionChange districtSelectionChange = (SelectDistrictInternalAction.DistrictSelectionChange) selectDistrictInternalAction2;
                boolean z13 = districtSelectionChange.f265808c;
                arrayList2.set(districtSelectionChange.f265807b, Boolean.valueOf(z13));
                int i12 = districtSelectionChange.f265809d;
                RegionState regionState = list2.get(i12);
                int i13 = regionState.f265838e;
                int i14 = z13 ? i13 + 1 : i13 - 1;
                arrayList.set(i12, RegionState.a(regionState, false, i14 == 0 ? CheckBoxExpandableLineState.f265893b : i14 == regionState.f265835b.size() ? CheckBoxExpandableLineState.f265895d : CheckBoxExpandableLineState.f265894c, i14, 3));
                return b(SelectDistrictState.a(selectDistrictState2, null, null, arrayList2, arrayList, null, null, false, 115));
            }
            if (selectDistrictInternalAction2 instanceof SelectDistrictInternalAction.RegionExpandChange) {
                ArrayList arrayList3 = new ArrayList(list2);
                int i15 = ((SelectDistrictInternalAction.RegionExpandChange) selectDistrictInternalAction2).f265812b;
                arrayList3.set(i15, RegionState.a(list2.get(i15), !r2.f265836c, null, 0, 13));
                return b(SelectDistrictState.a(selectDistrictState2, null, null, null, arrayList3, null, null, false, 119));
            }
            if (selectDistrictInternalAction2 instanceof SelectDistrictInternalAction.RegionSelectionChange) {
                SelectDistrictInternalAction.RegionSelectionChange regionSelectionChange = (SelectDistrictInternalAction.RegionSelectionChange) selectDistrictInternalAction2;
                RegionState regionState2 = list2.get(regionSelectionChange.f265813b);
                List<Integer> list3 = regionState2.f265835b;
                ArrayList arrayList4 = new ArrayList(list);
                ArrayList arrayList5 = new ArrayList(list2);
                int iOrdinal = regionSelectionChange.f265815d.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    checkBoxExpandableLineState = CheckBoxExpandableLineState.f265895d;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    checkBoxExpandableLineState = CheckBoxExpandableLineState.f265893b;
                }
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList4.set(((Number) it.next()).intValue(), Boolean.valueOf(checkBoxExpandableLineState == CheckBoxExpandableLineState.f265895d));
                }
                arrayList5.set(regionSelectionChange.f265814c, RegionState.a(regionState2, false, checkBoxExpandableLineState, checkBoxExpandableLineState == CheckBoxExpandableLineState.f265895d ? list3.size() : 0, 3));
                return b(SelectDistrictState.a(selectDistrictState2, null, null, arrayList4, arrayList5, null, null, false, 115));
            }
            if (!selectDistrictInternalAction2.equals(SelectDistrictInternalAction.ClearSelection.f265805b)) {
                if (!(selectDistrictInternalAction2 instanceof SelectDistrictInternalAction.SearchUpdate)) {
                    return selectDistrictState2;
                }
                List<UiItem> list4 = selectDistrictState2.f265819c.f265825b;
                ArrayList arrayList6 = new ArrayList(C42745f0.q(list4, 10));
                for (UiItem uiItem : list4) {
                    arrayList6.add(Boolean.valueOf((uiItem instanceof UiItem.DistrictItem) && C43066x.q(((UiItem.DistrictItem) uiItem).f265842e, ((SelectDistrictInternalAction.SearchUpdate) selectDistrictInternalAction2).f265816b, true)));
                }
                String str = ((SelectDistrictInternalAction.SearchUpdate) selectDistrictInternalAction2).f265816b;
                return b(SelectDistrictState.a(selectDistrictState2, null, null, null, null, arrayList6, str, str.length() > 0, 15));
            }
            List<RegionState> list5 = list2;
            ArrayList arrayList7 = new ArrayList(C42745f0.q(list5, 10));
            Iterator<T> it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList7.add(RegionState.a((RegionState) it2.next(), false, CheckBoxExpandableLineState.f265893b, 0, 3));
            }
            List listM0 = C42745f0.M0(arrayList7);
            List<Boolean> list6 = list;
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list6, 10));
            Iterator<T> it3 = list6.iterator();
            while (it3.hasNext()) {
                ((Boolean) it3.next()).getClass();
                arrayList8.add(Boolean.FALSE);
            }
            return b(SelectDistrictState.a(selectDistrictState2, null, null, arrayList8, listM0, null, "", false, 19));
        }
        SelectDistrictParams selectDistrictParams = ((SelectDistrictInternalAction.InitScreen) selectDistrictInternalAction2).f265811b;
        DistrictsWithRegions districtsWithRegions = selectDistrictParams.f265688c;
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        List<ParcelableEntity<String>> list7 = selectDistrictParams.f265689d;
        ArrayList arrayList12 = new ArrayList();
        Iterator<T> it4 = list7.iterator();
        while (it4.hasNext()) {
            Long lZ02 = C43066x.z0((String) ((ParcelableEntity) it4.next()).getId());
            if (lZ02 != null) {
                arrayList12.add(lZ02);
            }
        }
        ArrayList arrayList13 = new ArrayList();
        List<DistrictsWithRegions.DistrictRegion> regions = districtsWithRegions.getRegions();
        if (regions != null) {
            int i16 = 0;
            int i17 = 0;
            for (Object obj : regions) {
                int i18 = i16 + 1;
                if (i16 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                DistrictsWithRegions.DistrictRegion districtRegion = (DistrictsWithRegions.DistrictRegion) obj;
                int i19 = i16;
                arrayList9.add(new UiItem.RegionItem(districtRegion.getFullName(), i17, districtRegion.getId(), districtRegion.getShortName(), i19));
                arrayList13.add(Boolean.FALSE);
                int i22 = i17 + 1;
                ArrayList arrayList14 = new ArrayList();
                int i23 = 0;
                int i24 = 0;
                for (Object obj2 : districtRegion.getDistrictIds()) {
                    int i25 = i23 + 1;
                    if (i23 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    long jLongValue = ((Number) obj2).longValue();
                    arrayList14.add(Integer.valueOf(i22));
                    Iterator<T> it5 = districtsWithRegions.getDistricts().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it5.next();
                        Long longId = ((District) next).getLongId();
                        if (longId != null && longId.longValue() == jLongValue) {
                            break;
                        }
                    }
                    District district = (District) next;
                    if (district == null || (f282831b = district.getF282831b()) == null) {
                        f282831b = "";
                    }
                    String str2 = f282831b;
                    boolean zR2 = C42745f0.r(arrayList12, district != null ? district.getLongId() : null);
                    if (zR2) {
                        i24++;
                    }
                    int i26 = i22;
                    arrayList9.add(new UiItem.DistrictItem(i22, jLongValue, str2, i19, district));
                    arrayList11.add(new DistrictChip(str2, i26, i19));
                    arrayList13.add(Boolean.valueOf(zR2));
                    i22 = i26 + 1;
                    i23 = i25;
                    i24 = i24;
                }
                int i27 = i22;
                arrayList10.add(new RegionState(arrayList14, false, i24 == 0 ? CheckBoxExpandableLineState.f265893b : i24 == arrayList14.size() ? CheckBoxExpandableLineState.f265895d : CheckBoxExpandableLineState.f265894c, i24, 2, null));
                i17 = i27;
                i16 = i18;
            }
        }
        C40466a c40466a = new C40466a(arrayList9, arrayList10, arrayList11, arrayList13);
        int size = arrayList9.size();
        ArrayList arrayList15 = new ArrayList(size);
        for (int i28 = 0; i28 < size; i28++) {
            arrayList15.add(Boolean.FALSE);
        }
        SelectDistrictState selectDistrictStateA = SelectDistrictState.a(selectDistrictState2, arrayList9, null, arrayList13, arrayList10, arrayList15, "", false, 66);
        return b(SelectDistrictState.a(selectDistrictStateA, null, SelectDistrictViewState.a(selectDistrictStateA.f265819c, null, c40466a.f396162c, null, null, null, null, false, 125), null, null, null, null, false, 125));
    }
}
