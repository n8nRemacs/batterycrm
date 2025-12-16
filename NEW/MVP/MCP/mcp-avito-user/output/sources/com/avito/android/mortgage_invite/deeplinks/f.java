package com.avito.android.mortgage_invite.deeplinks;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationContactInfoLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l20.InterfaceC43530a;

/* compiled from: MortgageApplicationContactInfoDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/deeplinks/f;", "Lev/a;", "Lcom/avito/android/mortgage_invite/deeplink/MortgageApplicationContactInfoLink;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends AbstractC40161a<MortgageApplicationContactInfoLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f205818f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43530a f205819g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f205820h;

    @Inject
    public f(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC43530a interfaceC43530a, @Y61.k C25719a c25719a) {
        this.f205818f = interfaceC4053a;
        this.f205819g = interfaceC43530a;
        this.f205820h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MortgageApplicationContactInfoLink mortgageApplicationContactInfoLink = (MortgageApplicationContactInfoLink) deepLink;
        this.f205820h.b(mortgageApplicationContactInfoLink, this, null, new e(this, mortgageApplicationContactInfoLink));
    }
}
