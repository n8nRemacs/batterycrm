package Bl;

import Ur0.c;
import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.category.widget.h;
import kotlin.Metadata;

/* compiled from: CategoryWidgetItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBl/a;", "LUr0/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13159a extends c {

    /* renamed from: s, reason: collision with root package name */
    public final int f1687s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1688t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1689u;

    public C13159a(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f1687s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f1688t = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_button);
        this.f1689u = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_default_manrope);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof h) {
            int i12 = -this.f1687s;
            rect.left = i12;
            rect.right = i12;
            rect.bottom = this.f1688t;
            rect.top = this.f1689u;
            this.f16709q = true;
        } else {
            this.f16709q = false;
        }
        e(c.a.C1153a.f16711a);
    }
}
