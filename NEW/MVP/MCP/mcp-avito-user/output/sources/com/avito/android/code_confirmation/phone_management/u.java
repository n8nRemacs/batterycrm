package com.avito.android.code_confirmation.phone_management;

import Vo.C15699a;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import com.avito.android.code_confirmation.code_confirmation.SmsCodeConfirmationParams;
import com.avito.android.code_confirmation.code_confirmation.s0;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import kotlin.Metadata;

/* compiled from: PhoneManagementPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LVo/a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(LVo/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f119704b;

    public u(w wVar) {
        this.f119704b = wVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C15699a c15699a = (C15699a) obj;
        w wVar = this.f119704b;
        PhoneManagementActivity phoneManagementActivity = wVar.f119714i;
        if (phoneManagementActivity != null) {
            SmsCodeConfirmationParams smsCodeConfirmationParams = new SmsCodeConfirmationParams(wVar.f119717l, null, c15699a.f17383a, c15699a.f17384b, 5, null, CodeConfirmationPresenter.Mode.PhoneVerification.f119407b, 32, null);
            CodeConfirmationSource codeConfirmationSource = CodeConfirmationSource.f92767o;
            PhoneManagementIntentFactory.CallSource callSource = wVar.f119709d;
            CodeConfirmationSource codeConfirmationSource2 = wVar.f119711f;
            if (codeConfirmationSource2 == codeConfirmationSource || !(callSource instanceof PhoneManagementIntentFactory.CallSource.Messenger)) {
                codeConfirmationSource2 = (codeConfirmationSource2 == codeConfirmationSource && (callSource instanceof PhoneManagementIntentFactory.CallSource.Messenger)) ? CodeConfirmationSource.f92759g : CodeConfirmationSource.f92764l;
            }
            phoneManagementActivity.f119662o.b(new s0(smsCodeConfirmationParams, codeConfirmationSource2));
        }
    }
}
