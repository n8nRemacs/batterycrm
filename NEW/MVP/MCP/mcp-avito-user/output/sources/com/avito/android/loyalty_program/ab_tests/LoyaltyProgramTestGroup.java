package com.avito.android.loyalty_program.ab_tests;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoyaltyProgramTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty_program/ab_tests/LoyaltyProgramTestGroup;", "", "Lu3/j;", "_avito_loyalty-program_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LoyaltyProgramTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final LoyaltyProgramTestGroup f184148c;

    /* renamed from: d, reason: collision with root package name */
    public static final LoyaltyProgramTestGroup f184149d;

    /* renamed from: e, reason: collision with root package name */
    public static final LoyaltyProgramTestGroup f184150e;

    /* renamed from: f, reason: collision with root package name */
    public static final LoyaltyProgramTestGroup f184151f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ LoyaltyProgramTestGroup[] f184152g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f184153h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f184154b;

    static {
        LoyaltyProgramTestGroup loyaltyProgramTestGroup = new LoyaltyProgramTestGroup("NONE", 0, "none");
        f184148c = loyaltyProgramTestGroup;
        LoyaltyProgramTestGroup loyaltyProgramTestGroup2 = new LoyaltyProgramTestGroup("CONTROL", 1, "control");
        f184149d = loyaltyProgramTestGroup2;
        LoyaltyProgramTestGroup loyaltyProgramTestGroup3 = new LoyaltyProgramTestGroup("BONUS", 2, "bonus");
        f184150e = loyaltyProgramTestGroup3;
        LoyaltyProgramTestGroup loyaltyProgramTestGroup4 = new LoyaltyProgramTestGroup("DISCOUNT", 3, "discount");
        f184151f = loyaltyProgramTestGroup4;
        LoyaltyProgramTestGroup[] loyaltyProgramTestGroupArr = {loyaltyProgramTestGroup, loyaltyProgramTestGroup2, loyaltyProgramTestGroup3, loyaltyProgramTestGroup4};
        f184152g = loyaltyProgramTestGroupArr;
        f184153h = c.a(loyaltyProgramTestGroupArr);
    }

    public LoyaltyProgramTestGroup(String str, int i12, String str2) {
        this.f184154b = str2;
    }

    public static LoyaltyProgramTestGroup valueOf(String str) {
        return (LoyaltyProgramTestGroup) Enum.valueOf(LoyaltyProgramTestGroup.class, str);
    }

    public static LoyaltyProgramTestGroup[] values() {
        return (LoyaltyProgramTestGroup[]) f184152g.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF184154b() {
        return this.f184154b;
    }
}
