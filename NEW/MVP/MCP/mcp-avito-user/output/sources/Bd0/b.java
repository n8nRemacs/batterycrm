package BD0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.h;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorSettingPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBD0/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f1249b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1250c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f1251d = y6.b(24);

    /* renamed from: e, reason: collision with root package name */
    public final int f1252e = y6.b(16);

    /* renamed from: f, reason: collision with root package name */
    public final int f1253f = y6.b(32);

    /* renamed from: g, reason: collision with root package name */
    public final int f1254g = y6.b(24);

    /* renamed from: h, reason: collision with root package name */
    public final int f1255h = y6.b(40);

    @Inject
    public b(@k com.avito.konveyor.a aVar) {
        this.f1249b = aVar.Y(com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iU2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemViewType = -1;
        if (adapter != null && (iU2 = RecyclerView.U(view)) != -1 && iU2 != 0) {
            itemViewType = adapter.getItemViewType(iU2 - 1);
        }
        RecyclerView.C cW2 = recyclerView.W(view);
        rect.top = cW2 instanceof h ? this.f1250c : cW2 instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.placing.h ? itemViewType == this.f1249b ? this.f1251d : this.f1252e : cW2 instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k ? this.f1253f : 0;
        rect.bottom = RecyclerView.U(view) == zVar.b() + (-1) ? this.f1255h : 0;
        boolean z12 = recyclerView.W(view) instanceof h;
        int i12 = this.f1254g;
        rect.left = z12 ? 0 : i12;
        rect.right = recyclerView.W(view) instanceof h ? 0 : i12;
    }
}
