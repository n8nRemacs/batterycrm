package com.avito.android.advert.item.header;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AdvertDetailsHeaderView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/header/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f75838b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f75839c;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f75838b = aVar;
        this.f75839c = (TextView) view;
    }

    @Override // com.avito.android.advert.item.header.f
    public final void I8(@k AttributedText attributedText) {
        TextView textView = this.f75839c;
        textView.setText(this.f75838b.c(textView.getContext(), attributedText));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
