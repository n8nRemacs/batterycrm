package P4;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.branding_advantages.block.BrandingAdvantagesBlockItem;
import com.avito.android.advert.item.branding_advantages.block_element.BrandingAdvantagesBlockElementItem;
import com.avito.android.advert.item.similars.j;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.BrandingAdvantages;
import com.avito.android.remote.model.BrandingAdvantagesDescription;
import com.avito.android.remote.model.BrandingAdvantagesItem;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BrandingAdvantagesBlockItemFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP4/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.branding_advantages.block_element.factory.a f12811a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f12812b;

    @Inject
    public a(@k com.avito.android.advert.item.branding_advantages.block_element.factory.a aVar, @k j jVar) {
        this.f12811a = aVar;
        this.f12812b = jVar;
    }

    @l
    public final BrandingAdvantagesBlockItem a(@k AdvertDetails advertDetails) {
        BrandingAdvantages brandingAdvantages = advertDetails.getBrandingAdvantages();
        ArrayList arrayList = null;
        if (brandingAdvantages == null) {
            return null;
        }
        List<BrandingAdvantagesItem> items = brandingAdvantages.getItems();
        if (items == null || items.isEmpty()) {
            BrandingAdvantagesDescription description = brandingAdvantages.getDescription();
            String text = description != null ? description.getText() : null;
            if (text == null || C43066x.K(text)) {
                return null;
            }
        }
        String title = brandingAdvantages.getTitle();
        BrandingAdvantagesDescription description2 = brandingAdvantages.getDescription();
        BrandingAdvantagesBlockItem.Description description3 = description2 != null ? new BrandingAdvantagesBlockItem.Description(description2.getText(), description2.getMaxLines()) : null;
        List<BrandingAdvantagesItem> items2 = brandingAdvantages.getItems();
        if (items2 != null) {
            List<BrandingAdvantagesItem> list = items2;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (BrandingAdvantagesItem brandingAdvantagesItem : list) {
                this.f12811a.getClass();
                arrayList.add(new BrandingAdvantagesBlockElementItem(brandingAdvantagesItem.getTitle(), brandingAdvantagesItem.getIcon(), brandingAdvantagesItem.getBackgroundColor(), 0L, null, 24, null));
            }
        }
        return new BrandingAdvantagesBlockItem(title, description3, arrayList, 0L, null, this.f12812b.a(), null, null, JfifUtil.MARKER_SOI, null);
    }
}
