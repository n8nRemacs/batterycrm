package com.avito.android.analytics.coverage;

import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Handlers.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/S1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f89859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScreenCoverageEvent f89860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f89861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f89862e;

    public b(a aVar, ScreenCoverageEvent screenCoverageEvent, boolean z12, String str) {
        this.f89859b = aVar;
        this.f89860c = screenCoverageEvent;
        this.f89861d = z12;
        this.f89862e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f89859b.f89856a.get().c(this.f89860c);
        if (this.f89861d) {
            V2.f318762a.c("PerfCoverage", AK.c.s(new StringBuilder("tracked "), this.f89862e, " as screen not covered with performance metrics"), null);
        }
    }
}
