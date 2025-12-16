package com.avito.android.authorization.auth;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class L extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f92864l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AuthFragment f92865m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(A a12, AuthFragment authFragment) {
        super(0);
        this.f92864l = a12;
        this.f92865m = authFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        FastLoginState fastLoginState = FastLoginState.f92853c;
        A a12 = this.f92864l;
        a12.f92792u = fastLoginState;
        a12.l(this.f92865m);
        return G0.f406611a;
    }
}
