package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CrossFadeOpenAbTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/CrossFadeOpenAbTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CrossFadeOpenAbTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final CrossFadeOpenAbTestGroup f67795c;

    /* renamed from: d, reason: collision with root package name */
    public static final CrossFadeOpenAbTestGroup f67796d;

    /* renamed from: e, reason: collision with root package name */
    public static final CrossFadeOpenAbTestGroup f67797e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CrossFadeOpenAbTestGroup[] f67798f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67799g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67800b;

    static {
        CrossFadeOpenAbTestGroup crossFadeOpenAbTestGroup = new CrossFadeOpenAbTestGroup("CONTROL", 0, "control");
        CrossFadeOpenAbTestGroup crossFadeOpenAbTestGroup2 = new CrossFadeOpenAbTestGroup("SKELETON_TITLE_PRICE", 1, "skeleton_title_price");
        f67795c = crossFadeOpenAbTestGroup2;
        CrossFadeOpenAbTestGroup crossFadeOpenAbTestGroup3 = new CrossFadeOpenAbTestGroup("SKELETON_EMPTY", 2, "skeleton_empty");
        f67796d = crossFadeOpenAbTestGroup3;
        CrossFadeOpenAbTestGroup crossFadeOpenAbTestGroup4 = new CrossFadeOpenAbTestGroup("NONE", 3, "");
        f67797e = crossFadeOpenAbTestGroup4;
        CrossFadeOpenAbTestGroup[] crossFadeOpenAbTestGroupArr = {crossFadeOpenAbTestGroup, crossFadeOpenAbTestGroup2, crossFadeOpenAbTestGroup3, crossFadeOpenAbTestGroup4};
        f67798f = crossFadeOpenAbTestGroupArr;
        f67799g = c.a(crossFadeOpenAbTestGroupArr);
    }

    public CrossFadeOpenAbTestGroup(String str, int i12, String str2) {
        this.f67800b = str2;
    }

    public static CrossFadeOpenAbTestGroup valueOf(String str) {
        return (CrossFadeOpenAbTestGroup) Enum.valueOf(CrossFadeOpenAbTestGroup.class, str);
    }

    public static CrossFadeOpenAbTestGroup[] values() {
        return (CrossFadeOpenAbTestGroup[]) f67798f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67800b() {
        return this.f67800b;
    }
}
