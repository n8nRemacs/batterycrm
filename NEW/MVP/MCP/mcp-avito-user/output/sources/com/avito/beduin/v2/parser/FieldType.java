package com.avito.beduin.v2.parser;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/parser/FieldType;", "", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FieldType {

    /* renamed from: c, reason: collision with root package name */
    public static final FieldType f337869c;

    /* renamed from: d, reason: collision with root package name */
    public static final FieldType f337870d;

    /* renamed from: e, reason: collision with root package name */
    public static final FieldType f337871e;

    /* renamed from: f, reason: collision with root package name */
    public static final FieldType f337872f;

    /* renamed from: g, reason: collision with root package name */
    public static final FieldType f337873g;

    /* renamed from: h, reason: collision with root package name */
    public static final FieldType f337874h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ FieldType[] f337875i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f337876j;

    /* renamed from: b, reason: collision with root package name */
    public final String f337877b;

    static {
        FieldType fieldType = new FieldType("INTERACTION", 0, "Interaction");
        f337869c = fieldType;
        FieldType fieldType2 = new FieldType("STRUCTURE", 1, "Structure");
        f337870d = fieldType2;
        FieldType fieldType3 = new FieldType("PRIMITIVE", 2, "Primitive");
        f337871e = fieldType3;
        FieldType fieldType4 = new FieldType("COMPONENT", 3, "Component");
        f337872f = fieldType4;
        FieldType fieldType5 = new FieldType("FUNCTION", 4, "Function");
        f337873g = fieldType5;
        FieldType fieldType6 = new FieldType("INLINE", 5, "Inline");
        FieldType fieldType7 = new FieldType("REFERENCE", 6, "Reference");
        f337874h = fieldType7;
        FieldType[] fieldTypeArr = {fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7};
        f337875i = fieldTypeArr;
        f337876j = c.a(fieldTypeArr);
    }

    public FieldType(String str, int i12, String str2) {
        this.f337877b = str2;
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) f337875i.clone();
    }
}
