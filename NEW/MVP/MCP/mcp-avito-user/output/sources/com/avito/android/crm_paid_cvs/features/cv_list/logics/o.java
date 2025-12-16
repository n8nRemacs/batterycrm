package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import androidx.compose.runtime.C22026a;
import com.avito.android.arch.mvi.u;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListInternalAction;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import ct.C39410a;
import ht.C40982d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CvListReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/logics/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements u<CvListInternalAction, CvListState> {

    /* compiled from: CvListReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CvListInternalAction.LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CvListInternalAction.LoadType loadType = CvListInternalAction.LoadType.f130466b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CvListInternalAction.LoadType loadType2 = CvListInternalAction.LoadType.f130466b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CvListInternalAction.LoadType loadType3 = CvListInternalAction.LoadType.f130466b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final CvListState a(CvListInternalAction cvListInternalAction, CvListState cvListState) {
        CvListState cvListStateA;
        CvItem cvItem;
        CvItem cvItem2;
        CvListInternalAction cvListInternalAction2 = cvListInternalAction;
        CvListState cvListState2 = cvListState;
        boolean z12 = cvListInternalAction2 instanceof CvListInternalAction.ShowLoading;
        List<CvItem> list = cvListState2.f130496d;
        if (z12) {
            int iOrdinal = ((CvListInternalAction.ShowLoading) cvListInternalAction2).f130482d.ordinal();
            if (iOrdinal == 0) {
                return CvListState.a(cvListState2, null, CvListState.ListState.f130504c, null, null, null, null, null, null, null, 509);
            }
            if (iOrdinal == 1) {
                return CvListState.a(cvListState2, null, CvListState.ListState.f130505d, null, null, null, null, null, null, null, 509);
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return cvListState2;
                }
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.isEmpty() && (((CvItem) C42745f0.Q(arrayList)).f130346v || ((CvItem) C42745f0.Q(arrayList)).f130344t)) {
                C22026a.e(1, arrayList);
            }
            arrayList.add(C39410a.a(true));
            G0 g02 = G0.f406611a;
            return CvListState.a(cvListState2, null, null, arrayList, null, null, null, null, null, null, 507);
        }
        boolean z13 = cvListInternalAction2 instanceof CvListInternalAction.ShowContent;
        boolean z14 = false;
        int i12 = 0;
        List<FilterItem> list2 = cvListState2.f130499g;
        List<FilterItem> list3 = cvListState2.f130498f;
        CvListState.Tab tab = cvListState2.f130494b;
        if (z13) {
            CvListInternalAction.ShowContent showContent = (CvListInternalAction.ShowContent) cvListInternalAction2;
            int iOrdinal2 = showContent.f130474b.ordinal();
            if (iOrdinal2 == 0) {
                CvListState.ListState listState = CvListState.ListState.f130503b;
                CvListState.Tab tab2 = CvListState.Tab.f130509c;
                List<FilterItem> list4 = showContent.f130477e;
                cvListStateA = p.a(CvListState.a(cvListState2, null, listState, showContent.f130475c, showContent.f130476d, tab == tab2 ? list4 : list3, tab == CvListState.Tab.f130510d ? list4 : list2, showContent.f130478f, null, null, 385));
            } else if (iOrdinal2 != 1) {
                List<CvItem> list5 = showContent.f130475c;
                if (iOrdinal2 == 2) {
                    ArrayList arrayList2 = new ArrayList(list);
                    if (!arrayList2.isEmpty() && ((CvItem) C42745f0.Q(arrayList2)).f130344t) {
                        C22026a.e(1, arrayList2);
                    }
                    C42745f0.h(list5, arrayList2);
                    Long l12 = showContent.f130478f;
                    if (l12 != null) {
                        arrayList2.add(C39410a.a(false));
                    }
                    cvListStateA = CvListState.a(cvListState2, null, null, arrayList2, null, null, null, l12, null, null, 443);
                } else {
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CvItem cvItem3 = (CvItem) C42745f0.E(list5);
                    ArrayList arrayList3 = new ArrayList(list);
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        if (L.f(((CvItem) it.next()).f130326b, cvItem3.f130326b)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 != -1) {
                        arrayList3.set(i12, cvItem3);
                    }
                    cvListStateA = CvListState.a(cvListState2, null, null, arrayList3, null, null, null, null, null, null, 123);
                }
            } else {
                cvListStateA = p.a(CvListState.a(cvListState2, null, CvListState.ListState.f130503b, showContent.f130475c, showContent.f130476d, null, null, showContent.f130478f, null, null, 433));
            }
        } else if (cvListInternalAction2 instanceof CvListInternalAction.ShowError) {
            int iOrdinal3 = ((CvListInternalAction.ShowError) cvListInternalAction2).f130479b.ordinal();
            if (iOrdinal3 == 0) {
                cvListStateA = CvListState.a(cvListState2, null, CvListState.ListState.f130506e, null, null, null, null, null, null, null, 509);
            } else if (iOrdinal3 == 1) {
                cvListStateA = CvListState.a(cvListState2, null, CvListState.ListState.f130503b, null, null, null, null, null, null, null, 509);
            } else if (iOrdinal3 == 2) {
                ArrayList arrayList4 = new ArrayList(list);
                if (!arrayList4.isEmpty() && ((CvItem) C42745f0.Q(arrayList4)).f130344t) {
                    C22026a.e(1, arrayList4);
                }
                arrayList4.add(new CvItem("EMPTY_ID", null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, true, 1048574, null));
                G0 g03 = G0.f406611a;
                cvListStateA = CvListState.a(cvListState2, null, null, arrayList4, null, null, null, null, null, null, 507);
            } else {
                if (iOrdinal3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cvListStateA = CvListState.a(cvListState2, null, null, null, null, null, null, null, null, null, 127);
            }
        } else {
            if (cvListInternalAction2 instanceof CvListInternalAction.ChangeTab) {
                return CvListState.a(cvListState2, ((CvListInternalAction.ChangeTab) cvListInternalAction2).f130460b, CvListState.ListState.f130504c, C42784z0.f406748b, null, null, null, null, null, null, 56);
            }
            int i13 = 10;
            if (cvListInternalAction2 instanceof CvListInternalAction.ApplyFilter) {
                CvListInternalAction.ApplyFilter applyFilter = (CvListInternalAction.ApplyFilter) cvListInternalAction2;
                Set setP0 = C42745f0.P0(applyFilter.f130459c);
                int iOrdinal4 = tab.ordinal();
                if (iOrdinal4 == 0) {
                    list2 = list3;
                } else if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list2 = C42784z0.f406748b;
                }
                List<FilterItem> list6 = list2;
                ArrayList arrayList5 = new ArrayList(C42745f0.q(list6, 10));
                for (FilterItem filterItem : list6) {
                    boolean zF2 = L.f(filterItem.f130357b, applyFilter.f130458b);
                    List<OptionItem> list7 = filterItem.f130360e;
                    if (zF2) {
                        List<OptionItem> list8 = list7;
                        ArrayList arrayList6 = new ArrayList(C42745f0.q(list8, 10));
                        for (OptionItem optionItem : list8) {
                            arrayList6.add(OptionItem.a(optionItem, setP0.contains(optionItem), null, 61));
                        }
                        list7 = arrayList6;
                    }
                    arrayList5.add(FilterItem.a(filterItem, list7));
                }
                int iOrdinal5 = tab.ordinal();
                if (iOrdinal5 == 0) {
                    cvListStateA = CvListState.a(cvListState2, null, null, null, null, arrayList5, null, null, null, null, 495);
                } else if (iOrdinal5 == 1) {
                    cvListStateA = CvListState.a(cvListState2, null, null, null, null, null, arrayList5, null, null, null, 479);
                } else {
                    if (iOrdinal5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cvListStateA = CvListState.a(cvListState2, null, null, null, null, null, null, null, null, null, 511);
                }
            } else if (cvListInternalAction2 instanceof CvListInternalAction.ApplyAllFilters) {
                ArrayList<FilterItem> arrayList7 = ((CvListInternalAction.ApplyAllFilters) cvListInternalAction2).f130457b;
                ArrayList arrayList8 = new ArrayList(C42745f0.q(arrayList7, 10));
                for (FilterItem filterItemA : arrayList7) {
                    if (filterItemA.f130358c == FilterItem.FilterType.f130367h) {
                        List<OptionItem> list9 = filterItemA.f130360e;
                        ArrayList arrayList9 = new ArrayList(C42745f0.q(list9, i13));
                        for (OptionItem optionItem2 : list9) {
                            if (!arrayList7.isEmpty()) {
                                Iterator it2 = arrayList7.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z14 = false;
                                        break;
                                    }
                                    FilterItem filterItem2 = (FilterItem) it2.next();
                                    if (!C40982d.f397441a.contains(filterItem2.f130357b)) {
                                        if (filterItem2.f130358c == FilterItem.FilterType.f130367h) {
                                            continue;
                                        } else {
                                            List<OptionItem> list10 = filterItem2.f130360e;
                                            if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                                                Iterator<T> it3 = list10.iterator();
                                                while (it3.hasNext()) {
                                                    if (((OptionItem) it3.next()).f130371c) {
                                                        z14 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList9.add(OptionItem.a(optionItem2, z14, null, 61));
                            z14 = false;
                        }
                        filterItemA = FilterItem.a(filterItemA, arrayList9);
                    }
                    arrayList8.add(filterItemA);
                    z14 = false;
                    i13 = 10;
                }
                int iOrdinal6 = tab.ordinal();
                if (iOrdinal6 == 0) {
                    cvListStateA = CvListState.a(cvListState2, null, null, null, null, arrayList8, null, null, null, null, 495);
                } else if (iOrdinal6 == 1) {
                    cvListStateA = CvListState.a(cvListState2, null, null, null, null, null, arrayList8, null, null, null, 479);
                } else {
                    if (iOrdinal6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cvListStateA = CvListState.a(cvListState2, null, null, null, null, null, null, null, null, null, 511);
                }
            } else {
                if (cvListInternalAction2 instanceof CvListInternalAction.ShowStatus) {
                    return CvListState.a(cvListState2, null, null, null, null, null, null, null, ((CvListInternalAction.ShowStatus) cvListInternalAction2).f130486c, null, 383);
                }
                if (cvListInternalAction2 instanceof CvListInternalAction.CloseStatus) {
                    return CvListState.a(cvListState2, null, null, null, null, null, null, null, null, ((CvListInternalAction.CloseStatus) cvListInternalAction2).f130463d, 255);
                }
                if (cvListInternalAction2 instanceof CvListInternalAction.ToggleFavorites) {
                    CvListInternalAction.ToggleFavorites toggleFavorites = (CvListInternalAction.ToggleFavorites) cvListInternalAction2;
                    ArrayList arrayList10 = new ArrayList(list);
                    Iterator it4 = arrayList10.iterator();
                    int i14 = 0;
                    while (true) {
                        boolean zHasNext = it4.hasNext();
                        cvItem2 = toggleFavorites.f130493b;
                        if (!zHasNext) {
                            i14 = -1;
                            break;
                        }
                        if (L.f(((CvItem) it4.next()).f130326b, cvItem2.f130326b)) {
                            break;
                        }
                        i14++;
                    }
                    if (i14 != -1) {
                        arrayList10.set(i14, CvItem.a(cvItem2, true ^ cvItem2.f130341q, false, 2064383));
                    }
                    G0 g04 = G0.f406611a;
                    return CvListState.a(cvListState2, null, null, arrayList10, null, null, null, null, null, null, 507);
                }
                if (cvListInternalAction2 instanceof CvListInternalAction.ToggleComparison) {
                    CvListInternalAction.ToggleComparison toggleComparison = (CvListInternalAction.ToggleComparison) cvListInternalAction2;
                    if (toggleComparison.f130490c || toggleComparison.f130491d) {
                        return cvListState2;
                    }
                    ArrayList arrayList11 = new ArrayList(list);
                    Iterator it5 = arrayList11.iterator();
                    int i15 = 0;
                    while (true) {
                        boolean zHasNext2 = it5.hasNext();
                        cvItem = toggleComparison.f130489b;
                        if (!zHasNext2) {
                            i15 = -1;
                            break;
                        }
                        if (L.f(((CvItem) it5.next()).f130326b, cvItem.f130326b)) {
                            break;
                        }
                        i15++;
                    }
                    if (i15 != -1) {
                        arrayList11.set(i15, CvItem.a(cvItem, false, true ^ cvItem.f130342r, 2031615));
                    }
                    G0 g05 = G0.f406611a;
                    return CvListState.a(cvListState2, null, null, arrayList11, null, null, null, null, null, null, 507);
                }
                if (!(cvListInternalAction2 instanceof CvListInternalAction.DropFilters)) {
                    return cvListState2;
                }
                int iOrdinal7 = tab.ordinal();
                if (iOrdinal7 == 0) {
                    list2 = list3;
                } else if (iOrdinal7 != 1) {
                    if (iOrdinal7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list2 = C42784z0.f406748b;
                }
                List<FilterItem> list11 = list2;
                ArrayList arrayList12 = new ArrayList(C42745f0.q(list11, 10));
                for (FilterItem filterItem3 : list11) {
                    List<OptionItem> list12 = filterItem3.f130360e;
                    ArrayList arrayList13 = new ArrayList(C42745f0.q(list12, 10));
                    Iterator<T> it6 = list12.iterator();
                    while (it6.hasNext()) {
                        arrayList13.add(OptionItem.a((OptionItem) it6.next(), false, null, 61));
                    }
                    arrayList12.add(FilterItem.a(filterItem3, arrayList13));
                }
                int iOrdinal8 = tab.ordinal();
                if (iOrdinal8 == 0) {
                    cvListStateA = CvListState.a(cvListState2, null, null, null, null, arrayList12, null, null, null, null, 495);
                } else if (iOrdinal8 == 1) {
                    cvListStateA = CvListState.a(cvListState2, null, null, null, null, null, arrayList12, null, null, null, 479);
                } else {
                    if (iOrdinal8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cvListStateA = CvListState.a(cvListState2, null, null, null, null, null, null, null, null, null, 511);
                }
            }
        }
        return cvListStateA;
    }
}
