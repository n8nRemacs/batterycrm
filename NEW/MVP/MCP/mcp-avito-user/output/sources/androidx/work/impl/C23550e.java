package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.core.os.C22783k;

/* compiled from: DefaultRunnableScheduler.java */
@RestrictTo
/* renamed from: androidx.work.impl.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23550e implements androidx.work.V {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f55734a = C22783k.a(Looper.getMainLooper());

    @Override // androidx.work.V
    public final void a(long j12, @j.N Runnable runnable) {
        this.f55734a.postDelayed(runnable, j12);
    }

    @Override // androidx.work.V
    public final void b(@j.N Runnable runnable) {
        this.f55734a.removeCallbacks(runnable);
    }
}
