package com.avito.android.mortgage.deeplink;

import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import t00.InterfaceC48454a;

/* compiled from: MortgageLandingV2DeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/deeplink/T;", "Lev/a;", "Lcom/avito/android/mortgage/deeplink/MortgageLandingV2Link;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class T extends AbstractC40161a<MortgageLandingV2Link> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f198773f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48454a f198774g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f198775h;

    @Inject
    public T(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC48454a interfaceC48454a, @Y61.k C25719a c25719a) {
        this.f198773f = interfaceC4053a;
        this.f198774g = interfaceC48454a;
        this.f198775h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MortgageLandingV2Link mortgageLandingV2Link = (MortgageLandingV2Link) deepLink;
        this.f198775h.b(mortgageLandingV2Link, this, null, new S(this, mortgageLandingV2Link));
    }
}
