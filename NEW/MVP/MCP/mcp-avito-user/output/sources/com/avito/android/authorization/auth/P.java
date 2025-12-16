package com.avito.android.authorization.auth;

import com.avito.android.authorization.auth.g0;
import kotlin.Metadata;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class P<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f92872b;

    public P(A a12) {
        this.f92872b = a12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        A a12 = this.f92872b;
        h0 h0Var = a12.f92787p;
        if (h0Var != null) {
            g0.a.a(h0Var, a12.f92777f.c(th2), null, th2, 2);
        }
    }
}
