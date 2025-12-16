package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabBarRe23TestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/TabBarRe23TestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_design-system"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TabBarRe23TestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final TabBarRe23TestGroup f67929c;

    /* renamed from: d, reason: collision with root package name */
    public static final TabBarRe23TestGroup f67930d;

    /* renamed from: e, reason: collision with root package name */
    public static final TabBarRe23TestGroup f67931e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ TabBarRe23TestGroup[] f67932f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67933g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67934b;

    static {
        TabBarRe23TestGroup tabBarRe23TestGroup = new TabBarRe23TestGroup("TAB_BAR_RE23", 0, "no_labels");
        f67929c = tabBarRe23TestGroup;
        TabBarRe23TestGroup tabBarRe23TestGroup2 = new TabBarRe23TestGroup("TAB_BAR_RE23_WITH_TITLES", 1, "with_labels");
        f67930d = tabBarRe23TestGroup2;
        TabBarRe23TestGroup tabBarRe23TestGroup3 = new TabBarRe23TestGroup("CONTROL", 2, "control");
        f67931e = tabBarRe23TestGroup3;
        TabBarRe23TestGroup[] tabBarRe23TestGroupArr = {tabBarRe23TestGroup, tabBarRe23TestGroup2, tabBarRe23TestGroup3};
        f67932f = tabBarRe23TestGroupArr;
        f67933g = c.a(tabBarRe23TestGroupArr);
    }

    public TabBarRe23TestGroup(String str, int i12, String str2) {
        this.f67934b = str2;
    }

    public static TabBarRe23TestGroup valueOf(String str) {
        return (TabBarRe23TestGroup) Enum.valueOf(TabBarRe23TestGroup.class, str);
    }

    public static TabBarRe23TestGroup[] values() {
        return (TabBarRe23TestGroup[]) f67932f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67955b() {
        return this.f67934b;
    }
}
