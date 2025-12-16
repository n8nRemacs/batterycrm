package com.avito.android.screens.bbip.ui.items.forecast;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Group;
import com.avito.android.R;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ForecastItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/forecast/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip/ui/items/forecast/g;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f260384b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f260385c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f260386d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f260387e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Group f260388f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final StrikethroughTextView f260389g;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.bbip_forecast_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f260384b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.bbip_budget_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f260385c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.bbip_forecast_value);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f260386d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.bbip_price_value);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f260387e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.bbip_skeleton_group);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f260388f = (Group) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.bbip_budget_value);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.strikethrough.StrikethroughTextView");
        }
        this.f260389g = (StrikethroughTextView) viewFindViewById6;
    }

    @Override // com.avito.android.screens.bbip.ui.items.forecast.g
    public final void Hc(@l String str) {
        I5.a(this.f260386d, str, false);
    }

    @Override // com.avito.android.screens.bbip.ui.items.forecast.g
    public final void Vb(@l String str) {
        I5.a(this.f260389g, str, false);
    }

    @Override // com.avito.android.screens.bbip.ui.items.forecast.g
    public final void Xd(boolean z12) {
        D6.G(this.f260388f, z12);
        D6.G(this.f260386d, !z12);
        D6.G(this.f260387e, !z12);
        D6.G(this.f260389g, !z12);
    }

    @Override // com.avito.android.screens.bbip.ui.items.forecast.g
    public final void Zb(@l String str) {
        I5.a(this.f260387e, str, false);
    }

    @Override // com.avito.android.screens.bbip.ui.items.forecast.g
    public final void z6(@k String str) {
        this.f260385c.setText(str);
    }

    @Override // com.avito.android.screens.bbip.ui.items.forecast.g
    public final void z9(@k String str) {
        this.f260384b.setText(str);
    }
}
