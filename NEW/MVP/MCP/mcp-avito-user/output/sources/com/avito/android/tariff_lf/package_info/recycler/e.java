package com.avito.android.tariff_lf.package_info.recycler;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.konveyor.adapter.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffPackageItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/e;", "Lcom/avito/android/tariff_lf/package_info/recycler/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f299242b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f299243c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f299244d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f299245e;

    public e(@k View view, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.a aVar2) {
        super(view);
        this.f299242b = view;
        this.f299243c = aVar2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.micro_category_recycler_view);
        this.f299244d = recyclerView;
        this.f299245e = (TextView) view.findViewById(R.id.title);
        com.avito.android.tariff_lf.package_info.recycler.microcategory.e eVar = new com.avito.android.tariff_lf.package_info.recycler.microcategory.e();
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(new j(aVar2, aVar));
        recyclerView.l(eVar, -1);
    }

    @Override // com.avito.android.tariff_lf.package_info.recycler.d
    public final void H5(@k List<TC0.a> list) {
        this.f299245e.setTextAppearance(C35835l0.j(list.isEmpty() ? R.attr.textM1 : R.attr.textH3, this.f299242b.getContext()));
        this.f299243c.c(new UV0.c(list));
        RecyclerView.Adapter adapter = this.f299244d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.tariff_lf.package_info.recycler.d
    public final void setTitle(@k String str) {
        I5.a(this.f299245e, str, false);
    }
}
