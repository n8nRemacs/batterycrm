package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class jke extends fh6 {
    public final int X;
    public final int Y;
    public final Object d;
    public final qe7 o;

    public jke(jf7 jf7Var, Size size, qe7 qe7Var) {
        super(jf7Var);
        this.d = new Object();
        if (size == null) {
            this.X = this.b.getWidth();
            this.Y = this.b.getHeight();
        } else {
            this.X = size.getWidth();
            this.Y = size.getHeight();
        }
        this.o = qe7Var;
    }

    public final void d(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.X, this.Y)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.d) {
        }
    }

    @Override // defpackage.fh6, defpackage.jf7
    public final int getHeight() {
        return this.Y;
    }

    @Override // defpackage.fh6, defpackage.jf7
    public final qe7 getImageInfo() {
        return this.o;
    }

    @Override // defpackage.fh6, defpackage.jf7
    public final int getWidth() {
        return this.X;
    }
}
