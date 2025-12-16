package MV0;

import MV0.e;
import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction;
import dU0.InterfaceC39628a;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* compiled from: ScrollInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMV0/b;", "Landroidx/recyclerview/widget/RecyclerView;", "V", "LPT0/a;", "Lcom/avito/beduin/v2/interaction/scroll_to/api/ScrollToPositionInteraction;", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class b<V extends RecyclerView> extends PT0.a<V, ScrollToPositionInteraction> {
    public b() {
        super(ScrollToPositionInteraction.class);
    }

    @Override // PT0.a
    public final void c(InterfaceC39628a interfaceC39628a, View view) {
        View view2;
        ScrollToPositionInteraction scrollToPositionInteraction = (ScrollToPositionInteraction) interfaceC39628a;
        RecyclerView recyclerView = (RecyclerView) view;
        boolean z12 = scrollToPositionInteraction.f337818b;
        ScrollToPositionInteraction.Alignment alignment = scrollToPositionInteraction.f337819c;
        int i12 = scrollToPositionInteraction.f337817a;
        if (z12) {
            e eVar = new e(recyclerView.getContext(), alignment);
            eVar.f53878a = i12;
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.x1(eVar);
                return;
            }
            return;
        }
        RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 == null) {
            return;
        }
        layoutManager2.l1(i12);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new c(recyclerView, i12, layoutManager2, alignment));
            return;
        }
        RecyclerView.C cP2 = recyclerView.P(i12);
        if (cP2 == null || (view2 = cP2.itemView) == null) {
            return;
        }
        if (layoutManager2.I()) {
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
