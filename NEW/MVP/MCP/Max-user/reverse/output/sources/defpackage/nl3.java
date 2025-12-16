package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class nl3 extends Activity implements ggh, s07, kyd, j48, dz7 {
    public static final /* synthetic */ int C0 = 0;
    public final bwf A0;
    public final bwf B0;
    public final kl3 X;
    public final bwf Y;
    public final ll3 Z;
    public final l48 a = new l48(this);
    public final rl b = new rl(1);
    public final ka5 c;
    public final vd d;
    public fgh o;
    public final CopyOnWriteArrayList s0;
    public final CopyOnWriteArrayList t0;
    public final CopyOnWriteArrayList u0;
    public final CopyOnWriteArrayList v0;
    public final CopyOnWriteArrayList w0;
    public final CopyOnWriteArrayList x0;
    public boolean y0;
    public boolean z0;

    public nl3() {
        final b bVar = (b) this;
        this.c = new ka5(new dl3(bVar, 0));
        vd vdVar = new vd(this);
        this.d = vdVar;
        this.X = new kl3(bVar);
        this.Y = new bwf(new ml3(bVar, 2));
        new AtomicInteger();
        this.Z = new ll3(bVar);
        this.s0 = new CopyOnWriteArrayList();
        this.t0 = new CopyOnWriteArrayList();
        this.u0 = new CopyOnWriteArrayList();
        this.v0 = new CopyOnWriteArrayList();
        this.w0 = new CopyOnWriteArrayList();
        this.x0 = new CopyOnWriteArrayList();
        l48 l48Var = this.a;
        if (l48Var == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        l48Var.a(new b48() { // from class: el3
            @Override // defpackage.b48
            public final void d(j48 j48Var, k38 k38Var) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case 0:
                        b bVar2 = bVar;
                        if (k38Var == k38.ON_STOP && (window = bVar2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        b bVar3 = bVar;
                        if (k38Var == k38.ON_DESTROY) {
                            bVar3.b.c = null;
                            if (!bVar3.isChangingConfigurations()) {
                                bVar3.h().a();
                            }
                            kl3 kl3Var = bVar3.X;
                            b bVar4 = kl3Var.d;
                            bVar4.getWindow().getDecorView().removeCallbacks(kl3Var);
                            bVar4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kl3Var);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.a.a(new b48() { // from class: el3
            @Override // defpackage.b48
            public final void d(j48 j48Var, k38 k38Var) {
                Window window;
                View viewPeekDecorView;
                switch (i2) {
                    case 0:
                        b bVar2 = bVar;
                        if (k38Var == k38.ON_STOP && (window = bVar2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        b bVar3 = bVar;
                        if (k38Var == k38.ON_DESTROY) {
                            bVar3.b.c = null;
                            if (!bVar3.isChangingConfigurations()) {
                                bVar3.h().a();
                            }
                            kl3 kl3Var = bVar3.X;
                            b bVar4 = kl3Var.d;
                            bVar4.getWindow().getDecorView().removeCallbacks(kl3Var);
                            bVar4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kl3Var);
                            break;
                        }
                        break;
                }
            }
        });
        this.a.a(new nhd(i2, bVar));
        vdVar.q();
        zfi.e(this);
        ((pn) vdVar.d).f("android:support:activity-result", new fl3(bVar, 0));
        int i3 = 0;
        t(new gl3(bVar, i3));
        this.A0 = new bwf(new ml3(bVar, i3));
        this.B0 = new bwf(new ml3(bVar, 3));
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        this.X.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.s07
    public final dgh d() {
        return (dgh) this.A0.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (yoi.d(decorView, keyEvent)) {
            return true;
        }
        return yoi.e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (yoi.d(getWindow().getDecorView(), keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.s07
    public final d8a e() {
        d8a d8aVar = new d8a(0);
        if (getApplication() != null) {
            d8aVar.a(cgh.d, getApplication());
        }
        d8aVar.a(zfi.a, this);
        d8aVar.a(zfi.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            d8aVar.a(zfi.c, extras);
        }
        return d8aVar;
    }

    @Override // defpackage.ggh
    public final fgh h() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.o == null) {
            jl3 jl3Var = (jl3) getLastNonConfigurationInstance();
            if (jl3Var != null) {
                this.o = jl3Var.b;
            }
            if (this.o == null) {
                this.o = new fgh();
            }
        }
        return this.o;
    }

    @Override // defpackage.kyd
    public final pn l() {
        return (pn) this.d.d;
    }

    @Override // defpackage.dz7
    public final boolean o(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.Z.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        u().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.s0.iterator();
        while (it.hasNext()) {
            ((ju3) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.r(bundle);
        rl rlVar = this.b;
        rlVar.c = this;
        Iterator it = ((CopyOnWriteArraySet) rlVar.b).iterator();
        while (it.hasNext()) {
            ((mva) it.next()).a();
        }
        w(bundle);
        int i = nmd.b;
        lmd.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((ki6) it.next()).a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
            while (it.hasNext()) {
                if (((ki6) it.next()).a.p(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.y0) {
            return;
        }
        Iterator it = this.v0.iterator();
        while (it.hasNext()) {
            ((ju3) it.next()).accept(new w6a(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((ju3) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((ki6) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.z0) {
            return;
        }
        Iterator it = this.w0.iterator();
        while (it.hasNext()) {
            ((ju3) it.next()).accept(new mzb(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((ki6) it.next()).a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.Z.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        jl3 jl3Var;
        Object objX = x();
        fgh fghVar = this.o;
        if (fghVar == null && (jl3Var = (jl3) getLastNonConfigurationInstance()) != null) {
            fghVar = jl3Var.b;
        }
        if (fghVar == null && objX == null) {
            return null;
        }
        jl3 jl3Var2 = new jl3();
        jl3Var2.a = objX;
        jl3Var2.b = fghVar;
        return jl3Var2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        l48 l48Var = this.a;
        if (l48Var != null) {
            l48Var.g(l38.c);
        }
        y(bundle);
        this.d.s(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            ((ju3) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // defpackage.j48
    public final l48 p() {
        return this.a;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (kfi.f()) {
                Trace.beginSection(kfi.h("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            bm6 bm6Var = (bm6) this.Y.getValue();
            synchronized (bm6Var.b) {
                try {
                    bm6Var.c = true;
                    Iterator it = bm6Var.d.iterator();
                    while (it.hasNext()) {
                        ((cm6) it.next()).invoke();
                    }
                    bm6Var.d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void s(ju3 ju3Var) {
        this.s0.add(ju3Var);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        v();
        this.X.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    public final void t(mva mvaVar) {
        rl rlVar = this.b;
        if (((nl3) rlVar.c) != null) {
            mvaVar.a();
        }
        ((CopyOnWriteArraySet) rlVar.b).add(mvaVar);
    }

    public final jva u() {
        return (jva) this.B0.getValue();
    }

    public final void v() {
        pai.d(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(w0d.view_tree_view_model_store_owner, this);
        wqi.l(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(y0d.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(y0d.report_drawn, this);
    }

    public final void w(Bundle bundle) {
        super.onCreate(bundle);
        int i = nmd.b;
        lmd.b(this);
    }

    public Object x() {
        return null;
    }

    public final void y(Bundle bundle) {
        this.a.g(l38.c);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.y0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.y0 = false;
            Iterator it = this.v0.iterator();
            while (it.hasNext()) {
                ((ju3) it.next()).accept(new w6a(z));
            }
        } catch (Throwable th) {
            this.y0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.z0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.z0 = false;
            Iterator it = this.w0.iterator();
            while (it.hasNext()) {
                ((ju3) it.next()).accept(new mzb(z));
            }
        } catch (Throwable th) {
            this.z0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        v();
        this.X.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        this.X.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
