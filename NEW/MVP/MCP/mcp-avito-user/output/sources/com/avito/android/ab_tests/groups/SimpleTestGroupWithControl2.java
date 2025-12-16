package com.avito.android.ab_tests.groups;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimpleTestGroupWithControl2.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithControl2;", "", "Lu3/j;", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SimpleTestGroupWithControl2 implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SimpleTestGroupWithControl2[] f67966c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f67967d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67968b;

    static {
        SimpleTestGroupWithControl2[] simpleTestGroupWithControl2Arr = {new SimpleTestGroupWithControl2("CONTROL", 0, "control"), new SimpleTestGroupWithControl2("CONTROL_2", 1, "control2"), new SimpleTestGroupWithControl2("TEST", 2, "test")};
        f67966c = simpleTestGroupWithControl2Arr;
        f67967d = c.a(simpleTestGroupWithControl2Arr);
    }

    public SimpleTestGroupWithControl2(String str, int i12, String str2) {
        this.f67968b = str2;
    }

    public static SimpleTestGroupWithControl2 valueOf(String str) {
        return (SimpleTestGroupWithControl2) Enum.valueOf(SimpleTestGroupWithControl2.class, str);
    }

    public static SimpleTestGroupWithControl2[] values() {
        return (SimpleTestGroupWithControl2[]) f67966c.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67977b() {
        return this.f67968b;
    }
}
