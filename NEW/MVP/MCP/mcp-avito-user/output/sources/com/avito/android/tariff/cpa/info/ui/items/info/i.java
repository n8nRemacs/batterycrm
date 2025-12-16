package com.avito.android.tariff.cpa.info.ui.items.info;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: InfoItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/info/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/info/ui/items/info/h;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f294908b;

    public i(@k View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.tv_cpa_info);
        this.f294908b = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.info.h
    public final void g4(@k AttributedText attributedText) {
        j.a(this.f294908b, attributedText, null);
    }
}
