package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TfaCodeCheckPreRequestInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/interactor/n;", "Lcom/avito/android/authorization/tfa/code_check/interactor/m;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.r f94684a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f94685b;

    @Inject
    public n(@Y61.k com.avito.android.remote.r rVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f94684a = rVar;
        this.f94685b = interfaceC28373a;
    }

    @Override // com.avito.android.authorization.tfa.code_check.interactor.m
    @Y61.k
    public final t a(@Y61.k a.InterfaceC3494a.d dVar, @Y61.k a.InterfaceC3494a.d dVar2, @Y61.k a.InterfaceC3494a.d dVar3) {
        return new t(this.f94684a, dVar, dVar2, dVar3, this.f94685b);
    }
}
