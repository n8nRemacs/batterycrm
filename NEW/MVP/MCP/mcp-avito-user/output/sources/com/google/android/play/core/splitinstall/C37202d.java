package com.google.android.play.core.splitinstall;

import android.content.Context;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37202d {
    @j.N
    public static InterfaceC37201c a(@j.N Context context) {
        d0 d0Var;
        synchronized (i0.class) {
            try {
                if (i0.f358733a == null) {
                    new Q(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    i0.f358733a = new T(new C37234k(context), null);
                }
                d0Var = i0.f358733a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (InterfaceC37201c) ((T) d0Var).f358700i.zza();
    }
}
