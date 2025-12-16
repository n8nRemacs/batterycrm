package kD0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff_lf_constructor.configure.landing.items.header.g;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ConstructorLandingPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkD0/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kD0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42573b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f406205b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f406206c = y6.b(15);

    /* renamed from: d, reason: collision with root package name */
    public final int f406207d = y6.b(10);

    /* renamed from: e, reason: collision with root package name */
    public final int f406208e = y6.b(24);

    /* renamed from: f, reason: collision with root package name */
    public final int f406209f;

    public C42573b(@k com.avito.konveyor.a aVar) {
        this.f406209f = aVar.Y(com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        int iU2;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof g) {
            i12 = this.f406205b;
        } else if (cW2 instanceof com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.g) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemViewType = -1;
            if (adapter != null && (iU2 = RecyclerView.U(view)) != -1 && iU2 != 0) {
                itemViewType = adapter.getItemViewType(iU2 - 1);
            }
            i12 = itemViewType == this.f406209f ? this.f406207d : this.f406206c;
        } else {
            i12 = 0;
        }
        rect.top = i12;
        rect.bottom = 0;
        int i13 = this.f406208e;
        rect.left = i13;
        rect.right = i13;
    }
}
