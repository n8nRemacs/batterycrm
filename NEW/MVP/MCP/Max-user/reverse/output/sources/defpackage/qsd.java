package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class qsd extends ch6 {
    public m45 X;
    public Drawable o;

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            m45 m45Var = this.X;
            if (m45Var != null && !m45Var.a) {
                op5.j(k45.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(m45Var)), Integer.valueOf(System.identityHashCode(m45Var.e)), m45Var.toString());
                m45Var.b = true;
                m45Var.c = true;
                m45Var.b();
            }
            super.draw(canvas);
            Drawable drawable = this.o;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.o.draw(canvas);
            }
        }
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        m45 m45Var = this.X;
        if (m45Var != null) {
            m45Var.h(z);
        }
        return super.setVisible(z, z2);
    }
}
