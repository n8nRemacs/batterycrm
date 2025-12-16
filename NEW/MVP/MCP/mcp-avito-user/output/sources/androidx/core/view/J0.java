package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.C22826j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public class J0 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public static final J0 f44939b;

    /* renamed from: a, reason: collision with root package name */
    public final l f44940a;

    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    @j.X
    public static class a {
        static {
            try {
                View.class.getDeclaredField("mAttachInfo").setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                cls.getDeclaredField("mStableInsets").setAccessible(true);
                cls.getDeclaredField("mContentInsets").setAccessible(true);
            } catch (ReflectiveOperationException e12) {
                e12.getMessage();
            }
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @j.X
    public static class e extends d {
        public e() {
        }

        @Override // androidx.core.view.J0.f
        public void c(int i12, @j.N C22771k c22771k) {
            this.f44948c.setInsets(n.a(i12), c22771k.e());
        }

        @Override // androidx.core.view.J0.f
        public void i(int i12, boolean z12) {
            this.f44948c.setVisible(n.a(i12), z12);
        }

        public e(@j.N J0 j02) {
            super(j02);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final J0 f44949a;

        /* renamed from: b, reason: collision with root package name */
        public C22771k[] f44950b;

        public f() {
            this(new J0((J0) null));
        }

        public final void a() {
            C22771k[] c22771kArr = this.f44950b;
            if (c22771kArr != null) {
                C22771k c22771kG = c22771kArr[0];
                C22771k c22771kG2 = c22771kArr[1];
                J0 j02 = this.f44949a;
                if (c22771kG2 == null) {
                    c22771kG2 = j02.f44940a.g(2);
                }
                if (c22771kG == null) {
                    c22771kG = j02.f44940a.g(1);
                }
                g(C22771k.a(c22771kG, c22771kG2));
                C22771k c22771k = this.f44950b[m.a(16)];
                if (c22771k != null) {
                    f(c22771k);
                }
                C22771k c22771k2 = this.f44950b[m.a(32)];
                if (c22771k2 != null) {
                    d(c22771k2);
                }
                C22771k c22771k3 = this.f44950b[m.a(64)];
                if (c22771k3 != null) {
                    h(c22771k3);
                }
            }
        }

        @j.N
        public J0 b() {
            a();
            return this.f44949a;
        }

        public void c(int i12, @j.N C22771k c22771k) {
            if (this.f44950b == null) {
                this.f44950b = new C22771k[9];
            }
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i12 & i13) != 0) {
                    this.f44950b[m.a(i13)] = c22771k;
                }
            }
        }

        public f(@j.N J0 j02) {
            this.f44949a = j02;
        }

        public void d(@j.N C22771k c22771k) {
        }

        public void e(@j.N C22771k c22771k) {
        }

        public void f(@j.N C22771k c22771k) {
        }

        public void g(@j.N C22771k c22771k) {
        }

        public void h(@j.N C22771k c22771k) {
        }

        public void i(int i12, boolean z12) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @j.X
    public static class i extends h {
        public i(@j.N J0 j02, @j.N WindowInsets windowInsets) {
            super(j02, windowInsets);
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public J0 a() {
            return J0.s(null, this.f44956c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.J0.g, androidx.core.view.J0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f44956c, iVar.f44956c) && Objects.equals(this.f44960g, iVar.f44960g);
        }

        @Override // androidx.core.view.J0.l
        @j.P
        public C22826j f() {
            DisplayCutout displayCutout = this.f44956c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C22826j(displayCutout);
        }

        @Override // androidx.core.view.J0.l
        public int hashCode() {
            return this.f44956c.hashCode();
        }

        public i(@j.N J0 j02, @j.N i iVar) {
            super(j02, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @j.X
    public static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        @j.N
        public static final J0 f44965q = J0.s(null, WindowInsets.CONSUMED);

        public k(@j.N J0 j02, @j.N WindowInsets windowInsets) {
            super(j02, windowInsets);
        }

        @Override // androidx.core.view.J0.g, androidx.core.view.J0.l
        @j.N
        public C22771k g(int i12) {
            return C22771k.d(this.f44956c.getInsets(n.a(i12)));
        }

        @Override // androidx.core.view.J0.g, androidx.core.view.J0.l
        @j.N
        public C22771k h(int i12) {
            return C22771k.d(this.f44956c.getInsetsIgnoringVisibility(n.a(i12)));
        }

        @Override // androidx.core.view.J0.g, androidx.core.view.J0.l
        public boolean q(int i12) {
            return this.f44956c.isVisible(n.a(i12));
        }

        public k(@j.N J0 j02, @j.N k kVar) {
            super(j02, kVar);
        }

        @Override // androidx.core.view.J0.g, androidx.core.view.J0.l
        public final void d(@j.N View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class m {

        /* compiled from: WindowInsetsCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface a {
        }

        public static int a(int i12) {
            if (i12 == 1) {
                return 0;
            }
            if (i12 == 2) {
                return 1;
            }
            if (i12 == 4) {
                return 2;
            }
            if (i12 == 8) {
                return 3;
            }
            if (i12 == 16) {
                return 4;
            }
            if (i12 == 32) {
                return 5;
            }
            if (i12 == 64) {
                return 6;
            }
            if (i12 == 128) {
                return 7;
            }
            if (i12 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(AK.c.g(i12, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @j.X
    public static final class n {
        private n() {
        }

        public static int a(int i12) {
            int iStatusBars;
            int i13 = 0;
            for (int i14 = 1; i14 <= 256; i14 <<= 1) {
                if ((i12 & i14) != 0) {
                    if (i14 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i14 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i14 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i14 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i14 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i14 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i14 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i14 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i13 |= iStatusBars;
                }
            }
            return i13;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f44939b = k.f44965q;
        } else {
            f44939b = l.f44966b;
        }
    }

    @j.X
    public J0(@j.N WindowInsets windowInsets) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            this.f44940a = new k(this, windowInsets);
            return;
        }
        if (i12 >= 29) {
            this.f44940a = new j(this, windowInsets);
        } else if (i12 >= 28) {
            this.f44940a = new i(this, windowInsets);
        } else {
            this.f44940a = new h(this, windowInsets);
        }
    }

    public static C22771k n(@j.N C22771k c22771k, int i12, int i13, int i14, int i15) {
        int iMax = Math.max(0, c22771k.f44775a - i12);
        int iMax2 = Math.max(0, c22771k.f44776b - i13);
        int iMax3 = Math.max(0, c22771k.f44777c - i14);
        int iMax4 = Math.max(0, c22771k.f44778d - i15);
        return (iMax == i12 && iMax2 == i13 && iMax3 == i14 && iMax4 == i15) ? c22771k : C22771k.b(iMax, iMax2, iMax3, iMax4);
    }

    @j.N
    @j.X
    public static J0 s(@j.P View view, @j.N WindowInsets windowInsets) {
        windowInsets.getClass();
        J0 j02 = new J0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            J0 j0A = C22823h0.e.a(view);
            l lVar = j02.f44940a;
            lVar.t(j0A);
            lVar.d(view.getRootView());
        }
        return j02;
    }

    @j.N
    @Deprecated
    public final J0 a() {
        return this.f44940a.a();
    }

    @j.N
    @Deprecated
    public final J0 b() {
        return this.f44940a.b();
    }

    @j.N
    @Deprecated
    public final J0 c() {
        return this.f44940a.c();
    }

    @j.P
    public final C22826j d() {
        return this.f44940a.f();
    }

    @j.N
    public final C22771k e(int i12) {
        return this.f44940a.g(i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        return Objects.equals(this.f44940a, ((J0) obj).f44940a);
    }

    @j.N
    public final C22771k f(int i12) {
        return this.f44940a.h(i12);
    }

    @j.N
    @Deprecated
    public final C22771k g() {
        return this.f44940a.k();
    }

    @Deprecated
    public final int h() {
        return this.f44940a.l().f44778d;
    }

    public final int hashCode() {
        l lVar = this.f44940a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public final int i() {
        return this.f44940a.l().f44775a;
    }

    @Deprecated
    public final int j() {
        return this.f44940a.l().f44777c;
    }

    @Deprecated
    public final int k() {
        return this.f44940a.l().f44776b;
    }

    public final boolean l() {
        l lVar = this.f44940a;
        C22771k c22771kG = lVar.g(-1);
        C22771k c22771k = C22771k.f44774e;
        return (c22771kG.equals(c22771k) && lVar.h(-9).equals(c22771k) && lVar.f() == null) ? false : true;
    }

    @j.N
    public final J0 m(@j.F int i12, @j.F int i13, @j.F int i14, @j.F int i15) {
        return this.f44940a.n(i12, i13, i14, i15);
    }

    public final boolean o() {
        return this.f44940a.o();
    }

    public final boolean p(int i12) {
        return this.f44940a.q(i12);
    }

    @j.N
    @Deprecated
    public final J0 q(int i12, int i13, int i14, int i15) {
        b bVar = new b(this);
        C22771k c22771kB = C22771k.b(i12, i13, i14, i15);
        f fVar = bVar.f44941a;
        fVar.g(c22771kB);
        return fVar.b();
    }

    @j.P
    @j.X
    public final WindowInsets r() {
        l lVar = this.f44940a;
        if (lVar instanceof g) {
            return ((g) lVar).f44956c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    @j.X
    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public static Field f44942e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f44943f = false;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor<WindowInsets> f44944g = null;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f44945h = false;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsets f44946c;

        /* renamed from: d, reason: collision with root package name */
        public C22771k f44947d;

        public c() {
            this.f44946c = j();
        }

        @j.P
        private static WindowInsets j() {
            if (!f44943f) {
                try {
                    f44942e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f44943f = true;
            }
            Field field = f44942e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f44945h) {
                try {
                    f44944g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f44945h = true;
            }
            Constructor<WindowInsets> constructor = f44944g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.J0.f
        @j.N
        public J0 b() {
            a();
            J0 j0S = J0.s(null, this.f44946c);
            C22771k[] c22771kArr = this.f44950b;
            l lVar = j0S.f44940a;
            lVar.r(c22771kArr);
            lVar.u(this.f44947d);
            return j0S;
        }

        @Override // androidx.core.view.J0.f
        public void e(@j.P C22771k c22771k) {
            this.f44947d = c22771k;
        }

        @Override // androidx.core.view.J0.f
        public void g(@j.N C22771k c22771k) {
            WindowInsets windowInsets = this.f44946c;
            if (windowInsets != null) {
                this.f44946c = windowInsets.replaceSystemWindowInsets(c22771k.f44775a, c22771k.f44776b, c22771k.f44777c, c22771k.f44778d);
            }
        }

        public c(@j.N J0 j02) {
            super(j02);
            this.f44946c = j02.r();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @j.X
    public static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f44948c;

        public d() {
            this.f44948c = K0.b();
        }

        @Override // androidx.core.view.J0.f
        @j.N
        public J0 b() {
            a();
            J0 j0S = J0.s(null, this.f44948c.build());
            j0S.f44940a.r(this.f44950b);
            return j0S;
        }

        @Override // androidx.core.view.J0.f
        public void d(@j.N C22771k c22771k) {
            this.f44948c.setMandatorySystemGestureInsets(c22771k.e());
        }

        @Override // androidx.core.view.J0.f
        public void e(@j.N C22771k c22771k) {
            this.f44948c.setStableInsets(c22771k.e());
        }

        @Override // androidx.core.view.J0.f
        public void f(@j.N C22771k c22771k) {
            this.f44948c.setSystemGestureInsets(c22771k.e());
        }

        @Override // androidx.core.view.J0.f
        public void g(@j.N C22771k c22771k) {
            this.f44948c.setSystemWindowInsets(c22771k.e());
        }

        @Override // androidx.core.view.J0.f
        public void h(@j.N C22771k c22771k) {
            this.f44948c.setTappableElementInsets(c22771k.e());
        }

        public d(@j.N J0 j02) {
            WindowInsets.Builder builderB;
            super(j02);
            WindowInsets windowInsetsR = j02.r();
            if (windowInsetsR != null) {
                builderB = K0.c(windowInsetsR);
            } else {
                builderB = K0.b();
            }
            this.f44948c = builderB;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @j.X
    public static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        public C22771k f44961m;

        public h(@j.N J0 j02, @j.N WindowInsets windowInsets) {
            super(j02, windowInsets);
            this.f44961m = null;
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public J0 b() {
            return J0.s(null, this.f44956c.consumeStableInsets());
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public J0 c() {
            return J0.s(null, this.f44956c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public final C22771k j() {
            if (this.f44961m == null) {
                WindowInsets windowInsets = this.f44956c;
                this.f44961m = C22771k.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f44961m;
        }

        @Override // androidx.core.view.J0.l
        public boolean o() {
            return this.f44956c.isConsumed();
        }

        @Override // androidx.core.view.J0.l
        public void u(@j.P C22771k c22771k) {
            this.f44961m = c22771k;
        }

        public h(@j.N J0 j02, @j.N h hVar) {
            super(j02, hVar);
            this.f44961m = null;
            this.f44961m = hVar.f44961m;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @j.X
    public static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f44951h = false;

        /* renamed from: i, reason: collision with root package name */
        public static Method f44952i;

        /* renamed from: j, reason: collision with root package name */
        public static Class<?> f44953j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f44954k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f44955l;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final WindowInsets f44956c;

        /* renamed from: d, reason: collision with root package name */
        public C22771k[] f44957d;

        /* renamed from: e, reason: collision with root package name */
        public C22771k f44958e;

        /* renamed from: f, reason: collision with root package name */
        public J0 f44959f;

        /* renamed from: g, reason: collision with root package name */
        public C22771k f44960g;

        public g(@j.N J0 j02, @j.N WindowInsets windowInsets) {
            super(j02);
            this.f44958e = null;
            this.f44956c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() throws ClassNotFoundException, SecurityException {
            try {
                f44952i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f44953j = cls;
                f44954k = cls.getDeclaredField("mVisibleInsets");
                f44955l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f44954k.setAccessible(true);
                f44955l.setAccessible(true);
            } catch (ReflectiveOperationException e12) {
                e12.getMessage();
            }
            f44951h = true;
        }

        @j.N
        @SuppressLint({"WrongConstant"})
        private C22771k v(int i12, boolean z12) {
            C22771k c22771kA = C22771k.f44774e;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i12 & i13) != 0) {
                    c22771kA = C22771k.a(c22771kA, w(i13, z12));
                }
            }
            return c22771kA;
        }

        private C22771k x() {
            J0 j02 = this.f44959f;
            return j02 != null ? j02.f44940a.j() : C22771k.f44774e;
        }

        @j.P
        private C22771k y(@j.N View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f44951h) {
                A();
            }
            Method method = f44952i;
            if (method != null && f44953j != null && f44954k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f44954k.get(f44955l.get(objInvoke));
                    if (rect != null) {
                        return C22771k.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e12) {
                    e12.getMessage();
                }
            }
            return null;
        }

        @Override // androidx.core.view.J0.l
        public void d(@j.N View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C22771k c22771kY = y(view);
            if (c22771kY == null) {
                c22771kY = C22771k.f44774e;
            }
            s(c22771kY);
        }

        @Override // androidx.core.view.J0.l
        public void e(@j.N J0 j02) {
            j02.f44940a.t(this.f44959f);
            j02.f44940a.s(this.f44960g);
        }

        @Override // androidx.core.view.J0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f44960g, ((g) obj).f44960g);
            }
            return false;
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public C22771k g(int i12) {
            return v(i12, false);
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public C22771k h(int i12) {
            return v(i12, true);
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public final C22771k l() {
            if (this.f44958e == null) {
                WindowInsets windowInsets = this.f44956c;
                this.f44958e = C22771k.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f44958e;
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public J0 n(int i12, int i13, int i14, int i15) {
            b bVar = new b(J0.s(null, this.f44956c));
            bVar.c(J0.n(l(), i12, i13, i14, i15));
            C22771k c22771kN = J0.n(j(), i12, i13, i14, i15);
            f fVar = bVar.f44941a;
            fVar.e(c22771kN);
            return fVar.b();
        }

        @Override // androidx.core.view.J0.l
        public boolean p() {
            return this.f44956c.isRound();
        }

        @Override // androidx.core.view.J0.l
        @SuppressLint({"WrongConstant"})
        public boolean q(int i12) {
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i12 & i13) != 0 && !z(i13)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.J0.l
        public void r(C22771k[] c22771kArr) {
            this.f44957d = c22771kArr;
        }

        @Override // androidx.core.view.J0.l
        public void s(@j.N C22771k c22771k) {
            this.f44960g = c22771k;
        }

        @Override // androidx.core.view.J0.l
        public void t(@j.P J0 j02) {
            this.f44959f = j02;
        }

        @j.N
        public C22771k w(int i12, boolean z12) {
            C22771k c22771kJ;
            int i13;
            if (i12 == 1) {
                return z12 ? C22771k.b(0, Math.max(x().f44776b, l().f44776b), 0, 0) : C22771k.b(0, l().f44776b, 0, 0);
            }
            if (i12 == 2) {
                if (z12) {
                    C22771k c22771kX = x();
                    C22771k c22771kJ2 = j();
                    return C22771k.b(Math.max(c22771kX.f44775a, c22771kJ2.f44775a), 0, Math.max(c22771kX.f44777c, c22771kJ2.f44777c), Math.max(c22771kX.f44778d, c22771kJ2.f44778d));
                }
                C22771k c22771kL = l();
                J0 j02 = this.f44959f;
                c22771kJ = j02 != null ? j02.f44940a.j() : null;
                int iMin = c22771kL.f44778d;
                if (c22771kJ != null) {
                    iMin = Math.min(iMin, c22771kJ.f44778d);
                }
                return C22771k.b(c22771kL.f44775a, 0, c22771kL.f44777c, iMin);
            }
            C22771k c22771k = C22771k.f44774e;
            if (i12 == 8) {
                C22771k[] c22771kArr = this.f44957d;
                c22771kJ = c22771kArr != null ? c22771kArr[m.a(8)] : null;
                if (c22771kJ != null) {
                    return c22771kJ;
                }
                C22771k c22771kL2 = l();
                C22771k c22771kX2 = x();
                int i14 = c22771kL2.f44778d;
                if (i14 > c22771kX2.f44778d) {
                    return C22771k.b(0, 0, 0, i14);
                }
                C22771k c22771k2 = this.f44960g;
                return (c22771k2 == null || c22771k2.equals(c22771k) || (i13 = this.f44960g.f44778d) <= c22771kX2.f44778d) ? c22771k : C22771k.b(0, 0, 0, i13);
            }
            if (i12 == 16) {
                return k();
            }
            if (i12 == 32) {
                return i();
            }
            if (i12 == 64) {
                return m();
            }
            if (i12 != 128) {
                return c22771k;
            }
            J0 j03 = this.f44959f;
            C22826j c22826jF = j03 != null ? j03.f44940a.f() : f();
            if (c22826jF == null) {
                return c22771k;
            }
            int i15 = Build.VERSION.SDK_INT;
            return C22771k.b(i15 >= 28 ? C22826j.a.b(c22826jF.f45077a) : 0, i15 >= 28 ? C22826j.a.d(c22826jF.f45077a) : 0, i15 >= 28 ? C22826j.a.c(c22826jF.f45077a) : 0, i15 >= 28 ? C22826j.a.a(c22826jF.f45077a) : 0);
        }

        public boolean z(int i12) {
            if (i12 != 1 && i12 != 2) {
                if (i12 == 4) {
                    return false;
                }
                if (i12 != 8 && i12 != 128) {
                    return true;
                }
            }
            return !w(i12, false).equals(C22771k.f44774e);
        }

        public g(@j.N J0 j02, @j.N g gVar) {
            this(j02, new WindowInsets(gVar.f44956c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @j.X
    public static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        public C22771k f44962n;

        /* renamed from: o, reason: collision with root package name */
        public C22771k f44963o;

        /* renamed from: p, reason: collision with root package name */
        public C22771k f44964p;

        public j(@j.N J0 j02, @j.N WindowInsets windowInsets) {
            super(j02, windowInsets);
            this.f44962n = null;
            this.f44963o = null;
            this.f44964p = null;
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public C22771k i() {
            if (this.f44963o == null) {
                this.f44963o = C22771k.d(this.f44956c.getMandatorySystemGestureInsets());
            }
            return this.f44963o;
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public C22771k k() {
            if (this.f44962n == null) {
                this.f44962n = C22771k.d(this.f44956c.getSystemGestureInsets());
            }
            return this.f44962n;
        }

        @Override // androidx.core.view.J0.l
        @j.N
        public C22771k m() {
            if (this.f44964p == null) {
                this.f44964p = C22771k.d(this.f44956c.getTappableElementInsets());
            }
            return this.f44964p;
        }

        @Override // androidx.core.view.J0.g, androidx.core.view.J0.l
        @j.N
        public J0 n(int i12, int i13, int i14, int i15) {
            return J0.s(null, this.f44956c.inset(i12, i13, i14, i15));
        }

        public j(@j.N J0 j02, @j.N j jVar) {
            super(j02, jVar);
            this.f44962n = null;
            this.f44963o = null;
            this.f44964p = null;
        }

        @Override // androidx.core.view.J0.h, androidx.core.view.J0.l
        public void u(@j.P C22771k c22771k) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f44941a;

        public b() {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                this.f44941a = new e();
            } else if (i12 >= 29) {
                this.f44941a = new d();
            } else {
                this.f44941a = new c();
            }
        }

        @j.N
        public final J0 a() {
            return this.f44941a.b();
        }

        @j.N
        public final void b(int i12, @j.N C22771k c22771k) {
            this.f44941a.c(i12, c22771k);
        }

        @j.N
        @Deprecated
        public final void c(@j.N C22771k c22771k) {
            this.f44941a.g(c22771k);
        }

        @j.N
        public final void d(int i12) {
            this.f44941a.i(i12, false);
        }

        public b(@j.N J0 j02) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                this.f44941a = new e(j02);
            } else if (i12 >= 29) {
                this.f44941a = new d(j02);
            } else {
                this.f44941a = new c(j02);
            }
        }
    }

    public J0(@j.P J0 j02) {
        if (j02 != null) {
            l lVar = j02.f44940a;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30 && (lVar instanceof k)) {
                this.f44940a = new k(this, (k) lVar);
            } else if (i12 >= 29 && (lVar instanceof j)) {
                this.f44940a = new j(this, (j) lVar);
            } else if (i12 >= 28 && (lVar instanceof i)) {
                this.f44940a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f44940a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f44940a = new g(this, (g) lVar);
            } else {
                this.f44940a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f44940a = new l(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class l {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public static final J0 f44966b = new b().f44941a.b().f44940a.a().f44940a.b().f44940a.c();

        /* renamed from: a, reason: collision with root package name */
        public final J0 f44967a;

        public l(@j.N J0 j02) {
            this.f44967a = j02;
        }

        @j.N
        public J0 a() {
            return this.f44967a;
        }

        @j.N
        public J0 b() {
            return this.f44967a;
        }

        @j.N
        public J0 c() {
            return this.f44967a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && Objects.equals(l(), lVar.l()) && Objects.equals(j(), lVar.j()) && Objects.equals(f(), lVar.f());
        }

        @j.P
        public C22826j f() {
            return null;
        }

        @j.N
        public C22771k g(int i12) {
            return C22771k.f44774e;
        }

        @j.N
        public C22771k h(int i12) {
            if ((i12 & 8) == 0) {
                return C22771k.f44774e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @j.N
        public C22771k i() {
            return l();
        }

        @j.N
        public C22771k j() {
            return C22771k.f44774e;
        }

        @j.N
        public C22771k k() {
            return l();
        }

        @j.N
        public C22771k l() {
            return C22771k.f44774e;
        }

        @j.N
        public C22771k m() {
            return l();
        }

        @j.N
        public J0 n(int i12, int i13, int i14, int i15) {
            return f44966b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i12) {
            return true;
        }

        public void d(@j.N View view) {
        }

        public void e(@j.N J0 j02) {
        }

        public void r(C22771k[] c22771kArr) {
        }

        public void s(@j.N C22771k c22771k) {
        }

        public void t(@j.P J0 j02) {
        }

        public void u(C22771k c22771k) {
        }
    }
}
