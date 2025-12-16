package com.avito.android.analytics.screens.utils;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;

/* compiled from: ObservableTracker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "Lcom/avito/android/util/P2;", "T", "Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f90994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f90995c;

    public r(ScreenPerformanceTracker screenPerformanceTracker, String str) {
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        this.f90994b = screenPerformanceTracker;
        this.f90995c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f90994b.s(this.f90995c, ScreenPerformanceTracker.LoadingType.f90785b);
    }
}
