package com.avito.android.vas_discount.ui.items.button;

import Y61.k;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import com.avito.android.user_advert.advert.items.service_booking.i;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_discount/ui/items/button/h;", "Lcom/avito/android/vas_discount/ui/items/button/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f319728c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f319729b;

    public h(@k View view) {
        super(view);
        this.f319729b = (Button) view;
    }

    @Override // com.avito.android.vas_discount.ui.items.button.g
    public final void c(@k Y41.a<G0> aVar) {
        this.f319729b.setOnClickListener(new i(18, aVar));
    }

    @Override // com.avito.android.vas_discount.ui.items.button.g
    public final void setTitle(@k String str) {
        this.f319729b.setText(str);
    }
}
