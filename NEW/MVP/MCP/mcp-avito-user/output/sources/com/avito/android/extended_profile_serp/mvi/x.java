package com.avito.android.extended_profile_serp.mvi;

import com.avito.android.extended_profile_serp.C30558v;
import com.avito.android.extended_profile_serp.adapter.progress.ProgressItem;
import com.avito.android.extended_profile_serp.adapter.search_correction.SearchCorrectionItem;
import com.avito.android.extended_profile_serp.adapter.search_empty.SearchEmptyItem;
import com.avito.android.extended_profile_serp.adapter.search_header.SearchHeaderItem;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import com.avito.android.home.InterfaceC30768c;
import com.avito.android.remote.model.ExtendedProfilePhoneDisclaimer;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileSerpReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/x;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class x implements com.avito.android.arch.mvi.u<ExtendedProfileSerpInternalAction, ExtendedProfileSerpState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30768c f153066b;

    @Inject
    public x(@Y61.k InterfaceC30768c interfaceC30768c) {
        this.f153066b = interfaceC30768c;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final ExtendedProfileSerpState a(ExtendedProfileSerpInternalAction extendedProfileSerpInternalAction, ExtendedProfileSerpState extendedProfileSerpState) {
        ExtendedProfileSerpInternalAction extendedProfileSerpInternalAction2 = extendedProfileSerpInternalAction;
        ExtendedProfileSerpState extendedProfileSerpState2 = extendedProfileSerpState;
        boolean z12 = extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.AdvertsLoading;
        List<AdvertItem> list = extendedProfileSerpState2.f152965o;
        if (z12) {
            ExtendedProfileSerpInternalAction.AdvertsLoading advertsLoading = (ExtendedProfileSerpInternalAction.AdvertsLoading) extendedProfileSerpInternalAction2;
            boolean z13 = advertsLoading.f152928b;
            return b(ExtendedProfileSerpState.a(extendedProfileSerpState2, null, advertsLoading.f152929c, null, null, 0, 0, null, true, false, z13, 0, null, z13 ? C42784z0.f406748b : list, null, false, null, null, null, null, 940795));
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.AdvertsLoaded) {
            ExtendedProfileSerpInternalAction.AdvertsLoaded advertsLoaded = (ExtendedProfileSerpInternalAction.AdvertsLoaded) extendedProfileSerpInternalAction2;
            SearchCorrectionItem searchCorrectionItem = advertsLoaded.f152921e ? advertsLoaded.f152922f : extendedProfileSerpState2.f152964n;
            List<AdvertItem> list2 = advertsLoaded.f152919c;
            ArrayList arrayListH0 = C42745f0.h0(list2, list);
            boolean z14 = !list2.isEmpty() && arrayListH0.size() < advertsLoaded.f152924h;
            String str = advertsLoaded.f152923g;
            if (str == null) {
                str = "";
            }
            return b(ExtendedProfileSerpState.a(extendedProfileSerpState2, str, advertsLoaded.f152927k, null, advertsLoaded.f152918b, advertsLoaded.f152924h, advertsLoaded.f152925i, advertsLoaded.f152926j, false, false, false, advertsLoaded.f152920d, searchCorrectionItem, arrayListH0, null, z14, null, null, null, null, 999434));
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.AdvertsLoadingError) {
            ExtendedProfileSerpInternalAction.AdvertsLoadingError advertsLoadingError = (ExtendedProfileSerpInternalAction.AdvertsLoadingError) extendedProfileSerpInternalAction2;
            Throwable th2 = advertsLoadingError.f152931c ? advertsLoadingError.f152930b : null;
            return b(ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, null, null, 0, 0, null, false, false, false, 0, null, null, null, false, th2 != null ? new ExtendedProfileSerpState.a(null, th2, ExtendedProfileSerpState.ErrorType.f152973c) : null, null, null, null, 948991));
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.UserNotExistError) {
            return b(ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, null, null, 0, 0, null, false, false, false, 0, null, null, null, false, new ExtendedProfileSerpState.a(((ExtendedProfileSerpInternalAction.UserNotExistError) extendedProfileSerpInternalAction2).f152951b, null, ExtendedProfileSerpState.ErrorType.f152972b), null, null, null, 948991));
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.PageParamsLoading) {
            return ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, null, null, 0, 0, null, false, true, false, 0, null, null, null, false, null, null, null, null, 1048063);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.PageParamsLoaded) {
            return ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, ((ExtendedProfileSerpInternalAction.PageParamsLoaded) extendedProfileSerpInternalAction2).f152941b, null, 0, 0, null, false, false, false, 0, null, null, null, false, null, null, null, null, 1048567);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.UpdateItems) {
            return b(extendedProfileSerpState2);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.ShowPhoneDialog) {
            ExtendedProfileSerpInternalAction.ShowPhoneDialog showPhoneDialog = (ExtendedProfileSerpInternalAction.ShowPhoneDialog) extendedProfileSerpInternalAction2;
            C30558v c30558v = extendedProfileSerpState2.f152955e;
            String str2 = c30558v != null ? c30558v.f153113d : null;
            com.avito.android.extended_profile_phone_dialog.f fVar = showPhoneDialog.f152944b;
            ExtendedProfilePhoneDisclaimer extendedProfilePhoneDisclaimer = fVar.f151600b;
            return ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, null, null, 0, 0, null, false, false, false, 0, null, null, null, false, null, fVar, new ExtendedProfileSerpState.b(fVar, new FA.a(showPhoneDialog.f152946d, showPhoneDialog.f152945c, str2, extendedProfilePhoneDisclaimer != null ? extendedProfilePhoneDisclaimer.getIsAnonymous() : null)), null, 655359);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.OnPhoneCallCanceled) {
            return ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, null, null, 0, 0, null, false, false, false, 0, null, null, null, false, null, null, null, null, 786431);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.InlineFiltersLoading) {
            return ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, null, null, 0, 0, null, false, true, false, 0, null, null, null, false, null, null, null, null, 1048063);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.InlineFiltersLoaded) {
            return ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, null, null, 0, 0, null, false, false, false, 0, null, null, null, false, null, null, null, null, 1048063);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.SuggestLoaded) {
            return ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, null, null, 0, 0, null, false, false, false, 0, null, null, null, false, null, null, null, ((ExtendedProfileSerpInternalAction.SuggestLoaded) extendedProfileSerpInternalAction2).f152947b, 524287);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.SuggestLoadingError) {
            return ExtendedProfileSerpState.a(extendedProfileSerpState2, null, null, null, null, 0, 0, null, false, false, false, 0, null, null, null, false, null, null, null, C42784z0.f406748b, 524287);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.OpenFiltersScreen ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.OpenShare ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.ApplySuggest ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.UpdateSearchInputText ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.CloseScreen) {
            return extendedProfileSerpState2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ExtendedProfileSerpState b(ExtendedProfileSerpState extendedProfileSerpState) {
        ArrayList arrayList = new ArrayList();
        int f109435b = this.f153066b.getF109435b();
        int i12 = extendedProfileSerpState.f152957g;
        SearchCorrectionItem searchCorrectionItem = extendedProfileSerpState.f152964n;
        if (i12 <= 0 || extendedProfileSerpState.f152958h <= 0) {
            if (searchCorrectionItem != null) {
                arrayList.add(searchCorrectionItem);
            }
            String str = extendedProfileSerpState.f152959i;
            if (str != null) {
                arrayList.add(new SearchEmptyItem(null, f109435b, str, 1, null));
            }
        } else {
            if (searchCorrectionItem != null) {
                arrayList.add(searchCorrectionItem);
            }
            arrayList.add(new SearchHeaderItem(null, f109435b, extendedProfileSerpState.f152958h, 1, null));
            List<AdvertItem> list = extendedProfileSerpState.f152965o;
            arrayList.addAll(list);
            if (!list.isEmpty() && (extendedProfileSerpState.f152967q || extendedProfileSerpState.f152960j)) {
                arrayList.add(new ProgressItem(null, f109435b, 1, null));
            }
        }
        return ExtendedProfileSerpState.a(extendedProfileSerpState, null, null, null, null, 0, 0, null, false, false, false, 0, null, null, arrayList, false, null, null, null, null, 1032191);
    }
}
