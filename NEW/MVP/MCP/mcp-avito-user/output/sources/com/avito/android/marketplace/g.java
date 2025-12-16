package com.avito.android.marketplace;

import android.net.Uri;
import android.webkit.ValueCallback;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import mY.InterfaceC44028a;

/* compiled from: FinanceMarketplaceActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class g extends H implements Y41.l<ValueCallback<Uri[]>, G0> {
    @Override // Y41.l
    public final G0 invoke(ValueCallback<Uri[]> valueCallback) {
        FinanceMarketplaceActivity financeMarketplaceActivity = (FinanceMarketplaceActivity) this.receiver;
        int i12 = FinanceMarketplaceActivity.f185844E;
        financeMarketplaceActivity.b2().accept(new InterfaceC44028a.f(valueCallback));
        return G0.f406611a;
    }
}
