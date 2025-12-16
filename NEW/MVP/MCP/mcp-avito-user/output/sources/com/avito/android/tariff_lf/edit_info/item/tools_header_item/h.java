package com.avito.android.tariff_lf.edit_info.item.tools_header_item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ToolsHeaderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/tools_header_item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/tools_header_item/g;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f299069b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f299070c;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f299069b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f299070c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.tools_header_item.g
    public final void Wc(@l AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        j.a(this.f299070c, attributedText, aVar);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.tools_header_item.g
    public final void setTitle(@k String str) {
        I5.a(this.f299069b, str, false);
    }
}
