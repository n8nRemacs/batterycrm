package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RiseIcebreakersItemConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/RiseIcebreakersItemTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RiseIcebreakersItemTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final RiseIcebreakersItemTestGroup f67917c;

    /* renamed from: d, reason: collision with root package name */
    public static final RiseIcebreakersItemTestGroup f67918d;

    /* renamed from: e, reason: collision with root package name */
    public static final RiseIcebreakersItemTestGroup f67919e;

    /* renamed from: f, reason: collision with root package name */
    public static final RiseIcebreakersItemTestGroup f67920f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ RiseIcebreakersItemTestGroup[] f67921g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f67922h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67923b;

    static {
        RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup = new RiseIcebreakersItemTestGroup("CONTROL", 0, "control");
        f67917c = riseIcebreakersItemTestGroup;
        RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup2 = new RiseIcebreakersItemTestGroup("UNDER_PREFERENCES", 1, "under_preferences");
        f67918d = riseIcebreakersItemTestGroup2;
        RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup3 = new RiseIcebreakersItemTestGroup("OVER_PREFERENCES", 2, "over_preferences");
        f67919e = riseIcebreakersItemTestGroup3;
        RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup4 = new RiseIcebreakersItemTestGroup("NONE", 3, "");
        f67920f = riseIcebreakersItemTestGroup4;
        RiseIcebreakersItemTestGroup[] riseIcebreakersItemTestGroupArr = {riseIcebreakersItemTestGroup, riseIcebreakersItemTestGroup2, riseIcebreakersItemTestGroup3, riseIcebreakersItemTestGroup4};
        f67921g = riseIcebreakersItemTestGroupArr;
        f67922h = c.a(riseIcebreakersItemTestGroupArr);
    }

    public RiseIcebreakersItemTestGroup(String str, int i12, String str2) {
        this.f67923b = str2;
    }

    public static RiseIcebreakersItemTestGroup valueOf(String str) {
        return (RiseIcebreakersItemTestGroup) Enum.valueOf(RiseIcebreakersItemTestGroup.class, str);
    }

    public static RiseIcebreakersItemTestGroup[] values() {
        return (RiseIcebreakersItemTestGroup[]) f67921g.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67928b() {
        return this.f67923b;
    }
}
