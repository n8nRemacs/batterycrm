package com.google.android.material.behavior;

import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.i;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j.N;
import java.util.WeakHashMap;

/* compiled from: SwipeDismissBehavior.java */
/* loaded from: classes6.dex */
class b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f355920b;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f355920b = swipeDismissBehavior;
    }

    @Override // androidx.core.view.accessibility.i
    public final boolean c(@N View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f355920b;
        if (!swipeDismissBehavior.v(view)) {
            return false;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z12 = view.getLayoutDirection() == 1;
        int i12 = swipeDismissBehavior.f355908e;
        view.offsetLeftAndRight((!(i12 == 0 && z12) && (i12 != 1 || z12)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = swipeDismissBehavior.f355905b;
        if (bVar != null) {
            bVar.b(view);
        }
        return true;
    }
}
