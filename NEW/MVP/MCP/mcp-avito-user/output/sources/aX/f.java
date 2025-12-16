package Ax;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TargetViewVisibilityHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LAx/f;", "LAx/e;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends RecyclerView.r implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC13095a f710b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public RecyclerView f711c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.konveyor.adapter.b f712d;

    @Inject
    public f(@k InterfaceC13095a interfaceC13095a) {
        this.f710b = interfaceC13095a;
    }

    @Override // Ax.e
    public final void a() {
        RecyclerView recyclerView = this.f711c;
        if (recyclerView != null) {
            recyclerView.v0(this);
        }
        this.f711c = null;
        this.f712d = null;
    }

    @Override // Ax.e
    public final void e(@k RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f711c;
        if (recyclerView2 != null) {
            recyclerView2.v0(this);
        }
        this.f711c = recyclerView;
        recyclerView.o(this);
    }

    @Override // Ax.e
    public final void g(@k com.avito.konveyor.adapter.b bVar) {
        this.f712d = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        View view;
        RecyclerView recyclerView2;
        com.avito.konveyor.adapter.b bVar = this.f712d;
        boolean zContains = false;
        if (bVar != null && (view = bVar.itemView) != null && (recyclerView2 = this.f711c) != null && view.getHeight() > 0 && view.getWidth() > 0) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            view.getGlobalVisibleRect(rect);
            recyclerView2.getGlobalVisibleRect(rect2);
            zContains = rect2.contains(rect);
        }
        if (zContains) {
            this.f710b.e();
        }
    }
}
