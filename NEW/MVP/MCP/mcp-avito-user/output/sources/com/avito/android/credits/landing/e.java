package com.avito.android.credits.landing;

import Y61.k;
import android.net.Uri;
import com.avito.android.credits.landing.CreditProductsLandingFragment;
import com.avito.android.deep_linking.links.CreditPartnerLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.Metadata;

/* compiled from: CreditProductsLandingFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/landing/e;", "Lcom/yatatsu/powerwebview/d;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.yatatsu.powerwebview.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreditProductsLandingFragment f128940a;

    public e(CreditProductsLandingFragment creditProductsLandingFragment) {
        this.f128940a = creditProductsLandingFragment;
    }

    @Override // com.yatatsu.powerwebview.d
    public final boolean b(boolean z12, @k Uri uri) {
        CreditProductsLandingFragment.a aVar = CreditProductsLandingFragment.f128881G0;
        CreditProductsLandingFragment creditProductsLandingFragment = this.f128940a;
        String scheme = uri.getScheme();
        if (scheme == null || scheme.hashCode() != -1014226716 || !scheme.equals("ru.avito")) {
            return false;
        }
        x xVar = creditProductsLandingFragment.f128889t0;
        if (xVar == null) {
            xVar = null;
        }
        DeepLink deepLinkE = xVar.e(uri);
        if (deepLinkE instanceof NoMatchLink) {
            return false;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = creditProductsLandingFragment.f128890u0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        b.a.a(aVar2, deepLinkE, null, null, 6);
        if (!(deepLinkE instanceof CreditPartnerLink)) {
            creditProductsLandingFragment.r5();
        }
        return true;
    }
}
