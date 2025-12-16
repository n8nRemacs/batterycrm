package com.my.target;

import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public class t1 extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    @j.P
    public a f365158F0;

    public interface a {
        void b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void C0(int i12, int i13) {
        D0(i12, i13, new AccelerateDecelerateInterpolator());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i12) {
        a aVar;
        if (i12 == 0 && (aVar = this.f365158F0) != null) {
            aVar.b();
        }
    }

    public void setMoveStopListener(@j.P a aVar) {
        this.f365158F0 = aVar;
    }
}
