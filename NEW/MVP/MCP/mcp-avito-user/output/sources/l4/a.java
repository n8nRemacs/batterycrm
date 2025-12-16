package L4;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.brandingGallery.block.BrandingGalleryBlockItem;
import com.avito.android.advert.item.brandingGallery.items.BrandingGalleryBlockElementItem;
import com.avito.android.advert.item.similars.j;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.branding_gallery.BrandingGallery;
import com.avito.android.remote.model.branding_gallery.BrandingGalleryItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsBrandingGalleryBlockItemFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LL4/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.brandingGallery.items.factory.a f9771a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f9772b;

    @Inject
    public a(@k com.avito.android.advert.item.brandingGallery.items.factory.a aVar, @k j jVar) {
        this.f9771a = aVar;
        this.f9772b = jVar;
    }

    @l
    public final BrandingGalleryBlockItem a(@k AdvertDetails advertDetails) {
        List<BrandingGalleryItem> items;
        BrandingGalleryBlockElementItem brandingGalleryBlockElementItem;
        BrandingGallery brandingGallery = advertDetails.getBrandingGallery();
        if (brandingGallery == null || (items = brandingGallery.getItems()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BrandingGalleryItem brandingGalleryItem : items) {
            this.f9771a.getClass();
            if (brandingGalleryItem instanceof BrandingGalleryItem.Image) {
                brandingGalleryBlockElementItem = new BrandingGalleryBlockElementItem(((BrandingGalleryItem.Image) brandingGalleryItem).getImage(), null, 0L, null, 14, null);
            } else {
                if (!(brandingGalleryItem instanceof BrandingGalleryItem.Video)) {
                    throw new NoWhenBranchMatchedException();
                }
                BrandingGalleryItem.Video video = (BrandingGalleryItem.Video) brandingGalleryItem;
                brandingGalleryBlockElementItem = new BrandingGalleryBlockElementItem(video.getPreview(), video.getAction(), 0L, null, 12, null);
            }
            arrayList.add(brandingGalleryBlockElementItem);
        }
        return new BrandingGalleryBlockItem(arrayList, 0L, null, this.f9772b.a(), null, null, 54, null);
    }
}
