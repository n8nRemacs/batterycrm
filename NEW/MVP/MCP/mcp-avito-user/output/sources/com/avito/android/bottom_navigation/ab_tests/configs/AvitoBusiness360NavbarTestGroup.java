package com.avito.android.bottom_navigation.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoBusiness360NavbarTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/ab_tests/configs/AvitoBusiness360NavbarTestGroup;", "", "Lu3/j;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoBusiness360NavbarTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final AvitoBusiness360NavbarTestGroup f106995c;

    /* renamed from: d, reason: collision with root package name */
    public static final AvitoBusiness360NavbarTestGroup f106996d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AvitoBusiness360NavbarTestGroup[] f106997e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f106998f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f106999b;

    static {
        AvitoBusiness360NavbarTestGroup avitoBusiness360NavbarTestGroup = new AvitoBusiness360NavbarTestGroup("NONE", 0, "");
        f106995c = avitoBusiness360NavbarTestGroup;
        AvitoBusiness360NavbarTestGroup avitoBusiness360NavbarTestGroup2 = new AvitoBusiness360NavbarTestGroup("CONTROL", 1, "control");
        AvitoBusiness360NavbarTestGroup avitoBusiness360NavbarTestGroup3 = new AvitoBusiness360NavbarTestGroup("TEST", 2, "test");
        f106996d = avitoBusiness360NavbarTestGroup3;
        AvitoBusiness360NavbarTestGroup[] avitoBusiness360NavbarTestGroupArr = {avitoBusiness360NavbarTestGroup, avitoBusiness360NavbarTestGroup2, avitoBusiness360NavbarTestGroup3};
        f106997e = avitoBusiness360NavbarTestGroupArr;
        f106998f = c.a(avitoBusiness360NavbarTestGroupArr);
    }

    public AvitoBusiness360NavbarTestGroup(String str, int i12, String str2) {
        this.f106999b = str2;
    }

    public static AvitoBusiness360NavbarTestGroup valueOf(String str) {
        return (AvitoBusiness360NavbarTestGroup) Enum.valueOf(AvitoBusiness360NavbarTestGroup.class, str);
    }

    public static AvitoBusiness360NavbarTestGroup[] values() {
        return (AvitoBusiness360NavbarTestGroup[]) f106997e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67986b() {
        return this.f106999b;
    }
}
