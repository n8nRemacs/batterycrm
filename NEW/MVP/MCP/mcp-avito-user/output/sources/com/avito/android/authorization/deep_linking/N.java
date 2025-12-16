package com.avito.android.authorization.deep_linking;

import com.avito.android.R;
import com.avito.android.authorization.AuthSource;
import com.avito.android.code_confirmation.code_confirmation.CodeAlreadyConfirmedException;
import com.avito.android.code_confirmation.code_confirmation.FollowDeeplinkException;
import com.avito.android.code_confirmation.code_confirmation.ShowUserDialogException;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.deep_linking.links.auth.RestorePasswordLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: PerformResetPasswordAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class N<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f93701b;

    public N(S s5) {
        this.f93701b = s5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        S s5 = this.f93701b;
        if (th2 instanceof CodeAlreadyConfirmedException) {
            ConfirmedCodeInfo confirmedCodeInfo = ((CodeAlreadyConfirmedException) th2).f119395b;
            String str = confirmedCodeInfo.f119576c;
            AuthSource authSource = AuthSource.f92694c;
            s5.k(new RestorePasswordLink(str, confirmedCodeInfo.f119575b, "restore_auth"));
            return;
        }
        if (th2 instanceof FollowDeeplinkException) {
            s5.k(((FollowDeeplinkException) th2).f119415b);
            return;
        }
        if (th2 instanceof ShowUserDialogException) {
            s5.l(((ShowUserDialogException) th2).f119432b);
            return;
        }
        if (!(th2 instanceof ApiException)) {
            s5.m(com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]));
            return;
        }
        ApiError apiError = ((ApiException) th2).f318522b;
        if (apiError instanceof com.avito.android.remote.error.s) {
            s5.l(((com.avito.android.remote.error.s) apiError).getUserDialog());
        } else {
            com.avito.android.error.z.g(apiError, new T(s5), new U(s5), new V(s5), null, null, 24);
        }
    }
}
