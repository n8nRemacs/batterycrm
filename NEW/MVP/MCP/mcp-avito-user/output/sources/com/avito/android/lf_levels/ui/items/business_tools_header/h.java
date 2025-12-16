package com.avito.android.lf_levels.ui.items.business_tools_header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: LfBusinessToolHeaderItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lf_levels/ui/items/business_tools_header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/lf_levels/ui/items/business_tools_header/g;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f175435b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f175436c;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f175435b = aVar;
        this.f175436c = (TextView) view.findViewById(R.id.lf_business_tool_header_item);
    }

    @Override // com.avito.android.lf_levels.ui.items.business_tools_header.g
    public final void e(@k AttributedText attributedText) {
        j.c(this.f175436c, attributedText, this.f175435b);
    }
}
