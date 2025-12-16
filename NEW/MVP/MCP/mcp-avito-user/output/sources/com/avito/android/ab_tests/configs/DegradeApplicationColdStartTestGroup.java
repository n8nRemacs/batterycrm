package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DegradeApplicationColdStartTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/DegradeApplicationColdStartTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DegradeApplicationColdStartTestGroup implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final DegradeApplicationColdStartTestGroup f67801d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DegradeApplicationColdStartTestGroup[] f67802e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67803f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67804b;

    /* renamed from: c, reason: collision with root package name */
    public final double f67805c;

    static {
        DegradeApplicationColdStartTestGroup degradeApplicationColdStartTestGroup = new DegradeApplicationColdStartTestGroup("NONE", 0, "", 0.0d);
        f67801d = degradeApplicationColdStartTestGroup;
        DegradeApplicationColdStartTestGroup[] degradeApplicationColdStartTestGroupArr = {degradeApplicationColdStartTestGroup, new DegradeApplicationColdStartTestGroup("CONTROL", 1, "control", 0.0d), new DegradeApplicationColdStartTestGroup("PERCENT_5", 2, "percent_5", 0.05d), new DegradeApplicationColdStartTestGroup("PERCENT_10", 3, "percent_10", 0.1d), new DegradeApplicationColdStartTestGroup("PERCENT_15", 4, "percent_15", 0.15d), new DegradeApplicationColdStartTestGroup("PERCENT_20", 5, "percent_20", 0.2d), new DegradeApplicationColdStartTestGroup("PERCENT_25", 6, "percent_25", 0.25d), new DegradeApplicationColdStartTestGroup("PERCENT_30", 7, "percent_30", 0.3d), new DegradeApplicationColdStartTestGroup("PERCENT_35", 8, "percent_35", 0.35d), new DegradeApplicationColdStartTestGroup("PERCENT_40", 9, "percent_40", 0.4d), new DegradeApplicationColdStartTestGroup("PERCENT_50", 10, "percent_50", 0.5d), new DegradeApplicationColdStartTestGroup("PERCENT_60", 11, "percent_60", 0.6d), new DegradeApplicationColdStartTestGroup("PERCENT_70", 12, "percent_70", 0.7d), new DegradeApplicationColdStartTestGroup("PERCENT_80", 13, "percent_80", 0.8d), new DegradeApplicationColdStartTestGroup("PERCENT_90", 14, "percent_90", 0.9d), new DegradeApplicationColdStartTestGroup("PERCENT_100", 15, "percent_100", 1.0d)};
        f67802e = degradeApplicationColdStartTestGroupArr;
        f67803f = c.a(degradeApplicationColdStartTestGroupArr);
    }

    public DegradeApplicationColdStartTestGroup(String str, int i12, String str2, double d12) {
        this.f67804b = str2;
        this.f67805c = d12;
    }

    public static DegradeApplicationColdStartTestGroup valueOf(String str) {
        return (DegradeApplicationColdStartTestGroup) Enum.valueOf(DegradeApplicationColdStartTestGroup.class, str);
    }

    public static DegradeApplicationColdStartTestGroup[] values() {
        return (DegradeApplicationColdStartTestGroup[]) f67802e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67804b() {
        return this.f67804b;
    }
}
