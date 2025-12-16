package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetStartData;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetInternalAction;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacEnableBottomSheetReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/entity/IacEnableBottomSheetInternalAction;", "Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/entity/IacEnableBottomSheetState;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements u<IacEnableBottomSheetInternalAction, IacEnableBottomSheetState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IacEnableBottomSheetStartData f227858b;

    @Inject
    public l(@Y61.k IacEnableBottomSheetStartData iacEnableBottomSheetStartData) {
        this.f227858b = iacEnableBottomSheetStartData;
    }

    @Override // com.avito.android.arch.mvi.u
    public final IacEnableBottomSheetState a(IacEnableBottomSheetInternalAction iacEnableBottomSheetInternalAction, IacEnableBottomSheetState iacEnableBottomSheetState) {
        IacEnableBottomSheetInternalAction iacEnableBottomSheetInternalAction2 = iacEnableBottomSheetInternalAction;
        IacEnableBottomSheetState iacEnableBottomSheetState2 = iacEnableBottomSheetState;
        if (iacEnableBottomSheetInternalAction2.equals(IacEnableBottomSheetInternalAction.SetupContent.f227838b)) {
            IacEnableBottomSheetStartData iacEnableBottomSheetStartData = this.f227858b;
            return IacEnableBottomSheetState.a(iacEnableBottomSheetState2, iacEnableBottomSheetStartData.f227774b, iacEnableBottomSheetStartData.f227775c, false, 4);
        }
        if (iacEnableBottomSheetInternalAction2 instanceof IacEnableBottomSheetInternalAction.IacEnableChangeError) {
            return IacEnableBottomSheetState.a(iacEnableBottomSheetState2, false, false, false, 3);
        }
        if (iacEnableBottomSheetInternalAction2 instanceof IacEnableBottomSheetInternalAction.IacEnableChangeLoading) {
            return IacEnableBottomSheetState.a(iacEnableBottomSheetState2, false, false, true, 3);
        }
        if (iacEnableBottomSheetInternalAction2 instanceof IacEnableBottomSheetInternalAction.IacEnableChangeSuccess) {
            return IacEnableBottomSheetState.a(iacEnableBottomSheetState2, false, ((IacEnableBottomSheetInternalAction.IacEnableChangeSuccess) iacEnableBottomSheetInternalAction2).f227837b, false, 1);
        }
        if (iacEnableBottomSheetInternalAction2 instanceof IacEnableBottomSheetInternalAction.StartMicPermissionRequestFlow) {
            return iacEnableBottomSheetState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
