package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GridLayoutWithTwoColumnsAbTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/GridLayoutWithTwoColumnsAbTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_serp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GridLayoutWithTwoColumnsAbTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final GridLayoutWithTwoColumnsAbTestGroup f67820c;

    /* renamed from: d, reason: collision with root package name */
    public static final GridLayoutWithTwoColumnsAbTestGroup f67821d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ GridLayoutWithTwoColumnsAbTestGroup[] f67822e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67823f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67824b;

    static {
        GridLayoutWithTwoColumnsAbTestGroup gridLayoutWithTwoColumnsAbTestGroup = new GridLayoutWithTwoColumnsAbTestGroup("NONE", 0, "");
        f67820c = gridLayoutWithTwoColumnsAbTestGroup;
        GridLayoutWithTwoColumnsAbTestGroup gridLayoutWithTwoColumnsAbTestGroup2 = new GridLayoutWithTwoColumnsAbTestGroup("CONTROL", 1, "control");
        GridLayoutWithTwoColumnsAbTestGroup gridLayoutWithTwoColumnsAbTestGroup3 = new GridLayoutWithTwoColumnsAbTestGroup("TEST", 2, "test");
        f67821d = gridLayoutWithTwoColumnsAbTestGroup3;
        GridLayoutWithTwoColumnsAbTestGroup[] gridLayoutWithTwoColumnsAbTestGroupArr = {gridLayoutWithTwoColumnsAbTestGroup, gridLayoutWithTwoColumnsAbTestGroup2, gridLayoutWithTwoColumnsAbTestGroup3};
        f67822e = gridLayoutWithTwoColumnsAbTestGroupArr;
        f67823f = c.a(gridLayoutWithTwoColumnsAbTestGroupArr);
    }

    public GridLayoutWithTwoColumnsAbTestGroup(String str, int i12, String str2) {
        this.f67824b = str2;
    }

    public static GridLayoutWithTwoColumnsAbTestGroup valueOf(String str) {
        return (GridLayoutWithTwoColumnsAbTestGroup) Enum.valueOf(GridLayoutWithTwoColumnsAbTestGroup.class, str);
    }

    public static GridLayoutWithTwoColumnsAbTestGroup[] values() {
        return (GridLayoutWithTwoColumnsAbTestGroup[]) f67822e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67828b() {
        return this.f67824b;
    }
}
