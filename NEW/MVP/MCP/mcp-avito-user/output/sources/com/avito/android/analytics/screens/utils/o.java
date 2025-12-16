package com.avito.android.analytics.screens.utils;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ObservableTracker.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "r", "Lkotlin/G0;", "accept", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f90982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f90983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker.LoadingType f90984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f90985e;

    /* compiled from: ObservableTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f90986l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T f90987m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l<? super T, G0> lVar, T t12) {
            super(0);
            this.f90986l = lVar;
            this.f90987m = t12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f90986l.invoke(this.f90987m);
            return G0.f406611a;
        }
    }

    public o(ScreenPerformanceTracker screenPerformanceTracker, String str, ScreenPerformanceTracker.LoadingType loadingType, Y41.l<? super T, G0> lVar) {
        this.f90982b = screenPerformanceTracker;
        this.f90983c = str;
        this.f90984d = loadingType;
        this.f90985e = lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, java.lang.Object] */
    @Override // l41.g
    public final void accept(@Y61.k T t12) {
        a aVar = new a(this.f90985e, t12);
        D.e(this.f90982b, this.f90983c, this.f90984d, aVar);
    }
}
