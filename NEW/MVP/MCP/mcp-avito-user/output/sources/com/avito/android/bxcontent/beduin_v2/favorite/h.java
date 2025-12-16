package com.avito.android.bxcontent.beduin_v2.favorite;

import Y41.l;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BxFavoriteButtonState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/bxcontent/beduin_v2/favorite/g;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/bxcontent/beduin_v2/favorite/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements l<G, g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f109541l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(1);
        this.f109541l = iVar;
    }

    @Override // Y41.l
    public final g invoke(G g12) {
        G g13 = g12;
        String string = g13.getString(TooltipAttribute.PARAM_DEEP_LINK);
        String string2 = g13.getString("analyticsContext");
        if (string2 == null) {
            string2 = null;
            if (string != null) {
                DeepLink deepLinkB = this.f109541l.f109542c.b(string);
                AdvertDetailsLink advertDetailsLink = deepLinkB instanceof AdvertDetailsLink ? (AdvertDetailsLink) deepLinkB : null;
                if (advertDetailsLink != null) {
                    string2 = advertDetailsLink.f132948c;
                }
            }
        }
        String str = string2;
        String string3 = g13.getString("itemId");
        if (string3 == null) {
            string3 = "";
        }
        String str2 = string3;
        Boolean boolC = g13.c("isFavorite");
        return new g(str2, str, string, g13.getString("categoryId"), boolC != null ? boolC.booleanValue() : false);
    }
}
