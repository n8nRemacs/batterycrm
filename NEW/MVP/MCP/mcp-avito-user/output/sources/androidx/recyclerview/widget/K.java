package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C23416g;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerView.java */
/* loaded from: classes10.dex */
class K implements C23416g.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f53682a;

    public K(RecyclerView recyclerView) {
        this.f53682a = recyclerView;
    }

    public final void a(View view) {
        RecyclerView.C cX2 = RecyclerView.X(view);
        if (cX2 != null) {
            cX2.onLeftHiddenState(this.f53682a);
        }
    }

    public final void b(int i12) {
        RecyclerView recyclerView = this.f53682a;
        View childAt = recyclerView.getChildAt(i12);
        if (childAt != null) {
            recyclerView.w(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i12);
    }
}
