package com.google.android.play.core.integrity;

import android.content.Context;
import j.N;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
public class b {
    @N
    public static InterfaceC37198a a(Context context) {
        n nVar;
        synchronized (p.class) {
            try {
                if (p.f358577a == null) {
                    new l(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    p.f358577a = new n(context, null);
                }
                nVar = p.f358577a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (InterfaceC37198a) nVar.f358576c.a();
    }
}
