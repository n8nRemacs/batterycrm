package com.avito.android.vas_union;

import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_union.deeplink.VasUnionV2Link;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: VasUnionV2FragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_union/f;", "LA50/b;", "Lcom/avito/android/vas_union/deeplink/VasUnionV2Link;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements A50.b<VasUnionV2Link> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        VasUnionV2Link vasUnionV2Link = (VasUnionV2Link) deepLink;
        VasUnionV2Fragment.f323084D0.getClass();
        VasUnionV2Fragment vasUnionV2Fragment = new VasUnionV2Fragment();
        vasUnionV2Fragment.setArguments(C22777e.b(new Q("vas_union_v2_key_item_id", vasUnionV2Link.f323127b), new Q("vas_union_v2_key_checkout_context", vasUnionV2Link.f323128c), new Q("vas_union_v2_key_closable", Boolean.valueOf(vasUnionV2Link.f323129d))));
        return vasUnionV2Fragment;
    }
}
