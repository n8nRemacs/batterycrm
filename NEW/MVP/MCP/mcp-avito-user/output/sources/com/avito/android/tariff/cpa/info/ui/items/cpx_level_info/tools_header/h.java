package com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: CpxLevelInfoToolsHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/tools_header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/tools_header/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f294894b;

    public h(@k View view) {
        super(view);
        this.f294894b = (TextView) view.findViewById(R.id.cpx_level_info_tools_header_item);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header.g
    public final void e(@k AttributedText attributedText) {
        j.c(this.f294894b, attributedText, null);
    }
}
