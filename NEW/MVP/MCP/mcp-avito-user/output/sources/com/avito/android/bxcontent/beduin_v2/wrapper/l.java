package com.avito.android.bxcontent.beduin_v2.wrapper;

import com.avito.android.remote.model.SerpBannerContainer;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import com.avito.beduin.v2.engine.component.G;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BxWrapperState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/bxcontent/beduin_v2/wrapper/k;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/bxcontent/beduin_v2/wrapper/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements Y41.l<G, k> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f109613l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(1);
        this.f109613l = mVar;
    }

    @Override // Y41.l
    public final k invoke(G g12) {
        SerpElement serpElement;
        String string;
        String string2 = g12.getString("contentRawData");
        if (string2 != null) {
            try {
                serpElement = (SerpElement) this.f109613l.f109614c.d(SerpElement.class, string2);
            } catch (Exception unused) {
            }
        } else {
            serpElement = null;
        }
        if (serpElement instanceof SerpBannerContainer) {
            Object objG = C42745f0.G(((SerpBannerContainer) serpElement).getElements());
            AdNetworkBannerItem adNetworkBannerItem = objG instanceof AdNetworkBannerItem ? (AdNetworkBannerItem) objG : null;
            if (adNetworkBannerItem == null || (string = adNetworkBannerItem.getAlid()) == null) {
                string = UUID.randomUUID().toString();
            }
        } else {
            string = UUID.randomUUID().toString();
        }
        return new k(string, serpElement);
    }
}
