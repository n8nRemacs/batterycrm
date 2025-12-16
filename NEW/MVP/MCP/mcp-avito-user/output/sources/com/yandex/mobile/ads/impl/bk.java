package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public enum bk {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("IABConsent_ConsentString", "IABTCF_TCString"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("IABConsent_SubjectToGDPR", "IABTCF_gdprApplies"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("IABConsent_CMPPresent", "IABTCF_CmpSdkID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents");


    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f383972a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final String f383973b;

    public static final class a {
        @Y61.l
        public static bk a(@Y61.k String str) {
            for (bk bkVar : bk.values()) {
                if (kotlin.jvm.internal.L.f(bkVar.a(), str)) {
                    return bkVar;
                }
            }
            return null;
        }

        @Y61.l
        public static bk b(@Y61.k String str) {
            for (bk bkVar : bk.values()) {
                if (kotlin.jvm.internal.L.f(bkVar.b(), str)) {
                    return bkVar;
                }
            }
            return null;
        }
    }

    bk(String str, String str2) {
        this.f383972a = str;
        this.f383973b = str2;
    }

    @Y61.k
    public final String a() {
        return this.f383972a;
    }

    @Y61.k
    public final String b() {
        return this.f383973b;
    }
}
