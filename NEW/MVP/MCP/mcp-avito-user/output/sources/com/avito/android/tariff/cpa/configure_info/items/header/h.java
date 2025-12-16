package com.avito.android.tariff.cpa.configure_info.items.header;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: TariffHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/configure_info/items/header/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f294525b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f294526c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f294527d;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f294525b = aVar;
        this.f294526c = (TextView) view.findViewById(R.id.title);
        this.f294527d = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.tariff.cpa.configure_info.items.header.g
    public final void g(@k AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f294527d;
        textView.setMovementMethod(linkMovementMethod);
        j.a(textView, attributedText, this.f294525b);
    }

    @Override // com.avito.android.tariff.cpa.configure_info.items.header.g
    public final void setTitle(@k String str) {
        this.f294526c.setText(str);
    }
}
