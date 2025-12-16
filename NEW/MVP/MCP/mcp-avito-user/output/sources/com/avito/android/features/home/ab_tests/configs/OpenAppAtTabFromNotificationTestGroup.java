package com.avito.android.features.home.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OpenAppAtTabFromNotificationConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/features/home/ab_tests/configs/OpenAppAtTabFromNotificationTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_home"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OpenAppAtTabFromNotificationTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final OpenAppAtTabFromNotificationTestGroup f157661c;

    /* renamed from: d, reason: collision with root package name */
    public static final OpenAppAtTabFromNotificationTestGroup f157662d;

    /* renamed from: e, reason: collision with root package name */
    public static final OpenAppAtTabFromNotificationTestGroup f157663e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ OpenAppAtTabFromNotificationTestGroup[] f157664f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f157665g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157666b;

    static {
        OpenAppAtTabFromNotificationTestGroup openAppAtTabFromNotificationTestGroup = new OpenAppAtTabFromNotificationTestGroup("CONTROL", 0, "control");
        f157661c = openAppAtTabFromNotificationTestGroup;
        OpenAppAtTabFromNotificationTestGroup openAppAtTabFromNotificationTestGroup2 = new OpenAppAtTabFromNotificationTestGroup("ONLY_SELLERS_CHATS", 1, "only_sellers_chats");
        f157662d = openAppAtTabFromNotificationTestGroup2;
        OpenAppAtTabFromNotificationTestGroup openAppAtTabFromNotificationTestGroup3 = new OpenAppAtTabFromNotificationTestGroup("NONE", 2, "");
        f157663e = openAppAtTabFromNotificationTestGroup3;
        OpenAppAtTabFromNotificationTestGroup[] openAppAtTabFromNotificationTestGroupArr = {openAppAtTabFromNotificationTestGroup, openAppAtTabFromNotificationTestGroup2, openAppAtTabFromNotificationTestGroup3};
        f157664f = openAppAtTabFromNotificationTestGroupArr;
        f157665g = c.a(openAppAtTabFromNotificationTestGroupArr);
    }

    public OpenAppAtTabFromNotificationTestGroup(String str, int i12, String str2) {
        this.f157666b = str2;
    }

    public static OpenAppAtTabFromNotificationTestGroup valueOf(String str) {
        return (OpenAppAtTabFromNotificationTestGroup) Enum.valueOf(OpenAppAtTabFromNotificationTestGroup.class, str);
    }

    public static OpenAppAtTabFromNotificationTestGroup[] values() {
        return (OpenAppAtTabFromNotificationTestGroup[]) f157664f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF157669b() {
        return this.f157666b;
    }
}
