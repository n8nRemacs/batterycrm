package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import sA.InterfaceC48019a;
import uA.InterfaceC48870a;

/* compiled from: ProfileConstructorDataInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/domain/interactor/n;", "Lcom/avito/android/passport/profile_add/domain/interactor/m;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48019a f212343a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ProfileCreateExtendedFlow f212344b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r60.d f212345c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.p f212346d;

    @Inject
    public n(@Y61.k InterfaceC48019a interfaceC48019a, @Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow, @Y61.k r60.d dVar, @Y61.k com.avito.android.passport.profile_add.p pVar) {
        this.f212343a = interfaceC48019a;
        this.f212344b = profileCreateExtendedFlow;
        this.f212345c = dVar;
        this.f212346d = pVar;
    }

    @Override // com.avito.android.passport.profile_add.domain.interactor.m
    @Y61.l
    public final Object a(@Y61.k Continuation<? super TypedResult<InterfaceC48870a>> continuation) {
        ProfileCreateExtendedFlow profileCreateExtendedFlow = this.f212344b;
        String str = profileCreateExtendedFlow.f211170b;
        this.f212346d.getClass();
        return this.f212343a.a(this.f212345c.get(), str, profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.INN ? ((ProfileCreateExtendedFlow.Verification.INN) profileCreateExtendedFlow).f211179e : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.TinkoffID ? ((ProfileCreateExtendedFlow.Verification.TinkoffID) profileCreateExtendedFlow).f211183e : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.SberID ? ((ProfileCreateExtendedFlow.Verification.SberID) profileCreateExtendedFlow).f211181e : null, continuation);
    }
}
