package com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

/* compiled from: TitleItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/title/e;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/title/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f256233b;

    public e(@k View view) {
        super(view);
        this.f256233b = view;
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title.d
    public final void setTitle(@k String str) {
        ((TextView) this.f256233b).setText(str);
    }
}
