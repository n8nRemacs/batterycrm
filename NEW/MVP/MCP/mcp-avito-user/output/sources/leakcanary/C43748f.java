package leakcanary;

import android.app.Application;
import java.util.concurrent.Executor;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import leakcanary.D;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.r;

/* compiled from: BackgroundTrigger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/f;", "", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: leakcanary.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43748f {

    /* renamed from: a, reason: collision with root package name */
    public volatile RealHeapAnalysisJob f414054a;

    /* renamed from: b, reason: collision with root package name */
    public final leakcanary.internal.c f414055b;

    /* renamed from: c, reason: collision with root package name */
    public final Application f414056c;

    /* renamed from: d, reason: collision with root package name */
    public final C43756n f414057d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f414058e;

    /* renamed from: f, reason: collision with root package name */
    public final Y41.l<r.a, G0> f414059f;

    public C43748f() {
        throw null;
    }

    public C43748f(Application application, C43756n c43756n, Executor executor, D d12, Y41.l lVar, int i12, C42822w c42822w) {
        d12 = (i12 & 8) != 0 ? D.b.f413987e : d12;
        lVar = (i12 & 16) != 0 ? C43745c.f414050l : lVar;
        this.f414056c = application;
        this.f414057d = c43756n;
        this.f414058e = executor;
        this.f414059f = lVar;
        this.f414055b = new leakcanary.internal.c(d12, new C43747e(this));
    }
}
