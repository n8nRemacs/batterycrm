package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class pz4 extends FrameLayout {
    public zg a;
    public final AppCompatTextView b;
    public final ShapeDrawable c;
    public final bt d;
    public xt4 o;

    public pz4(Context context, int i) {
        super(context);
        rw4 rw4VarA = rw4.a();
        Resources resources = context.getResources();
        bt btVar = new bt();
        btVar.addFrame(resources.getDrawable(ivd.s1), 50);
        btVar.addFrame(resources.getDrawable(ivd.z1), 50);
        btVar.addFrame(resources.getDrawable(ivd.A1), 50);
        btVar.addFrame(resources.getDrawable(ivd.B1), 50);
        btVar.addFrame(resources.getDrawable(ivd.C1), 50);
        btVar.addFrame(resources.getDrawable(ivd.D1), 50);
        btVar.addFrame(resources.getDrawable(ivd.E1), 50);
        btVar.addFrame(resources.getDrawable(ivd.F1), 50);
        btVar.addFrame(resources.getDrawable(ivd.G1), 50);
        btVar.addFrame(resources.getDrawable(ivd.t1), 50);
        btVar.addFrame(resources.getDrawable(ivd.u1), 50);
        btVar.addFrame(resources.getDrawable(ivd.v1), 50);
        btVar.addFrame(resources.getDrawable(ivd.w1), 50);
        btVar.addFrame(resources.getDrawable(ivd.x1), 50);
        btVar.addFrame(resources.getDrawable(ivd.y1), 50);
        this.d = btVar;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setImageDrawable(this.d);
        int i2 = rw4VarA.p;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = rw4VarA.i;
        if (i == 1) {
            appCompatImageView.setRotationY(180.0f);
        }
        addView(appCompatImageView, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.b = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.b.setTextSize(rw4VarA.t);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = rw4VarA.i;
        addView(this.b, layoutParams2);
        int color = Color.parseColor("#40FFFFFF");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.c = shapeDrawable;
        shapeDrawable.getPaint().setColor(color);
        setBackground(this.c);
        int iB = vw4.b((int) 180.0f);
        if (i == 1) {
            float f = iB;
            setCorners(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
        } else {
            float f2 = iB;
            setCorners(new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2});
        }
    }

    private void setCorners(float[] fArr) {
        this.c.setShape(new RoundRectShape(fArr, null, null));
    }

    public final void a() {
        if (getVisibility() == 8) {
            return;
        }
        if (this.a == null) {
            setVisibility(8);
            return;
        }
        xt4 xt4Var = this.o;
        if (xt4Var != null) {
            xt4Var.k();
        }
        this.d.stop();
        this.o = this.a.f(this);
    }

    public final void b() {
        if (getVisibility() == 0) {
            return;
        }
        if (this.a == null) {
            setVisibility(0);
            return;
        }
        if (this.d.isRunning()) {
            return;
        }
        xt4 xt4Var = this.o;
        if (xt4Var != null) {
            xt4Var.k();
        }
        this.d.start();
        this.o = this.a.e(this);
    }

    public final void c(int i) throws Resources.NotFoundException {
        if (i == 0) {
            this.b.setText("");
        } else {
            this.b.setText(getResources().getString(mvd.G1, Integer.valueOf(i)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.stop();
        xt4 xt4Var = this.o;
        if (xt4Var != null) {
            xt4Var.k();
        }
    }

    public void setAnimations(zg zgVar) {
        this.a = zgVar;
    }
}
