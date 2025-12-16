package com.avito.android.iac_util_deeplinks.impl_module;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_util_deeplinks.public_module.OpenSystemSettingsLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40161a;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: OpenSystemSettingsLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/m;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/OpenSystemSettingsLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30962m extends AbstractC40161a<OpenSystemSettingsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f169150f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f169151g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f169152h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169153i;

    @Inject
    public C30962m(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f169150f = interfaceC28373a;
        this.f169151g = interfaceC35845m2;
        this.f169152h = interfaceC4053a;
        this.f169153i = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        OpenSystemSettingsLink openSystemSettingsLink = (OpenSystemSettingsLink) deepLink;
        ParametrizedEvent parametrizedEvent = openSystemSettingsLink.f169248c;
        if (parametrizedEvent != null) {
            this.f169150f.c(a0.a(parametrizedEvent));
        }
        this.f169152h.R(this.f169151g.i(), com.avito.android.deeplink_handler.view.b.f134588l);
        OpenSystemSettingsLink.b bVar = new OpenSystemSettingsLink.b();
        DeepLink[] deepLinkArr = (DeepLink[]) C42745f0.V(openSystemSettingsLink.f169247b).toArray(new DeepLink[0]);
        i(bVar, this.f169153i, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }
}
