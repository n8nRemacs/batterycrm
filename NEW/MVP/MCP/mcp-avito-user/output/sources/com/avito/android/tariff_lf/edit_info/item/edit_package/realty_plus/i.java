package com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.I5;
import com.avito.konveyor.adapter.j;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyPlusEditPackageItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/edit_package/realty_plus/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/edit_package/realty_plus/h;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f298954b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f298955c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f298956d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f298957e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f298958f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f298959g;

    public i(@k View view, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.a aVar2) {
        super(view);
        this.f298954b = aVar2;
        this.f298955c = (TextView) view.findViewById(R.id.location);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.edit_package_recycler_view);
        this.f298956d = recyclerView;
        View viewFindViewById = view.findViewById(R.id.clickArea);
        this.f298957e = viewFindViewById;
        this.f298958f = (TextView) view.findViewById(R.id.planned_amount);
        com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.h hVar = new com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.h();
        viewFindViewById.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 2));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(new j(aVar2, aVar));
        recyclerView.l(hVar, -1);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.h
    public final void H5(@k List<TC0.a> list) {
        this.f298954b.c(new UV0.c(list));
        RecyclerView.Adapter adapter = this.f298956d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.h
    public final void V(@k String str) {
        I5.a(this.f298955c, str, false);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f298959g = aVar;
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.h
    public final void h80(@k String str) {
        I5.a(this.f298958f, str, false);
    }
}
