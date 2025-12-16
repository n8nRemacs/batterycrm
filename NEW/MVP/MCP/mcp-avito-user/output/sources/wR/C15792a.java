package Wr;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.cpt.mass_activation.ui.items.header.g;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: CptMassActivationItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWr/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15792a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f18067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18068c = y6.b(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f18069d = y6.b(12);

    /* renamed from: e, reason: collision with root package name */
    public final int f18070e = y6.b(16);

    /* renamed from: f, reason: collision with root package name */
    public final int f18071f = y6.b(20);

    public C15792a(@k com.avito.konveyor.a aVar) {
        this.f18067b = aVar.Y(com.avito.android.cpt.mass_activation.ui.items.advert.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        int iU2;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof g) {
            i12 = this.f18069d;
        } else if (cW2 instanceof com.avito.android.cpt.mass_activation.ui.items.advert.g) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemViewType = -1;
            if (adapter != null && (iU2 = RecyclerView.U(view)) != -1 && iU2 != 0) {
                itemViewType = adapter.getItemViewType(iU2 - 1);
            }
            i12 = itemViewType == this.f18067b ? this.f18071f : this.f18070e;
        } else {
            i12 = 0;
        }
        rect.top = i12;
        rect.bottom = 0;
        int i13 = this.f18068c;
        rect.left = i13;
        rect.right = i13;
    }
}
