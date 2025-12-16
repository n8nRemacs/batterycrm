package com.avito.android.payment.lib;

import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PaymentMethodsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class k extends H implements Y41.l<Boolean, G0> {
    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        ((Button) this.receiver).setEnabled(bool.booleanValue());
        return G0.f406611a;
    }
}
