package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DegradeSomeScreensTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/DegradeSomeScreensTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DegradeSomeScreensTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final DegradeSomeScreensTestGroup f67811c;

    /* renamed from: d, reason: collision with root package name */
    public static final DegradeSomeScreensTestGroup f67812d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DegradeSomeScreensTestGroup[] f67813e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67814f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67815b;

    static {
        DegradeSomeScreensTestGroup degradeSomeScreensTestGroup = new DegradeSomeScreensTestGroup("NONE", 0, "");
        f67811c = degradeSomeScreensTestGroup;
        DegradeSomeScreensTestGroup degradeSomeScreensTestGroup2 = new DegradeSomeScreensTestGroup("CONTROL", 1, "control");
        f67812d = degradeSomeScreensTestGroup2;
        DegradeSomeScreensTestGroup[] degradeSomeScreensTestGroupArr = {degradeSomeScreensTestGroup, degradeSomeScreensTestGroup2, new DegradeSomeScreensTestGroup("INIT_ONLY_5", 2, "init_only_5"), new DegradeSomeScreensTestGroup("INIT_ONLY_10", 3, "init_only_10"), new DegradeSomeScreensTestGroup("INIT_ONLY_15", 4, "init_only_15"), new DegradeSomeScreensTestGroup("INIT_ONLY_20", 5, "init_only_20"), new DegradeSomeScreensTestGroup("INIT_ONLY_25", 6, "init_only_25"), new DegradeSomeScreensTestGroup("LOAD_ONLY_5", 7, "load_only_5"), new DegradeSomeScreensTestGroup("LOAD_ONLY_10", 8, "load_only_10"), new DegradeSomeScreensTestGroup("LOAD_ONLY_15", 9, "load_only_15"), new DegradeSomeScreensTestGroup("LOAD_ONLY_20", 10, "load_only_20"), new DegradeSomeScreensTestGroup("LOAD_ONLY_25", 11, "load_only_25"), new DegradeSomeScreensTestGroup("DRAW_ONLY_5", 12, "draw_only_5"), new DegradeSomeScreensTestGroup("DRAW_ONLY_10", 13, "draw_only_10"), new DegradeSomeScreensTestGroup("DRAW_ONLY_15", 14, "draw_only_15"), new DegradeSomeScreensTestGroup("DRAW_ONLY_20", 15, "draw_only_20"), new DegradeSomeScreensTestGroup("DRAW_ONLY_25", 16, "draw_only_25"), new DegradeSomeScreensTestGroup("EVERYTHING_3", 17, "init_loadx2_draw_3"), new DegradeSomeScreensTestGroup("EVERYTHING_5", 18, "init_loadx2_draw_5"), new DegradeSomeScreensTestGroup("EVERYTHING_7", 19, "init_loadx2_draw_7"), new DegradeSomeScreensTestGroup("EVERYTHING_10", 20, "init_loadx2_draw_10"), new DegradeSomeScreensTestGroup("EVERYTHING_15", 21, "init_loadx2_draw_15"), new DegradeSomeScreensTestGroup("EVERYTHING_20", 22, "init_loadx2_draw_20"), new DegradeSomeScreensTestGroup("EVERYTHING_25", 23, "init_loadx2_draw_25"), new DegradeSomeScreensTestGroup("EVERYTHING_30", 24, "init_loadx2_draw_30"), new DegradeSomeScreensTestGroup("EVERYTHING_35", 25, "init_loadx2_draw_35")};
        f67813e = degradeSomeScreensTestGroupArr;
        f67814f = c.a(degradeSomeScreensTestGroupArr);
    }

    public DegradeSomeScreensTestGroup(String str, int i12, String str2) {
        this.f67815b = str2;
    }

    public static DegradeSomeScreensTestGroup valueOf(String str) {
        return (DegradeSomeScreensTestGroup) Enum.valueOf(DegradeSomeScreensTestGroup.class, str);
    }

    public static DegradeSomeScreensTestGroup[] values() {
        return (DegradeSomeScreensTestGroup[]) f67813e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67815b() {
        return this.f67815b;
    }
}
