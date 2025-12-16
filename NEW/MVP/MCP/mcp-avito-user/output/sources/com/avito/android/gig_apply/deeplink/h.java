package com.avito.android.gig_apply.deeplink;

import Ju.AbstractC14250d;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_apply.GigSlotDeeplink;
import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import com.avito.android.gig_apply.ui.n;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigSlotDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_apply/deeplink/h;", "Lev/a;", "Lcom/avito/android/gig_apply/GigSlotDeeplink;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends AbstractC40161a<GigSlotDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final n f159576f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f159577g;

    @Inject
    public h(@Y61.k n nVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f159576f = nVar;
        this.f159577g = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f159577g.R(this.f159576f.a(new GigSlotOpenParams(((GigSlotDeeplink) deepLink).f159519b)), com.avito.android.deeplink_handler.view.b.f134588l);
        j(AbstractC14250d.c.f9171c);
    }
}
