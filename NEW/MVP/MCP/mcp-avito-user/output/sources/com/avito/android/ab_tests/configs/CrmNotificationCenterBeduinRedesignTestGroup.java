package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CrmNotificationCenterBeduinRedesignTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/CrmNotificationCenterBeduinRedesignTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_sbc"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CrmNotificationCenterBeduinRedesignTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final CrmNotificationCenterBeduinRedesignTestGroup f67788c;

    /* renamed from: d, reason: collision with root package name */
    public static final CrmNotificationCenterBeduinRedesignTestGroup f67789d;

    /* renamed from: e, reason: collision with root package name */
    public static final CrmNotificationCenterBeduinRedesignTestGroup f67790e;

    /* renamed from: f, reason: collision with root package name */
    public static final CrmNotificationCenterBeduinRedesignTestGroup f67791f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CrmNotificationCenterBeduinRedesignTestGroup[] f67792g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f67793h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67794b;

    static {
        CrmNotificationCenterBeduinRedesignTestGroup crmNotificationCenterBeduinRedesignTestGroup = new CrmNotificationCenterBeduinRedesignTestGroup("NONE", 0, "");
        f67788c = crmNotificationCenterBeduinRedesignTestGroup;
        CrmNotificationCenterBeduinRedesignTestGroup crmNotificationCenterBeduinRedesignTestGroup2 = new CrmNotificationCenterBeduinRedesignTestGroup("CONTROL", 1, "control");
        CrmNotificationCenterBeduinRedesignTestGroup crmNotificationCenterBeduinRedesignTestGroup3 = new CrmNotificationCenterBeduinRedesignTestGroup("TEST_OLD_NC_NEW_COUNTER", 2, "test_old_nc_new_counter");
        f67789d = crmNotificationCenterBeduinRedesignTestGroup3;
        CrmNotificationCenterBeduinRedesignTestGroup crmNotificationCenterBeduinRedesignTestGroup4 = new CrmNotificationCenterBeduinRedesignTestGroup("TEST_NEW_NC_OLD_COUNTER", 3, "test_new_nc_old_counter");
        f67790e = crmNotificationCenterBeduinRedesignTestGroup4;
        CrmNotificationCenterBeduinRedesignTestGroup crmNotificationCenterBeduinRedesignTestGroup5 = new CrmNotificationCenterBeduinRedesignTestGroup("TEST_NEW_NC_NEW_COUNTER", 4, "test_new_nc_new_counter");
        f67791f = crmNotificationCenterBeduinRedesignTestGroup5;
        CrmNotificationCenterBeduinRedesignTestGroup[] crmNotificationCenterBeduinRedesignTestGroupArr = {crmNotificationCenterBeduinRedesignTestGroup, crmNotificationCenterBeduinRedesignTestGroup2, crmNotificationCenterBeduinRedesignTestGroup3, crmNotificationCenterBeduinRedesignTestGroup4, crmNotificationCenterBeduinRedesignTestGroup5};
        f67792g = crmNotificationCenterBeduinRedesignTestGroupArr;
        f67793h = c.a(crmNotificationCenterBeduinRedesignTestGroupArr);
    }

    public CrmNotificationCenterBeduinRedesignTestGroup(String str, int i12, String str2) {
        this.f67794b = str2;
    }

    public static CrmNotificationCenterBeduinRedesignTestGroup valueOf(String str) {
        return (CrmNotificationCenterBeduinRedesignTestGroup) Enum.valueOf(CrmNotificationCenterBeduinRedesignTestGroup.class, str);
    }

    public static CrmNotificationCenterBeduinRedesignTestGroup[] values() {
        return (CrmNotificationCenterBeduinRedesignTestGroup[]) f67792g.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67794b() {
        return this.f67794b;
    }
}
