package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.M;
import j.N;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: CollapsingToolbarLayout.java */
/* loaded from: classes6.dex */
class g implements M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f355820b;

    public g(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f355820b = collapsingToolbarLayout;
    }

    @Override // androidx.core.view.M
    public final J0 h(View view, @N J0 j02) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f355820b;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        J0 j03 = collapsingToolbarLayout.getFitsSystemWindows() ? j02 : null;
        if (!Objects.equals(collapsingToolbarLayout.f355761B, j03)) {
            collapsingToolbarLayout.f355761B = j03;
            collapsingToolbarLayout.requestLayout();
        }
        return j02.c();
    }
}
