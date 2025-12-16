package com.avito.android.user_advert.advert.items.sales;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SaleInfoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/sales/h;", "Lcom/avito/android/user_advert/advert/items/sales/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f310099b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.sales_info);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f310099b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.user_advert.advert.items.sales.g
    public final void F(@k AttributedText attributedText) {
        j.a(this.f310099b, attributedText, null);
    }
}
