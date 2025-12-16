package com.avito.android.marketplace;

import android.content.res.Resources;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FiananceMarketplaceResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/s;", "Lcom/avito/android/marketplace/r;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f185956a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final FinanceMarketplaceWebViewDialogData f185957b;

    public s(@Y61.k Resources resources, @Y61.l FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData, @Y61.l String str) {
        this.f185956a = resources;
        this.f185957b = financeMarketplaceWebViewDialogData;
    }

    public /* synthetic */ s(Resources resources, FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData, String str, int i12, C42822w c42822w) {
        this(resources, (i12 & 2) != 0 ? null : financeMarketplaceWebViewDialogData, str);
    }
}
