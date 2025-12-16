package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class z3i extends e4i {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public co7[] d;
    public co7 e;
    public g4i f;
    public co7 g;

    public z3i(g4i g4iVar, WindowInsets windowInsets) {
        super(g4iVar);
        this.e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private co7 s(int i2, boolean z) {
        co7 co7VarA = co7.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                co7VarA = co7.a(co7VarA, t(i3, z));
            }
        }
        return co7VarA;
    }

    private co7 u() {
        g4i g4iVar = this.f;
        return g4iVar != null ? g4iVar.a.h() : co7.e;
    }

    private co7 v(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            x();
        }
        Method method = i;
        if (method != null && j != null && k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) k.get(l.get(objInvoke));
                if (rect != null) {
                    return co7.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void x() throws ClassNotFoundException, SecurityException {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    @Override // defpackage.e4i
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        co7 co7VarV = v(view);
        if (co7VarV == null) {
            co7VarV = co7.e;
        }
        y(co7VarV);
    }

    @Override // defpackage.e4i
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.g, ((z3i) obj).g);
        }
        return false;
    }

    @Override // defpackage.e4i
    public co7 f(int i2) {
        return s(i2, false);
    }

    @Override // defpackage.e4i
    public final co7 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = co7.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.e4i
    public g4i l(int i2, int i3, int i4, int i5) {
        g4i g4iVarH = g4i.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        y3i x3iVar = i6 >= 30 ? new x3i(g4iVarH) : i6 >= 29 ? new v3i(g4iVarH) : new u3i(g4iVarH);
        x3iVar.g(g4i.e(j(), i2, i3, i4, i5));
        x3iVar.e(g4i.e(h(), i2, i3, i4, i5));
        return x3iVar.b();
    }

    @Override // defpackage.e4i
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.e4i
    @SuppressLint({"WrongConstant"})
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !w(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.e4i
    public void p(co7[] co7VarArr) {
        this.d = co7VarArr;
    }

    @Override // defpackage.e4i
    public void q(g4i g4iVar) {
        this.f = g4iVar;
    }

    public co7 t(int i2, boolean z) {
        co7 co7VarH;
        int i3;
        if (i2 == 1) {
            return z ? co7.b(0, Math.max(u().b, j().b), 0, 0) : co7.b(0, j().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                co7 co7VarU = u();
                co7 co7VarH2 = h();
                return co7.b(Math.max(co7VarU.a, co7VarH2.a), 0, Math.max(co7VarU.c, co7VarH2.c), Math.max(co7VarU.d, co7VarH2.d));
            }
            co7 co7VarJ = j();
            g4i g4iVar = this.f;
            co7VarH = g4iVar != null ? g4iVar.a.h() : null;
            int iMin = co7VarJ.d;
            if (co7VarH != null) {
                iMin = Math.min(iMin, co7VarH.d);
            }
            return co7.b(co7VarJ.a, 0, co7VarJ.c, iMin);
        }
        co7 co7Var = co7.e;
        if (i2 == 8) {
            co7[] co7VarArr = this.d;
            co7VarH = co7VarArr != null ? co7VarArr[fsi.h(8)] : null;
            if (co7VarH != null) {
                return co7VarH;
            }
            co7 co7VarJ2 = j();
            co7 co7VarU2 = u();
            int i4 = co7VarJ2.d;
            if (i4 > co7VarU2.d) {
                return co7.b(0, 0, 0, i4);
            }
            co7 co7Var2 = this.g;
            if (co7Var2 != null && !co7Var2.equals(co7Var) && (i3 = this.g.d) > co7VarU2.d) {
                return co7.b(0, 0, 0, i3);
            }
        } else {
            if (i2 == 16) {
                return i();
            }
            if (i2 == 32) {
                return g();
            }
            if (i2 == 64) {
                return k();
            }
            if (i2 == 128) {
                g4i g4iVar2 = this.f;
                jy4 jy4VarE = g4iVar2 != null ? g4iVar2.a.e() : e();
                if (jy4VarE != null) {
                    int iA = jy4VarE.a();
                    int i5 = Build.VERSION.SDK_INT;
                    return co7.b(iA, i5 >= 28 ? iy4.f(jy4VarE.a) : 0, i5 >= 28 ? iy4.e(jy4VarE.a) : 0, i5 >= 28 ? iy4.c(jy4VarE.a) : 0);
                }
            }
        }
        return co7Var;
    }

    public boolean w(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !t(i2, false).equals(co7.e);
    }

    public void y(co7 co7Var) {
        this.g = co7Var;
    }
}
