package com.avito.android.vas_discount.business;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.UserAdvertStatusType;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertImage;
import com.avito.android.remote.model.AdvertStats;
import com.avito.android.remote.model.AdvertStatsContact;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Service;
import com.avito.android.remote.model.TimeToLive;
import com.avito.android.remote.model.UserAdvert;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.user_adverts.RealtyLeadgen;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import oL0.C44663a;

/* compiled from: DiscountToItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_discount/business/e;", "Lcom/avito/android/vas_discount/business/d;", "<init>", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements d {

    /* compiled from: DiscountToItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f319617a;

        static {
            int[] iArr = new int[UserAdvertStatusType.values().length];
            try {
                UserAdvertStatusType userAdvertStatusType = UserAdvertStatusType.f253053b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f319617a = iArr;
        }
    }

    @Inject
    public e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.vas_discount.business.d
    @k
    public final ArrayList a(@k DiscountResponse discountResponse) {
        Image image;
        Iterator it;
        UserAdvertItem.p.a aVar;
        UserAdvertItem.p pVar;
        LinkedHashMap linkedHashMap;
        UserAdvertItem.Status status;
        String description;
        DimmedImage image2;
        ArrayList arrayList = new ArrayList();
        String title = discountResponse.getDiscountInfo().getTitle();
        String description2 = discountResponse.getDiscountInfo().getDescription();
        Long dueDate = discountResponse.getDiscountInfo().getDueDate();
        Integer num = null;
        arrayList.add(new com.avito.android.vas_discount.ui.items.description.a(title, description2, dueDate != null ? Long.valueOf(TimeUnit.SECONDS.toMillis(dueDate.longValue())) : null));
        String advertsTitle = discountResponse.getAdvertsTitle();
        if (advertsTitle != null) {
            arrayList.add(new com.avito.android.vas_discount.ui.items.title.b(advertsTitle));
        }
        List<UserAdvert> listC = discountResponse.c();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, 10));
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            UserAdvert userAdvert = (UserAdvert) it2.next();
            String id2 = userAdvert.getId();
            String id3 = userAdvert.getId();
            String title2 = userAdvert.getTitle();
            AdvertImage image3 = userAdvert.getImage();
            if (image3 == null || (image2 = image3.getImage()) == null || (previewImage = image2.getImage()) == null) {
                Video video = userAdvert.getVideo();
                if (video != null) {
                    Image previewImage = video.getPreviewImage();
                    image = previewImage;
                } else {
                    image = num;
                }
            } else {
                image = previewImage;
            }
            String price = userAdvert.getPrice();
            AttributedText saleInfo = userAdvert.getSaleInfo();
            String shortcut = userAdvert.getShortcut();
            AdvertStats stats = userAdvert.getStats();
            if (stats == null) {
                it = it2;
                pVar = num;
            } else {
                Integer total = stats.getTotal();
                UserAdvertItem.p.a aVar2 = total != null ? new UserAdvertItem.p.a(total.intValue(), stats.getToday()) : num;
                Integer favorites = stats.getFavorites();
                UserAdvertItem.p.a aVar3 = favorites != null ? new UserAdvertItem.p.a(favorites.intValue(), num) : num;
                AdvertStatsContact contacts = stats.getContacts();
                if (contacts != null) {
                    it = it2;
                    aVar = new UserAdvertItem.p.a(contacts.getTotal(), Integer.valueOf(contacts.getToday()));
                } else {
                    it = it2;
                    aVar = null;
                }
                pVar = new UserAdvertItem.p(aVar2, aVar3, aVar, stats.getViewsToContactsConversion());
            }
            List<Service> servicesIcons = userAdvert.getServicesIcons();
            if (servicesIcons != null) {
                List<Service> list = servicesIcons;
                int iF2 = P0.f(C42745f0.q(list, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
                for (Service service : list) {
                    linkedHashMap2.put(service.getId(), service.getIcon());
                }
                linkedHashMap = linkedHashMap2;
            } else {
                linkedHashMap = null;
            }
            TimeToLive ttl = userAdvert.getTtl();
            UserAdvertItem.q qVar = (ttl == null || (description = ttl.getDescription()) == null) ? null : new UserAdvertItem.q(description);
            String declineReason = userAdvert.getDeclineReason();
            RealtyLeadgen realtyLeadgen = userAdvert.getRealtyLeadgen();
            UserAdvertItem.l lVar = realtyLeadgen == null ? null : new UserAdvertItem.l(realtyLeadgen.getText(), realtyLeadgen.getTextColor());
            DeepLink deepLink = userAdvert.getDeepLink();
            if (deepLink == null) {
                deepLink = new NoMatchLink();
            }
            DeepLink deepLink2 = deepLink;
            Boolean hasDelivery = userAdvert.getHasDelivery();
            boolean zBooleanValue = hasDelivery != null ? hasDelivery.booleanValue() : false;
            UserAdvert.Status status2 = userAdvert.getStatus();
            if (status2 == null) {
                status = null;
            } else {
                if (a.f319617a[status2.getType().ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                UserAdvertItem.Status.Type type = UserAdvertItem.Status.Type.f316665b;
                status = new UserAdvertItem.Status(status2.getDescription());
            }
            UserAdvert.PriceBadge priceBadge = userAdvert.getPriceBadge();
            UserAdvertItem.j jVar = priceBadge == null ? null : new UserAdvertItem.j(priceBadge.getTitle(), priceBadge.getUniversalTitleColor(), priceBadge.getUniversalBackgroundColor());
            Boolean boolIsAutoPublishOn = userAdvert.isAutoPublishOn();
            arrayList2.add(new C44663a(id2, id3, title2, image, price, saleInfo, shortcut, pVar, linkedHashMap, qVar, declineReason, null, lVar, false, deepLink2, zBooleanValue, status, jVar, null, null, null, null, null, boolIsAutoPublishOn != null ? boolIsAutoPublishOn.booleanValue() : false, null, null, null, userAdvert.getFillParameters(), null, 394012672, null));
            it2 = it;
            num = null;
        }
        C42745f0.h(arrayList2, arrayList);
        Action action = discountResponse.getAction();
        if (action != null) {
            arrayList.add(new com.avito.android.vas_discount.ui.items.button.a(action.getTitle(), action.getDeepLink()));
        }
        return arrayList;
    }
}
