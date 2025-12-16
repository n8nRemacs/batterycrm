package com.avito.android.services_portfolio;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import bv0.InterfaceC25725d;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.avito.android.services_portfolio.project.buyer.ui.PortfolioProjectBuyerFragment;
import com.avito.android.services_portfolio.project.seller.ui.PortfolioProjectSellerFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/services_portfolio/PortfolioActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "Lbv0/d;", "<init>", "()V", "a", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PortfolioActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, InterfaceC25725d {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f279978m = new a(null);

    /* compiled from: PortfolioActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/services_portfolio/PortfolioActivity$a;", "", "<init>", "()V", "", "EXTRA_FRAGMENT_BUYER_PARAMS", "Ljava/lang/String;", "EXTRA_FRAGMENT_SELLER_PARAMS", "FRAGMENT_PORTFOLIO_PROJECT", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i12 = Build.VERSION.SDK_INT;
        PortfolioProjectArguments portfolioProjectArguments = (PortfolioProjectArguments.SellerArgs) (i12 >= 33 ? (Parcelable) intent.getParcelableExtra("fragment_params_seller", PortfolioProjectArguments.SellerArgs.class) : intent.getParcelableExtra("fragment_params_seller"));
        if (portfolioProjectArguments == null) {
            Intent intent2 = getIntent();
            portfolioProjectArguments = (PortfolioProjectArguments.BuyerArgs) (i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("fragment_params_buyer", PortfolioProjectArguments.BuyerArgs.class) : intent2.getParcelableExtra("fragment_params_buyer"));
            if (portfolioProjectArguments == null) {
                finish();
                return;
            }
        }
        if (bundle == null) {
            if (portfolioProjectArguments instanceof PortfolioProjectArguments.SellerArgs) {
                H hE2 = getSupportFragmentManager().e();
                PortfolioProjectSellerFragment.f280296u0.getClass();
                hE2.j(R.id.fragment_container, PortfolioProjectSellerFragment.a.a((PortfolioProjectArguments.SellerArgs) portfolioProjectArguments), "fragment_portfolio_project", 1);
                hE2.e();
                return;
            }
            if (!(portfolioProjectArguments instanceof PortfolioProjectArguments.BuyerArgs)) {
                finish();
                return;
            }
            H hE3 = getSupportFragmentManager().e();
            PortfolioProjectBuyerFragment.f280064u0.getClass();
            hE3.j(R.id.fragment_container, PortfolioProjectBuyerFragment.a.a((PortfolioProjectArguments.BuyerArgs) portfolioProjectArguments), "fragment_portfolio_project", 1);
            hE3.e();
        }
    }
}
