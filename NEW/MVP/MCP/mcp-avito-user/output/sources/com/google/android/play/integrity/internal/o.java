package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.C37028k;
import j.P;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
public abstract class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @P
    public final C37028k f358918b;

    public o() {
        this.f358918b = null;
    }

    public void a(Exception exc) {
        C37028k c37028k = this.f358918b;
        if (c37028k != null) {
            c37028k.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e12) {
            a(e12);
        }
    }

    public o(@P C37028k c37028k) {
        this.f358918b = c37028k;
    }
}
