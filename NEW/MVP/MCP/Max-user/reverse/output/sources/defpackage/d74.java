package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d74 extends ViewGroup.MarginLayoutParams {
    public a74 a;
    public boolean b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p;

    public d74(int i, int i2) {
        super(i, i2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.m;
        }
        if (i != 1) {
            return false;
        }
        return this.n;
    }

    public final void b(a74 a74Var) {
        a74 a74Var2 = this.a;
        if (a74Var2 != a74Var) {
            if (a74Var2 != null) {
                a74Var2.j();
            }
            this.a = a74Var;
            this.b = true;
            if (a74Var != null) {
                a74Var.g(this);
            }
        }
    }

    public d74(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        a74 a74Var;
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i6d.CoordinatorLayout_Layout);
        this.c = typedArrayObtainStyledAttributes.getInteger(i6d.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(i6d.CoordinatorLayout_Layout_layout_anchor, -1);
        this.d = typedArrayObtainStyledAttributes.getInteger(i6d.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.e = typedArrayObtainStyledAttributes.getInteger(i6d.CoordinatorLayout_Layout_layout_keyline, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(i6d.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(i6d.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i6d.CoordinatorLayout_Layout_layout_behavior);
        this.b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(i6d.CoordinatorLayout_Layout_layout_behavior);
            String str = CoordinatorLayout.F0;
            if (TextUtils.isEmpty(string)) {
                a74Var = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.F0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.H0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.G0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    a74Var = (a74) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(wy1.h("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.a = a74Var;
        }
        typedArrayObtainStyledAttributes.recycle();
        a74 a74Var2 = this.a;
        if (a74Var2 != null) {
            a74Var2.g(this);
        }
    }

    public d74(d74 d74Var) {
        super((ViewGroup.MarginLayoutParams) d74Var);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public d74(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public d74(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
}
