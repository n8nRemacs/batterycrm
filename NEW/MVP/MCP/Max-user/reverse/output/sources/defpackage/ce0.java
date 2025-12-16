package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import ru.ok.messages.views.widgets.TamAvatarView;

/* loaded from: classes2.dex */
public abstract class ce0 extends View {
    public m45 a;
    public Drawable b;
    public ed0 c;
    public f7b d;
    public ve2 o;
    public zd0 s0;
    public pe8 t0;
    public f8c u0;
    public boolean v0;

    static {
        Math.round(Resources.getSystem().getDisplayMetrics().density * 40.0f);
    }

    public final void a(ku3 ku3Var) throws NumberFormatException {
        Drawable drawableB;
        rf7 rf7VarA;
        pe8 pe8Var = this.t0;
        int i = this.u0.a(ku3Var.p()).a != 40 ? 0 : ((TamAvatarView) this).v0 ? ivd.o1 : ivd.n1;
        if (i == 0) {
            drawableB = null;
        } else {
            drawableB = r34.b(getContext(), i);
            b(drawableB);
        }
        this.b = drawableB;
        ed0 ed0Var = new ed0(this.d, this.o, this.s0, ku3Var);
        this.c = ed0Var;
        m45 m45Var = this.a;
        if (m45Var != null) {
            l45 l45Var = m45Var.d;
            l45Var.getClass();
            ((gr6) l45Var).i(ed0Var.c(getContext()), 1);
        }
        m45 m45Var2 = this.a;
        Uri uriB = this.c.b(pe8Var.n());
        if (uriB == null || l8g.c(uriB.getPath())) {
            rf7VarA = null;
        } else {
            sf7 sf7VarD = sf7.d(uriB);
            sf7VarD.g = pf7.a;
            sf7VarD.k = getPostprocessor();
            rf7VarA = sf7VarD.a();
            zk6.e().e(rf7VarA, null);
        }
        c2c c2cVarA = zk6.a.a();
        c2cVarA.i = m45Var2.e;
        c2cVarA.h = true;
        if (rf7VarA != null) {
            c2cVarA.b = rf7VarA;
        }
        if (rf7VarA == null) {
            m45Var2.i(null);
        } else {
            m45Var2.i(c2cVarA.a());
        }
    }

    public abstract void b(Drawable drawable);

    public m45 getDraweeHolder() {
        return this.a;
    }

    public Drawable getForegroundCompat() {
        return getForeground();
    }

    public y6c getPostprocessor() {
        return new qkb();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m45 m45Var = this.a;
        if (m45Var != null) {
            m45Var.f();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m45 m45Var = this.a;
        if (m45Var != null) {
            m45Var.g();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        qsd qsdVarD = this.a.d();
        try {
            qsdVarD.setBounds(0, 0, width, height);
            qsdVarD.draw(canvas);
        } catch (Throwable th) {
            wqi.e("ce0", "failure to onDraw", th);
        }
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m45 m45Var = this.a;
        if (m45Var != null) {
            m45Var.f();
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m45 m45Var = this.a;
        if (m45Var != null) {
            m45Var.g();
        }
    }

    public void setForegroundCompat(Drawable drawable) {
        setForeground(drawable);
    }

    public void setSmallOnlineImage(boolean z) {
        this.v0 = z;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        m45 m45Var = this.a;
        if (m45Var == null || m45Var.d() != drawable) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
