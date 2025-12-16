package com.avito.android.ab_tests.groups;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StandardizeButtonWidthTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/groups/StandardizeButtonWidthTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_marketplace"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StandardizeButtonWidthTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final StandardizeButtonWidthTestGroup f67981c;

    /* renamed from: d, reason: collision with root package name */
    public static final StandardizeButtonWidthTestGroup f67982d;

    /* renamed from: e, reason: collision with root package name */
    public static final StandardizeButtonWidthTestGroup f67983e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ StandardizeButtonWidthTestGroup[] f67984f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67985g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67986b;

    static {
        StandardizeButtonWidthTestGroup standardizeButtonWidthTestGroup = new StandardizeButtonWidthTestGroup("CONTROL", 0, "control");
        f67981c = standardizeButtonWidthTestGroup;
        StandardizeButtonWidthTestGroup standardizeButtonWidthTestGroup2 = new StandardizeButtonWidthTestGroup("TEST_1", 1, "test");
        f67982d = standardizeButtonWidthTestGroup2;
        StandardizeButtonWidthTestGroup standardizeButtonWidthTestGroup3 = new StandardizeButtonWidthTestGroup("TEST_2", 2, "test2");
        f67983e = standardizeButtonWidthTestGroup3;
        StandardizeButtonWidthTestGroup[] standardizeButtonWidthTestGroupArr = {standardizeButtonWidthTestGroup, standardizeButtonWidthTestGroup2, standardizeButtonWidthTestGroup3};
        f67984f = standardizeButtonWidthTestGroupArr;
        f67985g = c.a(standardizeButtonWidthTestGroupArr);
    }

    public StandardizeButtonWidthTestGroup(String str, int i12, String str2) {
        this.f67986b = str2;
    }

    public static StandardizeButtonWidthTestGroup valueOf(String str) {
        return (StandardizeButtonWidthTestGroup) Enum.valueOf(StandardizeButtonWidthTestGroup.class, str);
    }

    public static StandardizeButtonWidthTestGroup[] values() {
        return (StandardizeButtonWidthTestGroup[]) f67984f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67986b() {
        return this.f67986b;
    }
}
