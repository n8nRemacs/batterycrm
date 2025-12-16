package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class o45 extends ImageView {
    public static boolean t0 = false;
    public final kt a;
    public float b;
    public m45 c;
    public boolean d;
    public boolean o;
    public Object s0;

    public o45(Context context) {
        super(context);
        this.a = new kt(0);
        this.b = 0.0f;
        this.d = false;
        this.o = false;
        this.s0 = null;
        b(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        t0 = z;
    }

    public final void b(Context context) {
        try {
            ml6.i();
            if (this.d) {
                ml6.i();
                return;
            }
            boolean z = true;
            this.d = true;
            this.c = new m45(null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                ml6.i();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!t0 || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.o = z;
            ml6.i();
        } catch (Throwable th) {
            ml6.i();
            throw th;
        }
    }

    public final void c() {
        Drawable drawable;
        if (!this.o || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public void d() {
        this.c.g();
    }

    public float getAspectRatio() {
        return this.b;
    }

    public i45 getController() {
        return this.c.e;
    }

    public Object getExtraData() {
        return this.s0;
    }

    public l45 getHierarchy() {
        l45 l45Var = this.c.d;
        l45Var.getClass();
        return l45Var;
    }

    public Drawable getTopLevelDrawable() {
        return this.c.d();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        this.c.f();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        d();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        c();
        this.c.f();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        kt ktVar = this.a;
        ktVar.b = i;
        ktVar.c = i2;
        float f = this.b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                ktVar.c = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(ktVar.b) - paddingRight) / f) + paddingBottom), ktVar.c), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    ktVar.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(ktVar.c) - paddingBottom) * f) + paddingRight), ktVar.b), 1073741824);
                }
            }
        }
        super.onMeasure(ktVar.b, ktVar.c);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        c();
        d();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        v0 v0Var;
        m45 m45Var = this.c;
        if (m45Var.e()) {
            v0 v0Var2 = (v0) m45Var.e;
            v0Var2.getClass();
            Class cls = v0.u;
            if (op5.a.h(2)) {
                op5.f(cls, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(v0Var2)), v0Var2.j, motionEvent);
            }
            nr6 nr6Var = v0Var2.e;
            if (nr6Var != null && (nr6Var.c || v0Var2.q())) {
                nr6 nr6Var2 = v0Var2.e;
                float f = nr6Var2.b;
                int action = motionEvent.getAction();
                if (action == 0) {
                    nr6Var2.c = true;
                    nr6Var2.d = true;
                    nr6Var2.e = motionEvent.getEventTime();
                    nr6Var2.f = motionEvent.getX();
                    nr6Var2.g = motionEvent.getY();
                    return true;
                }
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            nr6Var2.c = false;
                            nr6Var2.d = false;
                            return true;
                        }
                    } else if (Math.abs(motionEvent.getX() - nr6Var2.f) > f || Math.abs(motionEvent.getY() - nr6Var2.g) > f) {
                        nr6Var2.d = false;
                        return true;
                    }
                    return true;
                }
                nr6Var2.c = false;
                if (Math.abs(motionEvent.getX() - nr6Var2.f) > f || Math.abs(motionEvent.getY() - nr6Var2.g) > f) {
                    nr6Var2.d = false;
                }
                if (nr6Var2.d && motionEvent.getEventTime() - nr6Var2.e <= ViewConfiguration.getLongPressTimeout() && (v0Var = nr6Var2.a) != null) {
                    if (op5.a.h(2)) {
                        op5.e(cls, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(v0Var)), v0Var.j);
                    }
                    if (v0Var.q()) {
                        v0Var.d.c++;
                        gr6 gr6Var = v0Var.h;
                        gr6Var.f.o(gr6Var.a);
                        gr6Var.g();
                        v0Var.r();
                    }
                }
                nr6Var2.d = false;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        c();
    }

    public void setAspectRatio(float f) {
        if (f == this.b) {
            return;
        }
        this.b = f;
        requestLayout();
    }

    public void setController(i45 i45Var) {
        this.c.i(i45Var);
        super.setImageDrawable(this.c.d());
    }

    public void setExtraData(Object obj) {
        this.s0 = obj;
    }

    public void setHierarchy(l45 l45Var) {
        this.c.j(l45Var);
        super.setImageDrawable(this.c.d());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        b(getContext());
        this.c.i(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        b(getContext());
        this.c.i(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        b(getContext());
        this.c.i(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        b(getContext());
        this.c.i(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.o = z;
    }

    @Override // android.view.View
    public final String toString() {
        hc8 hc8VarC = yyi.c(this);
        m45 m45Var = this.c;
        hc8VarC.r(m45Var != null ? m45Var.toString() : "<no holder set>", "holder");
        return hc8VarC.toString();
    }

    public o45(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new kt(0);
        this.b = 0.0f;
        this.d = false;
        this.o = false;
        this.s0 = null;
        b(context);
    }

    public o45(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.a = new kt(0);
        this.b = 0.0f;
        this.d = false;
        this.o = false;
        this.s0 = null;
        b(context);
    }
}
