package com.avito.android.home;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.CalledFrom;
import com.avito.android.L;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35967w2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MainScreenLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/u;", "Lev/b;", "Lcom/avito/android/deep_linking/links/MainScreenLink;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u extends AbstractC40162b<MainScreenLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final L f162525d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f162526e;

    @Inject
    public u(@Y61.k L l12, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f162525d = l12;
        this.f162526e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        MainScreenLink mainScreenLink = (MainScreenLink) deepLink;
        boolean z12 = bundle != null ? bundle.getBoolean("with_activity_task", false) : false;
        CalledFrom calledFromB = bundle != null ? com.avito.android.util.H.b(bundle) : null;
        Intent intentA = this.f162525d.a(mainScreenLink.f133431b, mainScreenLink.f133432c);
        if (mainScreenLink.f133433d || z12) {
            intentA.addFlags(268468224);
        }
        C35967w2.c(intentA, calledFromB);
        this.f162526e.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
