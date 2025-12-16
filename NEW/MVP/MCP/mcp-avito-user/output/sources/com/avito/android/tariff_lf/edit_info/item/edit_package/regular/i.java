package com.avito.android.tariff_lf.edit_info.item.edit_package.regular;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.mnz_common.ui.TariffCountBar;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.paid_services.routing.TariffCountStatus;
import com.avito.android.util.I5;
import com.avito.konveyor.adapter.j;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RegularEditPackageItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/h;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f298983b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f298984c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TariffCountBar f298985d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView f298986e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f298987f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f298988g;

    public i(@k View view, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.a aVar2) {
        super(view);
        this.f298983b = aVar2;
        this.f298984c = (TextView) view.findViewById(R.id.location);
        this.f298985d = (TariffCountBar) view.findViewById(R.id.count_bar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.edit_package_recycler_view);
        this.f298986e = recyclerView;
        View viewFindViewById = view.findViewById(R.id.clickArea);
        this.f298987f = viewFindViewById;
        com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.h hVar = new com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.h();
        viewFindViewById.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 3));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(new j(aVar2, aVar));
        recyclerView.l(hVar, -1);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h
    public final void F50(@k ProgressState progressState) {
        this.f298985d.setProgressState(progressState);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h
    public final void H5(@k List<TC0.a> list) {
        this.f298983b.c(new UV0.c(list));
        RecyclerView.Adapter adapter = this.f298986e.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h
    public final void V(@k String str) {
        this.f298984c.setText(str);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h
    public final void X30(@k TariffCountStatus tariffCountStatus) {
        this.f298985d.setDescriptionStatus(tariffCountStatus);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f298988g = aVar;
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h
    public final void j(@l String str) {
        TextView textView = this.f298985d.f197988c;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, str, false);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h
    public final void pr(@l String str) {
        TextView textView = this.f298985d.f197989d;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, str, false);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h
    public final void re(float f12) {
        this.f298985d.setProgress(f12);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h
    public final void ud(@k String str) {
        this.f298985d.setTitle(str);
    }
}
