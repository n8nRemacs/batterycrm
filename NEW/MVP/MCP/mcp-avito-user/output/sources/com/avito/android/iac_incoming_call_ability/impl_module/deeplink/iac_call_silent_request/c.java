package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_call_silent_request;

import Fc1.E0;
import Y61.k;
import android.content.res.Resources;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_call_silent_request.IacCallSilentRequestDeeplink;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_permission_mic_ask.IacPermissionMicAskLink;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacCallSilentRequestDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/deeplink/iac_call_silent_request/c;", "Lev/a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC40161a<IacCallSilentRequestDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f168228f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f168229g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final F f168230h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC28373a f168231i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final NL.e f168232j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final EL.a f168233k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Resources f168234l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f168235m = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public c(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.i iVar, @k F f12, @k InterfaceC28373a interfaceC28373a, @k NL.e eVar, @k EL.a aVar2, @k Resources resources) {
        this.f168228f = aVar;
        this.f168229g = iVar;
        this.f168230h = f12;
        this.f168231i = interfaceC28373a;
        this.f168232j = eVar;
        this.f168233k = aVar2;
        this.f168234l = resources;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacCallSilentRequestDeeplink iacCallSilentRequestDeeplink = (IacCallSilentRequestDeeplink) deepLink;
        b.a.a(this.f168228f, new IacPermissionMicAskLink(true, "call_time"), null, null, 6);
        NL.e eVar = this.f168232j;
        boolean zA2 = eVar.a();
        io.reactivex.rxjava3.disposables.c cVar = this.f168235m;
        if (!zA2) {
            cVar.b(eVar.e(true, false).r().k(new E0(this, 26)).u());
        }
        cVar.b(A1.d(this.f168233k.a(iacCallSilentRequestDeeplink.f168391b, iacCallSilentRequestDeeplink.f168392c, "call_time"), new a(this), new b(this)));
    }
}
