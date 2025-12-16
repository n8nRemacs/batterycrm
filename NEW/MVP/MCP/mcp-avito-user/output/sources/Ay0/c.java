package aY0;

import android.content.Context;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f20922b = new c();

    /* renamed from: a, reason: collision with root package name */
    @P
    public C19842b f20923a = null;

    @N
    @RX0.a
    public static C19842b a(@N Context context) {
        C19842b c19842b;
        c cVar = f20922b;
        synchronized (cVar) {
            try {
                if (cVar.f20923a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f20923a = new C19842b(context);
                }
                c19842b = cVar.f20923a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c19842b;
    }
}
