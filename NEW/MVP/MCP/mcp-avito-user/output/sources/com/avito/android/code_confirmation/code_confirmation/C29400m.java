package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.code_confirmation.code_confirmation.model.VerifiedCodePayload;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.registration.VerifyCodeResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CodeConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "result", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/code_confirmation/code_confirmation/model/VerifiedCodePayload;", "apply", "(Lcom/avito/android/remote/model/registration/VerifyCodeResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.code_confirmation.code_confirmation.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29400m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f119571b;

    public C29400m(r rVar) {
        this.f119571b = rVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        VerifyCodeResult verifyCodeResult = (VerifyCodeResult) obj;
        if (verifyCodeResult instanceof VerifyCodeResult.Ok) {
            return io.reactivex.rxjava3.core.I.q(VerifiedCodePayload.f119579b);
        }
        boolean z12 = verifyCodeResult instanceof VerifyCodeResult.Failure;
        r rVar = this.f119571b;
        if (z12) {
            return r.d(rVar, com.avito.android.remote.error.j.a(2, ((VerifyCodeResult.Failure) verifyCodeResult).getMessage(), null));
        }
        if (verifyCodeResult instanceof VerifyCodeResult.IncorrectData) {
            return r.d(rVar, new ApiError.IncorrectData(((VerifyCodeResult.IncorrectData) verifyCodeResult).getMessages()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
