package com.avito.android.analytics.screens.utils;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObservableTracker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "Lcom/avito/android/util/P2;", "T", "", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class w<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f91007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Throwable, G0> f91009d;

    public w(ScreenPerformanceTracker screenPerformanceTracker, String str, Y41.l lVar) {
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        this.f91007b = screenPerformanceTracker;
        this.f91008c = str;
        this.f91009d = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        J.a aVar = new J.a(th2);
        v vVar = new v(this.f91009d, th2);
        D.d(this.f91007b, this.f91008c, aVar, ScreenPerformanceTracker.LoadingType.f90785b, vVar);
    }
}
