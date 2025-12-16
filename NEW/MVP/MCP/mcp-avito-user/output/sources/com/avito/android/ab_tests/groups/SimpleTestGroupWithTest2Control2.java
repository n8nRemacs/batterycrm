package com.avito.android.ab_tests.groups;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimpleTestGroupWithTest2Control2.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithTest2Control2;", "", "Lu3/j;", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SimpleTestGroupWithTest2Control2 implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SimpleTestGroupWithTest2Control2[] f67978c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f67979d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67980b;

    static {
        SimpleTestGroupWithTest2Control2[] simpleTestGroupWithTest2Control2Arr = {new SimpleTestGroupWithTest2Control2("CONTROL", 0, "control_1"), new SimpleTestGroupWithTest2Control2("CONTROL_2", 1, "control_2"), new SimpleTestGroupWithTest2Control2("TEST", 2, "test"), new SimpleTestGroupWithTest2Control2("TEST_2", 3, "test2")};
        f67978c = simpleTestGroupWithTest2Control2Arr;
        f67979d = c.a(simpleTestGroupWithTest2Control2Arr);
    }

    public SimpleTestGroupWithTest2Control2(String str, int i12, String str2) {
        this.f67980b = str2;
    }

    public static SimpleTestGroupWithTest2Control2 valueOf(String str) {
        return (SimpleTestGroupWithTest2Control2) Enum.valueOf(SimpleTestGroupWithTest2Control2.class, str);
    }

    public static SimpleTestGroupWithTest2Control2[] values() {
        return (SimpleTestGroupWithTest2Control2[]) f67978c.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67986b() {
        return this.f67980b;
    }
}
