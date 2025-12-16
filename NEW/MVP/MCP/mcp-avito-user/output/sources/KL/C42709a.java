package kl;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.L;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bxcontent.BxContentIntentFactory;
import com.avito.android.deep_linking.links.BxContentLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.NavigationBarStyleKt;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.SerpSpaceTypeKt;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: BxContentDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkl/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/BxContentLink;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42709a extends AbstractC40162b<BxContentLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BxContentIntentFactory f406578d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final L f406579e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f406580f;

    @Inject
    public C42709a(@k BxContentIntentFactory bxContentIntentFactory, @k L l12, @k a.InterfaceC4053a interfaceC4053a) {
        this.f406578d = bxContentIntentFactory;
        this.f406579e = l12;
        this.f406580f = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        BxContentLink bxContentLink = (BxContentLink) deepLink;
        this.f406580f.R(this.f406578d.b(bxContentLink.f133064b, (8355838 & 2) != 0 ? null : bxContentLink.f133065c, (8355838 & 8) != 0 ? null : bxContentLink.f133070h, (8355838 & 16) != 0 ? PresentationType.INSTANCE.defaultValue() : bxContentLink.f133073k, (8355838 & 64) != 0 ? null : bxContentLink.f133074l, (8355838 & 128) != 0 ? SerpSpaceType.Default : SerpSpaceTypeKt.orDefault(bxContentLink.f133075m), (8355838 & 256) != 0 ? false : bxContentLink.f133076n, (8355838 & 512) != 0 ? null : bundle != null ? NavigationBarStyleKt.getSerpNavigationBarStyle(bundle) : null, (8355838 & 1024) != 0 ? null : null, (8355838 & 2048) != 0 ? null : null, (8355838 & 4096) != 0 ? null : null, (8355838 & 8192) != 0 ? null : null, (8355838 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null, false, (65536 & 8355838) != 0 ? null : null, (131072 & 8355838) != 0 ? null : null, (262144 & 8355838) != 0 ? null : null, (524288 & 8355838) != 0 ? null : null, (1048576 & 8355838) != 0 ? null : null, (2097152 & 8355838) != 0 ? null : null, (8355838 & 4194304) != 0 ? NavigationScreenAction.f107100b : null).putExtra("up_intent", L.a.a(this.f406579e, null, 3)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
