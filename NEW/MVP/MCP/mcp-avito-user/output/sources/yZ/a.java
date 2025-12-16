package YZ;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mortgage.deeplink.util.MortgageVerificationFlowLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import t00.InterfaceC48454a;

/* compiled from: MortgageVerificationFlowLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LYZ/a;", "Lev/b;", "Lcom/avito/android/mortgage/deeplink/util/MortgageVerificationFlowLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40162b<MortgageVerificationFlowLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f19513d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC48454a f19514e;

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC48454a interfaceC48454a) {
        this.f19513d = interfaceC4053a;
        this.f19514e = interfaceC48454a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f19513d.R(this.f19514e.d(((MortgageVerificationFlowLink) deepLink).f198899b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
