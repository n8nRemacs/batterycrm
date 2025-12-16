package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.remote.model.TfaFlow;
import kotlin.Metadata;

/* compiled from: TfaCodeCheckCodeConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/interactor/c;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {
    @Y61.k
    a a(@Y61.k TfaFlow tfaFlow, @Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo);
}
