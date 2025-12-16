package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ZstdTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/ZstdTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ZstdTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final ZstdTestGroup f67935c;

    /* renamed from: d, reason: collision with root package name */
    public static final ZstdTestGroup f67936d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ZstdTestGroup[] f67937e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67938f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67939b;

    static {
        ZstdTestGroup zstdTestGroup = new ZstdTestGroup("NONE", 0, "");
        f67935c = zstdTestGroup;
        ZstdTestGroup zstdTestGroup2 = new ZstdTestGroup("CONTROL", 1, "control");
        ZstdTestGroup zstdTestGroup3 = new ZstdTestGroup("TEST", 2, "test");
        f67936d = zstdTestGroup3;
        ZstdTestGroup[] zstdTestGroupArr = {zstdTestGroup, zstdTestGroup2, zstdTestGroup3};
        f67937e = zstdTestGroupArr;
        f67938f = c.a(zstdTestGroupArr);
    }

    public ZstdTestGroup(String str, int i12, String str2) {
        this.f67939b = str2;
    }

    public static ZstdTestGroup valueOf(String str) {
        return (ZstdTestGroup) Enum.valueOf(ZstdTestGroup.class, str);
    }

    public static ZstdTestGroup[] values() {
        return (ZstdTestGroup[]) f67937e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67955b() {
        return this.f67939b;
    }
}
