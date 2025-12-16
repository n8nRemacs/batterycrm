package com.avito.android.authorization.reset_password;

import Vo.C15699a;
import com.avito.android.code_confirmation.code_confirmation.CodeAlreadyConfirmedException;
import com.avito.android.code_confirmation.code_confirmation.FollowDeeplinkException;
import com.avito.android.code_confirmation.code_confirmation.ShowUserDialogException;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.recover_by_phone.RecoverByPhoneResult;
import com.avito.android.util.ApiException;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ResetPasswordInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "result", "Lio/reactivex/rxjava3/core/O;", "LVo/a;", "apply", "(Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f94171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f94172c;

    public g(i iVar, String str) {
        this.f94171b = iVar;
        this.f94172c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        RecoverByPhoneResult recoverByPhoneResult = (RecoverByPhoneResult) obj;
        if (recoverByPhoneResult instanceof RecoverByPhoneResult.Ok) {
            RecoverByPhoneResult.Ok ok2 = (RecoverByPhoneResult.Ok) recoverByPhoneResult;
            return I.q(new C15699a(this.f94171b.f94176c.b(this.f94172c), ok2.getNextTryTime() - ok2.getLastTryTime()));
        }
        if (recoverByPhoneResult instanceof RecoverByPhoneResult.Failure) {
            return I.l(new ApiException(com.avito.android.remote.error.j.a(2, ((RecoverByPhoneResult.Failure) recoverByPhoneResult).getMessage(), null), null, 2, null));
        }
        if (recoverByPhoneResult instanceof RecoverByPhoneResult.Unsafe) {
            return I.l(new ApiException(com.avito.android.remote.error.j.a(2, ((RecoverByPhoneResult.Unsafe) recoverByPhoneResult).getMessage(), null), null, 2, null));
        }
        if (recoverByPhoneResult instanceof RecoverByPhoneResult.IncorrectData) {
            return I.l(new ApiException(new ApiError.IncorrectData(((RecoverByPhoneResult.IncorrectData) recoverByPhoneResult).getMessages()), null, 2, null));
        }
        if (recoverByPhoneResult instanceof RecoverByPhoneResult.Confirmed) {
            RecoverByPhoneResult.Confirmed confirmed = (RecoverByPhoneResult.Confirmed) recoverByPhoneResult;
            return I.l(new CodeAlreadyConfirmedException(new ConfirmedCodeInfo(this.f94172c, confirmed.getHash(), confirmed.getIsPhoneUsed(), null, 8, null)));
        }
        if (recoverByPhoneResult instanceof RecoverByPhoneResult.ErrorDialog) {
            return I.l(new ShowUserDialogException(((RecoverByPhoneResult.ErrorDialog) recoverByPhoneResult).getUserDialog()));
        }
        if (recoverByPhoneResult instanceof RecoverByPhoneResult.FollowDeeplink) {
            return I.l(new FollowDeeplinkException(((RecoverByPhoneResult.FollowDeeplink) recoverByPhoneResult).getDeeplink()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
