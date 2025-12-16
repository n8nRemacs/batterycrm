package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: SerpDisplayType.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0001¨\u0006\u0007"}, d2 = {"fallbackForTablet", "Lcom/avito/android/remote/model/SerpDisplayType;", "isTablet", "", "orDefault", "toParameterValue", "", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class SerpDisplayTypeKt {

    /* compiled from: SerpDisplayType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SerpDisplayType.values().length];
            try {
                iArr[SerpDisplayType.Grid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SerpDisplayType.List.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SerpDisplayType.Rich.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SerpDisplayType.Vacancy.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SerpDisplayType.Service.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SerpDisplayType.f253662Cv.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SerpDisplayType.AvitoBlack.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SerpDisplayType.AvitoMall.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SerpDisplayType.AvitoMallTall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SerpDisplayType.AvitoSales.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SerpDisplayType.HouseCard.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SerpDisplayType.CarouselVacancy.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SerpDisplayType.AvitoPromotion.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SerpDisplayType.ItemsCarouselWidgetGridXL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SerpDisplayType.CarouselGig.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SerpDisplayType.GigShift.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SerpDisplayType.ServiceTrustGrid.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SerpDisplayType.MiniRich.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @k
    public static final SerpDisplayType fallbackForTablet(@k SerpDisplayType serpDisplayType, boolean z12) {
        if (z12 && serpDisplayType.isInformative()) {
            serpDisplayType = null;
        }
        return orDefault(serpDisplayType);
    }

    @k
    public static final SerpDisplayType orDefault(@l SerpDisplayType serpDisplayType) {
        return serpDisplayType == null ? SerpDisplayType.Grid : serpDisplayType;
    }

    @k
    public static final String toParameterValue(@k SerpDisplayType serpDisplayType) {
        switch (WhenMappings.$EnumSwitchMapping$0[serpDisplayType.ordinal()]) {
            case 1:
                return "grid";
            case 2:
                return "list";
            case 3:
                return "rich";
            case 4:
                return "vacancy";
            case 5:
                return "service";
            case 6:
                return "cv";
            case 7:
                return "avitoBlack";
            case 8:
                return "avitoMall";
            case 9:
                return "avitoMallTall";
            case 10:
                return "avitoSales";
            case 11:
                return "houseCard";
            case 12:
                return "carousel_vacancy";
            case 13:
                return "avitoPromotion";
            case 14:
                return "itemsCarouselWidgetGridXL";
            case 15:
                return "carousel_gig";
            case 16:
                return "gigshift";
            case 17:
                return "serviceTrustGrid";
            case 18:
                return "minirich";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
