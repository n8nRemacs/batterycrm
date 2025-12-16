package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j.N;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes6.dex */
class k implements SwipeDismissBehavior.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f357337a;

    public k(BaseTransientBottomBar baseTransientBottomBar) {
        this.f357337a = baseTransientBottomBar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.b
    public final void a(int i12) {
        BaseTransientBottomBar baseTransientBottomBar = this.f357337a;
        if (i12 == 0) {
            o.b().e(baseTransientBottomBar.f357299w);
        } else if (i12 == 1 || i12 == 2) {
            o.b().d(baseTransientBottomBar.f357299w);
        }
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.b
    public final void b(@N View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f357337a.b(0);
    }
}
