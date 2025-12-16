package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class hvb extends w7i {
    public final String D0;
    public final GestureDetector E0;
    public gvb F0;
    public od7 G0;
    public boolean H0;
    public float I0;

    public hvb(Context context) {
        super(context);
        this.D0 = hvb.class.getName();
        GestureDetector gestureDetector = new GestureDetector(context, new kx0(12, this));
        this.E0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        hr6 hr6Var = new hr6(getResources());
        hr6Var.l = tyd.f;
        hr6Var.b = 0;
        setHierarchy(hr6Var.a());
    }

    private final c2c getControllerBuilder() {
        c2c c2cVarA = zk6.a.a();
        od7 od7Var = this.G0;
        c2cVarA.g = od7Var != null && od7Var.e;
        Uri uri = od7Var != null ? od7Var.b : null;
        if (uri != null) {
            sf7 sf7VarD = sf7.d(uri);
            float f = this.I0;
            if (f == 90.0f) {
                sf7VarD.e = new ysd((int) f, false);
            }
            c2cVarA.b = sf7VarD.a();
        } else {
            c2cVarA.b = null;
        }
        c2cVarA.h = true;
        c2cVarA.i = getController();
        return c2cVarA;
    }

    @Override // defpackage.w7i
    public final void g(Throwable th) {
        super.g(th);
        this.H0 = true;
        wqi.e(this.D0, "Set photo attach failed", th);
        gvb gvbVar = this.F0;
        if (gvbVar != null) {
            gvbVar.E();
        }
    }

    public final boolean getFailure() {
        return this.H0;
    }

    public final float getImageRotation() {
        return this.I0;
    }

    @Override // defpackage.w7i
    public final void h(pe7 pe7Var) {
        super.h(pe7Var);
        this.H0 = false;
        gvb gvbVar = this.F0;
        if (gvbVar != null) {
            gvbVar.k();
        }
    }

    public final void k(od7 od7Var, boolean z) {
        boolean z2 = !od7Var.equals(this.G0) || z;
        this.G0 = od7Var;
        this.H0 = false;
        if (z2) {
            c2c controllerBuilder = getControllerBuilder();
            Uri uri = od7Var.h;
            if (uri != null) {
                sf7 sf7VarD = sf7.d(uri);
                if (this.I0 == 90.0f) {
                    sf7VarD.e = new ysd((int) getRotation(), false);
                }
                controllerBuilder.c = sf7VarD.a();
            }
            rf7 rf7Var = controllerBuilder.b;
            setController(controllerBuilder.a());
        }
    }

    @Override // defpackage.w7i, defpackage.o45, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.E0.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void setImageRotation(float f) {
        this.I0 = f;
    }

    public final void setListener(gvb gvbVar) {
        this.F0 = gvbVar;
    }
}
