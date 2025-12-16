package com.yandex.metrica.billing_interface;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f377619b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f377620c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f377621d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f377622e;

    static {
        e eVar = new e("INAPP", 0);
        f377619b = eVar;
        e eVar2 = new e("SUBS", 1);
        f377620c = eVar2;
        e eVar3 = new e(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        f377621d = eVar3;
        f377622e = new e[]{eVar, eVar2, eVar3};
    }

    public e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f377622e.clone();
    }
}
