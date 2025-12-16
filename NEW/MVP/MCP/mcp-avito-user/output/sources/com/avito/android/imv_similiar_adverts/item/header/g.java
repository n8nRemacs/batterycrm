package com.avito.android.imv_similiar_adverts.item.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImvHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/item/header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/imv_similiar_adverts/item/header/f;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f170874b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f170875c;

    public g(@k View view) {
        super(view);
        this.f170874b = (TextView) view.findViewById(R.id.imv_similar_adverts_header_title);
        this.f170875c = (TextView) view.findViewById(R.id.imv_similar_adverts_header_description);
    }

    @Override // com.avito.android.imv_similiar_adverts.item.header.f
    public final void e(@k AttributedText attributedText) {
        j.c(this.f170874b, attributedText, null);
    }

    @Override // com.avito.android.imv_similiar_adverts.item.header.f
    public final void g(@l AttributedText attributedText) {
        G0 g02;
        TextView textView = this.f170875c;
        if (attributedText != null) {
            j.c(textView, attributedText, null);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            I5.a(textView, null, false);
        }
    }
}
