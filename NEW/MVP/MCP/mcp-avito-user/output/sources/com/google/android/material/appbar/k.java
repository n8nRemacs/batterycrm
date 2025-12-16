package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes6.dex */
public class k<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public l f355836a;

    /* renamed from: b, reason: collision with root package name */
    public int f355837b;

    public k() {
        this.f355837b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(@N CoordinatorLayout coordinatorLayout, @N V v12, int i12) {
        x(coordinatorLayout, v12, i12);
        if (this.f355836a == null) {
            this.f355836a = new l(v12);
        }
        l lVar = this.f355836a;
        View view = lVar.f355838a;
        lVar.f355839b = view.getTop();
        lVar.f355840c = view.getLeft();
        this.f355836a.a();
        int i13 = this.f355837b;
        if (i13 == 0) {
            return true;
        }
        this.f355836a.b(i13);
        this.f355837b = 0;
        return true;
    }

    public int v() {
        l lVar = this.f355836a;
        if (lVar != null) {
            return lVar.f355841d;
        }
        return 0;
    }

    public int w() {
        return v();
    }

    public void x(@N CoordinatorLayout coordinatorLayout, @N V v12, int i12) {
        coordinatorLayout.onLayoutChild(v12, i12);
    }

    public boolean y(int i12) {
        l lVar = this.f355836a;
        if (lVar != null) {
            return lVar.b(i12);
        }
        this.f355837b = i12;
        return false;
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f355837b = 0;
    }
}
