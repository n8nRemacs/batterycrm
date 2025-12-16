package androidx.core.app;

import java.lang.reflect.Method;

/* compiled from: ActivityRecreator.java */
/* renamed from: androidx.core.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class RunnableC22749g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44528c;

    public RunnableC22749g(Object obj, Object obj2) {
        this.f44527b = obj;
        this.f44528c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C22750h.f44532d;
            Object obj = this.f44528c;
            Object obj2 = this.f44527b;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C22750h.f44533e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e12) {
            if (e12.getClass() == RuntimeException.class && e12.getMessage() != null && e12.getMessage().startsWith("Unable to stop")) {
                throw e12;
            }
        } catch (Throwable unused) {
        }
    }
}
