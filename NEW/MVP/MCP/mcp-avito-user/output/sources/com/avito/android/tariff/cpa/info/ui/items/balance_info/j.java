package com.avito.android.tariff.cpa.info.ui.items.balance_info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BalanceInfoItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/balance_info/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/info/ui/items/balance_info/i;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f294828f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f294829b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f294830c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f294831d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Spinner f294832e;

    public j(@k View view) {
        super(view);
        this.f294829b = (TextView) view.findViewById(R.id.title);
        this.f294830c = (TextView) view.findViewById(R.id.price);
        this.f294831d = (Button) view.findViewById(R.id.refill_button);
        this.f294832e = (Spinner) view.findViewById(R.id.progress_bar);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.balance_info.i
    public final void nD(boolean z12) {
        this.f294831d.setEnabled(!z12);
        this.f294830c.setAlpha(z12 ? 0.5f : 1.0f);
        D6.G(this.f294832e, z12);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.balance_info.i
    public final void p(@k String str) {
        I5.a(this.f294830c, str, false);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.balance_info.i
    public final void r1(@l String str, @k Y41.a<G0> aVar) {
        Button button = this.f294831d;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(4, aVar));
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.balance_info.i
    public final void setTitle(@k String str) {
        I5.a(this.f294829b, str, false);
    }
}
