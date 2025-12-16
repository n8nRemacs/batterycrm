package com.avito.android.analytics.event;

import com.avito.android.remote.model.PresentationType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowSearchMapEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/MapType;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapType {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f89961c;

    /* renamed from: d, reason: collision with root package name */
    public static final MapType f89962d;

    /* renamed from: e, reason: collision with root package name */
    public static final MapType f89963e;

    /* renamed from: f, reason: collision with root package name */
    public static final MapType f89964f;

    /* renamed from: g, reason: collision with root package name */
    public static final MapType f89965g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ MapType[] f89966h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f89967i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f89968b;

    /* compiled from: ShowSearchMapEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/event/MapType$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ShowSearchMapEvent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.analytics.event.MapType$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2670a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f89969a;

            static {
                int[] iArr = new int[PresentationType.values().length];
                try {
                    iArr[PresentationType.FULL_MAP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PresentationType.SIMPLE_MAP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PresentationType.REGULAR_MAP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PresentationType.SERP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PresentationType.MAIN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PresentationType.PUSH.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f89969a = iArr;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        MapType mapType = new MapType("FULL_MAP", 0, "full_map");
        f89962d = mapType;
        MapType mapType2 = new MapType("SIMPLE_MAP", 1, "simple_map");
        f89963e = mapType2;
        MapType mapType3 = new MapType("REGULAR_MAP", 2, "regular_map");
        f89964f = mapType3;
        MapType mapType4 = new MapType("NONE", 3, "none");
        f89965g = mapType4;
        MapType[] mapTypeArr = {mapType, mapType2, mapType3, mapType4};
        f89966h = mapTypeArr;
        f89967i = kotlin.enums.c.a(mapTypeArr);
        f89961c = new a(null);
    }

    public MapType(String str, int i12, String str2) {
        this.f89968b = str2;
    }

    public static MapType valueOf(String str) {
        return (MapType) Enum.valueOf(MapType.class, str);
    }

    public static MapType[] values() {
        return (MapType[]) f89966h.clone();
    }
}
