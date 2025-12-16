package com.avito.android.help_center;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.HelpCenterShowLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HelpCenterDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/help_center/b;", "Lev/b;", "Lcom/avito/android/deep_linking/links/HelpCenterShowLink;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.help_center.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30745b extends AbstractC40162b<HelpCenterShowLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30751h f161621d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f161622e;

    @Inject
    public C30745b(@Y61.k InterfaceC30751h interfaceC30751h, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f161621d = interfaceC30751h;
        this.f161622e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f161622e.R(this.f161621d.a(null), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
