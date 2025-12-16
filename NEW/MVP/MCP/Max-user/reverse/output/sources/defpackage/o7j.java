package defpackage;

import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class o7j {
    public static float a(float f, float f2, float f3) {
        float f4 = f / (f3 / 2.0f);
        float f5 = f2 / 2.0f;
        if (f4 < 1.0f) {
            return (f5 * f4 * f4 * f4) + 0.0f;
        }
        float f6 = f4 - 2.0f;
        return (((f6 * f6 * f6) + 2.0f) * f5) + 0.0f;
    }

    public static final void b(esg esgVar) {
        esgVar.d(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, new cya(19));
        esgVar.d(482, new cya(20));
    }
}
