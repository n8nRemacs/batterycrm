package Tw0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.IncomeSettingsLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IncomeSettingsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LTw0/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/IncomeSettingsLink;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15419a extends AbstractC40162b<IncomeSettingsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.soa_stat.profile_settings.a f16021d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f16022e;

    @Inject
    public C15419a(@k com.avito.android.soa_stat.profile_settings.a aVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f16021d = aVar;
        this.f16022e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f16022e.R(this.f16021d.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
