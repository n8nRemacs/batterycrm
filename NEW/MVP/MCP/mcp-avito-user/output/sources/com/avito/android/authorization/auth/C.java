package com.avito.android.authorization.auth;

import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.Metadata;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class C<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f92848b;

    public C(A a12) {
        this.f92848b = a12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        A a12 = this.f92848b;
        a12.f92781j.c(new he.m());
        AuthFragment authFragment = a12.f92788q;
        if (authFragment != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = authFragment.f92820D0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, new CodeCheckLink(CodeCheckLink.Flow.Registration.f119255b, null, 2, null), "auth.codecheck.reg", null, 4);
        }
    }
}
