package IO;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemSpaceDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIO/d;", "LIO/a;", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f8173b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f8174c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final HashMap<Integer, e> f8175d;

    public d() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public static void c(d dVar, TV0.b bVar, int i12, int i13, int i14, int i15) {
        dVar.f8175d.put(Integer.valueOf(TV0.c.a(bVar)), new b(0, i12, 0, i13, i14, i15));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        c cVar;
        RecyclerView.C cW2 = recyclerView.W(view);
        int bindingAdapterPosition = cW2.getBindingAdapterPosition() != -1 ? cW2.getBindingAdapterPosition() : cW2.getOldPosition();
        e eVar = this.f8175d.get(Integer.valueOf(recyclerView.W(view).getItemViewType()));
        if (eVar != null) {
            cVar = this.f8174c;
            cVar.f8167a = 0;
            cVar.f8168b = 0;
            cVar.f8169c = 0;
            cVar.f8170d = 0;
            cVar.f8171e = 0;
            cVar.f8172f = 0;
            eVar.a(cVar);
        } else {
            cVar = this.f8173b;
        }
        boolean z12 = recyclerView.getAdapter() != null && bindingAdapterPosition == 0;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z13 = adapter != null && bindingAdapterPosition == adapter.getItemCount() - 1;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).f53690r : 1) == 1) {
            if (z12) {
                rect.top = cVar.f8171e;
            } else {
                rect.top = cVar.f8168b;
            }
            if (z13) {
                rect.bottom = cVar.f8172f;
            } else {
                rect.bottom = cVar.f8170d;
            }
            rect.left = cVar.f8167a;
            rect.right = cVar.f8169c;
            return;
        }
        if (z12) {
            rect.left = cVar.f8171e;
        } else {
            rect.left = cVar.f8168b;
        }
        if (z13) {
            rect.right = cVar.f8172f;
        } else {
            rect.right = cVar.f8170d;
        }
        rect.bottom = cVar.f8167a;
        rect.top = cVar.f8169c;
    }

    public d(int i12, int i13, int i14, int i15, int i16, int i17, int i18, C42822w c42822w) {
        this.f8173b = new c((i18 & 1) != 0 ? 0 : i12, (i18 & 2) != 0 ? 0 : i13, (i18 & 4) != 0 ? 0 : i14, (i18 & 8) != 0 ? 0 : i15, (i18 & 16) != 0 ? 0 : i16, (i18 & 32) == 0 ? i17 : 0);
        this.f8174c = new c(0, 0, 0, 0, 0, 0, 63, null);
        this.f8175d = new HashMap<>();
    }
}
