package tH;

import Ju.AbstractC14250d;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_motivation_payment.GigMotivationPaymentDeeplink;
import com.avito.android.gig_motivation_payment.ui.MotivationPaymentActivity;
import com.avito.android.gig_motivation_payment.ui.MotivationPaymentOpenParams;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigMotivationPaymentDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LtH/a;", "Lev/a;", "Lcom/avito/android/gig_motivation_payment/GigMotivationPaymentDeeplink;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tH.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48555a extends AbstractC40161a<GigMotivationPaymentDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f439213f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f439214g;

    @Inject
    public C48555a(@k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        this.f439213f = context;
        this.f439214g = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f439214g.R(new Intent(this.f439213f, (Class<?>) MotivationPaymentActivity.class).putExtra("open_params", new MotivationPaymentOpenParams(((GigMotivationPaymentDeeplink) deepLink).f160081b)), com.avito.android.deeplink_handler.view.b.f134588l);
        j(AbstractC14250d.c.f9171c);
    }
}
