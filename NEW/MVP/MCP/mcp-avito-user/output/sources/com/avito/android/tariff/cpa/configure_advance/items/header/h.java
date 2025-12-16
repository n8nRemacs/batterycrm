package com.avito.android.tariff.cpa.configure_advance.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/configure_advance/items/header/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f294361b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f294362c;

    public h(@k View view) {
        super(view);
        this.f294361b = (TextView) view.findViewById(R.id.title);
        this.f294362c = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.items.header.g
    public final void g(@l AttributedText attributedText) {
        G0 g02;
        TextView textView = this.f294362c;
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

    @Override // com.avito.android.tariff.cpa.configure_advance.items.header.g
    public final void setTitle(@k String str) {
        this.f294361b.setText(str);
    }
}
