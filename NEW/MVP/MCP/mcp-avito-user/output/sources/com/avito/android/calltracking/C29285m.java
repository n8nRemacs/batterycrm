package com.avito.android.calltracking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.CalltrackingDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalltrackingDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calltracking/m;", "Lev/b;", "Lcom/avito/android/deep_linking/links/CalltrackingDeeplink;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.calltracking.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29285m extends AbstractC40162b<CalltrackingDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Context f113756d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f113757e;

    @Inject
    public C29285m(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f113756d = context;
        this.f113757e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CalltrackingActivity.f113549q.getClass();
        this.f113757e.R(new Intent(this.f113756d, (Class<?>) CalltrackingActivity.class), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
