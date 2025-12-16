package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.WeakHashMap;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes6.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    public final View f355838a;

    /* renamed from: b, reason: collision with root package name */
    public int f355839b;

    /* renamed from: c, reason: collision with root package name */
    public int f355840c;

    /* renamed from: d, reason: collision with root package name */
    public int f355841d;

    public l(View view) {
        this.f355838a = view;
    }

    public final void a() {
        int i12 = this.f355841d;
        View view = this.f355838a;
        int top = i12 - (view.getTop() - this.f355839b);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f355840c));
    }

    public final boolean b(int i12) {
        if (this.f355841d == i12) {
            return false;
        }
        this.f355841d = i12;
        a();
        return true;
    }
}
