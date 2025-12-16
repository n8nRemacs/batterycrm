package com.avito.android.user_address.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAddressForceExitDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/deeplink/h;", "Lev/b;", "Lcom/avito/android/deep_linking/links/UserAddressLink$ForceExit;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_address.deeplink.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35347h extends AbstractC40162b<UserAddressLink.ForceExit> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f307237d;

    @Inject
    public C35347h(@Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f307237d = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f307237d.s1();
        return AbstractC14250d.c.f9171c;
    }
}
