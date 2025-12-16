package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import j.B;
import j.N;
import j.P;
import j.k0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFutureTarget.java */
/* loaded from: classes5.dex */
public class e<R> implements c<R>, f<R> {

    /* renamed from: b, reason: collision with root package name */
    @B
    @P
    public R f339558b;

    /* renamed from: c, reason: collision with root package name */
    @B
    @P
    public i f339559c;

    /* compiled from: RequestFutureTarget.java */
    @k0
    public static class a {
    }

    static {
        new a();
    }

    @Override // com.bumptech.glide.request.target.q
    @P
    public final synchronized d a() {
        return this.f339559c;
    }

    @Override // com.bumptech.glide.request.target.q
    public final synchronized void c(@N R r12, @P com.bumptech.glide.request.transition.f<? super R> fVar) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        synchronized (this) {
            synchronized (this) {
            }
            return false;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.f
    public final synchronized boolean d(@P GlideException glideException) {
        throw null;
    }

    @Override // com.bumptech.glide.request.target.q
    public final synchronized void f(@P i iVar) {
        this.f339559c = iVar;
    }

    @Override // com.bumptech.glide.request.target.q
    public final synchronized void g(@P Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        try {
            l(null);
            throw null;
        } catch (TimeoutException e12) {
            throw new AssertionError(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.f
    public final synchronized boolean i(Object obj) {
        this.f339558b = obj;
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return true;
    }

    @Override // com.bumptech.glide.request.target.q
    public final void j(@N i iVar) {
        iVar.c(0, 0);
    }

    public final synchronized R l(Long l12) {
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j12, @N TimeUnit timeUnit) {
        l(Long.valueOf(timeUnit.toMillis(j12)));
        throw null;
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
    }

    @Override // com.bumptech.glide.request.target.q
    public final void b(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.q
    public final void h(@N i iVar) {
    }

    @Override // com.bumptech.glide.request.target.q
    public final void k(@P Drawable drawable) {
    }
}
