package com.avito.android.features.auto.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoGlowFiltersTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/features/auto/ab_tests/configs/AutoGlowFiltersTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutoGlowFiltersTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final AutoGlowFiltersTestGroup f157643c;

    /* renamed from: d, reason: collision with root package name */
    public static final AutoGlowFiltersTestGroup f157644d;

    /* renamed from: e, reason: collision with root package name */
    public static final AutoGlowFiltersTestGroup f157645e;

    /* renamed from: f, reason: collision with root package name */
    public static final AutoGlowFiltersTestGroup f157646f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AutoGlowFiltersTestGroup[] f157647g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f157648h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157649b;

    static {
        AutoGlowFiltersTestGroup autoGlowFiltersTestGroup = new AutoGlowFiltersTestGroup("NONE", 0, "");
        f157643c = autoGlowFiltersTestGroup;
        AutoGlowFiltersTestGroup autoGlowFiltersTestGroup2 = new AutoGlowFiltersTestGroup("CONTROL", 1, "control");
        f157644d = autoGlowFiltersTestGroup2;
        AutoGlowFiltersTestGroup autoGlowFiltersTestGroup3 = new AutoGlowFiltersTestGroup("TEST", 2, "test");
        f157645e = autoGlowFiltersTestGroup3;
        AutoGlowFiltersTestGroup autoGlowFiltersTestGroup4 = new AutoGlowFiltersTestGroup("TEST_BEZ_VAZ", 3, "bez_vaz");
        f157646f = autoGlowFiltersTestGroup4;
        AutoGlowFiltersTestGroup[] autoGlowFiltersTestGroupArr = {autoGlowFiltersTestGroup, autoGlowFiltersTestGroup2, autoGlowFiltersTestGroup3, autoGlowFiltersTestGroup4};
        f157647g = autoGlowFiltersTestGroupArr;
        f157648h = c.a(autoGlowFiltersTestGroupArr);
    }

    public AutoGlowFiltersTestGroup(String str, int i12, String str2) {
        this.f157649b = str2;
    }

    public static AutoGlowFiltersTestGroup valueOf(String str) {
        return (AutoGlowFiltersTestGroup) Enum.valueOf(AutoGlowFiltersTestGroup.class, str);
    }

    public static AutoGlowFiltersTestGroup[] values() {
        return (AutoGlowFiltersTestGroup[]) f157647g.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF157649b() {
        return this.f157649b;
    }
}
