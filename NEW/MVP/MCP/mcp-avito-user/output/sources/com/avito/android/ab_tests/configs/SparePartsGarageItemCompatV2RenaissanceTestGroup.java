package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SparePartsGarageItemCompatV2RenaissanceTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/SparePartsGarageItemCompatV2RenaissanceTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SparePartsGarageItemCompatV2RenaissanceTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final SparePartsGarageItemCompatV2RenaissanceTestGroup f67924c;

    /* renamed from: d, reason: collision with root package name */
    public static final SparePartsGarageItemCompatV2RenaissanceTestGroup f67925d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SparePartsGarageItemCompatV2RenaissanceTestGroup[] f67926e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67927f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67928b;

    static {
        SparePartsGarageItemCompatV2RenaissanceTestGroup sparePartsGarageItemCompatV2RenaissanceTestGroup = new SparePartsGarageItemCompatV2RenaissanceTestGroup("NONE", 0, "");
        f67924c = sparePartsGarageItemCompatV2RenaissanceTestGroup;
        SparePartsGarageItemCompatV2RenaissanceTestGroup sparePartsGarageItemCompatV2RenaissanceTestGroup2 = new SparePartsGarageItemCompatV2RenaissanceTestGroup("CONTROL", 1, "control");
        f67925d = sparePartsGarageItemCompatV2RenaissanceTestGroup2;
        SparePartsGarageItemCompatV2RenaissanceTestGroup[] sparePartsGarageItemCompatV2RenaissanceTestGroupArr = {sparePartsGarageItemCompatV2RenaissanceTestGroup, sparePartsGarageItemCompatV2RenaissanceTestGroup2, new SparePartsGarageItemCompatV2RenaissanceTestGroup("TEST", 2, "test")};
        f67926e = sparePartsGarageItemCompatV2RenaissanceTestGroupArr;
        f67927f = c.a(sparePartsGarageItemCompatV2RenaissanceTestGroupArr);
    }

    public SparePartsGarageItemCompatV2RenaissanceTestGroup(String str, int i12, String str2) {
        this.f67928b = str2;
    }

    public static SparePartsGarageItemCompatV2RenaissanceTestGroup valueOf(String str) {
        return (SparePartsGarageItemCompatV2RenaissanceTestGroup) Enum.valueOf(SparePartsGarageItemCompatV2RenaissanceTestGroup.class, str);
    }

    public static SparePartsGarageItemCompatV2RenaissanceTestGroup[] values() {
        return (SparePartsGarageItemCompatV2RenaissanceTestGroup[]) f67926e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67939b() {
        return this.f67928b;
    }
}
