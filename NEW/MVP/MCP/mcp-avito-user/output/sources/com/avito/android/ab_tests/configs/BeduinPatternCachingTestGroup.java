package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinPatternCachingTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/BeduinPatternCachingTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BeduinPatternCachingTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final BeduinPatternCachingTestGroup f67783c;

    /* renamed from: d, reason: collision with root package name */
    public static final BeduinPatternCachingTestGroup f67784d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BeduinPatternCachingTestGroup[] f67785e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67786f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67787b;

    static {
        BeduinPatternCachingTestGroup beduinPatternCachingTestGroup = new BeduinPatternCachingTestGroup("NONE", 0, "");
        f67783c = beduinPatternCachingTestGroup;
        BeduinPatternCachingTestGroup beduinPatternCachingTestGroup2 = new BeduinPatternCachingTestGroup("CONTROL", 1, "control");
        BeduinPatternCachingTestGroup beduinPatternCachingTestGroup3 = new BeduinPatternCachingTestGroup("TEST", 2, "test");
        f67784d = beduinPatternCachingTestGroup3;
        BeduinPatternCachingTestGroup[] beduinPatternCachingTestGroupArr = {beduinPatternCachingTestGroup, beduinPatternCachingTestGroup2, beduinPatternCachingTestGroup3};
        f67785e = beduinPatternCachingTestGroupArr;
        f67786f = c.a(beduinPatternCachingTestGroupArr);
    }

    public BeduinPatternCachingTestGroup(String str, int i12, String str2) {
        this.f67787b = str2;
    }

    public static BeduinPatternCachingTestGroup valueOf(String str) {
        return (BeduinPatternCachingTestGroup) Enum.valueOf(BeduinPatternCachingTestGroup.class, str);
    }

    public static BeduinPatternCachingTestGroup[] values() {
        return (BeduinPatternCachingTestGroup[]) f67785e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67800b() {
        return this.f67787b;
    }
}
