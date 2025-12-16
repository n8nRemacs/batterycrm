package com.fasterxml.jackson.databind.cfg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CoercionAction {

    /* renamed from: b, reason: collision with root package name */
    public static final CoercionAction f341460b;

    /* renamed from: c, reason: collision with root package name */
    public static final CoercionAction f341461c;

    /* renamed from: d, reason: collision with root package name */
    public static final CoercionAction f341462d;

    /* renamed from: e, reason: collision with root package name */
    public static final CoercionAction f341463e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CoercionAction[] f341464f;

    static {
        CoercionAction coercionAction = new CoercionAction("Fail", 0);
        f341460b = coercionAction;
        CoercionAction coercionAction2 = new CoercionAction("TryConvert", 1);
        f341461c = coercionAction2;
        CoercionAction coercionAction3 = new CoercionAction("AsNull", 2);
        f341462d = coercionAction3;
        CoercionAction coercionAction4 = new CoercionAction("AsEmpty", 3);
        f341463e = coercionAction4;
        f341464f = new CoercionAction[]{coercionAction, coercionAction2, coercionAction3, coercionAction4};
    }

    public CoercionAction() {
        throw null;
    }

    public static CoercionAction valueOf(String str) {
        return (CoercionAction) Enum.valueOf(CoercionAction.class, str);
    }

    public static CoercionAction[] values() {
        return (CoercionAction[]) f341464f.clone();
    }
}
