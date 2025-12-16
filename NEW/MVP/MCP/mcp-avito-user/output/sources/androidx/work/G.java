package androidx.work;

import androidx.annotation.RestrictTo;

/* compiled from: Logger.java */
@RestrictTo
/* loaded from: classes10.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f55382a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f55383b;

    /* compiled from: Logger.java */
    public static class a extends G {
    }

    @j.N
    public static G a() {
        a aVar;
        synchronized (f55382a) {
            try {
                if (f55383b == null) {
                    f55383b = new a();
                }
                aVar = f55383b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @j.N
    public static String b(@j.N String str) {
        int length = str.length();
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(23, "WM-");
        if (length >= 20) {
            sbQ.append(str.substring(0, 20));
        } else {
            sbQ.append(str);
        }
        return sbQ.toString();
    }
}
