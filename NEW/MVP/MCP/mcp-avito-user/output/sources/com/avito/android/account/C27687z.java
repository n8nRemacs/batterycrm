package com.avito.android.account;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/LoginResult;", "response", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27687z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C27687z<T, R> f68185b = new C27687z<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            return new P2.a(((TypedResult.Error) typedResult).getError());
        }
        if (!(typedResult instanceof TypedResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        LoginResult loginResult = (LoginResult) ((TypedResult.Success) typedResult).getResult();
        if (loginResult instanceof LoginResult.Ok ? true : loginResult instanceof LoginResult.TfaCheckWithPush ? true : loginResult instanceof LoginResult.PassportBlocked ? true : loginResult instanceof LoginResult.FollowDeeplink ? true : loginResult instanceof LoginResult.ParsingPermission) {
            return new P2.b(loginResult);
        }
        if (loginResult instanceof LoginResult.FailedWithMessage) {
            return new P2.a(com.avito.android.remote.error.j.a(2, ((LoginResult.FailedWithMessage) loginResult).getMessage(), null));
        }
        if (loginResult instanceof LoginResult.FailedWithMessages) {
            return new P2.a(new ApiError.IncorrectData(((LoginResult.FailedWithMessages) loginResult).getMessages()));
        }
        if (loginResult instanceof LoginResult.FailedWithDialog) {
            return new P2.a(new ApiError.ErrorDialog(((LoginResult.FailedWithDialog) loginResult).getUserDialog()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
