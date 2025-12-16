package com.avito.android.home;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TooltipObserver.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/home/H;", "Lcom/avito/android/home/G;", "Lcom/avito/android/home/B;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class H implements G, B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<TooltipVisibility> f162175a;

    public H() {
        io.reactivex.rxjava3.subjects.b<TooltipVisibility> bVarN0 = io.reactivex.rxjava3.subjects.b.N0();
        bVarN0.r0(TooltipVisibility.f162193c);
        this.f162175a = bVarN0;
    }

    @Override // com.avito.android.home.B
    public final void a(@Y61.k TooltipVisibility tooltipVisibility) {
        this.f162175a.onNext(tooltipVisibility);
    }
}
