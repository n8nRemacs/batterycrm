package com.avito.beduin.v2.engine.exception;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinExceptionType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/BeduinExceptionType;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BeduinExceptionType {

    /* renamed from: b, reason: collision with root package name */
    public static final BeduinExceptionType f336704b;

    /* renamed from: c, reason: collision with root package name */
    public static final BeduinExceptionType f336705c;

    /* renamed from: d, reason: collision with root package name */
    public static final BeduinExceptionType f336706d;

    /* renamed from: e, reason: collision with root package name */
    public static final BeduinExceptionType f336707e;

    /* renamed from: f, reason: collision with root package name */
    public static final BeduinExceptionType f336708f;

    /* renamed from: g, reason: collision with root package name */
    public static final BeduinExceptionType f336709g;

    /* renamed from: h, reason: collision with root package name */
    public static final BeduinExceptionType f336710h;

    /* renamed from: i, reason: collision with root package name */
    public static final BeduinExceptionType f336711i;

    /* renamed from: j, reason: collision with root package name */
    public static final BeduinExceptionType f336712j;

    /* renamed from: k, reason: collision with root package name */
    public static final BeduinExceptionType f336713k;

    /* renamed from: l, reason: collision with root package name */
    public static final BeduinExceptionType f336714l;

    /* renamed from: m, reason: collision with root package name */
    public static final BeduinExceptionType f336715m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ BeduinExceptionType[] f336716n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a f336717o;

    static {
        BeduinExceptionType beduinExceptionType = new BeduinExceptionType("UnregisteredComponentState", 0);
        f336704b = beduinExceptionType;
        BeduinExceptionType beduinExceptionType2 = new BeduinExceptionType("UnregisteredFunction", 1);
        f336705c = beduinExceptionType2;
        BeduinExceptionType beduinExceptionType3 = new BeduinExceptionType("UnregisteredInteraction", 2);
        f336706d = beduinExceptionType3;
        BeduinExceptionType beduinExceptionType4 = new BeduinExceptionType("UnregisteredInteractionHandler", 3);
        f336707e = beduinExceptionType4;
        BeduinExceptionType beduinExceptionType5 = new BeduinExceptionType("Interaction", 4);
        f336708f = beduinExceptionType5;
        BeduinExceptionType beduinExceptionType6 = new BeduinExceptionType("CreateComponent", 5);
        f336709g = beduinExceptionType6;
        BeduinExceptionType beduinExceptionType7 = new BeduinExceptionType("ComponentProperty", 6);
        f336710h = beduinExceptionType7;
        BeduinExceptionType beduinExceptionType8 = new BeduinExceptionType("Engine", 7);
        f336711i = beduinExceptionType8;
        BeduinExceptionType beduinExceptionType9 = new BeduinExceptionType("Function", 8);
        f336712j = beduinExceptionType9;
        BeduinExceptionType beduinExceptionType10 = new BeduinExceptionType("MetaFunction", 9);
        f336713k = beduinExceptionType10;
        BeduinExceptionType beduinExceptionType11 = new BeduinExceptionType("BindState", 10);
        f336714l = beduinExceptionType11;
        BeduinExceptionType beduinExceptionType12 = new BeduinExceptionType("UnregisteredComponent", 11);
        f336715m = beduinExceptionType12;
        BeduinExceptionType[] beduinExceptionTypeArr = {beduinExceptionType, beduinExceptionType2, beduinExceptionType3, beduinExceptionType4, beduinExceptionType5, beduinExceptionType6, beduinExceptionType7, beduinExceptionType8, beduinExceptionType9, beduinExceptionType10, beduinExceptionType11, beduinExceptionType12};
        f336716n = beduinExceptionTypeArr;
        f336717o = c.a(beduinExceptionTypeArr);
    }

    public BeduinExceptionType() {
        throw null;
    }

    public static BeduinExceptionType valueOf(String str) {
        return (BeduinExceptionType) Enum.valueOf(BeduinExceptionType.class, str);
    }

    public static BeduinExceptionType[] values() {
        return (BeduinExceptionType[]) f336716n.clone();
    }
}
