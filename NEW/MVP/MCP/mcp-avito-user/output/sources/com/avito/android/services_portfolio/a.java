package com.avito.android.services_portfolio;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import bv0.InterfaceC25722a;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PortfolioIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/a;", "Lbv0/a;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements InterfaceC25722a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f279979a;

    @Inject
    public a(@k Application application) {
        this.f279979a = application;
    }

    @Override // bv0.InterfaceC25722a
    @k
    public final Intent a(@k PortfolioProjectArguments portfolioProjectArguments) {
        PortfolioActivity.f279978m.getClass();
        Intent intent = new Intent(this.f279979a, (Class<?>) PortfolioActivity.class);
        if (portfolioProjectArguments instanceof PortfolioProjectArguments.SellerArgs) {
            intent.putExtra("fragment_params_seller", portfolioProjectArguments);
        } else {
            intent.putExtra("fragment_params_buyer", portfolioProjectArguments);
        }
        return intent;
    }
}
