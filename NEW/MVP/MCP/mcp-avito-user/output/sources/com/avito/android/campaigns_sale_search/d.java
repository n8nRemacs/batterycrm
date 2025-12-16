package com.avito.android.campaigns_sale_search;

import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import um.b;

/* compiled from: CampaignsSaleSearchAddToSaleDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/d;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Y41.l<um.b, G0> f114514E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final Input f114515F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final Chips f114516G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final Button f114517H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final TextView f114518I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final TextView f114519J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public s f114520K;

    public d(@Y61.k ActivityC22955m activityC22955m, @Y61.k Y41.l lVar) {
        super(activityC22955m, 0, 2, null);
        this.f114514E = lVar;
        setContentView(R.layout.campaigns_sale_search_add_to_sale_bottomsheet);
        com.avito.android.lib.design.bottom_sheet.d.M(this, activityC22955m.getResources().getString(R.string.campaigns_sale_search_bottomsheet_title), true, true, 2);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        this.f114515F = (Input) findViewById(R.id.discount_input);
        Chips chips = (Chips) findViewById(R.id.chips_container);
        this.f114516G = chips;
        this.f114517H = (Button) findViewById(R.id.item_button);
        this.f114518I = (TextView) findViewById(R.id.input_validation_text);
        this.f114519J = (TextView) findViewById(R.id.input_bonus_text);
        if (chips == null) {
            return;
        }
        chips.setChipsSelectedListener(new b(this));
    }

    @Override // androidx.appcompat.app.A, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f114514E.invoke(b.d.f440235a);
        super.dismiss();
    }
}
