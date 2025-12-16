package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public abstract class G implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final C37028k f358346b;

    public G() {
        this.f358346b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e12) {
            C37028k c37028k = this.f358346b;
            if (c37028k != null) {
                c37028k.c(e12);
            }
        }
    }

    public G(@j.P C37028k c37028k) {
        this.f358346b = c37028k;
    }
}
