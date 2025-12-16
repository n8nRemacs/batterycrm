package MV0;

import MV0.e;
import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.m f10708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ScrollToPositionInteraction.Alignment f10709e;

    public c(RecyclerView recyclerView, int i12, RecyclerView.m mVar, ScrollToPositionInteraction.Alignment alignment) {
        this.f10706b = recyclerView;
        this.f10707c = i12;
        this.f10708d = mVar;
        this.f10709e = alignment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        View view2;
        view.removeOnLayoutChangeListener(this);
        RecyclerView recyclerView = this.f10706b;
        RecyclerView.C cP2 = recyclerView.P(this.f10707c);
        if (cP2 == null || (view2 = cP2.itemView) == null) {
            return;
        }
        boolean zI2 = this.f10708d.I();
        ScrollToPositionInteraction.Alignment alignment = this.f10709e;
        if (zI2) {
            e.a aVar = e.f10710q;
            int left = view2.getLeft();
            int right = view2.getRight();
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            aVar.getClass();
            recyclerView.scrollBy(-e.a.a(alignment, left, right, paddingLeft, width), 0);
            return;
        }
        e.a aVar2 = e.f10710q;
        int top = view2.getTop();
        int bottom = view2.getBottom();
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        aVar2.getClass();
        recyclerView.scrollBy(0, -e.a.a(alignment, top, bottom, paddingTop, height));
    }
}
