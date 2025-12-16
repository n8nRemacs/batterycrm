package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SerpSpaceType.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+Bw\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bj\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/SerpSpaceType;", "", "searchParamsSegment", "Lcom/avito/android/remote/model/SearchParamsSegment;", "segmentQueryParam", "", "isForceThemeAvitoRe23", "", "isForceBlackStatusBar", "withShortcutUpperBlock", "showInlineFilters", "loadInlinesOnFiltersUpdated", "handleSearchHintOnMap", "handleAutoOpenInlinesOnFullMap", "shouldInitSerpWhenMapStateIsHidden", "shouldHandleUserMovedMapSinceLastLocationUpdate", "(Ljava/lang/String;ILcom/avito/android/remote/model/SearchParamsSegment;Ljava/lang/String;ZZZZZZZZZ)V", "bottomNavigationSpace", "Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;", "getBottomNavigationSpace", "()Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;", "cartSegment", "getCartSegment", "()Ljava/lang/String;", "fromSpace", "getFromSpace", "getHandleAutoOpenInlinesOnFullMap", "()Z", "getHandleSearchHintOnMap", "getLoadInlinesOnFiltersUpdated", "getSegmentQueryParam", "getShouldHandleUserMovedMapSinceLastLocationUpdate", "getShouldInitSerpWhenMapStateIsHidden", "getShowInlineFilters", "getWithShortcutUpperBlock", "Default", "AvitoBlack", "AvitoSales", "AvitoMall", "AvitoForBusiness", "AutoSelect", "ServicesOrderRequest", "AvitoTravel", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerpSpaceType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SerpSpaceType[] $VALUES;
    public static final SerpSpaceType AutoSelect;
    public static final SerpSpaceType AvitoBlack;
    public static final SerpSpaceType AvitoForBusiness;
    public static final SerpSpaceType AvitoMall;
    public static final SerpSpaceType AvitoSales;
    public static final SerpSpaceType AvitoTravel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;
    public static final SerpSpaceType Default;
    public static final SerpSpaceType ServicesOrderRequest;
    private final boolean handleAutoOpenInlinesOnFullMap;
    private final boolean handleSearchHintOnMap;
    private final boolean isForceBlackStatusBar;
    private final boolean isForceThemeAvitoRe23;
    private final boolean loadInlinesOnFiltersUpdated;

    @k
    private final SearchParamsSegment searchParamsSegment;

    @l
    private final String segmentQueryParam;
    private final boolean shouldHandleUserMovedMapSinceLastLocationUpdate;
    private final boolean shouldInitSerpWhenMapStateIsHidden;
    private final boolean showInlineFilters;
    private final boolean withShortcutUpperBlock;

    /* compiled from: SerpSpaceType.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SerpSpaceType$Companion;", "", "()V", "fromSearchParamsSegment", "Lcom/avito/android/remote/model/SerpSpaceType;", "searchParamsSegment", "Lcom/avito/android/remote/model/SearchParamsSegment;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @l
        public final SerpSpaceType fromSearchParamsSegment(@k SearchParamsSegment searchParamsSegment) {
            SerpSpaceType serpSpaceType = null;
            if (searchParamsSegment == SearchParamsSegment.UnSpecified) {
                return null;
            }
            boolean z12 = false;
            for (SerpSpaceType serpSpaceType2 : SerpSpaceType.getEntries()) {
                if (serpSpaceType2.searchParamsSegment == searchParamsSegment) {
                    if (z12) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z12 = true;
                    serpSpaceType = serpSpaceType2;
                }
            }
            if (z12) {
                return serpSpaceType;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SerpSpaceType[] $values() {
        return new SerpSpaceType[]{Default, AvitoBlack, AvitoSales, AvitoMall, AvitoForBusiness, AutoSelect, ServicesOrderRequest, AvitoTravel};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        Default = new SerpSpaceType("Default", 0, null, null, false, false, z12, z13, z14, z15, z16, z17, z18, 2047, null);
        C42822w c42822w = null;
        boolean z19 = true;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        AvitoBlack = new SerpSpaceType("AvitoBlack", 1, null, "avitoBlack", z19, true, z22, z23, z24, false, z25, z26, z27, 2017, c42822w);
        C42822w c42822w2 = null;
        boolean z28 = true;
        boolean z29 = false;
        Object[] objArr = 0 == true ? 1 : 0;
        AvitoSales = new SerpSpaceType("AvitoSales", 2, objArr, null, z28, z12, z13, z14, z15, z16, z17, z18, z29, 2027, c42822w2);
        boolean z32 = false;
        AvitoMall = new SerpSpaceType("AvitoMall", 3, SearchParamsSegment.AvitoMall, "avitoMall", z19, z32, z22, z23, z24, true, z25, z26, z27, 1912, c42822w);
        AvitoForBusiness = new SerpSpaceType("AvitoForBusiness", 4, SearchParamsSegment.AvitoForBusiness, "avitoForBusiness", z28, z12, z13, z14, true, true, z17, z18, z29, 1848, c42822w2);
        boolean z33 = false;
        AutoSelect = new SerpSpaceType("AutoSelect", 5, SearchParamsSegment.AutoSelect, "autoSelect", z19, z32, z22, z23, z24, z33, z25, z26, z27, 2040, c42822w);
        ServicesOrderRequest = new SerpSpaceType("ServicesOrderRequest", 6, null, null, z28, z12, z13, z14, false, false, z17, z18, z29, 1995, c42822w2);
        AvitoTravel = new SerpSpaceType("AvitoTravel", 7, SearchParamsSegment.AvitoTravel, "avitoTravel", z19, z32, z22, z23, z24, z33, true, true, true, 232, c42822w);
        SerpSpaceType[] serpSpaceTypeArr$values = $values();
        $VALUES = serpSpaceTypeArr$values;
        $ENTRIES = c.a(serpSpaceTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private SerpSpaceType(String str, int i12, SearchParamsSegment searchParamsSegment, String str2, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22) {
        this.searchParamsSegment = searchParamsSegment;
        this.segmentQueryParam = str2;
        this.isForceThemeAvitoRe23 = z12;
        this.isForceBlackStatusBar = z13;
        this.withShortcutUpperBlock = z14;
        this.showInlineFilters = z15;
        this.loadInlinesOnFiltersUpdated = z16;
        this.handleSearchHintOnMap = z17;
        this.handleAutoOpenInlinesOnFullMap = z18;
        this.shouldInitSerpWhenMapStateIsHidden = z19;
        this.shouldHandleUserMovedMapSinceLastLocationUpdate = z22;
    }

    @k
    public static a<SerpSpaceType> getEntries() {
        return $ENTRIES;
    }

    public static SerpSpaceType valueOf(String str) {
        return (SerpSpaceType) Enum.valueOf(SerpSpaceType.class, str);
    }

    public static SerpSpaceType[] values() {
        return (SerpSpaceType[]) $VALUES.clone();
    }

    @k
    public final BottomNavigationSpace getBottomNavigationSpace() {
        return this.searchParamsSegment.getBottomNavigationSpace();
    }

    @l
    public final String getCartSegment() {
        return this.searchParamsSegment.getCartSegment();
    }

    @l
    public final String getFromSpace() {
        return this.searchParamsSegment.getFromSpace();
    }

    public final boolean getHandleAutoOpenInlinesOnFullMap() {
        return this.handleAutoOpenInlinesOnFullMap;
    }

    public final boolean getHandleSearchHintOnMap() {
        return this.handleSearchHintOnMap;
    }

    public final boolean getLoadInlinesOnFiltersUpdated() {
        return this.loadInlinesOnFiltersUpdated;
    }

    @l
    public final String getSegmentQueryParam() {
        return this.segmentQueryParam;
    }

    public final boolean getShouldHandleUserMovedMapSinceLastLocationUpdate() {
        return this.shouldHandleUserMovedMapSinceLastLocationUpdate;
    }

    public final boolean getShouldInitSerpWhenMapStateIsHidden() {
        return this.shouldInitSerpWhenMapStateIsHidden;
    }

    public final boolean getShowInlineFilters() {
        return this.showInlineFilters;
    }

    public final boolean getWithShortcutUpperBlock() {
        return this.withShortcutUpperBlock;
    }

    /* renamed from: isForceBlackStatusBar, reason: from getter */
    public final boolean getIsForceBlackStatusBar() {
        return this.isForceBlackStatusBar;
    }

    /* renamed from: isForceThemeAvitoRe23, reason: from getter */
    public final boolean getIsForceThemeAvitoRe23() {
        return this.isForceThemeAvitoRe23;
    }

    public /* synthetic */ SerpSpaceType(String str, int i12, SearchParamsSegment searchParamsSegment, String str2, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 1) != 0 ? SearchParamsSegment.UnSpecified : searchParamsSegment, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? true : z14, (i13 & 32) != 0 ? true : z15, (i13 & 64) != 0 ? false : z16, (i13 & 128) != 0 ? false : z17, (i13 & 256) != 0 ? false : z18, (i13 & 512) != 0 ? false : z19, (i13 & 1024) != 0 ? false : z22);
    }
}
