package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.c;
import com.google.android.material.internal.CheckableImageButton;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.e0;

/* compiled from: EndIconDelegate.java */
/* loaded from: classes6.dex */
abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f357514a;

    /* renamed from: b, reason: collision with root package name */
    public final p f357515b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f357516c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f357517d;

    public q(@N p pVar) {
        this.f357514a = pVar.f357484b;
        this.f357515b = pVar;
        this.f357516c = pVar.getContext();
        this.f357517d = pVar.f357490h;
    }

    @e0
    public int c() {
        return 0;
    }

    @InterfaceC42165v
    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public c.e h() {
        return null;
    }

    public boolean i(int i12) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof n;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f357515b.e(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(@P EditText editText) {
    }

    public void n(@N androidx.core.view.accessibility.f fVar) {
    }

    public void o(@N AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z12) {
    }
}
