package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class vq8 extends Drawable.ConstantState {
    public xse a;
    public ca5 b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public Rect g;
    public final float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public int p;
    public final Paint.Style q;

    public vq8(xse xseVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = xseVar;
        this.b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        wq8 wq8Var = new wq8(this);
        wq8Var.o = true;
        return wq8Var;
    }

    public vq8(vq8 vq8Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = vq8Var.a;
        this.b = vq8Var.b;
        this.j = vq8Var.j;
        this.c = vq8Var.c;
        this.d = vq8Var.d;
        this.f = vq8Var.f;
        this.e = vq8Var.e;
        this.k = vq8Var.k;
        this.h = vq8Var.h;
        this.p = vq8Var.p;
        this.n = vq8Var.n;
        this.i = vq8Var.i;
        this.l = vq8Var.l;
        this.m = vq8Var.m;
        this.o = vq8Var.o;
        this.q = vq8Var.q;
        if (vq8Var.g != null) {
            this.g = new Rect(vq8Var.g);
        }
    }
}
