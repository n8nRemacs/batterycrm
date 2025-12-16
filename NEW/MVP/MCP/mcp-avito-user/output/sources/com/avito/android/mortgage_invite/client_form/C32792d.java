package com.avito.android.mortgage_invite.client_form;

import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ApplicationClientFormFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.client_form.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32792d extends kotlin.jvm.internal.H implements Y41.l<PhoneConfirmArguments, G0> {
    @Override // Y41.l
    public final G0 invoke(PhoneConfirmArguments phoneConfirmArguments) {
        PhoneConfirmArguments phoneConfirmArguments2 = phoneConfirmArguments;
        ApplicationClientFormFragment applicationClientFormFragment = (ApplicationClientFormFragment) this.receiver;
        com.avito.android.mortgage.phone_confirm.m mVar = applicationClientFormFragment.f205017o0;
        if (mVar == null) {
            mVar = null;
        }
        mVar.a(phoneConfirmArguments2, applicationClientFormFragment);
        return G0.f406611a;
    }
}
