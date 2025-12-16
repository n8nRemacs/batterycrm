package com.avito.android.gig_shift_start.deeplink;

import Ju.AbstractC14250d;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_shift_start.GigShiftFinishDeeplink;
import com.avito.android.gig_shift_start.GigShiftStartDeeplink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigShiftStartDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_start/deeplink/a;", "Lev/a;", "Lcom/avito/android/gig_shift_start/GigShiftFinishDeeplink;", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<GigShiftFinishDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f160741f;

    @Inject
    public a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f160741f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        GigShiftFinishDeeplink gigShiftFinishDeeplink = (GigShiftFinishDeeplink) deepLink;
        b.a.a(this.f160741f, new GigShiftStartDeeplink(null, gigShiftFinishDeeplink.f160734b, gigShiftFinishDeeplink.f160735c, Boolean.TRUE), null, null, 6);
        j(AbstractC14250d.c.f9171c);
    }
}
