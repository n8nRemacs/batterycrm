package com.google.android.play.core.appupdate;

import android.content.Context;
import j.N;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: com.google.android.play.core.appupdate.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37096c {
    @N
    public static InterfaceC37095b a(@N Context context) {
        InterfaceC37098e interfaceC37098e;
        synchronized (h.class) {
            try {
                if (h.f358014a == null) {
                    new g(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    h.f358014a = new E(new n(context), null);
                }
                interfaceC37098e = h.f358014a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (InterfaceC37095b) ((E) interfaceC37098e).f358004e.zza();
    }
}
