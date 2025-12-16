package com.avito.android.tariff.cpr.configure.advance.items.header;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvanceHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpr/configure/advance/items/header/g;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f295268b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f295269c;

    public h(@k View view) {
        super(view);
        this.f295268b = (TextView) view.findViewById(R.id.cpr_header_title);
        this.f295269c = (TextView) view.findViewById(R.id.cpr_header_description);
    }

    @Override // com.avito.android.tariff.cpr.configure.advance.items.header.g
    public final void g(@l AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f295269c;
        textView.setMovementMethod(linkMovementMethod);
        j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpr.configure.advance.items.header.g
    public final void setTitle(@k String str) {
        this.f295268b.setText(str);
    }
}
