package O5;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.Z0;
import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.abuse.AdvertDetailsAbuseItem;
import com.avito.android.advert.item.advertnumber.AdvertDetailsAdvertNumberItem;
import com.avito.android.advert.item.blocks.items_factories.P0;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.advert.item.gig.documents.GigPersonalInfoItem;
import com.avito.android.advert.item.gig.duties.AdvertDetailsDutiesItem;
import com.avito.android.advert.item.gig.seller.AdvertDetailsGigSellerItem;
import com.avito.android.advert.item.gig.similar_shifts.AdvertDetailsSimilarShiftsItem;
import com.avito.android.advert.item.items_list_builder.c;
import com.avito.android.advert.item.items_list_builder.e;
import com.avito.android.advert.item.scroll_up.AdvertDetailsScrollUpItem;
import com.avito.android.advert.item.show_on_map.AdvertDetailsShowOnMapItem;
import com.avito.android.advert.item.similars.j;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert_badge_bar.AdvertBadgeBarItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.advert_core.map.AdvertMapItem;
import com.avito.android.advert_details_items.address.AdvertDetailsAddressItem;
import com.avito.android.advert_details_items.carousel_photogallery.CarouselPhotoGalleryItem;
import com.avito.android.advert_details_items.description.AdvertDetailsDescriptionItem;
import com.avito.android.advert_details_items.georeference.AdvertDetailsGeoReferenceItem;
import com.avito.android.advert_details_items.title.AdvertDetailsTitleItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.util.bottom_gap.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: GigItemsListBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO5/a;", "Lcom/avito/android/advert/item/items_list_builder/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final P0 f11971b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f11972c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28240u f11973d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f11974e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final kotlin.ranges.l f11975f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AdvertDetailsAbuseItem f11976g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AdvertDetailsAddressItem f11977h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AdvertDetailsAdvertNumberItem f11978i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final AdvertDetailsContactBarItem f11979j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final AdvertDetailsDescriptionItem f11980k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final CarouselPhotoGalleryItem f11981l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final List<AdvertDetailsGeoReferenceItem> f11982m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final AdvertDetailsDutiesItem f11983n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final AdvertMapItem f11984o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final GigPersonalInfoItem f11985p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final AdvertDetailsGigSellerItem f11986q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f11987r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final AdvertDetailsScrollUpItem f11988s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final AdvertDetailsShowOnMapItem f11989t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final AdvertDetailsSimilarShiftsItem f11990u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final AdvertDetailsTitleItem f11991v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final AdvertBadgeBarItem f11992w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final d f11993x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final Z0 f11994y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public final ArrayList f11995z = new ArrayList();

    public a(@k P0 p02, @k LinkedHashMap linkedHashMap, @k InterfaceC28240u interfaceC28240u, @k j jVar, @l kotlin.ranges.l lVar, @l AdvertDetailsAbuseItem advertDetailsAbuseItem, @l AdvertDetailsAddressItem advertDetailsAddressItem, @l AdvertDetailsAdvertNumberItem advertDetailsAdvertNumberItem, @l AdvertDetailsContactBarItem advertDetailsContactBarItem, @l AdvertDetailsDescriptionItem advertDetailsDescriptionItem, @l CarouselPhotoGalleryItem carouselPhotoGalleryItem, @l List list, @l AdvertDetailsDutiesItem advertDetailsDutiesItem, @l AdvertMapItem advertMapItem, @l GigPersonalInfoItem gigPersonalInfoItem, @l AdvertDetailsGigSellerItem advertDetailsGigSellerItem, @l PersistableSpannedItem persistableSpannedItem, @l AdvertDetailsScrollUpItem advertDetailsScrollUpItem, @l AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem, @l AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem, @l AdvertDetailsTitleItem advertDetailsTitleItem, @l AdvertBadgeBarItem advertBadgeBarItem, @k d dVar, @k Z0 z02) {
        this.f11971b = p02;
        this.f11972c = linkedHashMap;
        this.f11973d = interfaceC28240u;
        this.f11974e = jVar;
        this.f11975f = lVar;
        this.f11976g = advertDetailsAbuseItem;
        this.f11977h = advertDetailsAddressItem;
        this.f11978i = advertDetailsAdvertNumberItem;
        this.f11979j = advertDetailsContactBarItem;
        this.f11980k = advertDetailsDescriptionItem;
        this.f11981l = carouselPhotoGalleryItem;
        this.f11982m = list;
        this.f11983n = advertDetailsDutiesItem;
        this.f11984o = advertMapItem;
        this.f11985p = gigPersonalInfoItem;
        this.f11986q = advertDetailsGigSellerItem;
        this.f11987r = persistableSpannedItem;
        this.f11988s = advertDetailsScrollUpItem;
        this.f11989t = advertDetailsShowOnMapItem;
        this.f11990u = advertDetailsSimilarShiftsItem;
        this.f11991v = advertDetailsTitleItem;
        this.f11992w = advertBadgeBarItem;
        this.f11993x = dVar;
        this.f11994y = z02;
    }

    @Override // com.avito.android.advert.item.items_list_builder.c
    @k
    public final e a() {
        ArrayList arrayList = this.f11995z;
        arrayList.add(b(16));
        AdvertDetailsTitleItem advertDetailsTitleItem = this.f11991v;
        if (advertDetailsTitleItem != null) {
            arrayList.add(advertDetailsTitleItem);
        }
        PersistableSpannedItem persistableSpannedItem = this.f11987r;
        if (persistableSpannedItem != null) {
            arrayList.add(persistableSpannedItem);
        }
        arrayList.add(b(12));
        List<AdvertDetailsGeoReferenceItem> list = this.f11982m;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((AdvertDetailsGeoReferenceItem) it.next());
            }
        }
        AdvertDetailsAddressItem advertDetailsAddressItem = this.f11977h;
        if (advertDetailsAddressItem != null) {
            arrayList.add(advertDetailsAddressItem);
        }
        AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem = this.f11989t;
        if (advertDetailsShowOnMapItem != null) {
            arrayList.add(advertDetailsShowOnMapItem);
        }
        AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem = this.f11990u;
        if (advertDetailsSimilarShiftsItem != null) {
            arrayList.add(b(18));
            arrayList.add(advertDetailsSimilarShiftsItem);
        }
        GigPersonalInfoItem gigPersonalInfoItem = this.f11985p;
        if (gigPersonalInfoItem != null) {
            arrayList.add(b(24));
            arrayList.add(gigPersonalInfoItem);
        }
        AdvertDetailsContactBarItem advertDetailsContactBarItem = this.f11979j;
        if (advertDetailsContactBarItem != null) {
            arrayList.add(b(12));
            arrayList.add(advertDetailsContactBarItem);
        }
        AdvertBadgeBarItem advertBadgeBarItem = this.f11992w;
        if (advertBadgeBarItem != null) {
            arrayList.add(b(36));
            arrayList.add(advertBadgeBarItem);
        }
        int i12 = 28;
        AdvertDetailsDescriptionItem advertDetailsDescriptionItem = this.f11980k;
        if (advertDetailsDescriptionItem != null) {
            arrayList.add(this.f11971b.a(28, null, Integer.valueOf(R.style.Re23_Text_H25), this.f11973d.d()));
            arrayList.add(advertDetailsDescriptionItem);
        }
        AdvertDetailsDutiesItem advertDetailsDutiesItem = this.f11983n;
        if (advertDetailsDutiesItem != null) {
            arrayList.add(b(28));
            arrayList.add(advertDetailsDutiesItem);
        }
        AdvertDetailsGigSellerItem advertDetailsGigSellerItem = this.f11986q;
        if (advertDetailsGigSellerItem != null) {
            arrayList.add(b(28));
            arrayList.add(advertDetailsGigSellerItem);
        }
        CarouselPhotoGalleryItem carouselPhotoGalleryItem = this.f11981l;
        if (carouselPhotoGalleryItem != null) {
            arrayList.add(b(18));
            arrayList.add(carouselPhotoGalleryItem);
        }
        AdvertMapItem advertMapItem = this.f11984o;
        if (advertMapItem != null) {
            arrayList.add(b(18));
            arrayList.add(advertMapItem);
        }
        AdvertDetailsScrollUpItem advertDetailsScrollUpItem = this.f11988s;
        if (advertDetailsScrollUpItem != null) {
            arrayList.add(b(32));
            arrayList.add(advertDetailsScrollUpItem);
        }
        int size = arrayList.size();
        AdvertDetailsAbuseItem advertDetailsAbuseItem = this.f11976g;
        if (advertDetailsAbuseItem != null) {
            if (advertDetailsScrollUpItem != null) {
                i12 = 10;
            } else if (!advertDetailsAbuseItem.f72512b && !advertDetailsAbuseItem.f72513c) {
                i12 = 32;
            }
            arrayList.add(b(i12));
            arrayList.add(advertDetailsAbuseItem);
        }
        AdvertDetailsAdvertNumberItem advertDetailsAdvertNumberItem = this.f11978i;
        if (advertDetailsAdvertNumberItem != null) {
            arrayList.add(advertDetailsAdvertNumberItem);
        }
        Z0 z02 = this.f11994y;
        z02.getClass();
        n<Object> nVar = Z0.f67595D[23];
        arrayList.add(b(((Boolean) z02.f67623z.a().invoke()).booleanValue() ? this.f11993x.a().f318843a : 96));
        return new e(arrayList, size, this.f11972c, this.f11975f);
    }

    public final AdvertDetailsGapItem b(int i12) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsGapItem(52, null, i12, this.f11974e.a(), null, null, 50, null);
    }
}
