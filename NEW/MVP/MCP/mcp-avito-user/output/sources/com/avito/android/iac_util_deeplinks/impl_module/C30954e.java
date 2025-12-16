package com.avito.android.iac_util_deeplinks.impl_module;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.ClickStreamLocalLink;
import ev.AbstractC40161a;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ClickStreamLocalLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/e;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/ClickStreamLocalLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30954e extends AbstractC40161a<ClickStreamLocalLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f169140f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169141g;

    @Inject
    public C30954e(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f169140f = interfaceC28373a;
        this.f169141g = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ClickStreamLocalLink clickStreamLocalLink = (ClickStreamLocalLink) deepLink;
        this.f169140f.c(clickStreamLocalLink.f169244b);
        ClickStreamLocalLink.b bVar = new ClickStreamLocalLink.b();
        DeepLink[] deepLinkArr = (DeepLink[]) C42745f0.V(clickStreamLocalLink.f169245c).toArray(new DeepLink[0]);
        i(bVar, this.f169141g, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }
}
