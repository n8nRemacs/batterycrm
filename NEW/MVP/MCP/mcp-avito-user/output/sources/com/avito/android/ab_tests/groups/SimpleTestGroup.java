package com.avito.android.ab_tests.groups;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimpleTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/groups/SimpleTestGroup;", "", "Lu3/j;", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SimpleTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final SimpleTestGroup f67961c;

    /* renamed from: d, reason: collision with root package name */
    public static final SimpleTestGroup f67962d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SimpleTestGroup[] f67963e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67964f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67965b;

    static {
        SimpleTestGroup simpleTestGroup = new SimpleTestGroup("TEST", 0, "test");
        f67961c = simpleTestGroup;
        SimpleTestGroup simpleTestGroup2 = new SimpleTestGroup("CONTROL", 1, "control");
        f67962d = simpleTestGroup2;
        SimpleTestGroup[] simpleTestGroupArr = {simpleTestGroup, simpleTestGroup2};
        f67963e = simpleTestGroupArr;
        f67964f = c.a(simpleTestGroupArr);
    }

    public SimpleTestGroup(String str, int i12, String str2) {
        this.f67965b = str2;
    }

    public static SimpleTestGroup valueOf(String str) {
        return (SimpleTestGroup) Enum.valueOf(SimpleTestGroup.class, str);
    }

    public static SimpleTestGroup[] values() {
        return (SimpleTestGroup[]) f67963e.clone();
    }

    public final boolean a() {
        return this == f67961c;
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF207906b() {
        return this.f67965b;
    }
}
