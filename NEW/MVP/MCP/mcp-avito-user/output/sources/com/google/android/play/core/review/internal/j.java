package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.C37028k;
import j.P;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
public abstract class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @P
    public final C37028k f358622b;

    public j() {
        this.f358622b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e12) {
            C37028k c37028k = this.f358622b;
            if (c37028k != null) {
                c37028k.c(e12);
            }
        }
    }

    public j(@P C37028k c37028k) {
        this.f358622b = c37028k;
    }
}
