package com.avito.android.analytics;

import com.avito.android.util.InterfaceC35881r2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TestEventTracker.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/analytics/m0;", "Lcom/avito/android/analytics/r;", "Lcom/avito/android/analytics/o;", "Lcom/avito/android/util/r2;", "<init>", "()V", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m0 implements r<InterfaceC28464o>, InterfaceC35881r2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35881r2.a f90229a = InterfaceC35881r2.a.f318986a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.observers.n<InterfaceC28464o> f90230b = new io.reactivex.rxjava3.observers.n<>();

    @Inject
    public m0() {
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final void a() {
        this.f90229a.getClass();
    }

    @Override // com.avito.android.analytics.r
    public final void c(@Y61.k InterfaceC28464o interfaceC28464o) {
        this.f90230b.onNext(interfaceC28464o);
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    public final io.reactivex.rxjava3.core.H h() {
        return io.reactivex.rxjava3.schedulers.b.f404944d;
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    public final Class<InterfaceC28464o> i() {
        return InterfaceC28464o.class;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    /* renamed from: isInitialized */
    public final boolean getF318637a() {
        this.f90229a.getClass();
        return true;
    }
}
