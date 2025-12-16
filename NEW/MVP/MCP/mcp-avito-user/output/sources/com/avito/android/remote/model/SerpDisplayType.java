package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SerpDisplayType.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\u0081\u0002\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001,B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/SerpDisplayType;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "isAvitoBlack", "", "isAvitoMall", "isAvitoPromotion", "isAvitoSales", "isCarouselGig", "isCarouselVacancy", "isCv", "isGigShift", "isGrid", "isHouseCard", "isInformative", "isItemsCarouselWidgetGridXL", "isList", "isRich", "isService", "isServiceTrustGrid", "isSingleColumn", "isVacancy", "Grid", "List", "Rich", "Vacancy", "Service", "Cv", "AvitoBlack", "AvitoMall", "AvitoMallTall", "AvitoSales", "HouseCard", "CarouselVacancy", "AvitoPromotion", "ItemsCarouselWidgetGridXL", "CarouselGig", "GigShift", "ServiceTrustGrid", "MiniRich", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerpDisplayType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SerpDisplayType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;
    private final int id;
    public static final SerpDisplayType Grid = new SerpDisplayType("Grid", 0, 1);
    public static final SerpDisplayType List = new SerpDisplayType("List", 1, 2);
    public static final SerpDisplayType Rich = new SerpDisplayType("Rich", 2, 3);
    public static final SerpDisplayType Vacancy = new SerpDisplayType("Vacancy", 3, 4);
    public static final SerpDisplayType Service = new SerpDisplayType("Service", 4, 5);

    /* renamed from: Cv, reason: collision with root package name */
    public static final SerpDisplayType f253662Cv = new SerpDisplayType("Cv", 5, 6);
    public static final SerpDisplayType AvitoBlack = new SerpDisplayType("AvitoBlack", 6, 7);
    public static final SerpDisplayType AvitoMall = new SerpDisplayType("AvitoMall", 7, 8);
    public static final SerpDisplayType AvitoMallTall = new SerpDisplayType("AvitoMallTall", 8, 9);
    public static final SerpDisplayType AvitoSales = new SerpDisplayType("AvitoSales", 9, 10);
    public static final SerpDisplayType HouseCard = new SerpDisplayType("HouseCard", 10, 12);
    public static final SerpDisplayType CarouselVacancy = new SerpDisplayType("CarouselVacancy", 11, 13);
    public static final SerpDisplayType AvitoPromotion = new SerpDisplayType("AvitoPromotion", 12, 14);
    public static final SerpDisplayType ItemsCarouselWidgetGridXL = new SerpDisplayType("ItemsCarouselWidgetGridXL", 13, 15);
    public static final SerpDisplayType CarouselGig = new SerpDisplayType("CarouselGig", 14, 16);
    public static final SerpDisplayType GigShift = new SerpDisplayType("GigShift", 15, 17);
    public static final SerpDisplayType ServiceTrustGrid = new SerpDisplayType("ServiceTrustGrid", 16, 17);
    public static final SerpDisplayType MiniRich = new SerpDisplayType("MiniRich", 17, 18);

    /* compiled from: SerpDisplayType.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/SerpDisplayType$Companion;", "", "()V", "defaultValues", "", "Lcom/avito/android/remote/model/SerpDisplayType;", "()[Lcom/avito/android/remote/model/SerpDisplayType;", "fromString", "value", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final SerpDisplayType[] defaultValues() {
            return new SerpDisplayType[]{SerpDisplayType.Grid, SerpDisplayType.List};
        }

        @l
        public final SerpDisplayType fromString(@l String value) {
            String lowerCase = value != null ? value.toLowerCase() : null;
            if (lowerCase == null) {
                return null;
            }
            switch (lowerCase.hashCode()) {
                case -1905759517:
                    if (lowerCase.equals("avitomall")) {
                        return SerpDisplayType.AvitoMall;
                    }
                    return null;
                case -1358919245:
                    if (lowerCase.equals("minirich")) {
                        return SerpDisplayType.MiniRich;
                    }
                    return null;
                case -740699511:
                    if (lowerCase.equals("servicetrustgrid")) {
                        return SerpDisplayType.ServiceTrustGrid;
                    }
                    return null;
                case -517914316:
                    if (lowerCase.equals("avitopromotion")) {
                        return SerpDisplayType.AvitoPromotion;
                    }
                    return null;
                case -52922864:
                    if (lowerCase.equals("avitomalltall")) {
                        return SerpDisplayType.AvitoMallTall;
                    }
                    return null;
                case 3187:
                    if (lowerCase.equals("cv")) {
                        return SerpDisplayType.f253662Cv;
                    }
                    return null;
                case 3181382:
                    if (lowerCase.equals("grid")) {
                        return SerpDisplayType.Grid;
                    }
                    return null;
                case 3322014:
                    if (lowerCase.equals("list")) {
                        return SerpDisplayType.List;
                    }
                    return null;
                case 3500252:
                    if (lowerCase.equals("rich")) {
                        return SerpDisplayType.Rich;
                    }
                    return null;
                case 222706811:
                    if (lowerCase.equals("vacancy")) {
                        return SerpDisplayType.Vacancy;
                    }
                    return null;
                case 877653981:
                    if (lowerCase.equals("gigshift")) {
                        return SerpDisplayType.GigShift;
                    }
                    return null;
                case 901440668:
                    if (lowerCase.equals("carousel_vacancy")) {
                        return SerpDisplayType.CarouselVacancy;
                    }
                    return null;
                case 914379038:
                    if (lowerCase.equals("itemscarouselwidgetgridxl")) {
                        return SerpDisplayType.ItemsCarouselWidgetGridXL;
                    }
                    return null;
                case 1034138160:
                    if (lowerCase.equals("housecard")) {
                        return SerpDisplayType.HouseCard;
                    }
                    return null;
                case 1041155344:
                    if (lowerCase.equals("avitoblack")) {
                        return SerpDisplayType.AvitoBlack;
                    }
                    return null;
                case 1056538141:
                    if (lowerCase.equals("avitosales")) {
                        return SerpDisplayType.AvitoSales;
                    }
                    return null;
                case 1720283238:
                    if (lowerCase.equals("carousel_gig")) {
                        return SerpDisplayType.CarouselGig;
                    }
                    return null;
                case 1984153269:
                    if (lowerCase.equals("service")) {
                        return SerpDisplayType.Service;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SerpDisplayType[] $values() {
        return new SerpDisplayType[]{Grid, List, Rich, Vacancy, Service, f253662Cv, AvitoBlack, AvitoMall, AvitoMallTall, AvitoSales, HouseCard, CarouselVacancy, AvitoPromotion, ItemsCarouselWidgetGridXL, CarouselGig, GigShift, ServiceTrustGrid, MiniRich};
    }

    static {
        SerpDisplayType[] serpDisplayTypeArr$values = $values();
        $VALUES = serpDisplayTypeArr$values;
        $ENTRIES = c.a(serpDisplayTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private SerpDisplayType(String str, int i12, int i13) {
        this.id = i13;
    }

    @k
    public static a<SerpDisplayType> getEntries() {
        return $ENTRIES;
    }

    public static SerpDisplayType valueOf(String str) {
        return (SerpDisplayType) Enum.valueOf(SerpDisplayType.class, str);
    }

    public static SerpDisplayType[] values() {
        return (SerpDisplayType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    public final boolean isAvitoBlack() {
        return this == AvitoBlack;
    }

    public final boolean isAvitoMall() {
        return this == AvitoMall || this == AvitoMallTall;
    }

    public final boolean isAvitoPromotion() {
        return this == AvitoPromotion;
    }

    public final boolean isAvitoSales() {
        return this == AvitoSales;
    }

    public final boolean isCarouselGig() {
        return this == CarouselGig;
    }

    public final boolean isCarouselVacancy() {
        return this == CarouselVacancy;
    }

    public final boolean isCv() {
        return this == f253662Cv || isGigShift();
    }

    public final boolean isGigShift() {
        return this == GigShift;
    }

    public final boolean isGrid() {
        return this == Grid;
    }

    public final boolean isHouseCard() {
        return this == HouseCard;
    }

    public final boolean isInformative() {
        return isRich() || isVacancy() || isService() || isCv();
    }

    public final boolean isItemsCarouselWidgetGridXL() {
        return this == ItemsCarouselWidgetGridXL;
    }

    public final boolean isList() {
        return this == List;
    }

    public final boolean isRich() {
        return this == Rich || this == MiniRich;
    }

    public final boolean isService() {
        return this == Service;
    }

    public final boolean isServiceTrustGrid() {
        return this == ServiceTrustGrid;
    }

    public final boolean isSingleColumn() {
        return isList() || isInformative();
    }

    public final boolean isVacancy() {
        return this == Vacancy;
    }
}
