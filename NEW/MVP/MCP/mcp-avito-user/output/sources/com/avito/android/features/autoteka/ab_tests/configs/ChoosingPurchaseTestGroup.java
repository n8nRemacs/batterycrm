package com.avito.android.features.autoteka.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutotekaChoosingPurchaseTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/features/autoteka/ab_tests/configs/ChoosingPurchaseTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChoosingPurchaseTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final ChoosingPurchaseTestGroup f157655c;

    /* renamed from: d, reason: collision with root package name */
    public static final ChoosingPurchaseTestGroup f157656d;

    /* renamed from: e, reason: collision with root package name */
    public static final ChoosingPurchaseTestGroup f157657e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ChoosingPurchaseTestGroup[] f157658f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f157659g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157660b;

    static {
        ChoosingPurchaseTestGroup choosingPurchaseTestGroup = new ChoosingPurchaseTestGroup("NONE", 0, "");
        ChoosingPurchaseTestGroup choosingPurchaseTestGroup2 = new ChoosingPurchaseTestGroup("CONTROL", 1, "control");
        f157655c = choosingPurchaseTestGroup2;
        ChoosingPurchaseTestGroup choosingPurchaseTestGroup3 = new ChoosingPurchaseTestGroup("NOT_PRESELECTED", 2, "not_preselected");
        f157656d = choosingPurchaseTestGroup3;
        ChoosingPurchaseTestGroup choosingPurchaseTestGroup4 = new ChoosingPurchaseTestGroup("PRESELECTED_5", 3, "preselected_5");
        f157657e = choosingPurchaseTestGroup4;
        ChoosingPurchaseTestGroup[] choosingPurchaseTestGroupArr = {choosingPurchaseTestGroup, choosingPurchaseTestGroup2, choosingPurchaseTestGroup3, choosingPurchaseTestGroup4};
        f157658f = choosingPurchaseTestGroupArr;
        f157659g = c.a(choosingPurchaseTestGroupArr);
    }

    public ChoosingPurchaseTestGroup(String str, int i12, String str2) {
        this.f157660b = str2;
    }

    public static ChoosingPurchaseTestGroup valueOf(String str) {
        return (ChoosingPurchaseTestGroup) Enum.valueOf(ChoosingPurchaseTestGroup.class, str);
    }

    public static ChoosingPurchaseTestGroup[] values() {
        return (ChoosingPurchaseTestGroup[]) f157658f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF157660b() {
        return this.f157660b;
    }
}
