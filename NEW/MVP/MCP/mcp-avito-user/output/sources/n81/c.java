package N81;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FloatingToolbarRecyclerViewOnScrollListener.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LN81/c;", "Landroidx/recyclerview/widget/RecyclerView$r;", "LN81/e;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c extends RecyclerView.r implements e {

    /* renamed from: b, reason: collision with root package name */
    public int f11232b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f11233c;

    public /* synthetic */ c(View view, View view2, View view3, boolean z12, int i12, C42822w c42822w) {
        this(view, view2, view3, (i12 & 8) != 0 ? true : z12);
    }

    @Override // N81.e
    public final void b() {
        b bVar = this.f11233c;
        View view = bVar.f11223a;
        if (view.getTranslationY() == 0.0f) {
            return;
        }
        bVar.c(true);
        view.setTranslationY(0.0f);
    }

    @Override // N81.e
    public final boolean f() {
        return this.f11232b != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        if (i12 == 0) {
            this.f11233c.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        this.f11232b = iComputeVerticalScrollOffset;
        this.f11233c.b(i13, iComputeVerticalScrollOffset);
    }

    public c(@k View view, @k View view2, @k View view3, boolean z12) {
        this.f11233c = new b(view, view2, view3, z12);
    }
}
