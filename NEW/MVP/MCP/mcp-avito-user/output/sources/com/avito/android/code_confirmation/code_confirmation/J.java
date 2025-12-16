package com.avito.android.code_confirmation.code_confirmation;

import Vo.C15699a;
import com.avito.android.remote.ConfirmCodeResponse;
import com.avito.android.remote.RecallMeError;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/ConfirmCodeResponse;", "kotlin.jvm.PlatformType", "confirmCodeResponse", "Lio/reactivex/rxjava3/core/w;", "LVo/a;", "apply", "(Lcom/avito/android/remote/ConfirmCodeResponse;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class J<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f119418b;

    public J(T t12) {
        this.f119418b = t12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C15699a c15699a;
        String message;
        f0 f0Var;
        ConfirmCodeResponse confirmCodeResponse = (ConfirmCodeResponse) obj;
        T t12 = this.f119418b;
        t12.getClass();
        if (confirmCodeResponse.getSuccess()) {
            c15699a = new C15699a(t12.f119459t, confirmCodeResponse.getRetryAfterSec() != null ? r5.intValue() : 180L);
        } else {
            RecallMeError error = confirmCodeResponse.getError();
            c15699a = null;
            if (error != null && (message = error.getMessage()) != null && (f0Var = t12.f119452m) != null) {
                f0Var.g(null, message);
            }
        }
        return com.avito.android.util.rx3.A.a(c15699a);
    }
}
