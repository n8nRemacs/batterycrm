package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchParamsSegment.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/SearchParamsSegment;", "", "cartSegment", "", "fromSpace", "bottomNavigationSpace", "Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;)V", "getBottomNavigationSpace", "()Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;", "getCartSegment", "()Ljava/lang/String;", "getFromSpace", "AvitoMall", "AvitoForBusiness", "AutoSelect", "AvitoTravel", "UnSpecified", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchParamsSegment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SearchParamsSegment[] $VALUES;
    public static final SearchParamsSegment AutoSelect;
    public static final SearchParamsSegment UnSpecified;

    @k
    private final BottomNavigationSpace bottomNavigationSpace;

    @l
    private final String cartSegment;

    @l
    private final String fromSpace;
    public static final SearchParamsSegment AvitoMall = new SearchParamsSegment("AvitoMall", 0, "avitoMall", "avitoMall", null, 4, null);
    public static final SearchParamsSegment AvitoForBusiness = new SearchParamsSegment("AvitoForBusiness", 1, "avitoForBusiness", "avitoForBusiness", BottomNavigationSpace.f107066c);
    public static final SearchParamsSegment AvitoTravel = new SearchParamsSegment("AvitoTravel", 3, "avitoTravel", "avitoTravel", null, 4, null);

    private static final /* synthetic */ SearchParamsSegment[] $values() {
        return new SearchParamsSegment[]{AvitoMall, AvitoForBusiness, AutoSelect, AvitoTravel, UnSpecified};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C42822w c42822w = null;
        BottomNavigationSpace bottomNavigationSpace = null;
        AutoSelect = new SearchParamsSegment("AutoSelect", 2, "autoSelect", 0 == true ? 1 : 0, bottomNavigationSpace, 6, c42822w);
        UnSpecified = new SearchParamsSegment("UnSpecified", 4, null, 0 == true ? 1 : 0, bottomNavigationSpace, 7, c42822w);
        SearchParamsSegment[] searchParamsSegmentArr$values = $values();
        $VALUES = searchParamsSegmentArr$values;
        $ENTRIES = c.a(searchParamsSegmentArr$values);
    }

    private SearchParamsSegment(String str, int i12, String str2, String str3, BottomNavigationSpace bottomNavigationSpace) {
        this.cartSegment = str2;
        this.fromSpace = str3;
        this.bottomNavigationSpace = bottomNavigationSpace;
    }

    @k
    public static a<SearchParamsSegment> getEntries() {
        return $ENTRIES;
    }

    public static SearchParamsSegment valueOf(String str) {
        return (SearchParamsSegment) Enum.valueOf(SearchParamsSegment.class, str);
    }

    public static SearchParamsSegment[] values() {
        return (SearchParamsSegment[]) $VALUES.clone();
    }

    @k
    public final BottomNavigationSpace getBottomNavigationSpace() {
        return this.bottomNavigationSpace;
    }

    @l
    public final String getCartSegment() {
        return this.cartSegment;
    }

    @l
    public final String getFromSpace() {
        return this.fromSpace;
    }

    public /* synthetic */ SearchParamsSegment(String str, int i12, String str2, String str3, BottomNavigationSpace bottomNavigationSpace, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 1) != 0 ? null : str2, (i13 & 2) != 0 ? null : str3, (i13 & 4) != 0 ? BottomNavigationSpace.f107065b : bottomNavigationSpace);
    }
}
