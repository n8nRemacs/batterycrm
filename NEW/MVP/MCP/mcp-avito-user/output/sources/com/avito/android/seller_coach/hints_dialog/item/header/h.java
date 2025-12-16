package com.avito.android.seller_coach.hints_dialog.item.header;

import Y61.k;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: HeaderHintItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/header/h;", "Lcom/avito/android/seller_coach/hints_dialog/item/header/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f267482b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f267483c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f267484d;

    public h(@k View view) {
        super(view);
        this.f267482b = view;
        this.f267483c = (TextView) view.findViewById(R.id.tv_advice_header_detail_title);
        this.f267484d = (TextView) view.findViewById(R.id.tv_advice_header_detail_description);
    }

    @Override // com.avito.android.seller_coach.hints_dialog.item.header.g
    public final void kk(@k a aVar) {
        this.f267483c.setText(aVar.f267475c);
        this.f267484d.setText(Html.fromHtml(aVar.f267476d, 63));
    }
}
