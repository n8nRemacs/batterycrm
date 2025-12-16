package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_voip_call_request;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_voip_call_request.IacVoipCallRequestDeeplink;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacVoipCallRequestDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/deeplink/iac_voip_call_request/c;", "Lev/a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_voip_call_request/IacVoipCallRequestDeeplink;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC40161a<IacVoipCallRequestDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.i f168279f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final EL.a f168280g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f168281h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f168282i = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public c(@k a.i iVar, @k EL.a aVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f168279f = iVar;
        this.f168280g = aVar;
        this.f168281h = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacVoipCallRequestDeeplink iacVoipCallRequestDeeplink = (IacVoipCallRequestDeeplink) deepLink;
        this.f168282i.b(A1.d(this.f168280g.a(iacVoipCallRequestDeeplink.f168405c, iacVoipCallRequestDeeplink.f168406d, iacVoipCallRequestDeeplink.f168404b), new a(this), new b(this, iacVoipCallRequestDeeplink)));
    }
}
