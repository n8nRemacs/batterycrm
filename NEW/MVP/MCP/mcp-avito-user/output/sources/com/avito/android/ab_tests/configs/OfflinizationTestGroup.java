package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfflinizationTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/OfflinizationTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OfflinizationTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final OfflinizationTestGroup f67887c;

    /* renamed from: d, reason: collision with root package name */
    public static final OfflinizationTestGroup f67888d;

    /* renamed from: e, reason: collision with root package name */
    public static final OfflinizationTestGroup f67889e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ OfflinizationTestGroup[] f67890f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67891g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67892b;

    static {
        OfflinizationTestGroup offlinizationTestGroup = new OfflinizationTestGroup("NONE", 0, "");
        f67887c = offlinizationTestGroup;
        OfflinizationTestGroup offlinizationTestGroup2 = new OfflinizationTestGroup("CONTROL", 1, "control");
        OfflinizationTestGroup offlinizationTestGroup3 = new OfflinizationTestGroup("TEST_TIMEOUTS_ONLY", 2, "test_timeouts_only");
        f67888d = offlinizationTestGroup3;
        OfflinizationTestGroup offlinizationTestGroup4 = new OfflinizationTestGroup("TEST_TIMEOUTS_WITH_500", 3, "test_with_500");
        f67889e = offlinizationTestGroup4;
        OfflinizationTestGroup[] offlinizationTestGroupArr = {offlinizationTestGroup, offlinizationTestGroup2, offlinizationTestGroup3, offlinizationTestGroup4};
        f67890f = offlinizationTestGroupArr;
        f67891g = c.a(offlinizationTestGroupArr);
    }

    public OfflinizationTestGroup(String str, int i12, String str2) {
        this.f67892b = str2;
    }

    public static OfflinizationTestGroup valueOf(String str) {
        return (OfflinizationTestGroup) Enum.valueOf(OfflinizationTestGroup.class, str);
    }

    public static OfflinizationTestGroup[] values() {
        return (OfflinizationTestGroup[]) f67890f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67892b() {
        return this.f67892b;
    }
}
