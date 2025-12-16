package defpackage;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class te0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public te0(BackEvent backEvent) {
        kl klVar = kl.a;
        float fD = klVar.d(backEvent);
        float fE = klVar.e(backEvent);
        float fB = klVar.b(backEvent);
        int iC = klVar.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return xc0.h(sb, this.d, '}');
    }
}
