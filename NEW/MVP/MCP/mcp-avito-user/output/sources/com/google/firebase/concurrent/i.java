package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes13.dex */
class i<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f360835j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ScheduledFuture<?> f360836i;

    /* compiled from: DelegatingScheduledFuture.java */
    public class a implements b<V> {
        public a() {
        }

        public final void a(V v12) {
            int i12 = i.f360835j;
            i.this.j(v12);
        }

        public final void b(Exception exc) {
            int i12 = i.f360835j;
            i.this.k(exc);
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    public interface b<T> {
    }

    /* compiled from: DelegatingScheduledFuture.java */
    public interface c<T> {
        ScheduledFuture a(a aVar);
    }

    public i(c<V> cVar) {
        this.f360836i = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    public final void b() {
        this.f360836i.cancel(l());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f360836i.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f360836i.getDelay(timeUnit);
    }
}
