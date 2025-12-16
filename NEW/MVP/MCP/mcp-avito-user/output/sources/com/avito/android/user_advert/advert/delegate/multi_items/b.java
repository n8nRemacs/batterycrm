package com.avito.android.user_advert.advert.delegate.multi_items;

import Y61.k;
import com.avito.android.advert_multi_items.model.ImageDisplayMode;
import com.avito.android.advert_multi_items.model.ModificationViewState;
import com.avito.android.advert_multi_items.param.MultiItemParamHeaderItem;
import com.avito.android.advert_multi_items.param_chips.MultiItemParamChipsItem;
import com.avito.android.advert_multi_items.param_chips.modification_chip.ModificationChipItem;
import com.avito.android.advert_multi_items.param_images.MultiItemParamImagesItem;
import com.avito.android.advert_multi_items.param_images.modification_image.ModificationImageItem;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.adverts.multi_item.ImageType;
import com.avito.android.remote.model.adverts.multi_item.MultiItemModification;
import com.avito.android.remote.model.adverts.multi_item.MultiItemParam;
import com.avito.android.remote.model.adverts.multi_item.TitleRightAction;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: MultiItemsBlockConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_items/b;", "Lcom/avito/android/user_advert/advert/delegate/multi_items/a;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.user_advert.advert.delegate.multi_items.a {

    /* compiled from: MultiItemsBlockConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f308674a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f308675b;

        static {
            int[] iArr = new int[ImageType.values().length];
            try {
                iArr[ImageType.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageType.Portrait.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f308674a = iArr;
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
            f308675b = iArr2;
        }
    }

    @Inject
    public b() {
    }

    public static ModificationViewState b(MultiItemModification.ModificationState modificationState) {
        int i12 = a.f308675b[modificationState.ordinal()];
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

    @Override // com.avito.android.user_advert.advert.delegate.multi_items.a
    @k
    public final List<com.avito.conveyor_item.a> a(@k MyAdvertDetailsItem myAdvertDetailsItem) {
        ArrayList arrayList;
        int i12;
        com.avito.conveyor_item.a bVar;
        ImageDisplayMode imageDisplayMode;
        List<MultiItemParam> list = myAdvertDetailsItem.f309095H0;
        if (list != null) {
            List<MultiItemParam> list2 = list;
            int i13 = 10;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            int i14 = 0;
            for (Object obj : list2) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                MultiItemParam multiItemParam = (MultiItemParam) obj;
                if (multiItemParam instanceof MultiItemParam.ModificationsParam.Images) {
                    MultiItemParam.ModificationsParam.Images images = (MultiItemParam.ModificationsParam.Images) multiItemParam;
                    int i16 = a.f308674a[images.getImageType().ordinal()];
                    if (i16 == 1) {
                        imageDisplayMode = ImageDisplayMode.f85892b;
                    } else {
                        if (i16 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        imageDisplayMode = ImageDisplayMode.f85893c;
                    }
                    List<MultiItemModification.Images> modifications = images.getModifications();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(modifications, i13));
                    for (MultiItemModification.Images images2 : modifications) {
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(new ModificationImageItem(images.getTitle(), images2.getModificationId(), b(images2.getState()), imageDisplayMode, images2.getImage(), (UniversalColor) C42745f0.E(images2.getBackgroundColor().getColors()), images2.getBackgroundColor().getImage()));
                        arrayList3 = arrayList4;
                    }
                    ArrayList arrayList5 = arrayList3;
                    MultiItemParam.ModificationsParam modificationsParam = (MultiItemParam.ModificationsParam) multiItemParam;
                    String title = modificationsParam.getTitle();
                    TitleRightAction titleRightAction = modificationsParam.getTitleRightAction();
                    String title2 = titleRightAction != null ? titleRightAction.getTitle() : null;
                    TitleRightAction titleRightAction2 = modificationsParam.getTitleRightAction();
                    bVar = new MultiItemParamImagesItem(new MultiItemParamHeaderItem(title, title2, titleRightAction2 != null ? titleRightAction2.getDeepLink() : null), arrayList5, AK.c.g(i14, "MultiItemParam_"));
                    i12 = 10;
                } else if (multiItemParam instanceof MultiItemParam.ModificationsParam.Chips) {
                    MultiItemParam.ModificationsParam.Chips chips = (MultiItemParam.ModificationsParam.Chips) multiItemParam;
                    List<MultiItemModification.Chips> modifications2 = chips.getModifications();
                    i12 = 10;
                    ArrayList arrayList6 = new ArrayList(C42745f0.q(modifications2, 10));
                    for (MultiItemModification.Chips chips2 : modifications2) {
                        arrayList6.add(new ModificationChipItem(chips.getTitle(), chips2.getModificationId(), b(chips2.getState()), chips2.getTitle()));
                    }
                    MultiItemParam.ModificationsParam modificationsParam2 = (MultiItemParam.ModificationsParam) multiItemParam;
                    String title3 = modificationsParam2.getTitle();
                    TitleRightAction titleRightAction3 = modificationsParam2.getTitleRightAction();
                    String title4 = titleRightAction3 != null ? titleRightAction3.getTitle() : null;
                    TitleRightAction titleRightAction4 = modificationsParam2.getTitleRightAction();
                    bVar = new MultiItemParamChipsItem(new MultiItemParamHeaderItem(title3, title4, titleRightAction4 != null ? titleRightAction4.getDeepLink() : null), arrayList6, AK.c.g(i14, "MultiItemParam_"));
                } else {
                    i12 = 10;
                    if (!(multiItemParam instanceof MultiItemParam.CopyEntryPoint)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MultiItemParam.CopyEntryPoint copyEntryPoint = (MultiItemParam.CopyEntryPoint) multiItemParam;
                    bVar = new Ta.b(AK.c.g(i14, "MultiItemParam_"), copyEntryPoint.getButtonText(), copyEntryPoint.getDeeplink(), copyEntryPoint.getIconName());
                }
                arrayList2.add(bVar);
                i14 = i15;
                i13 = i12;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }
}
