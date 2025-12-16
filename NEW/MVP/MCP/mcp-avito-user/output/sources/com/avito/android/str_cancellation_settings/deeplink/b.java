package com.avito.android.str_cancellation_settings.deeplink;

import Ty0.InterfaceC15425a;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrCancellationSettingsLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/deeplink/b;", "Lev/a;", "Lcom/avito/android/str_cancellation_settings/deeplink/StrCancellationSettingsDeeplink;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC40161a<StrCancellationSettingsDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15425a f288296f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C25719a f288297g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f288298h;

    @Inject
    public b(@k InterfaceC15425a interfaceC15425a, @k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f288296f = interfaceC15425a;
        this.f288297g = c25719a;
        this.f288298h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        StrCancellationSettingsDeeplink strCancellationSettingsDeeplink = (StrCancellationSettingsDeeplink) deepLink;
        this.f288297g.b(strCancellationSettingsDeeplink, this, null, new a(this, strCancellationSettingsDeeplink));
    }
}
