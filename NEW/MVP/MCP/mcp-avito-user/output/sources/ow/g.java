package Ow;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;

/* compiled from: VisibilityItemsListener.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOw/g;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f12721b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashSet f12722c = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k l<? super Integer, G0> lVar) {
        this.f12721b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int iE02 = layoutManager.e0();
        for (int i14 = 0; i14 < iE02; i14++) {
            View viewD0 = layoutManager.d0(i14);
            if (viewD0 != null) {
                linkedHashSet.add(Integer.valueOf(RecyclerView.m.t0(viewD0)));
            }
        }
        LinkedHashSet linkedHashSet2 = this.f12722c;
        Iterator it = b1.f(linkedHashSet, linkedHashSet2).iterator();
        while (it.hasNext()) {
            this.f12721b.invoke(Integer.valueOf(((Number) it.next()).intValue()));
        }
        linkedHashSet2.clear();
        linkedHashSet2.addAll(linkedHashSet);
    }
}
