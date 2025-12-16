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
import com.avito.android.util.InterfaceC35745a5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/m;", "Lcom/avito/android/inline_filters/dialog/select/SelectFilterView;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.select.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31043m extends SelectFilterView {

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public PV.b f172171m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Button f172172n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f172173o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f172174p;

    /* renamed from: q, reason: collision with root package name */
    public final float f172175q;

    /* renamed from: r, reason: collision with root package name */
    public final int f172176r;

    public C31043m(@Y61.k View view, @Y61.k com.avito.android.candy.e eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(view, false, eVar, interfaceC35745a5, 2, null);
        View viewFindViewById = view.findViewById(R.id.apply_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f172172n = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.apply_button_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f172173o = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.filter_options_recycler_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f172174p = (RecyclerView) viewFindViewById3;
        this.f172175q = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.inline_filters_apply_btn_container_height);
        this.f172176r = D6.i(18, view.getContext());
        D6.G(viewFindViewById2, true);
    }

    @Override // com.avito.android.inline_filters.dialog.select.SelectFilterView, com.avito.android.inline_filters.dialog.select.InterfaceC31028a
    public final void k(@Y61.k List<com.avito.android.inline_filters.dialog.select.adapter.i> list, @Y61.l List<com.avito.android.inline_filters.dialog.select.adapter.i> list2) {
        super.k(list, list2);
        PV.b bVar = this.f172171m;
        RecyclerView recyclerView = this.f172174p;
        if (bVar != null) {
            recyclerView.r0(bVar);
        }
        int i12 = (int) this.f172175q;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(i12);
        shapeDrawable.setTint(C35835l0.d(R.attr.transparentWhite, recyclerView.getContext()));
        b.a aVar = new b.a(null, 1, null);
        aVar.f13092e = true;
        aVar.b(shapeDrawable, C42745f0.J(this.f172040i));
        PV.b bVarA = aVar.a();
        this.f172171m = bVarA;
        recyclerView.l(bVarA, -1);
        D6.G(this.f172038g, D6.y(this.f172173o));
    }
}
