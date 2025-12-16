package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.code_confirmation.code_confirmation.m0;
import com.avito.android.remote.ConfirmPhoneResponse;
import com.avito.android.remote.RecallMeError;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/ConfirmPhoneResponse;", "confirmPhoneResponse", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/ConfirmPhoneResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class B<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f119392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f119393c;

    public B(T t12, String str) {
        this.f119392b = t12;
        this.f119393c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String message;
        ConfirmPhoneResponse confirmPhoneResponse = (ConfirmPhoneResponse) obj;
        boolean success = confirmPhoneResponse.getSuccess();
        T t12 = this.f119392b;
        if (success) {
            CodeConfirmationActivity codeConfirmationActivity = t12.f119453n;
            if (codeConfirmationActivity != null) {
                codeConfirmationActivity.a2(new m0.c(this.f119393c));
                return;
            }
            return;
        }
        f0 f0Var = t12.f119452m;
        if (f0Var != null) {
            RecallMeError error = confirmPhoneResponse.getError();
            if (error == null || (message = error.getMessage()) == null) {
                message = "";
            }
            f0Var.g(null, message);
        }
    }
}
