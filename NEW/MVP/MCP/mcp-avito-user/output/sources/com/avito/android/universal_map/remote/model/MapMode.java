package com.avito.android.universal_map.remote.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapMode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/universal_map/remote/model/MapMode;", "", "(Ljava/lang/String;I)V", "STATIC", "DEFAULT", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapMode {

    @c("default")
    public static final MapMode DEFAULT;

    @c("static")
    public static final MapMode STATIC;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MapMode[] f306350b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f306351c;

    static {
        MapMode mapMode = new MapMode("STATIC", 0);
        STATIC = mapMode;
        MapMode mapMode2 = new MapMode("DEFAULT", 1);
        DEFAULT = mapMode2;
        MapMode[] mapModeArr = {mapMode, mapMode2};
        f306350b = mapModeArr;
        f306351c = kotlin.enums.c.a(mapModeArr);
    }

    private MapMode(String str, int i12) {
    }

    public static MapMode valueOf(String str) {
        return (MapMode) Enum.valueOf(MapMode.class, str);
    }

    public static MapMode[] values() {
        return (MapMode[]) f306350b.clone();
    }
}
