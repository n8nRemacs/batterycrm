package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* renamed from: com.google.android.gms.tasks.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37036t<T> implements InterfaceC37035s<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Object f355677b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final int f355678c;

    /* renamed from: d, reason: collision with root package name */
    public final P f355679d;

    /* renamed from: e, reason: collision with root package name */
    public int f355680e;

    /* renamed from: f, reason: collision with root package name */
    public int f355681f;

    /* renamed from: g, reason: collision with root package name */
    public int f355682g;

    /* renamed from: h, reason: collision with root package name */
    public Exception f355683h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f355684i;

    public C37036t(int i12, P p12) {
        this.f355678c = i12;
        this.f355679d = p12;
    }

    public final void a() {
        int i12 = this.f355680e + this.f355681f + this.f355682g;
        int i13 = this.f355678c;
        if (i12 == i13) {
            Exception exc = this.f355683h;
            P p12 = this.f355679d;
            if (exc == null) {
                if (this.f355684i) {
                    p12.w();
                    return;
                } else {
                    p12.v(null);
                    return;
                }
            }
            p12.u(new ExecutionException(this.f355681f + " out of " + i13 + " underlying tasks failed", this.f355683h));
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37021d
    public final void onCanceled() {
        synchronized (this.f355677b) {
            this.f355682g++;
            this.f355684i = true;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public final void onFailure(@j.N Exception exc) {
        synchronized (this.f355677b) {
            this.f355681f++;
            this.f355683h = exc;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public final void onSuccess(T t12) {
        synchronized (this.f355677b) {
            this.f355680e++;
            a();
        }
    }
}
