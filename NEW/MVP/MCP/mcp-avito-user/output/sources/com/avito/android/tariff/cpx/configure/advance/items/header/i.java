package com.avito.android.tariff.cpx.configure.advance.items.header;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: CpxConfigureAdvanceHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/header/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/configure/advance/items/header/h;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f295731b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f295732c;

    public i(@k View view) {
        super(view);
        this.f295731b = (TextView) view.findViewById(R.id.cpx_configure_advance_header_title);
        TextView textView = (TextView) view.findViewById(R.id.cpx_configure_advance_header_description);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f295732c = textView;
    }

    @Override // com.avito.android.tariff.cpx.configure.advance.items.header.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f295732c, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpx.configure.advance.items.header.h
    public final void setTitle(@k String str) {
        this.f295731b.setText(str);
    }
}
