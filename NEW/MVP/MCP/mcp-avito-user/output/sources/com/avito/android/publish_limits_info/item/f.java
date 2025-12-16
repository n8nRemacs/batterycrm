package com.avito.android.publish_limits_info.item;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.LimitsInfo;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LimitsInfoItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/item/f;", "Lcom/avito/android/publish_limits_info/item/e;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {
    @Inject
    public f() {
        throw null;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        LimitsInfo limitsInfo = aVar2.f245925c;
        AttributedText extraInfo = limitsInfo.getExtraInfo();
        if (extraInfo != null) {
            extraInfo.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, aVar2));
        }
        hVar.Wq(limitsInfo, aVar2.f245926d);
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return null;
    }
}
