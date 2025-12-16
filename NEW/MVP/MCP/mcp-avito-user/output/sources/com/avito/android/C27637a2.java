package com.avito.android;

import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryContactBar;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryEntry;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryReview;
import com.avito.android.remote.model.rating_details_mvi.TextSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: RatingDetailsGalleryInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_rating_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.a2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27637a2 {

    /* compiled from: RatingDetailsGalleryInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.a2$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67642a;

        static {
            int[] iArr = new int[PhotoGalleryContactBar.ActionType.values().length];
            try {
                iArr[PhotoGalleryContactBar.ActionType.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoGalleryContactBar.ActionType.MESSENGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhotoGalleryContactBar.ActionType.CALENDAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f67642a = iArr;
        }
    }

    @Y61.k
    public static final GalleryItem.GalleryContactBar a(@Y61.k PhotoGalleryContactBar photoGalleryContactBar) {
        GalleryItem.ActionType actionType;
        String name = photoGalleryContactBar.getName();
        String title = photoGalleryContactBar.getTitle();
        Image avatar = photoGalleryContactBar.getAvatar();
        String price = photoGalleryContactBar.getPrice();
        List<PhotoGalleryContactBar.ContactButton> actions = photoGalleryContactBar.getActions();
        ArrayList arrayList = new ArrayList(C42745f0.q(actions, 10));
        for (PhotoGalleryContactBar.ContactButton contactButton : actions) {
            String iconName = contactButton.getIconName();
            String iconColor = contactButton.getIconColor();
            DeepLink deepLink = contactButton.getDeepLink();
            int i12 = a.f67642a[contactButton.getActionType().ordinal()];
            if (i12 == 1) {
                actionType = GalleryItem.ActionType.f68410b;
            } else if (i12 == 2) {
                actionType = GalleryItem.ActionType.f68411c;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                actionType = GalleryItem.ActionType.f68412d;
            }
            arrayList.add(new GalleryItem.GalleryButton(actionType, iconName, iconColor, deepLink));
        }
        return new GalleryItem.GalleryContactBar(name, avatar, arrayList, title, price, photoGalleryContactBar.getUserHash());
    }

    @Y61.k
    public static final GalleryItem.GalleyReview b(@Y61.k PhotoGalleryReview photoGalleryReview) {
        ArrayList arrayList;
        Long id2 = photoGalleryReview.getId();
        String title = photoGalleryReview.getTitle();
        Float score = photoGalleryReview.getScore();
        Image avatar = photoGalleryReview.getAvatar();
        List<TnsGalleryImage> images = photoGalleryReview.getImages();
        String stageTitle = photoGalleryReview.getStageTitle();
        String rated = photoGalleryReview.getRated();
        List<TextSection> textSections = photoGalleryReview.getTextSections();
        if (textSections != null) {
            List<TextSection> list = textSections;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                TextSection textSection = (TextSection) it.next();
                arrayList.add(new GalleryItem.ReviewTextSection(textSection.getTitle(), textSection.getText(), false, 4, null));
            }
        } else {
            arrayList = null;
        }
        return new GalleryItem.GalleyReview(id2, title, score, avatar, stageTitle, images, rated, arrayList, photoGalleryReview.getItemTitle());
    }

    @Y61.k
    public static final List<GalleryItem.GalleryImage> c(@Y61.k PhotoGalleryEntry photoGalleryEntry) {
        List<PhotoGalleryReview> reviews = photoGalleryEntry.getReviews();
        if (reviews == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (PhotoGalleryReview photoGalleryReview : reviews) {
            ArrayList arrayList2 = new ArrayList();
            List<TnsGalleryImage> images = photoGalleryReview.getImages();
            if (images != null) {
                Iterator<T> it = images.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new GalleryItem.GalleryImage((TnsGalleryImage) it.next(), photoGalleryReview.getId()));
                }
            }
            C42745f0.h(arrayList2, arrayList);
        }
        return arrayList;
    }
}
