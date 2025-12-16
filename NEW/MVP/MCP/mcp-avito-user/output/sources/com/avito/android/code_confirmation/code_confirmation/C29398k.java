package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.registration.ConfirmCodeResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CodeConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/registration/ConfirmCodeResult;", "result", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/code_confirmation/code_confirmation/model/ConfirmedCodeInfo;", "apply", "(Lcom/avito/android/remote/model/registration/ConfirmCodeResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.code_confirmation.code_confirmation.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29398k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f119565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f119566c;

    public C29398k(r rVar, String str) {
        this.f119565b = str;
        this.f119566c = rVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ConfirmCodeResult confirmCodeResult = (ConfirmCodeResult) obj;
        if (confirmCodeResult instanceof ConfirmCodeResult.Ok) {
            ConfirmCodeResult.Ok ok2 = (ConfirmCodeResult.Ok) confirmCodeResult;
            return io.reactivex.rxjava3.core.I.q(new ConfirmedCodeInfo(this.f119565b, ok2.getHash(), ok2.getIsPhoneUsed(), null, 8, null));
        }
        boolean z12 = confirmCodeResult instanceof ConfirmCodeResult.Failure;
        r rVar = this.f119566c;
        if (z12) {
            return r.d(rVar, com.avito.android.remote.error.j.a(2, ((ConfirmCodeResult.Failure) confirmCodeResult).getMessage(), null));
        }
        if (confirmCodeResult instanceof ConfirmCodeResult.IncorrectData) {
            return r.d(rVar, new ApiError.IncorrectData(((ConfirmCodeResult.IncorrectData) confirmCodeResult).getMessages()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
