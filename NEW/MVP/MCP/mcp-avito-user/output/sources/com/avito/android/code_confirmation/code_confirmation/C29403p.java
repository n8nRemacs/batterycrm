package com.avito.android.code_confirmation.code_confirmation;

import Vo.C15699a;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.registration.RequestCodeResult;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CodeConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/registration/RequestCodeResult;", "result", "Lio/reactivex/rxjava3/core/w;", "LVo/a;", "apply", "(Lcom/avito/android/remote/model/registration/RequestCodeResult;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.code_confirmation.code_confirmation.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29403p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f119586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f119587c;

    public C29403p(r rVar, String str) {
        this.f119586b = rVar;
        this.f119587c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        RequestCodeResult requestCodeResult = (RequestCodeResult) obj;
        boolean z12 = requestCodeResult instanceof RequestCodeResult.Ok;
        r rVar = this.f119586b;
        if (z12) {
            RequestCodeResult.Ok ok2 = (RequestCodeResult.Ok) requestCodeResult;
            return io.reactivex.rxjava3.core.I.q(new C15699a(rVar.f119621c.a(this.f119587c), ok2.getNextTryTime() - ok2.getLastTryTime())).E();
        }
        if (requestCodeResult instanceof RequestCodeResult.Failure) {
            return r.c(rVar, com.avito.android.remote.error.j.a(2, ((RequestCodeResult.Failure) requestCodeResult).getMessage(), null));
        }
        if (requestCodeResult instanceof RequestCodeResult.IncorrectData) {
            return r.c(rVar, new ApiError.IncorrectData(((RequestCodeResult.IncorrectData) requestCodeResult).getMessages()));
        }
        if (requestCodeResult instanceof RequestCodeResult.ErrorDialog) {
            return r.c(rVar, new ApiError.ErrorDialog(((RequestCodeResult.ErrorDialog) requestCodeResult).getUserDialog()));
        }
        if (!(requestCodeResult instanceof RequestCodeResult.Confirmed)) {
            if (requestCodeResult instanceof RequestCodeResult.VerifyByCall) {
                return C41928w.f403335b;
            }
            throw new NoWhenBranchMatchedException();
        }
        RequestCodeResult.Confirmed confirmed = (RequestCodeResult.Confirmed) requestCodeResult;
        return io.reactivex.rxjava3.core.I.l(new CodeAlreadyConfirmedException(new ConfirmedCodeInfo(this.f119587c, confirmed.getHash(), confirmed.getIsPhoneUsed(), null, 8, null))).E();
    }
}
