package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ho extends un implements tf9, LayoutInflater.Factory2 {
    public static final z0f r1 = new z0f(0);
    public static final int[] s1 = {R.attr.windowBackground};
    public static final boolean t1 = !"robolectric".equals(Build.FINGERPRINT);
    public CharSequence A0;
    public wh4 B0;
    public iv6 C0;
    public ao6 D0;
    public l7 E0;
    public ActionBarContextView F0;
    public PopupWindow G0;
    public vn H0;
    public boolean J0;
    public ViewGroup K0;
    public TextView L0;
    public View M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public go[] V0;
    public go W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public Configuration b1;
    public final int c1;
    public int d1;
    public int e1;
    public boolean f1;
    public co g1;
    public co h1;
    public boolean i1;
    public int j1;
    public boolean l1;
    public Rect m1;
    public Rect n1;
    public wp o1;
    public OnBackInvokedDispatcher p1;
    public OnBackInvokedCallback q1;
    public final Object t0;
    public final Context u0;
    public Window v0;
    public bo w0;
    public final Object x0;
    public kpi y0;
    public mrf z0;
    public dhh I0 = null;
    public final vn k1 = new vn(this, 0);

    public ho(Context context, Window window, nn nnVar, Object obj) {
        ln lnVar = null;
        this.c1 = -100;
        this.u0 = context;
        this.x0 = nnVar;
        this.t0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof ln)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        lnVar = (ln) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (lnVar != null) {
                this.c1 = ((ho) lnVar.C()).c1;
            }
        }
        if (this.c1 == -100) {
            String name = this.t0.getClass().getName();
            z0f z0fVar = r1;
            Integer num = (Integer) z0fVar.get(name);
            if (num != null) {
                this.c1 = num.intValue();
                z0fVar.remove(this.t0.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        ko.d();
    }

    public static we8 p(Context context) {
        we8 we8Var;
        we8 we8Var2;
        if (Build.VERSION.SDK_INT >= 33 || (we8Var = un.c) == null) {
            return null;
        }
        xe8 xe8Var = we8Var.a;
        we8 we8VarB = yn.b(context.getApplicationContext().getResources().getConfiguration());
        if (xe8Var.a.isEmpty()) {
            we8Var2 = we8.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < we8VarB.b() + we8Var.b()) {
                Locale locale = i < we8Var.b() ? xe8Var.a.get(i) : we8VarB.a.a.get(i - we8Var.b());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            we8Var2 = new we8(new xe8(ve8.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return we8Var2.a.a.isEmpty() ? we8VarB : we8Var2;
    }

    public static Configuration t(Context context, int i, we8 we8Var, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (we8Var != null) {
            yn.d(configuration2, we8Var);
        }
        return configuration2;
    }

    public final void A() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        if (this.P0 && this.y0 == null) {
            Object obj = this.t0;
            if (obj instanceof Activity) {
                this.y0 = new l3i((Activity) obj, this.Q0);
            } else if (obj instanceof Dialog) {
                this.y0 = new l3i((Dialog) obj);
            }
            kpi kpiVar = this.y0;
            if (kpiVar != null) {
                kpiVar.n(this.l1);
            }
        }
    }

    public final void B(int i) {
        this.j1 = (1 << i) | this.j1;
        if (this.i1) {
            return;
        }
        View decorView = this.v0.getDecorView();
        WeakHashMap weakHashMap = hfh.a;
        decorView.postOnAnimation(this.k1);
        this.i1 = true;
    }

    public final int C(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.h1 == null) {
                            this.h1 = new co(this, context);
                        }
                        return this.h1.H();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).H();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean D() {
        boolean z = this.X0;
        this.X0 = false;
        go goVarZ = z(0);
        if (!goVarZ.m) {
            l7 l7Var = this.E0;
            if (l7Var != null) {
                l7Var.a();
                return true;
            }
            A();
            kpi kpiVar = this.y0;
            if (kpiVar == null || !kpiVar.d()) {
                return false;
            }
        } else if (!z) {
            s(goVarZ, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.Y.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.go r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho.E(go, android.view.KeyEvent):void");
    }

    public final boolean F(go goVar, int i, KeyEvent keyEvent) {
        vf9 vf9Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((goVar.k || G(goVar, keyEvent)) && (vf9Var = goVar.h) != null) {
            return vf9Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(defpackage.go r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho.G(go, android.view.KeyEvent):boolean");
    }

    public final void H() {
        if (this.J0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.p1 != null && (z(0).m || this.E0 != null)) {
                z = true;
            }
            if (z && this.q1 == null) {
                this.q1 = ao.b(this.p1, this);
            } else {
                if (z || (onBackInvokedCallback = this.q1) == null) {
                    return;
                }
                ao.c(this.p1, onBackInvokedCallback);
                this.q1 = null;
            }
        }
    }

    @Override // defpackage.un
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.u0);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof ho) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.tf9
    public final boolean b(vf9 vf9Var, MenuItem menuItem) {
        go goVar;
        Window.Callback callback = this.v0.getCallback();
        if (callback != null && !this.a1) {
            vf9 vf9VarK = vf9Var.k();
            go[] goVarArr = this.V0;
            int length = goVarArr != null ? goVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    goVar = goVarArr[i];
                    if (goVar != null && goVar.h == vf9VarK) {
                        break;
                    }
                    i++;
                } else {
                    goVar = null;
                    break;
                }
            }
            if (goVar != null) {
                return callback.onMenuItemSelected(goVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.un
    public final void c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.y0 != null) {
            A();
            if (this.y0.h()) {
                return;
            }
            B(0);
        }
    }

    @Override // defpackage.un
    public final void e() throws PackageManager.NameNotFoundException {
        String strD;
        this.Y0 = true;
        n(false, true);
        x();
        Object obj = this.t0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strD = uxi.d(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strD = null;
            }
            if (strD != null) {
                kpi kpiVar = this.y0;
                if (kpiVar == null) {
                    this.l1 = true;
                } else {
                    kpiVar.n(true);
                }
            }
            synchronized (un.Z) {
                un.h(this);
                un.Y.add(new WeakReference(this));
            }
        }
        this.b1 = new Configuration(this.u0.getResources().getConfiguration());
        this.Z0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // defpackage.tf9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.vf9 r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            wh4 r6 = r5.B0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            xh4 r6 = r6.o
            fcg r6 = (defpackage.fcg) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.d
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.u0
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            wh4 r6 = r5.B0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            xh4 r6 = r6.o
            fcg r6 = (defpackage.fcg) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto Ld3
            h7 r6 = r6.o
            if (r6 == 0) goto Ld3
            zn6 r2 = r6.E0
            if (r2 != 0) goto L4a
            boolean r6 = r6.j()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.v0
            android.view.Window$Callback r6 = r6.getCallback()
            wh4 r2 = r5.B0
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.e()
            xh4 r2 = r2.o
            fcg r2 = (defpackage.fcg) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.p()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            wh4 r0 = r5.B0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.e()
            xh4 r0 = r0.o
            fcg r0 = (defpackage.fcg) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L7e
            h7 r0 = r0.o
            if (r0 == 0) goto L7e
            boolean r0 = r0.g()
        L7e:
            boolean r0 = r5.a1
            if (r0 != 0) goto Ld2
            go r0 = r5.z(r1)
            vf9 r0 = r0.h
            r6.onPanelClosed(r3, r0)
            return
        L8c:
            if (r6 == 0) goto Ld2
            boolean r2 = r5.a1
            if (r2 != 0) goto Ld2
            boolean r2 = r5.i1
            if (r2 == 0) goto La9
            int r2 = r5.j1
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.v0
            android.view.View r0 = r0.getDecorView()
            vn r2 = r5.k1
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            go r0 = r5.z(r1)
            vf9 r2 = r0.h
            if (r2 == 0) goto Ld2
            boolean r4 = r0.o
            if (r4 != 0) goto Ld2
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Ld2
            vf9 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            wh4 r6 = r5.B0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            xh4 r6 = r6.o
            fcg r6 = (defpackage.fcg) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            r6.w()
        Ld2:
            return
        Ld3:
            go r6 = r5.z(r1)
            r6.n = r0
            r5.s(r6, r1)
            r0 = 0
            r5.E(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho.f(vf9):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.t0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.un.Z
            monitor-enter(r0)
            defpackage.un.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.i1
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.v0
            android.view.View r0 = r0.getDecorView()
            vn r1 = r3.k1
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.a1 = r0
            int r0 = r3.c1
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.t0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            z0f r0 = defpackage.ho.r1
            java.lang.Object r1 = r3.t0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.c1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            z0f r0 = defpackage.ho.r1
            java.lang.Object r1 = r3.t0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            kpi r0 = r3.y0
            if (r0 == 0) goto L63
            r0.j()
        L63:
            co r0 = r3.g1
            if (r0 == 0) goto L6a
            r0.C()
        L6a:
            co r0 = r3.h1
            if (r0 == 0) goto L71
            r0.C()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho.g():void");
    }

    @Override // defpackage.un
    public final boolean i(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.T0 && i == 108) {
            return false;
        }
        if (this.P0 && i == 1) {
            this.P0 = false;
        }
        if (i == 1) {
            H();
            this.T0 = true;
            return true;
        }
        if (i == 2) {
            H();
            this.N0 = true;
            return true;
        }
        if (i == 5) {
            H();
            this.O0 = true;
            return true;
        }
        if (i == 10) {
            H();
            this.R0 = true;
            return true;
        }
        if (i == 108) {
            H();
            this.P0 = true;
            return true;
        }
        if (i != 109) {
            return this.v0.requestFeature(i);
        }
        H();
        this.Q0 = true;
        return true;
    }

    @Override // defpackage.un
    public final void j(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.K0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.u0).inflate(i, viewGroup);
        this.w0.a(this.v0.getCallback());
    }

    @Override // defpackage.un
    public final void k(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.K0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.w0.a(this.v0.getCallback());
    }

    @Override // defpackage.un
    public final void l(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.K0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.w0.a(this.v0.getCallback());
    }

    @Override // defpackage.un
    public final void m(CharSequence charSequence) {
        this.A0 = charSequence;
        wh4 wh4Var = this.B0;
        if (wh4Var != null) {
            wh4Var.setWindowTitle(charSequence);
            return;
        }
        kpi kpiVar = this.y0;
        if (kpiVar != null) {
            kpiVar.p(charSequence);
            return;
        }
        TextView textView = this.L0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(boolean r13, boolean r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho.n(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.v0
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof defpackage.bo
            if (r2 != 0) goto L7a
            bo r0 = new bo
            r0.<init>(r7, r1)
            r7.w0 = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.u0
            int[] r1 = defpackage.ho.s1
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            ko r4 = defpackage.ko.a()
            monitor-enter(r4)
            eod r5 = r4.a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.c(r3, r0, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.v0 = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.p1
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.t0
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.q1
            if (r1 == 0) goto L61
            defpackage.ao.c(r8, r1)
            r7.q1 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = defpackage.ao.a(r0)
            r7.p1 = r8
            goto L76
        L74:
            r7.p1 = r2
        L76:
            r7.I()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho.o(android.view.Window):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:118:0x01e3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void q(int i, go goVar, vf9 vf9Var) {
        if (vf9Var == null) {
            if (goVar == null && i >= 0) {
                go[] goVarArr = this.V0;
                if (i < goVarArr.length) {
                    goVar = goVarArr[i];
                }
            }
            if (goVar != null) {
                vf9Var = goVar.h;
            }
        }
        if ((goVar == null || goVar.m) && !this.a1) {
            bo boVar = this.w0;
            Window.Callback callback = this.v0.getCallback();
            boVar.getClass();
            try {
                boVar.o = true;
                callback.onPanelClosed(i, vf9Var);
            } finally {
                boVar.o = false;
            }
        }
    }

    public final void r(vf9 vf9Var) {
        h7 h7Var;
        if (this.U0) {
            return;
        }
        this.U0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.B0;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((fcg) actionBarOverlayLayout.o).a.a;
        if (actionMenuView != null && (h7Var = actionMenuView.o) != null) {
            h7Var.g();
            e7 e7Var = h7Var.D0;
            if (e7Var != null && e7Var.b()) {
                e7Var.i.dismiss();
            }
        }
        Window.Callback callback = this.v0.getCallback();
        if (callback != null && !this.a1) {
            callback.onPanelClosed(108, vf9Var);
        }
        this.U0 = false;
    }

    public final void s(go goVar, boolean z) {
        fo foVar;
        wh4 wh4Var;
        if (z && goVar.a == 0 && (wh4Var = this.B0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) wh4Var;
            actionBarOverlayLayout.e();
            if (((fcg) actionBarOverlayLayout.o).a.p()) {
                r(goVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.u0.getSystemService("window");
        if (windowManager != null && goVar.m && (foVar = goVar.e) != null) {
            windowManager.removeView(foVar);
            if (z) {
                q(goVar.a, goVar, null);
            }
        }
        goVar.k = false;
        goVar.l = false;
        goVar.m = false;
        goVar.f = null;
        goVar.n = true;
        if (this.W0 == goVar) {
            this.W0 = null;
        }
        if (goVar.a == 0) {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i) {
        go goVarZ = z(i);
        if (goVarZ.h != null) {
            Bundle bundle = new Bundle();
            goVarZ.h.t(bundle);
            if (bundle.size() > 0) {
                goVarZ.p = bundle;
            }
            goVarZ.h.w();
            goVarZ.h.clear();
        }
        goVarZ.o = true;
        goVarZ.n = true;
        if ((i == 108 || i == 0) && this.B0 != null) {
            go goVarZ2 = z(0);
            goVarZ2.k = false;
            G(goVarZ2, null);
        }
    }

    public final void w() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.J0) {
            return;
        }
        int[] iArr = o6d.AppCompatTheme;
        Context context = this.u0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(o6d.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(o6d.AppCompatTheme_windowNoTitle, false)) {
            i(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(o6d.AppCompatTheme_windowActionBar, false)) {
            i(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(o6d.AppCompatTheme_windowActionBarOverlay, false)) {
            i(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(o6d.AppCompatTheme_windowActionModeOverlay, false)) {
            i(10);
        }
        this.S0 = typedArrayObtainStyledAttributes.getBoolean(o6d.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.v0.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = 2;
        if (this.T0) {
            viewGroup = this.R0 ? (ViewGroup) layoutInflaterFrom.inflate(p1d.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(p1d.abc_screen_simple, (ViewGroup) null);
        } else if (this.S0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(p1d.abc_dialog_title_material, (ViewGroup) null);
            this.Q0 = false;
            this.P0 = false;
        } else if (this.P0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(fvc.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new m44(context, typedValue.resourceId) : context).inflate(p1d.abc_screen_toolbar, (ViewGroup) null);
            wh4 wh4Var = (wh4) viewGroup.findViewById(zxc.decor_content_parent);
            this.B0 = wh4Var;
            wh4Var.setWindowCallback(this.v0.getCallback());
            if (this.Q0) {
                ((ActionBarOverlayLayout) this.B0).d(109);
            }
            if (this.N0) {
                ((ActionBarOverlayLayout) this.B0).d(2);
            }
            if (this.O0) {
                ((ActionBarOverlayLayout) this.B0).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.P0);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.Q0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.S0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.R0);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(az1.k(sb, this.T0, " }"));
        }
        usd usdVar = new usd(i, this);
        WeakHashMap weakHashMap = hfh.a;
        veh.u(viewGroup, usdVar);
        if (this.B0 == null) {
            this.L0 = (TextView) viewGroup.findViewById(zxc.title);
        }
        boolean z = whh.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(zxc.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.v0.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.v0.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new mc5(i, this));
        this.K0 = viewGroup;
        Object obj = this.t0;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.A0;
        if (!TextUtils.isEmpty(title)) {
            wh4 wh4Var2 = this.B0;
            if (wh4Var2 != null) {
                wh4Var2.setWindowTitle(title);
            } else {
                kpi kpiVar = this.y0;
                if (kpiVar != null) {
                    kpiVar.p(title);
                } else {
                    TextView textView = this.L0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.K0.findViewById(R.id.content);
        View decorView = this.v0.getDecorView();
        contentFrameLayout2.t0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(o6d.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(o6d.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(o6d.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(o6d.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(o6d.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(o6d.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(o6d.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(o6d.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(o6d.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(o6d.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(o6d.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.J0 = true;
        go goVarZ = z(0);
        if (this.a1 || goVarZ.h != null) {
            return;
        }
        B(108);
    }

    public final void x() {
        if (this.v0 == null) {
            Object obj = this.t0;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.v0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final n2 y(Context context) {
        if (this.g1 == null) {
            if (jdc.X == null) {
                Context applicationContext = context.getApplicationContext();
                jdc.X = new jdc(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.g1 = new co(this, jdc.X);
        }
        return this.g1;
    }

    public final go z(int i) {
        go[] goVarArr = this.V0;
        if (goVarArr == null || goVarArr.length <= i) {
            go[] goVarArr2 = new go[i + 1];
            if (goVarArr != null) {
                System.arraycopy(goVarArr, 0, goVarArr2, 0, goVarArr.length);
            }
            this.V0 = goVarArr2;
            goVarArr = goVarArr2;
        }
        go goVar = goVarArr[i];
        if (goVar != null) {
            return goVar;
        }
        go goVar2 = new go();
        goVar2.a = i;
        goVar2.n = false;
        goVarArr[i] = goVar2;
        return goVar2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
