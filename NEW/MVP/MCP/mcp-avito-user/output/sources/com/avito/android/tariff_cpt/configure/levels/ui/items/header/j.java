package com.avito.android.tariff_cpt.configure.levels.ui.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TariffCptConfigureLevelsHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/header/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/configure/levels/ui/items/header/i;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f297941b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f297942c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f297943d;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f297941b = aVar;
        this.f297942c = (TextView) view.findViewById(R.id.tariff_cpt_configure_levels_header_title);
        this.f297943d = (TextView) view.findViewById(R.id.tariff_cpt_configure_levels_header_description);
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.header.i
    public final void e(@k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f297942c, attributedText, this.f297941b);
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.header.i
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f297943d, attributedText, this.f297941b);
    }
}
