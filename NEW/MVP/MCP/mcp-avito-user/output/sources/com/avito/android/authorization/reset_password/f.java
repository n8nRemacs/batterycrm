package com.avito.android.authorization.reset_password;

import com.avito.android.code_confirmation.code_confirmation.FollowDeeplinkException;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ResetPasswordResult;
import com.avito.android.remote.model.recover_by_phone.RecoverByEmailResult;
import com.avito.android.util.ApiException;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ResetPasswordInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByEmailResult;", "result", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/ResetPasswordResult;", "apply", "(Lcom/avito/android/remote/model/recover_by_phone/RecoverByEmailResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f94169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f94170c;

    public f(i iVar, String str) {
        this.f94169b = iVar;
        this.f94170c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        RecoverByEmailResult recoverByEmailResult = (RecoverByEmailResult) obj;
        if (recoverByEmailResult instanceof RecoverByEmailResult.Ok) {
            return I.q(new ResetPasswordResult.ViaLink(this.f94169b.f94176c.a(this.f94170c)));
        }
        if (recoverByEmailResult instanceof RecoverByEmailResult.FollowDeeplink) {
            return I.l(new FollowDeeplinkException(((RecoverByEmailResult.FollowDeeplink) recoverByEmailResult).getDeeplink()));
        }
        if (recoverByEmailResult instanceof RecoverByEmailResult.ErrorDialog) {
            return I.l(new ApiException(new ApiError.ErrorDialog(((RecoverByEmailResult.ErrorDialog) recoverByEmailResult).getUserDialog()), null, 2, null));
        }
        if (recoverByEmailResult instanceof RecoverByEmailResult.Failure) {
            return I.l(new ApiException(com.avito.android.remote.error.j.a(2, ((RecoverByEmailResult.Failure) recoverByEmailResult).getMessage(), null), null, 2, null));
        }
        if (recoverByEmailResult instanceof RecoverByEmailResult.IncorrectData) {
            return I.l(new ApiException(new ApiError.IncorrectData(((RecoverByEmailResult.IncorrectData) recoverByEmailResult).getMessages()), null, 2, null));
        }
        if (recoverByEmailResult instanceof RecoverByEmailResult.Unsafe) {
            return I.l(new ApiException(com.avito.android.remote.error.j.a(2, ((RecoverByEmailResult.Unsafe) recoverByEmailResult).getMessage(), null), null, 2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
