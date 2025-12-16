package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j.N;

/* compiled from: ViewPager2.java */
/* loaded from: classes10.dex */
class i implements RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j(@N View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) nVar).width != -1 || ((ViewGroup.MarginLayoutParams) nVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(@N View view) {
    }
}
