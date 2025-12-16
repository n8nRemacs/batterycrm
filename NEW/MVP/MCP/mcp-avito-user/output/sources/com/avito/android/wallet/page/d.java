package com.avito.android.wallet.page;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import com.avito.android.wallet.page.history.PaymentHistoryActivity;
import com.avito.android.wallet.page.history.details.PaymentHistoryDetailsActivity;
import com.avito.android.wallet.page.topup.form.TopUpFormActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WalletPageIntentFactoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/d;", "Lcom/avito/android/wallet/page/c;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f327760a;

    @Inject
    public d(@k Application application) {
        this.f327760a = application;
    }

    @Override // com.avito.android.wallet.page.c
    @k
    public final Intent a() {
        return new Intent(this.f327760a, (Class<?>) PaymentHistoryActivity.class);
    }

    @Override // com.avito.android.wallet.page.c
    @k
    public final Intent b(@l String str) {
        Intent intent = new Intent(this.f327760a, (Class<?>) TopUpFormActivity.class);
        intent.putExtra("TopUpFormActivity_amount", str);
        return intent;
    }

    @Override // com.avito.android.wallet.page.c
    @k
    public final Intent c(@l String str, @l String str2, boolean z12) {
        return new Intent(this.f327760a, (Class<?>) WalletPageActivity.class).putExtra("open_params", new WalletPageOpenParams(str, str2, z12));
    }

    @Override // com.avito.android.wallet.page.c
    @k
    public final Intent d(@k String str) {
        return new Intent(this.f327760a, (Class<?>) PaymentHistoryDetailsActivity.class).putExtra("EXTRA_PAYMENT_DETAILS_ID", str);
    }
}
