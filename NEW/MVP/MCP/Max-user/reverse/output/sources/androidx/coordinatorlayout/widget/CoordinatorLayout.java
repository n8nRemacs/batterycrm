package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a74;
import defpackage.b74;
import defpackage.c74;
import defpackage.d74;
import defpackage.e6c;
import defpackage.e74;
import defpackage.f74;
import defpackage.g4i;
import defpackage.hfh;
import defpackage.i6d;
import defpackage.in;
import defpackage.k5d;
import defpackage.k5i;
import defpackage.kce;
import defpackage.kt;
import defpackage.pfh;
import defpackage.r34;
import defpackage.s55;
import defpackage.sda;
import defpackage.tda;
import defpackage.teh;
import defpackage.u35;
import defpackage.veh;
import defpackage.yuc;
import defpackage.z0f;
import defpackage.z64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements sda, tda {
    public static final String F0;
    public static final Class[] G0;
    public static final ThreadLocal H0;
    public static final s55 I0;
    public static final e6c J0;
    public boolean A0;
    public Drawable B0;
    public ViewGroup.OnHierarchyChangeListener C0;
    public kce D0;
    public final kt E0;
    public final ArrayList a;
    public final k5i b;
    public final ArrayList c;
    public final int[] d;
    public final int[] o;
    public boolean s0;
    public boolean t0;
    public final int[] u0;
    public View v0;
    public View w0;
    public e74 x0;
    public boolean y0;
    public g4i z0;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        F0 = r0 != null ? r0.getName() : null;
        I0 = new s55(21);
        G0 = new Class[]{Context.class, AttributeSet.class};
        H0 = new ThreadLocal();
        J0 = new e6c(12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = yuc.coordinatorLayoutStyle;
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.b = new k5i(4);
        this.c = new ArrayList();
        this.d = new int[2];
        this.o = new int[2];
        this.E0 = new kt(6);
        int i2 = 0;
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, i6d.CoordinatorLayout, 0, k5d.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, i6d.CoordinatorLayout, i, 0);
        if (i == 0) {
            hfh.m(this, context, i6d.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, k5d.Widget_Support_CoordinatorLayout);
        } else {
            hfh.m(this, context, i6d.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(i6d.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.u0 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.u0[i3] = (int) (r5[i3] * f);
            }
        }
        this.B0 = typedArrayObtainStyledAttributes.getDrawable(i6d.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new c74(i2, this));
        WeakHashMap weakHashMap = hfh.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) J0.a();
        return rect == null ? new Rect() : rect;
    }

    public static void f(int i, Rect rect, Rect rect2, d74 d74Var, int i2, int i3) {
        int i4 = d74Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = d74Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d74 k(View view) {
        d74 d74Var = (d74) view.getLayoutParams();
        if (!d74Var.b) {
            if (view instanceof z64) {
                a74 behavior = ((in) ((z64) view)).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                d74Var.b(behavior);
                d74Var.b = true;
                return d74Var;
            }
            b74 b74Var = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                b74Var = (b74) superclass.getAnnotation(b74.class);
                if (b74Var != null) {
                    break;
                }
            }
            if (b74Var != null) {
                try {
                    d74Var.b((a74) b74Var.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + b74Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            d74Var.b = true;
        }
        return d74Var;
    }

    public static void w(View view, int i) {
        d74 d74Var = (d74) view.getLayoutParams();
        int i2 = d74Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = hfh.a;
            view.offsetLeftAndRight(i - i2);
            d74Var.i = i;
        }
    }

    public static void x(View view, int i) {
        d74 d74Var = (d74) view.getLayoutParams();
        int i2 = d74Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = hfh.a;
            view.offsetTopAndBottom(i - i2);
            d74Var.j = i;
        }
    }

    public final void b(d74 d74Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) d74Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) d74Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) d74Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void c(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            e(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d74) && super.checkLayoutParams(layoutParams);
    }

    public final List d(View view) {
        z0f z0fVar = (z0f) this.b.c;
        int i = z0fVar.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) z0fVar.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(z0fVar.f(i2));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a74 a74Var = ((d74) view.getLayoutParams()).a;
        if (a74Var != null) {
            a74Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B0;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(Rect rect, View view) {
        ThreadLocal threadLocal = pfh.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = pfh.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        pfh.a(this, view, matrix);
        ThreadLocal threadLocal3 = pfh.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int g(int i) {
        int[] iArr = this.u0;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d74(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d74(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.a);
    }

    public final g4i getLastWindowInsets() {
        return this.z0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        kt ktVar = this.E0;
        return ktVar.c | ktVar.b;
    }

    public Drawable getStatusBarBackground() {
        return this.B0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // defpackage.tda
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        a74 a74Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                d74 d74Var = (d74) childAt.getLayoutParams();
                if (d74Var.a(i5) && (a74Var = d74Var.a) != null) {
                    int[] iArr2 = this.d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    a74Var.p(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // defpackage.sda
    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
        h(view, i, i2, i3, i4, 0, this.o);
    }

    @Override // defpackage.sda
    public final boolean j(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                d74 d74Var = (d74) childAt.getLayoutParams();
                a74 a74Var = d74Var.a;
                if (a74Var != null) {
                    boolean zU = a74Var.u(this, childAt, view, view2, i, i2);
                    z |= zU;
                    if (i2 == 0) {
                        d74Var.m = zU;
                    } else if (i2 == 1) {
                        d74Var.n = zU;
                    }
                } else if (i2 == 0) {
                    d74Var.m = false;
                } else if (i2 == 1) {
                    d74Var.n = false;
                }
            }
        }
        return z;
    }

    @Override // defpackage.sda
    public final void l(View view, View view2, int i, int i2) {
        kt ktVar = this.E0;
        if (i2 == 1) {
            ktVar.c = i;
        } else {
            ktVar.b = i;
        }
        this.w0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((d74) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.sda
    public final void m(View view, int i) {
        kt ktVar = this.E0;
        if (i == 1) {
            ktVar.c = 0;
        } else {
            ktVar.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            d74 d74Var = (d74) childAt.getLayoutParams();
            if (d74Var.a(i)) {
                a74 a74Var = d74Var.a;
                if (a74Var != null) {
                    a74Var.v(this, childAt, view, i);
                }
                if (i == 0) {
                    d74Var.m = false;
                } else if (i == 1) {
                    d74Var.n = false;
                }
                d74Var.o = false;
            }
        }
        this.w0 = null;
    }

    @Override // defpackage.sda
    public final void n(View view, int i, int i2, int[] iArr, int i3) {
        a74 a74Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d74 d74Var = (d74) childAt.getLayoutParams();
                if (d74Var.a(i3) && (a74Var = d74Var.a) != null) {
                    int[] iArr2 = this.d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    a74Var.o(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            p(1);
        }
    }

    public final boolean o(View view, int i, int i2) {
        e6c e6cVar = J0;
        Rect rectA = a();
        e(rectA, view);
        try {
            return rectA.contains(i, i2);
        } finally {
            rectA.setEmpty();
            e6cVar.b(rectA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        if (this.y0) {
            if (this.x0 == null) {
                this.x0 = new e74(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.x0);
        }
        if (this.z0 == null) {
            WeakHashMap weakHashMap = hfh.a;
            if (getFitsSystemWindows()) {
                teh.c(this);
            }
        }
        this.t0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
        if (this.y0 && this.x0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.x0);
        }
        View view = this.w0;
        if (view != null) {
            m(view, 0);
        }
        this.t0 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.A0 || this.B0 == null) {
            return;
        }
        g4i g4iVar = this.z0;
        int iD = g4iVar != null ? g4iVar.d() : 0;
        if (iD > 0) {
            this.B0.setBounds(0, 0, getWidth(), iD);
            this.B0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v();
        }
        boolean zT = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        this.v0 = null;
        v();
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a74 a74Var;
        WeakHashMap weakHashMap = hfh.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((a74Var = ((d74) view.getLayoutParams()).a) == null || !a74Var.l(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                d74 d74Var = (d74) childAt.getLayoutParams();
                if (d74Var.a(0)) {
                    a74 a74Var = d74Var.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        a74 a74Var;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                d74 d74Var = (d74) childAt.getLayoutParams();
                if (d74Var.a(0) && (a74Var = d74Var.a) != null) {
                    zN |= a74Var.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        n(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        i(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        l(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f74)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f74 f74Var = (f74) parcelable;
        super.onRestoreInstanceState(f74Var.a);
        SparseArray sparseArray = f74Var.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            a74 a74Var = k(childAt).a;
            if (id != -1 && a74Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                a74Var.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        f74 f74Var = new f74(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            a74 a74Var = ((d74) childAt.getLayoutParams()).a;
            if (id != -1 && a74Var != null && (parcelableS = a74Var.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        f74Var.c = sparseArray;
        return f74Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return j(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        m(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zT;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.v0;
        boolean z = false;
        if (view != null) {
            a74 a74Var = ((d74) view.getLayoutParams()).a;
            zT = a74Var != null ? a74Var.w(this, this.v0, motionEvent) : false;
        } else {
            zT = t(motionEvent, 1);
            if (actionMasked != 0 && zT) {
                z = true;
            }
        }
        if (this.v0 == null || actionMasked == 3) {
            zT |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        this.v0 = null;
        v();
        return zT;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r23) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i) {
        Rect rectA;
        Rect rectA2;
        d74 d74Var = (d74) view.getLayoutParams();
        View view2 = d74Var.k;
        if (view2 == null && d74Var.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        e6c e6cVar = J0;
        if (view2 != null) {
            rectA = a();
            rectA2 = a();
            try {
                e(rectA, view2);
                d74 d74Var2 = (d74) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                f(i, rectA, rectA2, d74Var2, measuredWidth, measuredHeight);
                b(d74Var2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                e6cVar.b(rectA);
                rectA2.setEmpty();
                e6cVar.b(rectA2);
            }
        }
        int i2 = d74Var.e;
        if (i2 < 0) {
            d74 d74Var3 = (d74) view.getLayoutParams();
            rectA = a();
            rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) d74Var3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) d74Var3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) d74Var3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) d74Var3).bottomMargin);
            if (this.z0 != null) {
                WeakHashMap weakHashMap = hfh.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA.left = this.z0.b() + rectA.left;
                    rectA.top = this.z0.d() + rectA.top;
                    rectA.right -= this.z0.c();
                    rectA.bottom -= this.z0.a();
                }
            }
            rectA2 = a();
            int i3 = d74Var3.c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
            return;
        }
        d74 d74Var4 = (d74) view.getLayoutParams();
        int i4 = d74Var4.c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iG = g(i2) - measuredWidth2;
        if (i5 == 1) {
            iG += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iG += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) d74Var4).leftMargin, Math.min(iG, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) d74Var4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) d74Var4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) d74Var4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void r(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        a74 a74Var = ((d74) view.getLayoutParams()).a;
        if (a74Var == null || !a74Var.q(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.s0) {
            return;
        }
        if (this.v0 == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                a74 a74Var = ((d74) childAt.getLayoutParams()).a;
                if (a74Var != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    a74Var.k(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        v();
        this.s0 = true;
    }

    public final boolean s(a74 a74Var, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return a74Var.k(this, view, motionEvent);
        }
        if (i == 1) {
            return a74Var.w(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.C0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.B0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.B0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.B0.setState(getDrawableState());
                }
                Drawable drawable3 = this.B0;
                WeakHashMap weakHashMap = hfh.a;
                u35.b(drawable3, getLayoutDirection());
                this.B0.setVisible(getVisibility() == 0, false);
                this.B0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = hfh.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? r34.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.B0;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.B0.setVisible(z, false);
    }

    public final boolean t(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        s55 s55Var = I0;
        if (s55Var != null) {
            Collections.sort(arrayList, s55Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zS = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            a74 a74Var = ((d74) view.getLayoutParams()).a;
            if (zS && actionMasked != 0) {
                if (a74Var != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    s(a74Var, view, motionEventObtain, i);
                }
            } else if (!zS && a74Var != null && (zS = s(a74Var, view, motionEvent, i))) {
                this.v0 = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        View view2 = (View) arrayList.get(i4);
                        a74 a74Var2 = ((d74) view2.getLayoutParams()).a;
                        if (a74Var2 != null) {
                            if (motionEventObtain == null) {
                                motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                            }
                            s(a74Var2, view2, motionEventObtain, i);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zS;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v() {
        View view = this.v0;
        if (view != null) {
            a74 a74Var = ((d74) view.getLayoutParams()).a;
            if (a74Var != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                a74Var.w(this, this.v0, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.v0 = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((d74) getChildAt(i).getLayoutParams()).getClass();
        }
        this.s0 = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B0;
    }

    public final void y() {
        WeakHashMap weakHashMap = hfh.a;
        if (!getFitsSystemWindows()) {
            veh.u(this, null);
            return;
        }
        if (this.D0 == null) {
            this.D0 = new kce(13, this);
        }
        veh.u(this, this.D0);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d74 ? new d74((d74) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d74((ViewGroup.MarginLayoutParams) layoutParams) : new d74(layoutParams);
    }
}
