package com.avito.android.vas_performance.deeplink.handler;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.vas_performance.E;
import com.avito.android.vas_performance.deeplink.AppliedServicesLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppliedServicesDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/deeplink/handler/a;", "Lev/b;", "Lcom/avito/android/vas_performance/deeplink/AppliedServicesLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40162b<AppliedServicesLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f319880d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f319881e;

    @Inject
    public a(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k E e12) {
        this.f319880d = interfaceC4053a;
        this.f319881e = e12;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f319880d.R(this.f319881e.a(((AppliedServicesLink) deepLink).f319856b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
