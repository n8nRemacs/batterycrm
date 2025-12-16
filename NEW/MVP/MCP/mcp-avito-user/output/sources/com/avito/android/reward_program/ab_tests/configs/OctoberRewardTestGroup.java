package com.avito.android.reward_program.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OctoberRewardTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/reward_program/ab_tests/configs/OctoberRewardTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_reward-program"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OctoberRewardTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final OctoberRewardTestGroup f255680c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ OctoberRewardTestGroup[] f255681d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f255682e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f255683b;

    static {
        OctoberRewardTestGroup octoberRewardTestGroup = new OctoberRewardTestGroup("CONTROL", 0, "control");
        f255680c = octoberRewardTestGroup;
        OctoberRewardTestGroup[] octoberRewardTestGroupArr = {octoberRewardTestGroup, new OctoberRewardTestGroup("TEST", 1, "test"), new OctoberRewardTestGroup("TEST2", 2, "test_2")};
        f255681d = octoberRewardTestGroupArr;
        f255682e = c.a(octoberRewardTestGroupArr);
    }

    public OctoberRewardTestGroup(String str, int i12, String str2) {
        this.f255683b = str2;
    }

    public static OctoberRewardTestGroup valueOf(String str) {
        return (OctoberRewardTestGroup) Enum.valueOf(OctoberRewardTestGroup.class, str);
    }

    public static OctoberRewardTestGroup[] values() {
        return (OctoberRewardTestGroup[]) f255681d.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF255688b() {
        return this.f255683b;
    }
}
