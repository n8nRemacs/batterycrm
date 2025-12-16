package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.R;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import com.avito.android.util.InterfaceC35741a1;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import wb0.InterfaceC49591b;

/* compiled from: PhonesListMviOneTimeEventProducer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/L;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class L implements com.avito.android.arch.mvi.t<PhonesListMviInternalAction, InterfaceC49591b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f227934b;

    @Inject
    public L(@Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f227934b = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49591b b(PhonesListMviInternalAction phonesListMviInternalAction) {
        InterfaceC49591b kVar;
        PhonesListMviInternalAction phonesListMviInternalAction2 = phonesListMviInternalAction;
        if (phonesListMviInternalAction2.equals(PhonesListMviInternalAction.OpenAddPhoneScreen.f228000b)) {
            return InterfaceC49591b.d.f441656a;
        }
        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.OpenTimePicker) {
            kVar = new InterfaceC49591b.i(((PhonesListMviInternalAction.OpenTimePicker) phonesListMviInternalAction2).f228008b);
        } else if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.OpenSchedulePicker) {
            kVar = new InterfaceC49591b.h(((PhonesListMviInternalAction.OpenSchedulePicker) phonesListMviInternalAction2).f228007b);
        } else if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.OpenIacEnableBottomSheet) {
            PhonesListMviInternalAction.OpenIacEnableBottomSheet openIacEnableBottomSheet = (PhonesListMviInternalAction.OpenIacEnableBottomSheet) phonesListMviInternalAction2;
            kVar = new InterfaceC49591b.f(openIacEnableBottomSheet.f228003b, openIacEnableBottomSheet.f228004c);
        } else if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.SuccessToast) {
            kVar = new InterfaceC49591b.m(((PhonesListMviInternalAction.SuccessToast) phonesListMviInternalAction2).f228013b);
        } else if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.ErrorToastOnTimePickerDialog) {
            kVar = new InterfaceC49591b.j(((PhonesListMviInternalAction.ErrorToastOnTimePickerDialog) phonesListMviInternalAction2).f227990b);
        } else {
            if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.CloseTimePickerDialog) {
                return InterfaceC49591b.a.f441652a;
            }
            if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.OpenPhoneActionsSheet) {
                PhonesListMviInternalAction.OpenPhoneActionsSheet openPhoneActionsSheet = (PhonesListMviInternalAction.OpenPhoneActionsSheet) phonesListMviInternalAction2;
                kVar = new InterfaceC49591b.g(openPhoneActionsSheet.f228005b, openPhoneActionsSheet.f228006c);
            } else {
                if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.NeedRefreshProfileAfterExit) {
                    return InterfaceC49591b.c.f441655a;
                }
                boolean z12 = phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.IacEnableChangeError;
                InterfaceC35741a1 interfaceC35741a1 = this.f227934b;
                if (z12) {
                    Throwable th2 = ((PhonesListMviInternalAction.IacEnableChangeError) phonesListMviInternalAction2).f227992b;
                    kVar = new InterfaceC49591b.C12822b(InterfaceC35741a1.a.a(interfaceC35741a1, th2, null, null, 6), th2);
                } else {
                    if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.HideDeletedDevice) {
                        return new InterfaceC49591b.m(com.avito.android.printable_text.b.c(R.string.delete_device_success_toast, new Serializable[0]));
                    }
                    if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.OpenDeleteDeviceFragment) {
                        PhonesListMviInternalAction.OpenDeleteDeviceFragment openDeleteDeviceFragment = (PhonesListMviInternalAction.OpenDeleteDeviceFragment) phonesListMviInternalAction2;
                        kVar = new InterfaceC49591b.e(openDeleteDeviceFragment.f228001b, openDeleteDeviceFragment.f228002c);
                    } else if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.DeleteDeviceError) {
                        Throwable th3 = ((PhonesListMviInternalAction.DeleteDeviceError) phonesListMviInternalAction2).f227989b;
                        kVar = new InterfaceC49591b.C12822b(InterfaceC35741a1.a.a(interfaceC35741a1, th3, null, null, 6), th3);
                    } else {
                        if (phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.StartMicPermissionRequestFlow) {
                            return InterfaceC49591b.l.f441667a;
                        }
                        if (!(phonesListMviInternalAction2 instanceof PhonesListMviInternalAction.ShowUxFeedback)) {
                            return null;
                        }
                        kVar = new InterfaceC49591b.k(((PhonesListMviInternalAction.ShowUxFeedback) phonesListMviInternalAction2).f228011b);
                    }
                }
            }
        }
        return kVar;
    }
}
