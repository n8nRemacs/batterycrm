package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DegradeScrollTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/DegradeScrollTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DegradeScrollTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final DegradeScrollTestGroup f67806c;

    /* renamed from: d, reason: collision with root package name */
    public static final DegradeScrollTestGroup f67807d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DegradeScrollTestGroup[] f67808e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67809f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67810b;

    static {
        DegradeScrollTestGroup degradeScrollTestGroup = new DegradeScrollTestGroup("NONE", 0, "");
        f67806c = degradeScrollTestGroup;
        DegradeScrollTestGroup degradeScrollTestGroup2 = new DegradeScrollTestGroup("CONTROL", 1, "control");
        f67807d = degradeScrollTestGroup2;
        DegradeScrollTestGroup[] degradeScrollTestGroupArr = {degradeScrollTestGroup, degradeScrollTestGroup2, new DegradeScrollTestGroup("PERCENT_3", 2, "percent_3"), new DegradeScrollTestGroup("PERCENT_5", 3, "percent_5"), new DegradeScrollTestGroup("PERCENT_10", 4, "percent_10"), new DegradeScrollTestGroup("PERCENT_15", 5, "percent_15"), new DegradeScrollTestGroup("PERCENT_20", 6, "percent_20"), new DegradeScrollTestGroup("PERCENT_25", 7, "percent_25"), new DegradeScrollTestGroup("PERCENT_30", 8, "percent_30"), new DegradeScrollTestGroup("PERCENT_35", 9, "percent_35"), new DegradeScrollTestGroup("PERCENT_40", 10, "percent_40"), new DegradeScrollTestGroup("PERCENT_50", 11, "percent_50"), new DegradeScrollTestGroup("PERCENT_100", 12, "percent_100"), new DegradeScrollTestGroup("PERCENT_125", 13, "percent_125"), new DegradeScrollTestGroup("PERCENT_150", 14, "percent_150"), new DegradeScrollTestGroup("PERCENT_175", 15, "percent_175"), new DegradeScrollTestGroup("PERCENT_200", 16, "percent_200"), new DegradeScrollTestGroup("PERCENT_225", 17, "percent_225"), new DegradeScrollTestGroup("PERCENT_250", 18, "percent_250"), new DegradeScrollTestGroup("PERCENT_275", 19, "percent_275"), new DegradeScrollTestGroup("PERCENT_300", 20, "percent_300"), new DegradeScrollTestGroup("PERCENT_325", 21, "percent_325"), new DegradeScrollTestGroup("PERCENT_350", 22, "percent_350"), new DegradeScrollTestGroup("PERCENT_375", 23, "percent_375"), new DegradeScrollTestGroup("PERCENT_400", 24, "percent_400"), new DegradeScrollTestGroup("PERCENT_450", 25, "percent_450"), new DegradeScrollTestGroup("PERCENT_500", 26, "percent_500"), new DegradeScrollTestGroup("PERCENT_550", 27, "percent_550"), new DegradeScrollTestGroup("PERCENT_600", 28, "percent_600")};
        f67808e = degradeScrollTestGroupArr;
        f67809f = c.a(degradeScrollTestGroupArr);
    }

    public DegradeScrollTestGroup(String str, int i12, String str2) {
        this.f67810b = str2;
    }

    public static DegradeScrollTestGroup valueOf(String str) {
        return (DegradeScrollTestGroup) Enum.valueOf(DegradeScrollTestGroup.class, str);
    }

    public static DegradeScrollTestGroup[] values() {
        return (DegradeScrollTestGroup[]) f67808e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67819b() {
        return this.f67810b;
    }
}
