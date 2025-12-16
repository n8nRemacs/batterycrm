package com.avito.android.code_check.code_confirm.mvi;

import To.InterfaceC15383a;
import com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CodeConfirmActor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_code-check_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {
    @Y61.k
    public static final CodeConfirmInternalAction a(@Y61.k InterfaceC15383a interfaceC15383a) {
        if (interfaceC15383a instanceof InterfaceC15383a.C1082a) {
            return new CodeConfirmInternalAction.Confirmed(((InterfaceC15383a.C1082a) interfaceC15383a).f15844a);
        }
        if (interfaceC15383a instanceof InterfaceC15383a.d.b) {
            return new CodeConfirmInternalAction.ServerCodeValidationError(((InterfaceC15383a.d.b) interfaceC15383a).f15849a);
        }
        if (interfaceC15383a instanceof InterfaceC15383a.d.C1083a) {
            return CodeConfirmInternalAction.LocalCodeValidationError.f118716b;
        }
        if (interfaceC15383a instanceof InterfaceC15383a.e) {
            return new CodeConfirmInternalAction.Navigate(((InterfaceC15383a.e) interfaceC15383a).f15850a);
        }
        if (interfaceC15383a instanceof InterfaceC15383a.f) {
            return new CodeConfirmInternalAction.ShowToastMessage(((InterfaceC15383a.f) interfaceC15383a).f15851a);
        }
        if (interfaceC15383a instanceof InterfaceC15383a.g) {
            return new CodeConfirmInternalAction.ShowUserDialog(((InterfaceC15383a.g) interfaceC15383a).f15852a);
        }
        if (interfaceC15383a.equals(InterfaceC15383a.h.f15853a)) {
            return new CodeConfirmInternalAction.TrackContent();
        }
        if (!(interfaceC15383a instanceof InterfaceC15383a.c)) {
            if (interfaceC15383a.equals(InterfaceC15383a.b.f15845a)) {
                return CodeConfirmInternalAction.DisableAutofill.f118715b;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC15383a.c cVar = (InterfaceC15383a.c) interfaceC15383a;
        return new CodeConfirmInternalAction.UnknownError(cVar.f15846a, cVar.f15847b, cVar.f15848c);
    }
}
