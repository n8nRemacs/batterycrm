package com.huawei.hms.hatool;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f363589b;

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f363590c;

    /* renamed from: d, reason: collision with root package name */
    public static final y0 f363591d;

    /* renamed from: e, reason: collision with root package name */
    public static final y0 f363592e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y0[] f363593f;

    static {
        y0 y0Var = new y0("IMEI", 0);
        f363589b = y0Var;
        y0 y0Var2 = new y0("UDID", 1);
        f363590c = y0Var2;
        y0 y0Var3 = new y0("SN", 2);
        f363591d = y0Var3;
        y0 y0Var4 = new y0("EMPTY", 3);
        f363592e = y0Var4;
        f363593f = new y0[]{y0Var, y0Var2, y0Var3, y0Var4};
    }

    public y0() {
        throw null;
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) f363593f.clone();
    }
}
