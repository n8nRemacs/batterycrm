package com.avito.android.analytics.screens.utils;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObservableTracker.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f90990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f90991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker.LoadingType f90992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f90993e;

    public q(ScreenPerformanceTracker screenPerformanceTracker, String str, ScreenPerformanceTracker.LoadingType loadingType, Y41.l<? super Throwable, G0> lVar) {
        this.f90990b = screenPerformanceTracker;
        this.f90991c = str;
        this.f90992d = loadingType;
        this.f90993e = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, java.lang.Object] */
    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        J.a aVar = new J.a(th2);
        p pVar = new p(this.f90993e, th2);
        D.d(this.f90990b, this.f90991c, aVar, this.f90992d, pVar);
    }
}
