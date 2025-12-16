package com.avito.android.map.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapInternalAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapErrorType;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapErrorType {

    /* renamed from: b, reason: collision with root package name */
    public static final MapErrorType f185053b;

    /* renamed from: c, reason: collision with root package name */
    public static final MapErrorType f185054c;

    /* renamed from: d, reason: collision with root package name */
    public static final MapErrorType f185055d;

    /* renamed from: e, reason: collision with root package name */
    public static final MapErrorType f185056e;

    /* renamed from: f, reason: collision with root package name */
    public static final MapErrorType f185057f;

    /* renamed from: g, reason: collision with root package name */
    public static final MapErrorType f185058g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ MapErrorType[] f185059h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f185060i;

    static {
        MapErrorType mapErrorType = new MapErrorType("ERROR_WITH_ADVERTS", 0);
        f185053b = mapErrorType;
        MapErrorType mapErrorType2 = new MapErrorType("ERROR_WITH_MARKERS", 1);
        f185054c = mapErrorType2;
        MapErrorType mapErrorType3 = new MapErrorType("ERROR_WITH_DRAW_AREA", 2);
        f185055d = mapErrorType3;
        MapErrorType mapErrorType4 = new MapErrorType("ERROR_WITHOUT_INFO", 3);
        f185056e = mapErrorType4;
        MapErrorType mapErrorType5 = new MapErrorType("ERROR_WITH_LOCATION", 4);
        f185057f = mapErrorType5;
        MapErrorType mapErrorType6 = new MapErrorType("ERROR_WITH_MAP_ONBOARDING", 5);
        f185058g = mapErrorType6;
        MapErrorType[] mapErrorTypeArr = {mapErrorType, mapErrorType2, mapErrorType3, mapErrorType4, mapErrorType5, mapErrorType6};
        f185059h = mapErrorTypeArr;
        f185060i = c.a(mapErrorTypeArr);
    }

    public MapErrorType() {
        throw null;
    }

    public static MapErrorType valueOf(String str) {
        return (MapErrorType) Enum.valueOf(MapErrorType.class, str);
    }

    public static MapErrorType[] values() {
        return (MapErrorType[]) f185059h.clone();
    }
}
