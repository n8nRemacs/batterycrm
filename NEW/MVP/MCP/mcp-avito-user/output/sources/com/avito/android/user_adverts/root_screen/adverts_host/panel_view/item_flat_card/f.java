package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PanelFlatCardItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f313742b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f313743c;

    public f(@k View view) {
        super(view);
        this.f313742b = (TextView) view.findViewById(R.id.user_adverts_panel_flat_card_header);
        this.f313743c = (TextView) view.findViewById(R.id.user_adverts_panel_flat_card_value);
    }
}
