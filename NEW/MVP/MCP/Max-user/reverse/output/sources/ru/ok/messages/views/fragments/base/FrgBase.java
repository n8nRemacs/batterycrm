package ru.ok.messages.views.fragments.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.a;
import defpackage.d6;
import defpackage.en8;
import defpackage.f8;
import defpackage.i7g;
import defpackage.k5j;
import defpackage.kzf;
import defpackage.lk6;
import defpackage.q1g;
import defpackage.qm3;
import defpackage.sj0;
import defpackage.t1b;
import defpackage.tcf;
import defpackage.ucf;
import defpackage.wib;
import defpackage.wqi;
import defpackage.y4e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class FrgBase extends a implements i7g {
    public wib l1;
    public y4e m1;
    public q1g n1;
    public f8 p1;
    public lk6 q1;
    public ArrayList s1;
    public final String i1 = getClass().getSimpleName();
    public boolean j1 = true;
    public boolean k1 = false;
    public final HashSet o1 = new HashSet();
    public long r1 = 0;
    public final tcf t1 = ucf.a(null);

    public void A0(int i, String[] strArr, int[] iArr) {
    }

    @Override // androidx.fragment.app.a
    public final void J(int i, int i2, Intent intent) {
        super.J(i, i2, intent);
        if (this.k1) {
            w0(i, i2, intent);
        } else {
            this.p1 = new f8(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.a
    public final void K(Activity activity) {
        this.Q0 = true;
        wqi.c(this.i1, "lifecycle: onAttach", new Object[0]);
        if (!(activity instanceof d6)) {
            throw new IllegalStateException("Use FrgBase only in ActBase subclasses.");
        }
        this.j1 = true;
        x0((d6) activity);
    }

    @Override // androidx.fragment.app.a
    public void M(Bundle bundle) {
        d6 d6Var = (d6) t();
        wib wibVar = d6Var.J0;
        this.l1 = wibVar;
        ((t1b) ((qm3) wibVar.b)).getClass();
        this.m1 = y4e.a;
        this.n1 = d6Var.f();
        this.l1.getClass();
        super.M(bundle);
        wqi.c(this.i1, "lifecycle: onCreate", new Object[0]);
        if (this.j1) {
            throw new IllegalStateException("super.onAttachBase() not called");
        }
        if (bundle != null) {
            k5j.a(bundle, this.o1);
        }
        ((t1b) ((qm3) this.l1.b)).l().d(this);
        this.s1 = new ArrayList();
    }

    @Override // androidx.fragment.app.a
    public void P() {
        wqi.c(this.i1, "lifecycle: onDestroy", new Object[0]);
        ((t1b) ((qm3) this.l1.b)).l().f(this);
        this.Q0 = true;
        this.s1.clear();
    }

    @Override // androidx.fragment.app.a
    public void Q() {
        wqi.c(this.i1, "lifecycle: onDestroyView", new Object[0]);
        this.Q0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void R() {
        this.Q0 = true;
        wqi.c(this.i1, "lifecycle: onDetach", new Object[0]);
    }

    @Override // androidx.fragment.app.a
    public final void T(boolean z) {
        wqi.c(this.i1, "onHiddenChanged %b", Boolean.valueOf(z));
        this.t1.m(null, Boolean.valueOf(z));
    }

    @Override // androidx.fragment.app.a
    public void X() {
        this.Q0 = true;
        wqi.c(this.i1, "lifecycle: onPause", new Object[0]);
        this.k1 = false;
        if (TextUtils.isEmpty(t0())) {
            return;
        }
        ((t1b) ((qm3) this.l1.b)).a().i(SystemClock.elapsedRealtime() - this.r1, t0());
    }

    @Override // androidx.fragment.app.a
    public final void Z(int i, String[] strArr, int[] iArr) {
        if (this.k1) {
            A0(i, strArr, iArr);
        } else {
            this.q1 = new lk6(i, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.a
    public void a0() {
        this.Q0 = true;
        String str = this.i1;
        wqi.c(str, "lifecycle: onResume", new Object[0]);
        StringBuilder sb = new StringBuilder("unhandled events: ");
        HashSet hashSet = this.o1;
        sb.append(hashSet.size());
        wqi.c(str, sb.toString(), new Object[0]);
        this.k1 = true;
        this.r1 = SystemClock.elapsedRealtime();
        ((kzf) ((t1b) ((qm3) this.l1.b)).getAccessor().c(624)).getClass();
        if (((y4e) kzf.a()).b().b()) {
            en8 en8VarL = ((t1b) ((qm3) this.l1.b)).l();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                en8VarL.c((sj0) it.next());
            }
            hashSet.clear();
        }
        lk6 lk6Var = this.q1;
        if (lk6Var != null) {
            A0(lk6Var.b, (String[]) lk6Var.c, (int[]) lk6Var.d);
            this.q1 = null;
        }
        f8 f8Var = this.p1;
        if (f8Var != null) {
            w0(f8Var.a, f8Var.b, f8Var.c);
            this.p1 = null;
        }
    }

    @Override // androidx.fragment.app.a
    public void b0(Bundle bundle) {
        wqi.c("k5j", "onSaveInstanceState", new Object[0]);
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(this.o1));
    }

    @Override // androidx.fragment.app.a
    public final void c0() {
        this.Q0 = true;
        wqi.c(this.i1, "lifecycle: onStart", new Object[0]);
    }

    @Override // androidx.fragment.app.a
    public final void d0() {
        this.Q0 = true;
        wqi.c(this.i1, "lifecycle: onStop", new Object[0]);
    }

    @Override // defpackage.i7g
    public final q1g f() {
        return this.n1;
    }

    @Override // androidx.fragment.app.a
    public final void f0(Bundle bundle) {
        this.Q0 = true;
    }

    public final void s0() {
        d6 d6VarU0 = u0();
        if (d6VarU0 != null) {
            d6VarU0.finish();
        }
    }

    public String t0() {
        return null;
    }

    public final d6 u0() {
        if (t() == null || t().isFinishing()) {
            return null;
        }
        return (d6) t();
    }

    public void v0() {
    }

    public void w0(int i, int i2, Intent intent) {
    }

    public void x0(d6 d6Var) {
        this.j1 = false;
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(int i, KeyEvent keyEvent) {
        Iterator it = this.s1.iterator();
        while (it.hasNext()) {
            if (((FrgBase) it.next()).z0(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }
}
