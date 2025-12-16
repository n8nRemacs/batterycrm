package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class bo implements Window.Callback {
    public final /* synthetic */ ho X;
    public final Window.Callback a;
    public ulc b;
    public boolean c;
    public boolean d;
    public boolean o;

    public bo(ho hoVar, Window.Callback callback) {
        this.X = hoVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        g3i.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.X.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            ho hoVar = this.X;
            hoVar.A();
            kpi kpiVar = hoVar.y0;
            if (kpiVar == null || !kpiVar.k(keyCode, keyEvent)) {
                go goVar = hoVar.W0;
                if (goVar == null || !hoVar.F(goVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (hoVar.W0 == null) {
                        go goVarZ = hoVar.z(0);
                        hoVar.G(goVarZ, keyEvent);
                        boolean zF = hoVar.F(goVarZ, keyEvent.getKeyCode(), keyEvent);
                        goVarZ.k = false;
                        if (zF) {
                        }
                    }
                    return false;
                }
                go goVar2 = hoVar.W0;
                if (goVar2 != null) {
                    goVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof vf9)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        ulc ulcVar = this.b;
        if (ulcVar != null) {
            View view = i == 0 ? new View(((acg) ulcVar.b).a.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(i, menu);
        ho hoVar = this.X;
        if (i == 108) {
            hoVar.A();
            kpi kpiVar = hoVar.y0;
            if (kpiVar != null) {
                kpiVar.e(true);
            }
        } else {
            hoVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.o) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        ho hoVar = this.X;
        if (i == 108) {
            hoVar.A();
            kpi kpiVar = hoVar.y0;
            if (kpiVar != null) {
                kpiVar.e(false);
                return;
            }
            return;
        }
        if (i == 0) {
            go goVarZ = hoVar.z(i);
            if (goVarZ.m) {
                hoVar.s(goVarZ, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        h3i.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        vf9 vf9Var = menu instanceof vf9 ? (vf9) menu : null;
        if (i == 0 && vf9Var == null) {
            return false;
        }
        if (vf9Var != null) {
            vf9Var.H0 = true;
        }
        ulc ulcVar = this.b;
        if (ulcVar != null && i == 0) {
            acg acgVar = (acg) ulcVar.b;
            if (!acgVar.d) {
                acgVar.a.l = true;
                acgVar.d = true;
            }
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (vf9Var != null) {
            vf9Var.H0 = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        vf9 vf9Var = this.X.z(0).h;
        if (vf9Var != null) {
            d(list, vf9Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return f3i.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (i != 0) {
            return f3i.b(this.a, callback, i);
        }
        ho hoVar = this.X;
        Context context = hoVar.u0;
        fa6 fa6Var = new fa6();
        fa6Var.b = context;
        fa6Var.a = callback;
        fa6Var.c = new ArrayList();
        boolean z = false;
        fa6Var.d = new z0f(0);
        l7 l7Var = hoVar.E0;
        if (l7Var != null) {
            l7Var.a();
        }
        h79 h79Var = new h79(hoVar, fa6Var, z, 3);
        hoVar.A();
        kpi kpiVar = hoVar.y0;
        if (kpiVar != null) {
            hoVar.E0 = kpiVar.q(h79Var);
        }
        if (hoVar.E0 == null) {
            dhh dhhVar = hoVar.I0;
            if (dhhVar != null) {
                dhhVar.b();
            }
            l7 l7Var2 = hoVar.E0;
            if (l7Var2 != null) {
                l7Var2.a();
            }
            int i2 = 1;
            if (hoVar.F0 == null) {
                if (hoVar.S0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(fvc.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        m44 m44Var = new m44(context, 0);
                        m44Var.getTheme().setTo(themeNewTheme);
                        context = m44Var;
                    }
                    hoVar.F0 = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, fvc.actionModePopupWindowStyle);
                    hoVar.G0 = popupWindow;
                    r6c.d(popupWindow, 2);
                    hoVar.G0.setContentView(hoVar.F0);
                    hoVar.G0.setWidth(-1);
                    context.getTheme().resolveAttribute(fvc.actionBarSize, typedValue, true);
                    hoVar.F0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    hoVar.G0.setHeight(-2);
                    hoVar.H0 = new vn(hoVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) hoVar.K0.findViewById(zxc.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        hoVar.A();
                        kpi kpiVar2 = hoVar.y0;
                        Context contextG = kpiVar2 != null ? kpiVar2.g() : null;
                        if (contextG != null) {
                            context = contextG;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        hoVar.F0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (hoVar.F0 != null) {
                dhh dhhVar2 = hoVar.I0;
                if (dhhVar2 != null) {
                    dhhVar2.b();
                }
                hoVar.F0.e();
                Context context2 = hoVar.F0.getContext();
                ActionBarContextView actionBarContextView = hoVar.F0;
                w9f w9fVar = new w9f();
                w9fVar.c = context2;
                w9fVar.d = actionBarContextView;
                w9fVar.o = h79Var;
                vf9 vf9Var = new vf9(actionBarContextView.getContext());
                vf9Var.v0 = 1;
                w9fVar.Z = vf9Var;
                vf9Var.o = w9fVar;
                if (((fa6) h79Var.b).z(w9fVar, vf9Var)) {
                    w9fVar.i();
                    hoVar.F0.c(w9fVar);
                    hoVar.E0 = w9fVar;
                    if (hoVar.J0 && (viewGroup = hoVar.K0) != null && viewGroup.isLaidOut()) {
                        hoVar.F0.setAlpha(0.0f);
                        dhh dhhVarA = hfh.a(hoVar.F0);
                        dhhVarA.a(1.0f);
                        hoVar.I0 = dhhVarA;
                        dhhVarA.d(new wn(i2, hoVar));
                    } else {
                        hoVar.F0.setAlpha(1.0f);
                        hoVar.F0.setVisibility(0);
                        if (hoVar.F0.getParent() instanceof View) {
                            View view = (View) hoVar.F0.getParent();
                            WeakHashMap weakHashMap = hfh.a;
                            teh.c(view);
                        }
                    }
                    if (hoVar.G0 != null) {
                        hoVar.v0.getDecorView().post(hoVar.H0);
                    }
                } else {
                    hoVar.E0 = null;
                }
            }
            hoVar.I();
            hoVar.E0 = hoVar.E0;
        }
        hoVar.I();
        l7 l7Var3 = hoVar.E0;
        if (l7Var3 != null) {
            return fa6Var.v(l7Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
