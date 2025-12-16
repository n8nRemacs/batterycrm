package com.avito.android.advert.item.blocks.items_factories;

import android.os.Parcelable;
import com.avito.android.advert.item.multi_item.AdvertDetailsMultiItemItem;
import com.avito.android.advert_multi_items.model.ImageDisplayMode;
import com.avito.android.advert_multi_items.model.ModificationViewState;
import com.avito.android.advert_multi_items.param.MultiItemParamHeaderItem;
import com.avito.android.advert_multi_items.param_chips.MultiItemParamChipsItem;
import com.avito.android.advert_multi_items.param_chips.modification_chip.ModificationChipItem;
import com.avito.android.advert_multi_items.param_images.MultiItemParamImagesItem;
import com.avito.android.advert_multi_items.param_images.modification_image.ModificationImageItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.multi_item.MultiItemModification;
import com.avito.android.remote.model.multi_item.MultiItemParamUnited;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsMultiItemParamsItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/O2;", "Lcom/avito/android/advert/item/blocks/items_factories/N2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class O2 implements N2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73819a;

    /* compiled from: AdvertDetailsMultiItemParamsItemFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73820a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f73821b;

        static {
            int[] iArr = new int[MultiItemParamUnited.MultiItemParam.ImageType.values().length];
            try {
                iArr[MultiItemParamUnited.MultiItemParam.ImageType.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultiItemParamUnited.MultiItemParam.ImageType.Portrait.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f73820a = iArr;
            int[] iArr2 = new int[MultiItemModification.ModificationState.values().length];
            try {
                iArr2[MultiItemModification.ModificationState.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MultiItemModification.ModificationState.Selected.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MultiItemModification.ModificationState.Disabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MultiItemModification.ModificationState.OutOfStocks.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f73821b = iArr2;
        }
    }

    @Inject
    public O2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73819a = jVar;
    }

    public static ModificationViewState b(MultiItemModification.ModificationState modificationState) {
        int i12 = a.f73821b[modificationState.ordinal()];
        if (i12 == 1) {
            return ModificationViewState.f85896b;
        }
        if (i12 == 2) {
            return ModificationViewState.f85897c;
        }
        if (i12 == 3 || i12 == 4) {
            return ModificationViewState.f85898d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.N2
    @Y61.l
    public final AdvertDetailsMultiItemItem a(@Y61.k AdvertDetails advertDetails) {
        Parcelable multiItemParamChipsItem;
        ImageDisplayMode imageDisplayMode;
        List<MultiItemParamUnited> multiItemParams = advertDetails.getMultiItemParams();
        if (multiItemParams != null) {
            if (multiItemParams.isEmpty()) {
                multiItemParams = null;
            }
            if (multiItemParams != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : multiItemParams) {
                    if (obj instanceof MultiItemParamUnited.MultiItemParam) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MultiItemParamUnited.MultiItemParam multiItemParam = (MultiItemParamUnited.MultiItemParam) it.next();
                    if (multiItemParam instanceof MultiItemParamUnited.MultiItemParam.Images) {
                        MultiItemParamUnited.MultiItemParam.Images images = (MultiItemParamUnited.MultiItemParam.Images) multiItemParam;
                        int i12 = a.f73820a[images.getImageType().ordinal()];
                        if (i12 == 1) {
                            imageDisplayMode = ImageDisplayMode.f85892b;
                        } else {
                            if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            imageDisplayMode = ImageDisplayMode.f85893c;
                        }
                        List<MultiItemModification.Images> modifications = images.getModifications();
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(modifications, 10));
                        for (MultiItemModification.Images images2 : modifications) {
                            arrayList3.add(new ModificationImageItem(multiItemParam.getTitle(), images2.getModificationId(), b(images2.getState()), imageDisplayMode, images2.getImage(), (UniversalColor) C42745f0.E(images2.getBackgroundColor().getColors()), images2.getBackgroundColor().getImage()));
                        }
                        String title = multiItemParam.getTitle();
                        MultiItemParamUnited.MultiItemParam.TitleRightAction titleRightAction = multiItemParam.getTitleRightAction();
                        String title2 = titleRightAction != null ? titleRightAction.getTitle() : null;
                        MultiItemParamUnited.MultiItemParam.TitleRightAction titleRightAction2 = multiItemParam.getTitleRightAction();
                        multiItemParamChipsItem = new MultiItemParamImagesItem(new MultiItemParamHeaderItem(title, title2, titleRightAction2 != null ? titleRightAction2.getDeepLink() : null), arrayList3, null, 4, null);
                    } else {
                        if (!(multiItemParam instanceof MultiItemParamUnited.MultiItemParam.Chips)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<MultiItemModification.Chips> modifications2 = ((MultiItemParamUnited.MultiItemParam.Chips) multiItemParam).getModifications();
                        ArrayList arrayList4 = new ArrayList(C42745f0.q(modifications2, 10));
                        for (MultiItemModification.Chips chips : modifications2) {
                            arrayList4.add(new ModificationChipItem(multiItemParam.getTitle(), chips.getModificationId(), b(chips.getState()), chips.getTitle()));
                        }
                        String title3 = multiItemParam.getTitle();
                        MultiItemParamUnited.MultiItemParam.TitleRightAction titleRightAction3 = multiItemParam.getTitleRightAction();
                        String title4 = titleRightAction3 != null ? titleRightAction3.getTitle() : null;
                        MultiItemParamUnited.MultiItemParam.TitleRightAction titleRightAction4 = multiItemParam.getTitleRightAction();
                        multiItemParamChipsItem = new MultiItemParamChipsItem(new MultiItemParamHeaderItem(title3, title4, titleRightAction4 != null ? titleRightAction4.getDeepLink() : null), arrayList4, null, 4, null);
                    }
                    arrayList2.add(multiItemParamChipsItem);
                }
                return new AdvertDetailsMultiItemItem(0L, null, arrayList2, this.f73819a.a(), null, null, 51, null);
            }
        }
        return null;
    }
}
