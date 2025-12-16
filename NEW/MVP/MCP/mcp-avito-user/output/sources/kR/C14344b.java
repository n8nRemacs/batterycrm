package Kr;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpt.activation.deeplink.CptActivationEstimateLink;
import com.avito.android.cpt.activation.i;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CptActivationLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LKr/b;", "Lev/b;", "Lcom/avito/android/cpt/activation/deeplink/CptActivationEstimateLink;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14344b extends AbstractC40162b<CptActivationEstimateLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f9672d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final i f9673e;

    @Inject
    public C14344b(@k a.InterfaceC4053a interfaceC4053a, @k i iVar) {
        this.f9672d = interfaceC4053a;
        this.f9673e = iVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CptActivationEstimateLink cptActivationEstimateLink = (CptActivationEstimateLink) deepLink;
        String str2 = cptActivationEstimateLink.f126225b;
        this.f9672d.R(this.f9673e.a(cptActivationEstimateLink.f126226c, str2), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
