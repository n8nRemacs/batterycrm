package com.avito.android.analytics.coverage;

import Y61.k;
import android.os.Handler;
import android.os.SystemClock;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.coverage.ScreenCoverageEvent;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PerfScreenCoverageTracker.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/coverage/a;", "", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C2667a f89855d = new C2667a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC28373a> f89856a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Handler f89857b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashSet f89858c = new LinkedHashSet();

    /* compiled from: PerfScreenCoverageTracker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/analytics/coverage/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "delay", "J", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.coverage.a$a, reason: collision with other inner class name */
    public static final class C2667a {
        public /* synthetic */ C2667a(C42822w c42822w) {
            this();
        }

        public C2667a() {
        }
    }

    @Inject
    public a(@k h31.e<InterfaceC28373a> eVar, @k Handler handler) {
        this.f89856a = eVar;
        this.f89857b = handler;
    }

    public final void a(Object obj, r rVar) {
        boolean z12 = obj instanceof InterfaceC28477j.b;
        String str = rVar.f90695b;
        if (z12 && (obj instanceof InterfaceC28477j.a)) {
            throw new IllegalStateException(androidx.appcompat.app.r.q(str, " is marked both as Trackable and NonTrackable simultaneously"));
        }
        ScreenCoverageEvent.ScreenType screenType = z12 ? ScreenCoverageEvent.ScreenType.f89849c : obj instanceof InterfaceC28477j.a ? ScreenCoverageEvent.ScreenType.f89850d : ScreenCoverageEvent.ScreenType.f89851e;
        this.f89857b.postAtTime(new b(this, new ScreenCoverageEvent(rVar.f90694a, null, screenType), screenType != ScreenCoverageEvent.ScreenType.f89850d, str), str, SystemClock.uptimeMillis() + 30000);
    }
}
