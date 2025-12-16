package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBar;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarActionType;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarCompareFeature;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarDropdownAction;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarFavoriteFeature;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarFeatures;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarShareFeature;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarVisibleAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertNavBar.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\f\u0010\u0004\u001a\u00020\t*\u00020\nH\u0002\u001a\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\r0\f\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\r0\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"ICONS_COUNT_WITHOUT_DROPDOWN", "", "ICONS_COUNT_WITH_DROPDOWN", "MAX_VISIBLE_ICONS_ON_NAVBAR", "convert", "Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBar;", "Lcom/avito/android/remote/model/AdvertNavBar;", "advert", "Lcom/avito/android/remote/model/AdvertDetails;", "Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarActionType;", "Lcom/avito/android/remote/model/AdvertNavBarActionType;", "getDropdownActions", "", "Lcom/avito/android/remote/model/AdvertNavBarAction;", "getVisibleActions", "_avito-discouraged_avito-api_advert-details"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertNavBarKt {
    private static final int ICONS_COUNT_WITHOUT_DROPDOWN = 3;
    private static final int ICONS_COUNT_WITH_DROPDOWN = 2;
    private static final int MAX_VISIBLE_ICONS_ON_NAVBAR = 3;

    /* compiled from: AdvertNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvertNavBarActionType.values().length];
            try {
                iArr[AdvertNavBarActionType.FAVORITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertNavBarActionType.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertNavBarActionType.COMPARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertNavBarActionType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvertNavBarActionType.DOWNLOAD_PDF_FILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvertNavBarActionType.DOWNLOAD_DOCX_FILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l
    public static final PhotoGalleryNavBar convert(@k AdvertNavBar advertNavBar, @k AdvertDetails advertDetails) {
        List<AdvertNavBarAction> actions;
        AdvertisementVerticalAlias verticalAlias;
        if (advertNavBar.getGallery() == null || (actions = advertNavBar.getGallery().getActions()) == null || actions.isEmpty()) {
            return null;
        }
        List<AdvertNavBarAction> visibleActions = getVisibleActions(advertNavBar.getGallery().getActions());
        ArrayList arrayList = new ArrayList(C42745f0.q(visibleActions, 10));
        for (AdvertNavBarAction advertNavBarAction : visibleActions) {
            arrayList.add(new PhotoGalleryNavBarVisibleAction(convert(advertNavBarAction.getType()), advertNavBarAction.getIcon(), advertNavBarAction.getDeepLink()));
        }
        List<AdvertNavBarAction> dropdownActions = getDropdownActions(advertNavBar.getGallery().getActions());
        ArrayList arrayList2 = new ArrayList(C42745f0.q(dropdownActions, 10));
        for (AdvertNavBarAction advertNavBarAction2 : dropdownActions) {
            arrayList2.add(new PhotoGalleryNavBarDropdownAction(convert(advertNavBarAction2.getType()), advertNavBarAction2.getTextIcon(), advertNavBarAction2.getText(), advertNavBarAction2.getDeepLink()));
        }
        boolean isFavorite = advertDetails.getIsFavorite();
        AdjustParameters adjustParameters = advertDetails.getAdjustParameters();
        if (adjustParameters == null || (verticalAlias = adjustParameters.getVerticalAlias()) == null) {
            verticalAlias = AdvertisementVerticalAlias.NO_VALUE;
        }
        PhotoGalleryNavBarFavoriteFeature photoGalleryNavBarFavoriteFeature = new PhotoGalleryNavBarFavoriteFeature(isFavorite, verticalAlias, advertDetails.getCustomerValue());
        AdvertSharing sharing = advertDetails.getSharing();
        String id2 = advertDetails.getId();
        String categoryId = advertDetails.getCategoryId();
        AdjustParameters adjustParameters2 = advertDetails.getAdjustParameters();
        PhotoGalleryNavBarShareFeature photoGalleryNavBarShareFeature = new PhotoGalleryNavBarShareFeature(sharing, id2, categoryId, adjustParameters2 != null ? adjustParameters2.getMicroCategoryId() : null, advertDetails.getLocationId(), advertDetails.getTitle());
        String id3 = advertDetails.getId();
        String categoryId2 = advertDetails.getCategoryId();
        AdvertComparison comparison = advertDetails.getComparison();
        return new PhotoGalleryNavBar(arrayList, arrayList2, new PhotoGalleryNavBarFeatures(photoGalleryNavBarFavoriteFeature, photoGalleryNavBarShareFeature, new PhotoGalleryNavBarCompareFeature(id3, categoryId2, comparison != null ? L.f(comparison.isAdded(), Boolean.TRUE) : false)));
    }

    @k
    public static final List<AdvertNavBarAction> getDropdownActions(@k List<AdvertNavBarAction> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!getVisibleActions(list).contains((AdvertNavBarAction) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @k
    public static final List<AdvertNavBarAction> getVisibleActions(@k List<AdvertNavBarAction> list) {
        int i12 = list.size() > 3 ? 2 : 3;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AdvertNavBarAction) obj).getShowAsAction() != AdvertNavBarActionVisibility.NEVER) {
                arrayList.add(obj);
            }
        }
        return C42745f0.q0(arrayList.subList(0, Math.min(i12, arrayList.size())));
    }

    private static final PhotoGalleryNavBarActionType convert(AdvertNavBarActionType advertNavBarActionType) {
        switch (WhenMappings.$EnumSwitchMapping$0[advertNavBarActionType.ordinal()]) {
            case 1:
                return PhotoGalleryNavBarActionType.f217475b;
            case 2:
                return PhotoGalleryNavBarActionType.f217476c;
            case 3:
                return PhotoGalleryNavBarActionType.f217477d;
            case 4:
                return PhotoGalleryNavBarActionType.f217478e;
            case 5:
                return PhotoGalleryNavBarActionType.f217478e;
            case 6:
                return PhotoGalleryNavBarActionType.f217478e;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
