package com.avito.android.analytics.screens.tracker.trace;

import Y61.k;
import android.os.Trace;
import com.avito.android.util.V2;
import j.X;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ScreenSystemTracingTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/trace/d;", "Lcom/avito/android/analytics/screens/tracker/trace/c;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f90917a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f90918b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f90919c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f90920d;

    public d(@k String str, @k g gVar, @k String str2) {
        this.f90917a = str;
        this.f90918b = gVar;
        this.f90919c = str2;
    }

    public final String b() {
        return "avito-perf " + this.f90917a + ' ' + this.f90918b.f90922a + ' ' + this.f90919c;
    }

    @Override // com.avito.android.analytics.screens.tracker.trace.c
    public final void h() {
        String strB = b();
        V2.f318762a.c("AvitoSystemTracingTracker", "Track recording trace for " + strB, null);
        Trace.endAsyncSection(b(), 0);
    }

    @Override // com.avito.android.analytics.screens.tracker.X
    public final void start() {
        String strB = b();
        synchronized (this) {
            if (this.f90920d) {
                V2.f318762a.c("AvitoSystemTracingTracker", "Tracing for " + strB + " called second time", null);
                return;
            }
            this.f90920d = true;
            G0 g02 = G0.f406611a;
            V2.f318762a.c("AvitoSystemTracingTracker", "Start recording trace for " + strB, null);
            Trace.beginAsyncSection(strB, 0);
        }
    }
}
