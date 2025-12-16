package com.avito.android.tariff_select.ui.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffSelectHeaderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_select/ui/items/header/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_select/ui/items/header/h;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f301263b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f301264c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f301265d;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f301263b = aVar;
        View viewFindViewById = view.findViewById(R.id.tariff_select_header_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f301264c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tariff_select_header_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f301265d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.tariff_select.ui.items.header.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f301265d, attributedText, this.f301263b);
    }

    @Override // com.avito.android.tariff_select.ui.items.header.h
    public final void setTitle(@k String str) {
        this.f301264c.setText(str);
    }
}
