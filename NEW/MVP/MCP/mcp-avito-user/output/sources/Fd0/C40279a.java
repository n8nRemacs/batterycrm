package fD0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.mnz_common.extensions.f;
import com.avito.android.tariff_lf_constructor.configure.category.items.content.h;
import com.avito.android.tariff_lf_constructor.configure.header_item.g;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConfigureCategoryPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfD0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40279a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f395784b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f395785c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f395786d = y6.b(16);

    /* renamed from: e, reason: collision with root package name */
    public final int f395787e;

    @Inject
    public C40279a(@k com.avito.konveyor.a aVar) {
        this.f395787e = aVar.Y(com.avito.android.tariff_lf_constructor.configure.category.items.content.b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        rect.top = cW2 instanceof g ? this.f395784b : (!(cW2 instanceof h) || f.a(view, recyclerView) == this.f395787e) ? 0 : this.f395785c;
        rect.bottom = RecyclerView.U(view) == zVar.b() + (-1) ? y6.b(24) : 0;
        int i12 = this.f395786d;
        rect.left = i12;
        rect.right = i12;
    }
}
