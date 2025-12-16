package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcl;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class G2<V> extends FutureTask<V> implements Comparable<G2<V>> {

    /* renamed from: b, reason: collision with root package name */
    public final long f354684b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f354685c;

    /* renamed from: d, reason: collision with root package name */
    public final String f354686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A2 f354687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G2(A2 a22, Runnable runnable, boolean z12, String str) {
        super(zzcl.zza().zza(runnable), null);
        this.f354687e = a22;
        long andIncrement = A2.f354510k.getAndIncrement();
        this.f354684b = andIncrement;
        this.f354686d = str;
        this.f354685c = z12;
        if (andIncrement == Long.MAX_VALUE) {
            a22.zzj().f354889f.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@j.N Object obj) {
        G2 g22 = (G2) obj;
        boolean z12 = g22.f354685c;
        boolean z13 = this.f354685c;
        if (z13 != z12) {
            return z13 ? -1 : 1;
        }
        long j12 = g22.f354684b;
        long j13 = this.f354684b;
        if (j13 < j12) {
            return -1;
        }
        if (j13 > j12) {
            return 1;
        }
        this.f354687e.zzj().f354890g.c("Two tasks share the same index. index", Long.valueOf(j13));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f354687e.zzj().f354889f.c(this.f354686d, th2);
        if ((th2 instanceof D2) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G2(A2 a22, Callable callable, boolean z12) {
        super(zzcl.zza().zza(callable));
        this.f354687e = a22;
        long andIncrement = A2.f354510k.getAndIncrement();
        this.f354684b = andIncrement;
        this.f354686d = "Task exception on worker thread";
        this.f354685c = z12;
        if (andIncrement == Long.MAX_VALUE) {
            a22.zzj().f354889f.b("Tasks index overflow");
        }
    }
}
