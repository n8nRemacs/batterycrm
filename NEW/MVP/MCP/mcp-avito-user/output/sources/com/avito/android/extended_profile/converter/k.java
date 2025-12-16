package com.avito.android.extended_profile.converter;

import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_widgets.adapter.gap.GapItem;
import com.avito.android.remote.model.UniversalWidgetFactoidType;
import com.avito.android.remote.model.UniversalWidgetImageWithTextImageRatio;
import com.avito.android.remote.model.UniversalWidgetImageWithTextSectionType;
import com.avito.android.remote.model.UniversalWidgetTextColor;
import com.avito.android.remote.model.UniversalWidgetTextPosition;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileUniversalWidgetConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/converter/k;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.universal_widget.a f149428a;

    /* compiled from: ExtendedProfileUniversalWidgetConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149429a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f149430b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f149431c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f149432d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f149433e;

        static {
            int[] iArr = new int[UniversalWidgetFactoidType.values().length];
            try {
                iArr[UniversalWidgetFactoidType.THREE_COLUMNS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalWidgetFactoidType.FOUR_COLUMNS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f149429a = iArr;
            int[] iArr2 = new int[UniversalWidgetTextColor.values().length];
            try {
                iArr2[UniversalWidgetTextColor.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UniversalWidgetTextColor.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f149430b = iArr2;
            int[] iArr3 = new int[UniversalWidgetImageWithTextSectionType.values().length];
            try {
                iArr3[UniversalWidgetImageWithTextSectionType.FULL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[UniversalWidgetImageWithTextSectionType.IMG_WITH_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[UniversalWidgetImageWithTextSectionType.TWO_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[UniversalWidgetImageWithTextSectionType.THREE_COLUMNS.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[UniversalWidgetImageWithTextSectionType.FOUR_COLUMNS.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f149431c = iArr3;
            int[] iArr4 = new int[UniversalWidgetImageWithTextImageRatio.values().length];
            try {
                iArr4[UniversalWidgetImageWithTextImageRatio.ONE_TO_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[UniversalWidgetImageWithTextImageRatio.FOUR_TO_THREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[UniversalWidgetImageWithTextImageRatio.THREE_TO_FOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[UniversalWidgetImageWithTextImageRatio.FIX.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            f149432d = iArr4;
            int[] iArr5 = new int[UniversalWidgetTextPosition.values().length];
            try {
                iArr5[UniversalWidgetTextPosition.f253677IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[UniversalWidgetTextPosition.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f149433e = iArr5;
            int[] iArr6 = new int[UniversalWidgetSectionModel.FactoidItemsCountType.values().length];
            try {
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                UniversalWidgetSectionModel.FactoidItemsCountType factoidItemsCountType = UniversalWidgetSectionModel.FactoidItemsCountType.f153553b;
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr7 = new int[UniversalWidgetSectionModel.ImageWithTextType.values().length];
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr7[1] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr7[2] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType3 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr7[3] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType4 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr7[4] = 5;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    @Inject
    public k(@Y61.k com.avito.android.extended_profile_ui_components.universal_widget.a aVar) {
        this.f149428a = aVar;
    }

    public static void a(ArrayList arrayList, List list) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        arrayList.addAll(list2);
        arrayList.add(new GapItem(null, null, y6.b(28), 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02f6  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.extended_profile.data.f b(@Y61.k com.avito.android.remote.model.ExtendedProfileUniversalWidget r63) {
        /*
            Method dump skipped, instructions count: 1609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.converter.k.b(com.avito.android.remote.model.ExtendedProfileUniversalWidget):com.avito.android.extended_profile.data.f");
    }
}
