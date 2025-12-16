package com.avito.android.advert_item_actions.deeplink;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.advert_item_actions.AdvertItemActionsDeeplink;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertItemActionsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_item_actions/deeplink/f;", "Lev/a;", "Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink;", "_avito_advert-item-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends AbstractC40161a<AdvertItemActionsDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f85844f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.advert_item_actions.view.a f85845g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final La.c f85846h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC28373a f85847i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f85848j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f85849k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f85850l;

    @Inject
    public f(@k a.d dVar, @k com.avito.android.advert_item_actions.view.a aVar, @k La.c cVar, @k InterfaceC28373a interfaceC28373a, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f85844f = dVar;
        this.f85845g = aVar;
        this.f85846h = cVar;
        this.f85847i = interfaceC28373a;
        this.f85848j = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f85844f.k0(new e(this, (AdvertItemActionsDeeplink) deepLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f85849k.e();
    }
}
