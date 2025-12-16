package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoFilterHintToastConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/AutoFilterHintToastTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_serp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AutoFilterHintToastTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final AutoFilterHintToastTestGroup f67779c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AutoFilterHintToastTestGroup[] f67780d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f67781e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67782b;

    static {
        AutoFilterHintToastTestGroup autoFilterHintToastTestGroup = new AutoFilterHintToastTestGroup("NONE", 0, "");
        f67779c = autoFilterHintToastTestGroup;
        AutoFilterHintToastTestGroup[] autoFilterHintToastTestGroupArr = {autoFilterHintToastTestGroup, new AutoFilterHintToastTestGroup("CONTROL", 1, "control"), new AutoFilterHintToastTestGroup("TEST_400", 2, "test_min_400_items"), new AutoFilterHintToastTestGroup("TEST_800", 3, "test_min_800_items")};
        f67780d = autoFilterHintToastTestGroupArr;
        f67781e = c.a(autoFilterHintToastTestGroupArr);
    }

    public AutoFilterHintToastTestGroup(String str, int i12, String str2) {
        this.f67782b = str2;
    }

    public static AutoFilterHintToastTestGroup valueOf(String str) {
        return (AutoFilterHintToastTestGroup) Enum.valueOf(AutoFilterHintToastTestGroup.class, str);
    }

    public static AutoFilterHintToastTestGroup[] values() {
        return (AutoFilterHintToastTestGroup[]) f67780d.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67787b() {
        return this.f67782b;
    }
}
