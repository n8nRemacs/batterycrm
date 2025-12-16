package com.avito.android.account;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SocialAuthResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SocialAuthResult;", "response", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class A<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final A<T, R> f68030b = new A<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        SocialAuthResult socialAuthResult = (SocialAuthResult) ((TypedResult.Success) typedResult).getResult();
        if (socialAuthResult instanceof SocialAuthResult.Ok ? true : socialAuthResult instanceof SocialAuthResult.TfaCheckWithPush ? true : socialAuthResult instanceof SocialAuthResult.ParsingPermission ? true : socialAuthResult instanceof SocialAuthResult.NeedPhoneVerification ? true : socialAuthResult instanceof SocialAuthResult.FollowDeeplink ? true : socialAuthResult instanceof SocialAuthResult.DuplicatedPD ? true : socialAuthResult instanceof SocialAuthResult.PassportBlocked) {
            return new P2.b(socialAuthResult);
        }
        if (socialAuthResult instanceof SocialAuthResult.WrongSocialUser) {
            return new P2.a(new ApiError.ErrorDialog(((SocialAuthResult.WrongSocialUser) socialAuthResult).getUserDialog()));
        }
        if (socialAuthResult instanceof SocialAuthResult.BlockedAccount) {
            return new P2.a(new ApiError.ErrorDialog(((SocialAuthResult.BlockedAccount) socialAuthResult).getUserDialog()));
        }
        if (socialAuthResult instanceof SocialAuthResult.FailedWithDialog) {
            return new P2.a(new ApiError.ErrorDialog(((SocialAuthResult.FailedWithDialog) socialAuthResult).getUserDialog()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
