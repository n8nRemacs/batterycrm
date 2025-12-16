package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* renamed from: com.google.android.gms.tasks.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37028k<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final P f355672a = new P();

    public C37028k() {
    }

    public final void a(@j.N Exception exc) {
        this.f355672a.u(exc);
    }

    public final void b(@j.P TResult tresult) {
        this.f355672a.v(tresult);
    }

    public final boolean c(@j.N Exception exc) {
        P p12 = this.f355672a;
        p12.getClass();
        C36729v.k(exc, "Exception must not be null");
        synchronized (p12.f355659a) {
            try {
                if (p12.f355661c) {
                    return false;
                }
                p12.f355661c = true;
                p12.f355664f = exc;
                p12.f355660b.b(p12);
                return true;
            } finally {
            }
        }
    }

    public final boolean d(@j.P TResult tresult) {
        return this.f355672a.x(tresult);
    }

    public C37028k(@j.N AbstractC37018a abstractC37018a) {
        abstractC37018a.b(new L(this));
    }
}
