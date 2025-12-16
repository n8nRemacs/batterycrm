package com.avito.android.login_suggests_impl;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;

/* compiled from: LoginSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f182947b;

    public s(t tVar) {
        this.f182947b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        t tVar = this.f182947b;
        ScreenPerformanceTracker.a.d(tVar.f182953f, null, null, new J.a((Throwable) obj), null, 11);
        LoginSuggestsActivity loginSuggestsActivity = tVar.f182956i;
        if (loginSuggestsActivity != null) {
            loginSuggestsActivity.a2();
        }
    }
}
