package GD0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.f;
import com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.h;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureVerticalPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGD0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f6376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6377c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6378d;

    @Inject
    public a(@k com.avito.konveyor.a aVar) {
        this.f6376b = aVar.Y(com.avito.android.tariff_lf_constructor.configure.vertical.items.content.b.class);
        this.f6377c = aVar.Y(com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.b.class);
        this.f6378d = aVar.Y(com.avito.android.tariff_lf_constructor.configure.vertical.items.text.b.class);
    }

    public static int c(View view, RecyclerView recyclerView) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof f) {
            return y6.b(24);
        }
        if (cW2 instanceof com.avito.android.tariff_lf_constructor.configure.vertical.items.text.f) {
            return y6.b(24);
        }
        if (cW2 instanceof h) {
            return y6.b(18);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iB2;
        int iU2;
        int iU3;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof h) {
            iB2 = y6.b(12);
        } else if (cW2 instanceof com.avito.android.tariff_lf_constructor.configure.vertical.items.text.f) {
            iB2 = y6.b(30);
        } else if (cW2 instanceof com.avito.android.tariff_lf_constructor.configure.vertical.items.content.h) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemViewType = -1;
            int itemViewType2 = (adapter == null || (iU2 = RecyclerView.U(view)) == -1 || iU2 == 0) ? -1 : adapter.getItemViewType(iU2 - 1);
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 != null && (iU3 = RecyclerView.U(view)) != adapter2.getItemCount() - 1) {
                itemViewType = adapter2.getItemViewType(iU3 + 1);
            }
            int i12 = this.f6376b;
            view.setBackgroundResource((itemViewType2 == i12 && itemViewType == i12) ? R.drawable.bg_package_rectangle : itemViewType2 == i12 ? R.drawable.bg_package_bottom_angle_round : itemViewType == i12 ? R.drawable.bg_package_top_angle_round : R.drawable.bg_package_angle_round);
            iB2 = itemViewType2 == i12 ? y6.b(2) : itemViewType2 == this.f6377c ? y6.b(24) : itemViewType2 == this.f6378d ? y6.b(18) : y6.b(28);
        } else {
            iB2 = 0;
        }
        rect.top = iB2;
        rect.bottom = RecyclerView.U(view) == zVar.b() + (-1) ? y6.b(40) : 0;
        rect.left = c(view, recyclerView);
        rect.right = c(view, recyclerView);
    }
}
