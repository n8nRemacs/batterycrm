package com.avito.android.tariff_lf.package_info.recycler.microcategory;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: TariffPackageMicrocategoryItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/microcategory/d;", "Lcom/avito/android/tariff_lf/package_info/recycler/microcategory/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f299260b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f299261c;

    public d(@k View view) {
        super(view);
        this.f299260b = (TextView) view.findViewById(R.id.title);
        this.f299261c = (TextView) view.findViewById(R.id.subcategories);
    }

    @Override // com.avito.android.tariff_lf.package_info.recycler.microcategory.c
    public final void f(@l String str) {
        I5.a(this.f299261c, str, false);
    }

    @Override // com.avito.android.tariff_lf.package_info.recycler.microcategory.c
    public final void setTitle(@k String str) {
        this.f299260b.setText(str);
    }
}
