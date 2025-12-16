package com.avito.android.sx_address.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.SxAddressEntryLinks;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import yA0.InterfaceC50095c;

/* compiled from: SxAddressEntryLinksDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/deeplink/u;", "Lev/b;", "Lcom/avito/android/SxAddressEntryLinks;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class u extends AbstractC40162b<SxAddressEntryLinks> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Context f292878d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f292879e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50095c f292880f;

    @Inject
    public u(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC50095c interfaceC50095c) {
        this.f292878d = context;
        this.f292879e = interfaceC4053a;
        this.f292880f = interfaceC50095c;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f292879e.R(this.f292880f.b(this.f292878d), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
