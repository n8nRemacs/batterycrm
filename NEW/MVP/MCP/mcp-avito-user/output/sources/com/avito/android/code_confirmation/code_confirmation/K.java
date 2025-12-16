package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class K<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f119419b;

    public K(T t12) {
        this.f119419b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T t12 = this.f119419b;
        f0 f0Var = t12.f119452m;
        if (f0Var != null) {
            f0Var.h();
        }
        ScreenPerformanceTracker.a.b(t12.f119451l, "requestCode", 2);
    }
}
