package XW;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.loyalty.links.quality_service_gray.QualityServiceGrayLink;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayArgs;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: QualityServiceLinkSyncHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LXW/b;", "Lev/b;", "Lcom/avito/android/loyalty/links/quality_service_gray/QualityServiceGrayLink;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC40162b<QualityServiceGrayLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final HW.a f18900d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f18901e;

    @Inject
    public b(@k HW.a aVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f18900d = aVar;
        this.f18901e = interfaceC4053a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f18901e.R(this.f18900d.f(new QualityServiceGrayArgs(((QualityServiceGrayLink) deepLink).f183237b)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
