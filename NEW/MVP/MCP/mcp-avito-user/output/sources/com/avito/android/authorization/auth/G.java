package com.avito.android.authorization.auth;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasSuggests", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class G extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AuthFragment f92857l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(AuthFragment authFragment) {
        super(1);
        this.f92857l = authFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        if (bool.booleanValue()) {
            AuthFragment authFragment = this.f92857l;
            authFragment.E5();
            authFragment.f92827K0.b(G0.f406611a);
        }
        return G0.f406611a;
    }
}
