package com.fasterxml.jackson.databind.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LogicalType {

    /* renamed from: b, reason: collision with root package name */
    public static final LogicalType f342432b;

    /* renamed from: c, reason: collision with root package name */
    public static final LogicalType f342433c;

    /* renamed from: d, reason: collision with root package name */
    public static final LogicalType f342434d;

    /* renamed from: e, reason: collision with root package name */
    public static final LogicalType f342435e;

    /* renamed from: f, reason: collision with root package name */
    public static final LogicalType f342436f;

    /* renamed from: g, reason: collision with root package name */
    public static final LogicalType f342437g;

    /* renamed from: h, reason: collision with root package name */
    public static final LogicalType f342438h;

    /* renamed from: i, reason: collision with root package name */
    public static final LogicalType f342439i;

    /* renamed from: j, reason: collision with root package name */
    public static final LogicalType f342440j;

    /* renamed from: k, reason: collision with root package name */
    public static final LogicalType f342441k;

    /* renamed from: l, reason: collision with root package name */
    public static final LogicalType f342442l;

    /* renamed from: m, reason: collision with root package name */
    public static final LogicalType f342443m;

    /* renamed from: n, reason: collision with root package name */
    public static final LogicalType f342444n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ LogicalType[] f342445o;

    static {
        LogicalType logicalType = new LogicalType("Array", 0);
        f342432b = logicalType;
        LogicalType logicalType2 = new LogicalType("Collection", 1);
        f342433c = logicalType2;
        LogicalType logicalType3 = new LogicalType("Map", 2);
        f342434d = logicalType3;
        LogicalType logicalType4 = new LogicalType("POJO", 3);
        f342435e = logicalType4;
        LogicalType logicalType5 = new LogicalType("Untyped", 4);
        f342436f = logicalType5;
        LogicalType logicalType6 = new LogicalType("Integer", 5);
        f342437g = logicalType6;
        LogicalType logicalType7 = new LogicalType("Float", 6);
        f342438h = logicalType7;
        LogicalType logicalType8 = new LogicalType("Boolean", 7);
        f342439i = logicalType8;
        LogicalType logicalType9 = new LogicalType("Enum", 8);
        f342440j = logicalType9;
        LogicalType logicalType10 = new LogicalType("Textual", 9);
        f342441k = logicalType10;
        LogicalType logicalType11 = new LogicalType("Binary", 10);
        f342442l = logicalType11;
        LogicalType logicalType12 = new LogicalType("DateTime", 11);
        f342443m = logicalType12;
        LogicalType logicalType13 = new LogicalType("OtherScalar", 12);
        f342444n = logicalType13;
        f342445o = new LogicalType[]{logicalType, logicalType2, logicalType3, logicalType4, logicalType5, logicalType6, logicalType7, logicalType8, logicalType9, logicalType10, logicalType11, logicalType12, logicalType13};
    }

    public LogicalType() {
        throw null;
    }

    public static LogicalType valueOf(String str) {
        return (LogicalType) Enum.valueOf(LogicalType.class, str);
    }

    public static LogicalType[] values() {
        return (LogicalType[]) f342445o.clone();
    }
}
