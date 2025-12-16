package com.avito.android.sbc.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.SbcDispatchesLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.sbc.autodispatches.SbcAutoDispatchesActivity;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SbcDispatchesLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/deeplink/m;", "Lcom/avito/android/deep_linking/links/SbcDispatchesLink;", "DeeplinkT", "Lev/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m<DeeplinkT extends SbcDispatchesLink> extends AbstractC40162b<DeeplinkT> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f259964d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Context f259965e;

    @Inject
    public m(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f259964d = interfaceC4053a;
        this.f259965e = context;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f259964d.R(new Intent(this.f259965e, (Class<?>) SbcAutoDispatchesActivity.class), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
