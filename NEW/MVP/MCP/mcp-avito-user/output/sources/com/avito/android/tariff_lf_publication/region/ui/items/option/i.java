package com.avito.android.tariff_lf_publication.region.ui.items.option;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemRadio;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffLfPublicationRegionOptionView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/ui/items/option/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_publication/region/ui/items/option/h;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final ListItemRadio f301131b;

    public i(@k View view) {
        super(view);
        this.f301131b = (ListItemRadio) view.findViewById(R.id.tariff_lf_publication_region_option_item);
    }

    @Override // com.avito.android.tariff_lf_publication.region.ui.items.option.h
    public final void setChecked(boolean z12) {
        this.f301131b.setChecked(z12);
    }

    @Override // com.avito.android.tariff_lf_publication.region.ui.items.option.h
    public final void setTitle(@k String str) {
        this.f301131b.setTitle(str);
    }

    @Override // com.avito.android.tariff_lf_publication.region.ui.items.option.h
    public final void w7(@k Y41.a<G0> aVar) {
        this.f301131b.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(6, this, aVar));
    }
}
