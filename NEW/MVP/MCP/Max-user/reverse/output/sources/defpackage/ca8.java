package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ca8 implements yye {
    public static final Method K0;
    public static final Method L0;
    public AdapterView.OnItemSelectedListener A0;
    public final Handler F0;
    public Rect H0;
    public boolean I0;
    public final oo J0;
    public int X;
    public int Y;
    public final Context a;
    public ListAdapter b;
    public q55 c;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public pb4 x0;
    public View y0;
    public AdapterView.OnItemClickListener z0;
    public final int d = -2;
    public int o = -2;
    public final int Z = 1002;
    public int v0 = 0;
    public final int w0 = Integer.MAX_VALUE;
    public final aa8 B0 = new aa8(this, 1);
    public final ar5 C0 = new ar5(1, this);
    public final ba8 D0 = new ba8(this);
    public final aa8 E0 = new aa8(this, 0);
    public final Rect G0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                L0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ca8(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.F0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o6d.ListPopupWindow, i, 0);
        this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(o6d.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(o6d.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.Y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.s0 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        oo ooVar = new oo(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, o6d.PopupWindow, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(o6d.PopupWindow_overlapAnchor)) {
            r6c.c(ooVar, typedArrayObtainStyledAttributes2.getBoolean(o6d.PopupWindow_overlapAnchor, false));
        }
        int i3 = o6d.PopupWindow_android_popupBackground;
        ooVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(i3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i3, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(i3) : eri.a(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.J0 = ooVar;
        ooVar.setInputMethodMode(1);
    }

    @Override // defpackage.yye
    public final boolean a() {
        return this.J0.isShowing();
    }

    public final Drawable b() {
        return this.J0.getBackground();
    }

    public final int c() {
        return this.X;
    }

    @Override // defpackage.yye
    public final void dismiss() {
        oo ooVar = this.J0;
        ooVar.dismiss();
        ooVar.setContentView(null);
        this.c = null;
        this.F0.removeCallbacks(this.B0);
    }

    public final void e(int i) {
        this.X = i;
    }

    @Override // defpackage.yye
    public final void g() {
        int i;
        int paddingBottom;
        q55 q55Var;
        q55 q55Var2 = this.c;
        Context context = this.a;
        oo ooVar = this.J0;
        if (q55Var2 == null) {
            q55 q55VarQ = q(context, !this.I0);
            this.c = q55VarQ;
            q55VarQ.setAdapter(this.b);
            this.c.setOnItemClickListener(this.z0);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new x98(0, this));
            this.c.setOnScrollListener(this.D0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.A0;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            ooVar.setContentView(this.c);
        }
        Drawable background = ooVar.getBackground();
        Rect rect = this.G0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.s0) {
                this.Y = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = y98.a(ooVar, this.y0, this.Y, ooVar.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.o;
            int iA2 = this.c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = this.J0.getInputMethodMode() == 2;
        r6c.d(ooVar, this.Z);
        if (ooVar.isShowing()) {
            if (this.y0.isAttachedToWindow()) {
                int width = this.o;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.y0.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        ooVar.setWidth(this.o == -1 ? -1 : 0);
                        ooVar.setHeight(0);
                    } else {
                        ooVar.setWidth(this.o == -1 ? -1 : 0);
                        ooVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                ooVar.setOutsideTouchable(true);
                int i5 = width;
                View view = this.y0;
                int i6 = this.X;
                int i7 = this.Y;
                int i8 = i5 < 0 ? -1 : i5;
                if (i3 < 0) {
                    i3 = -1;
                }
                ooVar.update(view, i6, i7, i8, i3);
                return;
            }
            return;
        }
        int width2 = this.o;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.y0.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        ooVar.setWidth(width2);
        ooVar.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = K0;
            if (method != null) {
                try {
                    method.invoke(ooVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            z98.b(ooVar, true);
        }
        ooVar.setOutsideTouchable(true);
        ooVar.setTouchInterceptor(this.C0);
        if (this.u0) {
            r6c.c(ooVar, this.t0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = L0;
            if (method2 != null) {
                try {
                    method2.invoke(ooVar, this.H0);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            z98.a(ooVar, this.H0);
        }
        ooVar.showAsDropDown(this.y0, this.X, this.Y, this.v0);
        this.c.setSelection(-1);
        if ((!this.I0 || this.c.isInTouchMode()) && (q55Var = this.c) != null) {
            q55Var.setListSelectionHidden(true);
            q55Var.requestLayout();
        }
        if (this.I0) {
            return;
        }
        this.F0.post(this.E0);
    }

    public final void i(Drawable drawable) {
        this.J0.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.yye
    public final q55 j() {
        return this.c;
    }

    public final void l(int i) {
        this.Y = i;
        this.s0 = true;
    }

    public final int o() {
        if (this.s0) {
            return this.Y;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        pb4 pb4Var = this.x0;
        if (pb4Var == null) {
            this.x0 = new pb4(1, this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(pb4Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.x0);
        }
        q55 q55Var = this.c;
        if (q55Var != null) {
            q55Var.setAdapter(this.b);
        }
    }

    public q55 q(Context context, boolean z) {
        return new q55(context, z);
    }

    public final void r(int i) {
        Drawable background = this.J0.getBackground();
        if (background == null) {
            this.o = i;
            return;
        }
        Rect rect = this.G0;
        background.getPadding(rect);
        this.o = rect.left + rect.right + i;
    }
}
