package com.avito.android.user_advert.advert.items.vas_discount;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: VasDiscountDescriptionItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/vas_discount/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/vas_discount/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f310356b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f310357c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f310358d;

    public h(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f310356b = aVar;
        this.f310357c = view.getContext();
        this.f310358d = (TextView) view.findViewById(R.id.discount_description_view);
    }

    @Override // com.avito.android.user_advert.advert.items.vas_discount.g
    public final void w60(@Y61.k AttributedText attributedText) {
        I5.a(this.f310358d, this.f310356b.c(this.f310357c, attributedText), false);
    }
}
