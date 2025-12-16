package com.avito.android.iac_util_deeplinks.impl_module.checkable_test_link;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.checkable_test_link.IacCheckableTestLink;
import ev.AbstractC40162b;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: IacCheckableTestLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/checkable_test_link/b;", "Lev/b;", "Lcom/avito/android/iac_util_deeplinks/public_module/checkable_test_link/IacCheckableTestLink;", "<init>", "()V", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC40162b<IacCheckableTestLink> {
    @Inject
    public b() {
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        IacCheckableTestLink.f169288c = C42745f0.i0((IacCheckableTestLink) deepLink, (Collection) IacCheckableTestLink.f169288c);
        return new a();
    }
}
