package com.avito.android.iac_util_deeplinks.impl_module;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.RunMultipleLink;
import ev.AbstractC40161a;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RunMultipleLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/M;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/RunMultipleLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class M extends AbstractC40161a<RunMultipleLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169127f;

    @Inject
    public M(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f169127f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        RunMultipleLink.b bVar = new RunMultipleLink.b();
        DeepLink[] deepLinkArr = (DeepLink[]) ((RunMultipleLink) deepLink).f169285b.toArray(new DeepLink[0]);
        i(bVar, this.f169127f, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }
}
