package com.avito.android.credits.landing;

import android.widget.ProgressBar;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;

/* compiled from: CreditProductsLandingFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreditProductsLandingFragment f128901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PowerWebView f128902c;

    public c(CreditProductsLandingFragment creditProductsLandingFragment, PowerWebView powerWebView) {
        this.f128901b = creditProductsLandingFragment;
        this.f128902c = powerWebView;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = (PowerWebViewStateChangeEvent) obj;
        PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392945d;
        PowerWebViewStateChangeEvent.State state2 = powerWebViewStateChangeEvent.f392937a;
        PowerWebView powerWebView = this.f128902c;
        CreditProductsLandingFragment creditProductsLandingFragment = this.f128901b;
        if ((state2 == state || state2 == PowerWebViewStateChangeEvent.State.f392943b) && powerWebViewStateChangeEvent.f392938b < 100) {
            ProgressBar progressBar = creditProductsLandingFragment.f128884B0;
            if (progressBar != null) {
                D6.H(progressBar);
            }
            D6.g(powerWebView);
            return;
        }
        if (state2 == PowerWebViewStateChangeEvent.State.f392946e) {
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder("HTTP error: code:");
            int i12 = powerWebViewStateChangeEvent.f392941e;
            sb2.append(i12);
            sb2.append(" message:");
            sb2.append(powerWebViewStateChangeEvent.f392942f);
            v22.d("CreditProductsLanding", sb2.toString());
            CreditProductsLandingFragment.D5(creditProductsLandingFragment, i12 / 100 == 5);
        } else {
            D6.H(powerWebView);
        }
        ProgressBar progressBar2 = creditProductsLandingFragment.f128884B0;
        if (progressBar2 != null) {
            D6.w(progressBar2);
        }
    }
}
