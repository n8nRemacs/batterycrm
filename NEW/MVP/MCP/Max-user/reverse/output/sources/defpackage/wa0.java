package defpackage;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
public final class wa0 {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public wa0(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wa0) {
            wa0 wa0Var = (wa0) obj;
            if (this.a.equals(wa0Var.a) && this.b == wa0Var.b && this.c == wa0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return ho7.j(sb, this.c, "}");
    }
}
