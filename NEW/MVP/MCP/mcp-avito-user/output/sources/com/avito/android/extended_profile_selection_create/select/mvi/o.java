package com.avito.android.extended_profile_selection_create.select.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.select.adapter.advert.SelectionAdvertItem;
import com.avito.android.extended_profile_selection_create.select.adapter.search_button.SearchButtonItem;
import com.avito.android.extended_profile_selection_create.select.adapter.search_correction.SearchCorrectionItem;
import com.avito.android.extended_profile_selection_create.select.adapter.search_empty.SearchEmptyItem;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateInternalAction;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.SearchParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileSelectionCreateReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateState;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements u<ExtendedProfileSelectionCreateInternalAction, ExtendedProfileSelectionCreateState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSelectionCreateConfig f152403b;

    @Inject
    public o(@Y61.k ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig) {
        this.f152403b = extendedProfileSelectionCreateConfig;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ExtendedProfileSelectionCreateState a(ExtendedProfileSelectionCreateInternalAction extendedProfileSelectionCreateInternalAction, ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState) {
        ExtendedProfileSelectionCreateState extendedProfileSelectionCreateStateA;
        ExtendedProfileSelectionCreateInternalAction extendedProfileSelectionCreateInternalAction2 = extendedProfileSelectionCreateInternalAction;
        ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState2 = extendedProfileSelectionCreateState;
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoading) {
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, true, 0, null, null, null, null, null, false, null, null, false, null, false, false, null, false, 16776959);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoaded) {
            List<Long> list = ((ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoaded) extendedProfileSelectionCreateInternalAction2).f152335b;
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, C42745f0.P0(list), C42745f0.P0(list), false, null, null, false, null, false, false, null, false, 16752639);
        }
        boolean z12 = extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.AdvertsLoading;
        List<SelectionAdvertItem> list2 = extendedProfileSelectionCreateState2.f152357r;
        if (z12) {
            ExtendedProfileSelectionCreateInternalAction.AdvertsLoading advertsLoading = (ExtendedProfileSelectionCreateInternalAction.AdvertsLoading) extendedProfileSelectionCreateInternalAction2;
            boolean z13 = advertsLoading.f152315b;
            return b(ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, advertsLoading.f152316c, 0, 0, null, true, false, z13, 0, null, null, null, null, null, false, z13 ? C42784z0.f406748b : list2, null, false, null, false, false, null, false, 12222139));
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.AdvertsLoaded) {
            ExtendedProfileSelectionCreateInternalAction.AdvertsLoaded advertsLoaded = (ExtendedProfileSelectionCreateInternalAction.AdvertsLoaded) extendedProfileSelectionCreateInternalAction2;
            SearchCorrectionItem searchCorrectionItem = advertsLoaded.f152308d ? advertsLoaded.f152309e : extendedProfileSelectionCreateState2.f152351l;
            ArrayList arrayList = advertsLoaded.f152306b;
            ArrayList arrayListH0 = C42745f0.h0(arrayList, list2);
            boolean z14 = !arrayList.isEmpty() && arrayListH0.size() < advertsLoaded.f152311g;
            String str = advertsLoaded.f152310f;
            if (str == null) {
                str = "";
            }
            return b(ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, str, advertsLoaded.f152314j, advertsLoaded.f152311g, advertsLoaded.f152312h, advertsLoaded.f152313i, false, false, false, advertsLoaded.f152307c, searchCorrectionItem, null, null, null, null, false, arrayListH0, null, z14, null, false, false, null, false, 16447490));
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoadedError) {
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, null, false, null, null, false, null, false, false, new ExtendedProfileSelectionCreateState.a(((ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoadedError) extendedProfileSelectionCreateInternalAction2).f152336b, ExtendedProfileSelectionCreateState.ErrorAction.f152365b), false, 12582655);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.AdvertsLoadingError) {
            ExtendedProfileSelectionCreateInternalAction.AdvertsLoadingError advertsLoadingError = (ExtendedProfileSelectionCreateInternalAction.AdvertsLoadingError) extendedProfileSelectionCreateInternalAction2;
            Throwable th2 = advertsLoadingError.f152318c ? advertsLoadingError.f152317b : null;
            return b(ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, null, false, null, null, false, null, false, false, th2 != null ? new ExtendedProfileSelectionCreateState.a(th2, ExtendedProfileSelectionCreateState.ErrorAction.f152366c) : null, false, 12320447));
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.UpdateItems) {
            return b(extendedProfileSelectionCreateState2);
        }
        boolean z15 = extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectAdvert;
        Set<Long> set = extendedProfileSelectionCreateState2.f152355p;
        if (z15) {
            SelectionAdvertItem selectionAdvertItem = ((ExtendedProfileSelectionCreateInternalAction.SelectAdvert) extendedProfileSelectionCreateInternalAction2).f152333b;
            boolean zContains = set.contains(Long.valueOf(selectionAdvertItem.f152038d));
            long j12 = selectionAdvertItem.f152038d;
            if (zContains) {
                LinkedHashSet linkedHashSetO0 = C42745f0.O0(set);
                linkedHashSetO0.remove(Long.valueOf(j12));
                G0 g02 = G0.f406611a;
                extendedProfileSelectionCreateStateA = ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, linkedHashSetO0, false, null, null, false, null, false, false, null, false, 15712255);
            } else {
                LinkedHashSet linkedHashSetO02 = C42745f0.O0(set);
                linkedHashSetO02.add(Long.valueOf(j12));
                G0 g03 = G0.f406611a;
                extendedProfileSelectionCreateStateA = ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, linkedHashSetO02, false, null, null, false, null, false, false, null, false, 15712255);
            }
            return b(extendedProfileSelectionCreateStateA);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.HighlightContinueText) {
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, null, false, null, null, false, null, true, false, null, false, 15728639);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionLoading) {
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, null, false, null, null, false, null, false, true, null, false, 14680063);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionError) {
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, null, false, null, null, false, null, false, false, null, false, 14680063);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionIncorrectValues) {
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, null, false, null, null, false, null, false, false, null, false, 14680063);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionItemListIdCreated) {
            ExtendedProfileSelectionCreateInternalAction.CreateSelectionItemListIdCreated createSelectionItemListIdCreated = (ExtendedProfileSelectionCreateInternalAction.CreateSelectionItemListIdCreated) extendedProfileSelectionCreateInternalAction2;
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, createSelectionItemListIdCreated.f152323b, createSelectionItemListIdCreated.f152324c, null, null, false, null, null, false, null, false, false, null, false, 16771071);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionSuccess) {
            SearchParams searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
            C42784z0 c42784z0 = C42784z0.f406748b;
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, searchParams, 0, 0, null, false, true, false, 0, null, null, null, extendedProfileSelectionCreateState2.f152355p, null, true, c42784z0, c42784z0, false, null, false, false, null, false, 14442363);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.ShowMoreActions) {
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, null, false, null, null, false, null, false, false, null, true, 8388607);
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CloseSelectionMenu) {
            return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, null, false, null, null, false, null, false, false, null, false, 8388607);
        }
        if (!(extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectAll)) {
            if (!(extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.UnselectAll)) {
                if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.OpenFiltersScreen ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CloseScreen) {
                    return extendedProfileSelectionCreateState2;
                }
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashSet linkedHashSetO03 = C42745f0.O0(set);
            List<SelectionAdvertItem> list3 = list2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((SelectionAdvertItem) it.next()).f152038d));
            }
            linkedHashSetO03.removeAll(C42745f0.P0(arrayList2));
            return b(ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, linkedHashSetO03, false, null, null, false, null, false, false, null, false, 7323647));
        }
        List<SelectionAdvertItem> list4 = list2;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Long.valueOf(((SelectionAdvertItem) it2.next()).f152038d));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!set.contains(Long.valueOf(((Number) next).longValue()))) {
                arrayList4.add(next);
            }
        }
        List listE0 = C42745f0.E0(arrayList4, this.f152403b.f151617h - set.size());
        LinkedHashSet linkedHashSetO04 = C42745f0.O0(set);
        linkedHashSetO04.addAll(listE0);
        return b(ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState2, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, linkedHashSetO04, false, null, null, false, null, false, false, null, false, 7323647));
    }

    public final ExtendedProfileSelectionCreateState b(ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState) {
        PrintableText printableTextB;
        ArrayList arrayList = new ArrayList();
        int i12 = extendedProfileSelectionCreateState.f152344e;
        SearchCorrectionItem searchCorrectionItem = extendedProfileSelectionCreateState.f152351l;
        Set<Long> set = extendedProfileSelectionCreateState.f152355p;
        if (i12 <= 0 || extendedProfileSelectionCreateState.f152345f <= 0) {
            if (searchCorrectionItem != null) {
                arrayList.add(searchCorrectionItem);
            }
            if (extendedProfileSelectionCreateState.f152346g != null) {
                arrayList.add(new SearchEmptyItem(null, null, 3, null));
            }
        } else {
            if (searchCorrectionItem != null) {
                arrayList.add(searchCorrectionItem);
            }
            List<SelectionAdvertItem> list = extendedProfileSelectionCreateState.f152357r;
            List<SelectionAdvertItem> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (SelectionAdvertItem selectionAdvertItem : list2) {
                arrayList2.add(new SelectionAdvertItem(selectionAdvertItem.f152036b, selectionAdvertItem.f152037c, selectionAdvertItem.f152038d, selectionAdvertItem.f152039e, selectionAdvertItem.f152040f, selectionAdvertItem.f152041g, selectionAdvertItem.f152042h, set.contains(Long.valueOf(selectionAdvertItem.f152038d))));
            }
            arrayList.addAll(arrayList2);
            if (!list.isEmpty() && (extendedProfileSelectionCreateState.f152359t || extendedProfileSelectionCreateState.f152347h)) {
                arrayList.add(new SearchButtonItem(null, null, extendedProfileSelectionCreateState.f152347h, 3, null));
            }
        }
        int size = set.size();
        ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig = this.f152403b;
        int i13 = extendedProfileSelectionCreateConfig.f151617h;
        if (size >= i13) {
            printableTextB = com.avito.android.printable_text.b.b(R.plurals.extended_profile_selection_create_over_limit_selected, i13, Integer.valueOf(i13));
        } else {
            boolean zIsEmpty = set.isEmpty();
            int i14 = extendedProfileSelectionCreateConfig.f151616g;
            printableTextB = zIsEmpty ? com.avito.android.printable_text.b.b(R.plurals.extended_profile_selection_create_min_selection_count, i14, Integer.valueOf(i14)) : set.size() < i14 ? com.avito.android.printable_text.b.b(R.plurals.extended_profile_selection_less_min_selected_count, i14 - set.size(), Integer.valueOf(i14 - set.size())) : com.avito.android.printable_text.b.b(R.plurals.extended_profile_selection_create_selected_count, set.size(), Integer.valueOf(set.size()));
        }
        return ExtendedProfileSelectionCreateState.a(extendedProfileSelectionCreateState, null, null, 0, 0, null, false, false, false, 0, null, null, null, null, null, false, null, arrayList, false, printableTextB, false, false, null, false, 16121855);
    }
}
