package com.avito.android.payment.items.submit_button_item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.mortgage.root.list.items.legacy_status.i;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SubmitButtonView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/items/submit_button_item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/payment/items/submit_button_item/f;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f214504c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f214505b;

    public g(@k View view) {
        super(view);
        this.f214505b = (TextView) view;
    }

    @Override // com.avito.android.payment.items.submit_button_item.f
    public final void c(@l Y41.a<G0> aVar) {
        this.f214505b.setOnClickListener(new i(16, aVar));
    }

    @Override // com.avito.android.payment.items.submit_button_item.f
    public final void setEnabled(boolean z12) {
        this.f214505b.setEnabled(true);
    }

    @Override // com.avito.android.payment.items.submit_button_item.f
    public final void setText(@k String str) {
        this.f214505b.setText(str);
    }
}
