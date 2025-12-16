package com.avito.android.analytics.screens.utils;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObservableTracker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"R", "Lcom/avito/android/util/P2;", "T", "r", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f91000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<P2.c, G0> f91002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y41.l<P2.b<Object>, G0> f91003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y41.l<P2.a, G0> f91004f;

    public u(ScreenPerformanceTracker screenPerformanceTracker, String str, Y41.l lVar, Y41.l lVar2, Y41.l lVar3) {
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        this.f91000b = screenPerformanceTracker;
        this.f91001c = str;
        this.f91002d = lVar;
        this.f91003e = lVar2;
        this.f91004f = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        String str = this.f91001c;
        ScreenPerformanceTracker screenPerformanceTracker = this.f91000b;
        if (z12) {
            D.e(screenPerformanceTracker, str, loadingType, new s(this.f91003e, p22));
        } else if (p22 instanceof P2.a) {
            D.d(screenPerformanceTracker, str, new J.a(((P2.a) p22).f318719a), loadingType, new t(this.f91004f, p22));
        } else if (p22 instanceof P2.c) {
            this.f91002d.invoke(p22);
        }
    }
}
