package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class gxa extends Drawable {
    public final Context a;
    public final nxa b = kxa.a;
    public final String c = gxa.class.getName();
    public final m45 d;
    public int e;
    public final rpd f;
    public final md0 g;
    public String h;
    public rf7 i;
    public final int j;

    public gxa(Context context) {
        this.a = context;
        hr6 hr6Var = new hr6(context.getResources());
        hr6Var.b = 0;
        m45 m45Var = new m45(hr6Var.a());
        qsd qsdVarD = m45Var.d();
        if (qsdVarD != null) {
            qsdVarD.setCallback(new sf(4, this));
        }
        this.d = m45Var;
        this.e = 1;
        rpd rpdVar = new rpd();
        this.f = rpdVar;
        md0 md0Var = new md0(1, this);
        this.g = md0Var;
        this.j = kti.d(32 * vw4.d().getDisplayMetrics().density);
        c2c c2cVarA = zk6.a.a();
        c2cVarA.d = rpdVar;
        c2cVarA.e = md0Var;
        c2cVarA.i = m45Var.e;
        c2cVarA.h = true;
        m45Var.i(c2cVarA.a());
    }

    public final void a(rf7 rf7Var) throws NumberFormatException {
        int iD;
        m45 m45Var = this.d;
        if (rf7Var == null) {
            m45Var.i(null);
        } else {
            boolean zIsEmpty = getBounds().isEmpty();
            int iD2 = this.j;
            if (zIsEmpty) {
                iD = iD2;
            } else if (getBounds().width() < getBounds().height()) {
                int iWidth = getBounds().width();
                if (iWidth >= iD2) {
                    iD2 = iWidth;
                }
                iD = kti.d((iD2 / getBounds().width()) * getBounds().height());
            } else {
                int iHeight = getBounds().height();
                if (iHeight >= iD2) {
                    iD2 = iHeight;
                }
                int i = iD2;
                iD2 = kti.d((iD2 / getBounds().height()) * getBounds().width());
                iD = i;
            }
            nc0 nc0Var = hxa.a;
            Uri uri = rf7Var.b;
            ynd yndVar = (iD2 <= 0 || iD <= 0) ? null : new ynd(iD2, iD);
            sf7 sf7VarD = sf7.d(uri);
            sf7VarD.g = pf7.b;
            sf7VarD.k = hxa.a(this.b);
            if (yndVar != null) {
                sf7VarD.d = yndVar;
            }
            sf7VarD.j = m9c.c;
            rf7 rf7VarA = sf7VarD.a();
            df7 df7VarE = zk6.e();
            df7VarE.getClass();
            cf7 cf7Var = new cf7(df7VarE, rf7VarA, null);
            rpd rpdVar = this.f;
            rpdVar.a(cf7Var);
            if (m45Var.e == null) {
                c2c c2cVarA = zk6.a.a();
                c2cVarA.d = rpdVar;
                c2cVarA.e = this.g;
                c2cVarA.i = m45Var.e;
                c2cVarA.h = true;
                m45Var.i(c2cVarA.a());
            }
        }
        invalidateSelf();
    }

    public final void b(mc0 mc0Var, String str) {
        rf7 rf7VarB;
        boolean zA = fni.a(this.h, str);
        nxa nxaVar = this.b;
        m45 m45Var = this.d;
        if (!zA) {
            this.h = str;
            if (str == null || str.length() == 0) {
                rf7VarB = null;
            } else {
                nc0 nc0Var = hxa.a;
                rf7VarB = hxa.b(str, nxaVar);
            }
            this.i = rf7VarB;
            if (rf7VarB != null) {
                m45Var.f();
            } else {
                m45Var.g();
            }
            a(this.i);
            invalidateSelf();
        }
        if (mc0Var != null && mc0Var != mc0.c && (mc0Var.a != 0 || mc0Var.b.length() != 0)) {
            v1a v1aVar = a93.s0;
            Context context = this.a;
            lc0 lc0Var = new lc0(context, nxaVar, mc0Var, v1aVar.x(context).k());
            l45 l45Var = m45Var.d;
            l45Var.getClass();
            ((gr6) l45Var).i(lc0Var, 1);
            this.e = 3;
        } else if (this.e == 3) {
            l45 l45Var2 = m45Var.d;
            l45Var2.getClass();
            ((gr6) l45Var2).i(null, 1);
            this.e = 1;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        qsd qsdVarD = this.d.d();
        if (qsdVarD != null) {
            Drawable.Callback callback = qsdVarD.getCallback();
            qsdVarD.setCallback(null);
            qsdVarD.draw(canvas);
            qsdVarD.setCallback(callback);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxa)) {
            return false;
        }
        gxa gxaVar = (gxa) obj;
        return fni.a(this.b, gxaVar.b) && fni.a(this.h, gxaVar.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        qsd qsdVarD = this.d.d();
        return qsdVarD != null ? qsdVarD.getAlpha() : super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        this.d.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.d.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) throws NumberFormatException {
        super.onBoundsChange(rect);
        qsd qsdVarD = this.d.d();
        if (qsdVarD != null) {
            Drawable.Callback callback = qsdVarD.getCallback();
            qsdVarD.setCallback(null);
            qsdVarD.setBounds(0, 0, rect.width(), rect.height());
            qsdVarD.setCallback(callback);
        }
        a(this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        qsd qsdVarD = this.d.d();
        if (qsdVarD != null) {
            qsdVarD.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        qsd qsdVarD = this.d.d();
        if (qsdVarD != null) {
            qsdVarD.setColorFilter(colorFilter);
        }
    }
}
