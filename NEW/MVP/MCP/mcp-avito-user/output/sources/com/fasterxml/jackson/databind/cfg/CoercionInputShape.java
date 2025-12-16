package com.fasterxml.jackson.databind.cfg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CoercionInputShape {

    /* renamed from: b, reason: collision with root package name */
    public static final CoercionInputShape f341465b;

    /* renamed from: c, reason: collision with root package name */
    public static final CoercionInputShape f341466c;

    /* renamed from: d, reason: collision with root package name */
    public static final CoercionInputShape f341467d;

    /* renamed from: e, reason: collision with root package name */
    public static final CoercionInputShape f341468e;

    /* renamed from: f, reason: collision with root package name */
    public static final CoercionInputShape f341469f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CoercionInputShape[] f341470g;

    /* JADX INFO: Fake field, exist only in values array */
    CoercionInputShape EF0;

    static {
        CoercionInputShape coercionInputShape = new CoercionInputShape("Array", 0);
        CoercionInputShape coercionInputShape2 = new CoercionInputShape("Object", 1);
        CoercionInputShape coercionInputShape3 = new CoercionInputShape("Integer", 2);
        f341465b = coercionInputShape3;
        CoercionInputShape coercionInputShape4 = new CoercionInputShape("Float", 3);
        f341466c = coercionInputShape4;
        CoercionInputShape coercionInputShape5 = new CoercionInputShape("Boolean", 4);
        CoercionInputShape coercionInputShape6 = new CoercionInputShape("String", 5);
        f341467d = coercionInputShape6;
        CoercionInputShape coercionInputShape7 = new CoercionInputShape("Binary", 6);
        CoercionInputShape coercionInputShape8 = new CoercionInputShape("EmptyArray", 7);
        f341468e = coercionInputShape8;
        CoercionInputShape coercionInputShape9 = new CoercionInputShape("EmptyObject", 8);
        CoercionInputShape coercionInputShape10 = new CoercionInputShape("EmptyString", 9);
        f341469f = coercionInputShape10;
        f341470g = new CoercionInputShape[]{coercionInputShape, coercionInputShape2, coercionInputShape3, coercionInputShape4, coercionInputShape5, coercionInputShape6, coercionInputShape7, coercionInputShape8, coercionInputShape9, coercionInputShape10};
    }

    public CoercionInputShape() {
        throw null;
    }

    public static CoercionInputShape valueOf(String str) {
        return (CoercionInputShape) Enum.valueOf(CoercionInputShape.class, str);
    }

    public static CoercionInputShape[] values() {
        return (CoercionInputShape[]) f341470g.clone();
    }
}
