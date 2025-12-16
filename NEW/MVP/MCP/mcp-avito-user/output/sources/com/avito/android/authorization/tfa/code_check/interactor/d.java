package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.account.InterfaceC27663a;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.remote.model.TfaFlow;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TfaCodeCheckCodeConfirmInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/interactor/d;", "Lcom/avito/android/authorization/tfa/code_check/interactor/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f94668a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credman.o f94669b;

    @Inject
    public d(@Y61.k InterfaceC27663a interfaceC27663a, @Y61.k com.avito.android.credman.o oVar) {
        this.f94668a = interfaceC27663a;
        this.f94669b = oVar;
    }

    @Override // com.avito.android.authorization.tfa.code_check.interactor.c
    @Y61.k
    public final a a(@Y61.k TfaFlow tfaFlow, @Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo) {
        return new a(this.f94668a, tfaFlow, loginInfo, this.f94669b);
    }
}
