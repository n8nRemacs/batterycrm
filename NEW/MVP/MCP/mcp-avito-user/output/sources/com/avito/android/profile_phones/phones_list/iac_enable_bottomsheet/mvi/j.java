package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetInternalAction;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import vb0.InterfaceC49295b;

/* compiled from: IacEnableBottomSheetOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/entity/IacEnableBottomSheetInternalAction;", "Lvb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements t<IacEnableBottomSheetInternalAction, InterfaceC49295b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f227856b;

    @Inject
    public j(@Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f227856b = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49295b b(IacEnableBottomSheetInternalAction iacEnableBottomSheetInternalAction) {
        IacEnableBottomSheetInternalAction iacEnableBottomSheetInternalAction2 = iacEnableBottomSheetInternalAction;
        if (iacEnableBottomSheetInternalAction2 instanceof IacEnableBottomSheetInternalAction.IacEnableChangeError) {
            IacEnableBottomSheetInternalAction.IacEnableChangeError iacEnableChangeError = (IacEnableBottomSheetInternalAction.IacEnableChangeError) iacEnableBottomSheetInternalAction2;
            return new InterfaceC49295b.a(InterfaceC35741a1.a.a(this.f227856b, iacEnableChangeError.f227836b, null, null, 6), iacEnableChangeError.f227836b);
        }
        if (iacEnableBottomSheetInternalAction2.equals(IacEnableBottomSheetInternalAction.SetupContent.f227838b) || (iacEnableBottomSheetInternalAction2 instanceof IacEnableBottomSheetInternalAction.IacEnableChangeLoading) || (iacEnableBottomSheetInternalAction2 instanceof IacEnableBottomSheetInternalAction.IacEnableChangeSuccess)) {
            return null;
        }
        if (iacEnableBottomSheetInternalAction2.equals(IacEnableBottomSheetInternalAction.StartMicPermissionRequestFlow.f227839b)) {
            return InterfaceC49295b.C12783b.f440873a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
