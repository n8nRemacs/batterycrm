package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class p8f extends Drawable.ConstantState {
    public final nb5 a;
    public int b;
    public final ka5 c;

    public p8f(nb5 nb5Var, int i, ka5 ka5Var) {
        this.a = nb5Var;
        this.b = i;
        this.c = ka5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8f)) {
            return false;
        }
        p8f p8fVar = (p8f) obj;
        return fni.a(this.a, p8fVar.a) && this.b == p8fVar.b && fni.a(this.c, p8fVar.c);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(0, xrf.k(0, xrf.k(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new o8f(this);
    }

    public final String toString() {
        return "SpriteEmojiDrawableState(location=" + this.a + ", size=" + this.b + ", paddingHorizontal=0, paddingVertical=0, bitmapResolver=" + this.c + ")";
    }
}
