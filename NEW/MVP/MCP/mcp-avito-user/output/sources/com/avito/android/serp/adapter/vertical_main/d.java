package com.avito.android.serp.adapter.vertical_main;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import j.InterfaceC42150f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoStyleConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/d;", "Lcom/avito/android/serp/adapter/vertical_main/c;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* compiled from: PromoStyleConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f272799a;

        static {
            int[] iArr = new int[PromoStyle.values().length];
            try {
                iArr[PromoStyle.WHITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoStyle.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoStyle.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromoStyle.RED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PromoStyle.ORANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PromoStyle.BEIGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PromoStyle.VIOLET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PromoStyle.WARMGRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f272799a = iArr;
        }
    }

    @Inject
    public d() {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.c
    @InterfaceC42150f
    public final int a(@Y61.k PromoStyle promoStyle) {
        switch (a.f272799a[promoStyle.ordinal()]) {
            case 1:
                return R.attr.bannerWhite;
            case 2:
                return R.attr.bannerBlue;
            case 3:
                return R.attr.bannerGreen;
            case 4:
                return R.attr.bannerRed;
            case 5:
                return R.attr.bannerOrange;
            case 6:
                return R.attr.bannerBeige;
            case 7:
                return R.attr.bannerViolet;
            case 8:
            default:
                return R.attr.bannerWarmgray;
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.c
    @Y61.k
    public final VerticalPromoBlockItem.ContentStyle b(@Y61.l StyleBlock styleBlock) {
        if (!L.f(styleBlock != null ? styleBlock.getTheme() : null, "avitoTheme")) {
            return new VerticalPromoBlockItem.ContentStyle(styleBlock != null ? styleBlock.getTheme() : null, Integer.valueOf(R.attr.baseSelectWhiteBackgroundM), Integer.valueOf(R.attr.chipsOverlayOutlinedMedium), null, Integer.valueOf(R.attr.buttonOverlayPrimaryMedium), Integer.valueOf(R.attr.buttonOverlayPrimaryMedium));
        }
        PromoStyle preset = styleBlock.getPreset();
        switch (preset == null ? -1 : a.f272799a[preset.ordinal()]) {
            case 2:
                return new VerticalPromoBlockItem.ContentStyle(styleBlock.getTheme(), Integer.valueOf(R.attr.baseSelect), null, Integer.valueOf(R.attr.segmentedControl), Integer.valueOf(R.attr.buttonSecondaryLarge), Integer.valueOf(R.attr.buttonPrimaryLarge));
            case 3:
                return new VerticalPromoBlockItem.ContentStyle(styleBlock.getTheme(), Integer.valueOf(R.attr.baseSelectBannerGreenDefaultLarge), null, Integer.valueOf(R.attr.segmentedControlBannerGreenStandard), Integer.valueOf(R.attr.buttonBannerGreenPrimaryLarge), Integer.valueOf(R.attr.buttonBannerGreenPrimaryLarge));
            case 4:
                return new VerticalPromoBlockItem.ContentStyle(styleBlock.getTheme(), Integer.valueOf(R.attr.baseSelectBannerRedDefaultLarge), null, Integer.valueOf(R.attr.segmentedControlBannerRedStandard), Integer.valueOf(R.attr.buttonBannerRedPrimaryLarge), Integer.valueOf(R.attr.buttonBannerRedPrimaryLarge));
            case 5:
                return new VerticalPromoBlockItem.ContentStyle(styleBlock.getTheme(), Integer.valueOf(R.attr.baseSelectBannerOrangeDefaultLarge), null, Integer.valueOf(R.attr.segmentedControlBannerOrangeStandard), Integer.valueOf(R.attr.buttonBannerOrangePrimaryLarge), Integer.valueOf(R.attr.buttonBannerOrangePrimaryLarge));
            case 6:
                return new VerticalPromoBlockItem.ContentStyle(styleBlock.getTheme(), Integer.valueOf(R.attr.baseSelectBannerBeigeDefaultLarge), null, Integer.valueOf(R.attr.segmentedControlBannerBeigeStandard), Integer.valueOf(R.attr.buttonBannerBeigePrimaryLarge), Integer.valueOf(R.attr.buttonBannerBeigePrimaryLarge));
            case 7:
                return new VerticalPromoBlockItem.ContentStyle(styleBlock.getTheme(), Integer.valueOf(R.attr.baseSelectBannerVioletDefaultLarge), null, Integer.valueOf(R.attr.segmentedControlBannerVioletStandard), Integer.valueOf(R.attr.buttonBannerVioletPrimaryLarge), Integer.valueOf(R.attr.buttonBannerVioletPrimaryLarge));
            case 8:
                return new VerticalPromoBlockItem.ContentStyle(styleBlock.getTheme(), Integer.valueOf(R.attr.baseSelectBannerWarmgrayDefaultLarge), null, Integer.valueOf(R.attr.segmentedControlBannerWarmgrayStandard), Integer.valueOf(R.attr.buttonBannerWarmgrayPrimaryLarge), Integer.valueOf(R.attr.buttonBannerWarmgrayPrimaryLarge));
            default:
                return new VerticalPromoBlockItem.ContentStyle(styleBlock.getTheme(), Integer.valueOf(R.attr.baseSelect), null, Integer.valueOf(R.attr.segmentedControl), Integer.valueOf(R.attr.buttonSecondaryLarge), Integer.valueOf(R.attr.buttonPrimaryLarge));
        }
    }
}
