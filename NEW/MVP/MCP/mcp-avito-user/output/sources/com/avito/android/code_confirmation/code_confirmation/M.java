package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class M<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f119421b;

    public M(T t12) {
        this.f119421b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        J.a aVar = new J.a(th2);
        T t12 = this.f119421b;
        ScreenPerformanceTracker.a.d(t12.f119451l, "requestCode", null, aVar, null, 10);
        ScreenPerformanceTracker screenPerformanceTracker = t12.f119451l;
        screenPerformanceTracker.m("requestCode");
        T.g(t12, th2);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, "requestCode", aVar, null, 4);
    }
}
