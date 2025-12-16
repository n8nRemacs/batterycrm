package xf;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.autoteka.deeplinks.AutotekaLandingLink;
import com.avito.android.autoteka.presentation.landing.AutotekaLandingActivity;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaLandingDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxf/a;", "Lev/b;", "Lcom/avito/android/autoteka/deeplinks/AutotekaLandingLink;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49933a extends AbstractC40162b<AutotekaLandingLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Context f442591d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f442592e;

    @Inject
    public C49933a(@k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        this.f442591d = context;
        this.f442592e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Intent intent = new Intent(this.f442591d, (Class<?>) AutotekaLandingActivity.class);
        intent.putExtra("KeyAutotekaLandingUtmParams", ((AutotekaLandingLink) deepLink).f96220b);
        this.f442592e.R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
