package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageManagerUspDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/deeplink/X;", "Lev/b;", "Lcom/avito/android/mortgage/deeplink/MortgageManagerUspLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class X extends AbstractC40162b<MortgageManagerUspLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.d f198780d;

    @Inject
    public X(@Y61.k a.d dVar) {
        this.f198780d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f198780d.D0("ManagerUspDialog", new W((MortgageManagerUspLink) deepLink));
        return AbstractC14250d.c.f9171c;
    }
}
