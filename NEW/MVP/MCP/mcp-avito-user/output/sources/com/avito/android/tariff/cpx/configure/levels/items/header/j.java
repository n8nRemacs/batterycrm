package com.avito.android.tariff.cpx.configure.levels.items.header;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TariffCpxConfigureLevelsHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/items/header/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/configure/levels/items/header/i;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f296137b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f296138c;

    public j(@k View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.tariff_cpx_configure_levels_header_title);
        this.f296137b = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.tariff_cpx_configure_levels_header_description);
        this.f296138c = textView2;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.header.i
    public final void e(@k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f296137b, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.header.i
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f296138c, attributedText, null);
    }
}
