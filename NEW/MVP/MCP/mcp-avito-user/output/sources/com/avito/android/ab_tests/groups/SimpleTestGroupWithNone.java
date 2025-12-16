package com.avito.android.ab_tests.groups;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimpleTestGroupWithNone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "", "Lu3/j;", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SimpleTestGroupWithNone implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final SimpleTestGroupWithNone f67969c;

    /* renamed from: d, reason: collision with root package name */
    public static final SimpleTestGroupWithNone f67970d;

    /* renamed from: e, reason: collision with root package name */
    public static final SimpleTestGroupWithNone f67971e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ SimpleTestGroupWithNone[] f67972f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67973g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67974b;

    static {
        SimpleTestGroupWithNone simpleTestGroupWithNone = new SimpleTestGroupWithNone("NONE", 0, "");
        f67969c = simpleTestGroupWithNone;
        SimpleTestGroupWithNone simpleTestGroupWithNone2 = new SimpleTestGroupWithNone("CONTROL", 1, "control");
        f67970d = simpleTestGroupWithNone2;
        SimpleTestGroupWithNone simpleTestGroupWithNone3 = new SimpleTestGroupWithNone("TEST", 2, "test");
        f67971e = simpleTestGroupWithNone3;
        SimpleTestGroupWithNone[] simpleTestGroupWithNoneArr = {simpleTestGroupWithNone, simpleTestGroupWithNone2, simpleTestGroupWithNone3};
        f67972f = simpleTestGroupWithNoneArr;
        f67973g = c.a(simpleTestGroupWithNoneArr);
    }

    public SimpleTestGroupWithNone(String str, int i12, String str2) {
        this.f67974b = str2;
    }

    public static SimpleTestGroupWithNone valueOf(String str) {
        return (SimpleTestGroupWithNone) Enum.valueOf(SimpleTestGroupWithNone.class, str);
    }

    public static SimpleTestGroupWithNone[] values() {
        return (SimpleTestGroupWithNone[]) f67972f.clone();
    }

    public final boolean a() {
        return this != f67969c;
    }

    public final boolean b() {
        return this == f67971e;
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67974b() {
        return this.f67974b;
    }
}
