package com.avito.android.inline_filters.dialog.select;

import PV.b;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RadioSelectFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/D;", "Lcom/avito/android/inline_filters/dialog/select/SelectFilterView;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class D extends SelectFilterView {

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public PV.b f172007m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Button f172008n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f172009o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f172010p;

    /* renamed from: q, reason: collision with root package name */
    public final float f172011q;

    /* renamed from: r, reason: collision with root package name */
    public final int f172012r;

    public D(@Y61.k View view) {
        super(view, false, null, null, 14, null);
        View viewFindViewById = view.findViewById(R.id.apply_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f172008n = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.apply_button_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f172009o = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.filter_options_recycler_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f172010p = (RecyclerView) viewFindViewById3;
        this.f172011q = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.inline_filters_apply_btn_container_height);
        this.f172012r = D6.i(18, view.getContext());
        D6.G(viewFindViewById2, true);
    }

    @Override // com.avito.android.inline_filters.dialog.select.SelectFilterView, com.avito.android.inline_filters.dialog.select.InterfaceC31028a
    public final void k(@Y61.k List<com.avito.android.inline_filters.dialog.select.adapter.i> list, @Y61.l List<com.avito.android.inline_filters.dialog.select.adapter.i> list2) {
        super.k(list, null);
        PV.b bVar = this.f172007m;
        RecyclerView recyclerView = this.f172010p;
        if (bVar != null) {
            recyclerView.r0(bVar);
        }
        int i12 = (int) this.f172011q;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(i12);
        shapeDrawable.setTint(C35835l0.d(R.attr.transparentWhite, recyclerView.getContext()));
        b.a aVar = new b.a(null, 1, null);
        aVar.f13092e = true;
        aVar.b(shapeDrawable, C42745f0.J(this.f172040i));
        PV.b bVarA = aVar.a();
        this.f172007m = bVarA;
        recyclerView.l(bVarA, -1);
        D6.G(this.f172038g, D6.y(this.f172009o));
    }
}
