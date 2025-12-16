package defpackage;

import android.graphics.drawable.Drawable;
import java.io.Closeable;
import java.io.IOException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class ok4 extends pk4 implements wc3, u6g {
    public boolean X;
    public final ContextScope Y;
    public Drawable d;
    public final mcf o;

    public ok4(Drawable drawable, mcf mcfVar, wl8 wl8Var) {
        this.d = drawable;
        this.o = mcfVar;
        ContextScope contextScopeA = d7j.a(wl8Var);
        this.Y = contextScopeA;
        gw0.w(new g56(mcfVar, new zr0(2, this, ok4.class, "onThemeChanged", "onThemeChanged(Lone/me/sdk/design/OneMeTheme;)V", 4, 18), 1), contextScopeA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wc3
    public final Drawable F() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return null;
        }
        Drawable drawableMutate = drawable.mutate();
        if (drawableMutate != drawable) {
            drawableMutate.setBounds(drawable.getBounds());
        }
        if (drawableMutate instanceof u6g) {
            ((u6g) drawableMutate).onThemeChanged((yeb) this.o.getValue());
        }
        return drawableMutate;
    }

    @Override // defpackage.sc3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        d7j.c(this.Y, null);
        Object obj = this.d;
        Closeable closeable = obj instanceof Closeable ? (Closeable) obj : null;
        if (closeable != null) {
            closeable.close();
        }
        this.d = null;
        this.X = true;
    }

    @Override // defpackage.sc3, defpackage.pe7
    public final int getHeight() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.sc3
    public final int getSizeInBytes() {
        return getHeight() * getWidth() * 4;
    }

    @Override // defpackage.sc3, defpackage.pe7
    public final int getWidth() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.sc3
    public final boolean isClosed() {
        return this.X;
    }

    @Override // defpackage.gj0, defpackage.sc3
    public final boolean isStateful() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Object obj = this.d;
        u6g u6gVar = obj instanceof u6g ? (u6g) obj : null;
        if (u6gVar != null) {
            u6gVar.onThemeChanged(yebVar);
        }
    }
}
