package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public abstract class t0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final C37028k f358798b;

    public t0() {
        this.f358798b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e12) {
            C37028k c37028k = this.f358798b;
            if (c37028k != null) {
                c37028k.c(e12);
            }
        }
    }

    public t0(@j.P C37028k c37028k) {
        this.f358798b = c37028k;
    }
}
