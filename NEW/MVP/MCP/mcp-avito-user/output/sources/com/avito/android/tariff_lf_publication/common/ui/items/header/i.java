package com.avito.android.tariff_lf_publication.common.ui.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: TariffLfPublicationHeaderView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/common/ui/items/header/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_publication/common/ui/items/header/h;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f300717b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f300718c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f300719d;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f300717b = aVar;
        this.f300718c = (TextView) view.findViewById(R.id.tariff_lf_publication_header_title);
        this.f300719d = (TextView) view.findViewById(R.id.tariff_lf_publication_header_description);
    }

    @Override // com.avito.android.tariff_lf_publication.common.ui.items.header.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f300719d, attributedText, this.f300717b);
    }

    @Override // com.avito.android.tariff_lf_publication.common.ui.items.header.h
    public final void setTitle(@k String str) {
        this.f300718c.setText(str);
    }
}
