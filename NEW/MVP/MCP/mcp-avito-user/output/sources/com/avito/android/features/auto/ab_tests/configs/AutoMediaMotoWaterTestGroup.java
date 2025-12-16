package com.avito.android.features.auto.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoMediaMotoWaterTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/features/auto/ab_tests/configs/AutoMediaMotoWaterTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutoMediaMotoWaterTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final AutoMediaMotoWaterTestGroup f157650c;

    /* renamed from: d, reason: collision with root package name */
    public static final AutoMediaMotoWaterTestGroup f157651d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AutoMediaMotoWaterTestGroup[] f157652e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f157653f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157654b;

    static {
        AutoMediaMotoWaterTestGroup autoMediaMotoWaterTestGroup = new AutoMediaMotoWaterTestGroup("NONE", 0, "");
        f157650c = autoMediaMotoWaterTestGroup;
        AutoMediaMotoWaterTestGroup autoMediaMotoWaterTestGroup2 = new AutoMediaMotoWaterTestGroup("CONTROL", 1, "control");
        AutoMediaMotoWaterTestGroup autoMediaMotoWaterTestGroup3 = new AutoMediaMotoWaterTestGroup("TEST", 2, "bottom");
        f157651d = autoMediaMotoWaterTestGroup3;
        AutoMediaMotoWaterTestGroup[] autoMediaMotoWaterTestGroupArr = {autoMediaMotoWaterTestGroup, autoMediaMotoWaterTestGroup2, autoMediaMotoWaterTestGroup3};
        f157652e = autoMediaMotoWaterTestGroupArr;
        f157653f = c.a(autoMediaMotoWaterTestGroupArr);
    }

    public AutoMediaMotoWaterTestGroup(String str, int i12, String str2) {
        this.f157654b = str2;
    }

    public static AutoMediaMotoWaterTestGroup valueOf(String str) {
        return (AutoMediaMotoWaterTestGroup) Enum.valueOf(AutoMediaMotoWaterTestGroup.class, str);
    }

    public static AutoMediaMotoWaterTestGroup[] values() {
        return (AutoMediaMotoWaterTestGroup[]) f157652e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF157654b() {
        return this.f157654b;
    }
}
