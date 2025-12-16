package com.avito.android.deep_linking.action_select_link;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ActionSelectLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/action_select_link/c;", "Lev/b;", "Lcom/avito/android/deep_linking/action_select_link/ActionSelectLink;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends AbstractC40162b<ActionSelectLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f132889d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f132890e;

    @Inject
    public c(@k a.d dVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f132889d = dVar;
        this.f132890e = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f132889d.k0(new b((ActionSelectLink) deepLink, this, str, bundle));
        return AbstractC14250d.c.f9171c;
    }
}
