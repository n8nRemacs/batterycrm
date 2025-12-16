package oD0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.mnz_common.extensions.f;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.n;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.g;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffLocationsPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoD0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oD0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44629c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f419629b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f419630c = y6.b(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f419631d;

    @Inject
    public C44629c(@k com.avito.konveyor.a aVar) {
        this.f419631d = aVar.Y(com.avito.android.tariff_lf_constructor.configure.locations.items.badges.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        int i12 = 0;
        int i13 = cW2 instanceof g ? true : cW2 instanceof n ? 0 : this.f419630c;
        rect.left = i13;
        RecyclerView.C cW3 = recyclerView.W(view);
        if ((cW3 instanceof g ? true : cW3 instanceof n) && f.a(view, recyclerView) == this.f419631d) {
            i12 = this.f419629b;
        }
        rect.top = i12;
        rect.right = i13;
    }
}
