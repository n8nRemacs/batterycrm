package com.avito.android.ab_tests.groups;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimpleTestGroupWithNoneControl2.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNoneControl2;", "", "Lu3/j;", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SimpleTestGroupWithNoneControl2 implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SimpleTestGroupWithNoneControl2[] f67975c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f67976d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67977b;

    static {
        SimpleTestGroupWithNoneControl2[] simpleTestGroupWithNoneControl2Arr = {new SimpleTestGroupWithNoneControl2("NONE", 0, ""), new SimpleTestGroupWithNoneControl2("CONTROL", 1, "control"), new SimpleTestGroupWithNoneControl2("CONTROL_2", 2, "control2"), new SimpleTestGroupWithNoneControl2("TEST", 3, "test")};
        f67975c = simpleTestGroupWithNoneControl2Arr;
        f67976d = c.a(simpleTestGroupWithNoneControl2Arr);
    }

    public SimpleTestGroupWithNoneControl2(String str, int i12, String str2) {
        this.f67977b = str2;
    }

    public static SimpleTestGroupWithNoneControl2 valueOf(String str) {
        return (SimpleTestGroupWithNoneControl2) Enum.valueOf(SimpleTestGroupWithNoneControl2.class, str);
    }

    public static SimpleTestGroupWithNoneControl2[] values() {
        return (SimpleTestGroupWithNoneControl2[]) f67975c.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67977b() {
        return this.f67977b;
    }
}
