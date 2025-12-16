package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.C37028k;
import j.P;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public abstract class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @P
    public final C37028k f358046b;

    public t() {
        this.f358046b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e12) {
            C37028k c37028k = this.f358046b;
            if (c37028k != null) {
                c37028k.c(e12);
            }
        }
    }

    public t(@P C37028k c37028k) {
        this.f358046b = c37028k;
    }
}
