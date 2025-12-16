package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class FieldType {

    /* renamed from: c, reason: collision with root package name */
    public static final FieldType f362650c;

    /* renamed from: d, reason: collision with root package name */
    public static final FieldType f362651d;

    /* renamed from: e, reason: collision with root package name */
    public static final FieldType f362652e;

    /* renamed from: f, reason: collision with root package name */
    public static final FieldType f362653f;

    /* renamed from: g, reason: collision with root package name */
    public static final FieldType f362654g;

    /* renamed from: h, reason: collision with root package name */
    public static final FieldType f362655h;

    /* renamed from: i, reason: collision with root package name */
    public static final FieldType[] f362656i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.reflect.Type[] f362657j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ FieldType[] f362658k;

    /* renamed from: b, reason: collision with root package name */
    public final int f362659b;

    /* JADX INFO: Fake field, exist only in values array */
    FieldType EF0;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362660a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f362661b;

        static {
            int[] iArr = new int[JavaType.values().length];
            f362661b = iArr;
            try {
                iArr[JavaType.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362661b[JavaType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr2 = f362661b;
                JavaType javaType = JavaType.VOID;
                iArr2[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[b.values().length];
            f362660a = iArr3;
            try {
                iArr3[3] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362660a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362660a[0] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f362662b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f362663c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f362664d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f362665e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f362666f;

        static {
            b bVar = new b("SCALAR", 0);
            f362662b = bVar;
            b bVar2 = new b("VECTOR", 1);
            f362663c = bVar2;
            b bVar3 = new b("PACKED_VECTOR", 2);
            f362664d = bVar3;
            b bVar4 = new b("MAP", 3);
            f362665e = bVar4;
            f362666f = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public static b valueOf(String str) {
            return (b) java.lang.Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f362666f.clone();
        }
    }

    static {
        b bVar = b.f362662b;
        JavaType javaType = JavaType.DOUBLE;
        FieldType fieldType = new FieldType("DOUBLE", 0, 0, bVar, javaType);
        JavaType javaType2 = JavaType.FLOAT;
        FieldType fieldType2 = new FieldType("FLOAT", 1, 1, bVar, javaType2);
        JavaType javaType3 = JavaType.LONG;
        FieldType fieldType3 = new FieldType("INT64", 2, 2, bVar, javaType3);
        FieldType fieldType4 = new FieldType("UINT64", 3, 3, bVar, javaType3);
        JavaType javaType4 = JavaType.INT;
        FieldType fieldType5 = new FieldType("INT32", 4, 4, bVar, javaType4);
        FieldType fieldType6 = new FieldType("FIXED64", 5, 5, bVar, javaType3);
        FieldType fieldType7 = new FieldType("FIXED32", 6, 6, bVar, javaType4);
        JavaType javaType5 = JavaType.BOOLEAN;
        FieldType fieldType8 = new FieldType("BOOL", 7, 7, bVar, javaType5);
        JavaType javaType6 = JavaType.STRING;
        FieldType fieldType9 = new FieldType("STRING", 8, 8, bVar, javaType6);
        JavaType javaType7 = JavaType.MESSAGE;
        FieldType fieldType10 = new FieldType("MESSAGE", 9, 9, bVar, javaType7);
        f362650c = fieldType10;
        JavaType javaType8 = JavaType.BYTE_STRING;
        FieldType fieldType11 = new FieldType("BYTES", 10, 10, bVar, javaType8);
        FieldType fieldType12 = new FieldType("UINT32", 11, 11, bVar, javaType4);
        JavaType javaType9 = JavaType.ENUM;
        FieldType fieldType13 = new FieldType("ENUM", 12, 12, bVar, javaType9);
        FieldType fieldType14 = new FieldType("SFIXED32", 13, 13, bVar, javaType4);
        FieldType fieldType15 = new FieldType("SFIXED64", 14, 14, bVar, javaType3);
        FieldType fieldType16 = new FieldType("SINT32", 15, 15, bVar, javaType4);
        FieldType fieldType17 = new FieldType("SINT64", 16, 16, bVar, javaType3);
        FieldType fieldType18 = new FieldType("GROUP", 17, 17, bVar, javaType7);
        f362651d = fieldType18;
        b bVar2 = b.f362663c;
        FieldType fieldType19 = new FieldType("DOUBLE_LIST", 18, 18, bVar2, javaType);
        FieldType fieldType20 = new FieldType("FLOAT_LIST", 19, 19, bVar2, javaType2);
        FieldType fieldType21 = new FieldType("INT64_LIST", 20, 20, bVar2, javaType3);
        FieldType fieldType22 = new FieldType("UINT64_LIST", 21, 21, bVar2, javaType3);
        FieldType fieldType23 = new FieldType("INT32_LIST", 22, 22, bVar2, javaType4);
        FieldType fieldType24 = new FieldType("FIXED64_LIST", 23, 23, bVar2, javaType3);
        FieldType fieldType25 = new FieldType("FIXED32_LIST", 24, 24, bVar2, javaType4);
        FieldType fieldType26 = new FieldType("BOOL_LIST", 25, 25, bVar2, javaType5);
        FieldType fieldType27 = new FieldType("STRING_LIST", 26, 26, bVar2, javaType6);
        FieldType fieldType28 = new FieldType("MESSAGE_LIST", 27, 27, bVar2, javaType7);
        f362652e = fieldType28;
        FieldType fieldType29 = new FieldType("BYTES_LIST", 28, 28, bVar2, javaType8);
        FieldType fieldType30 = new FieldType("UINT32_LIST", 29, 29, bVar2, javaType4);
        FieldType fieldType31 = new FieldType("ENUM_LIST", 30, 30, bVar2, javaType9);
        FieldType fieldType32 = new FieldType("SFIXED32_LIST", 31, 31, bVar2, javaType4);
        FieldType fieldType33 = new FieldType("SFIXED64_LIST", 32, 32, bVar2, javaType3);
        FieldType fieldType34 = new FieldType("SINT32_LIST", 33, 33, bVar2, javaType4);
        FieldType fieldType35 = new FieldType("SINT64_LIST", 34, 34, bVar2, javaType3);
        b bVar3 = b.f362664d;
        FieldType fieldType36 = new FieldType("DOUBLE_LIST_PACKED", 35, 35, bVar3, javaType);
        f362653f = fieldType36;
        FieldType fieldType37 = new FieldType("FLOAT_LIST_PACKED", 36, 36, bVar3, javaType2);
        FieldType fieldType38 = new FieldType("INT64_LIST_PACKED", 37, 37, bVar3, javaType3);
        FieldType fieldType39 = new FieldType("UINT64_LIST_PACKED", 38, 38, bVar3, javaType3);
        FieldType fieldType40 = new FieldType("INT32_LIST_PACKED", 39, 39, bVar3, javaType4);
        FieldType fieldType41 = new FieldType("FIXED64_LIST_PACKED", 40, 40, bVar3, javaType3);
        FieldType fieldType42 = new FieldType("FIXED32_LIST_PACKED", 41, 41, bVar3, javaType4);
        FieldType fieldType43 = new FieldType("BOOL_LIST_PACKED", 42, 42, bVar3, javaType5);
        FieldType fieldType44 = new FieldType("UINT32_LIST_PACKED", 43, 43, bVar3, javaType4);
        FieldType fieldType45 = new FieldType("ENUM_LIST_PACKED", 44, 44, bVar3, javaType9);
        FieldType fieldType46 = new FieldType("SFIXED32_LIST_PACKED", 45, 45, bVar3, javaType4);
        FieldType fieldType47 = new FieldType("SFIXED64_LIST_PACKED", 46, 46, bVar3, javaType3);
        FieldType fieldType48 = new FieldType("SINT32_LIST_PACKED", 47, 47, bVar3, javaType4);
        FieldType fieldType49 = new FieldType("SINT64_LIST_PACKED", 48, 48, bVar3, javaType3);
        f362654g = fieldType49;
        FieldType fieldType50 = new FieldType("GROUP_LIST", 49, 49, bVar2, javaType7);
        f362655h = fieldType50;
        f362658k = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18, fieldType19, fieldType20, fieldType21, fieldType22, fieldType23, fieldType24, fieldType25, fieldType26, fieldType27, fieldType28, fieldType29, fieldType30, fieldType31, fieldType32, fieldType33, fieldType34, fieldType35, fieldType36, fieldType37, fieldType38, fieldType39, fieldType40, fieldType41, fieldType42, fieldType43, fieldType44, fieldType45, fieldType46, fieldType47, fieldType48, fieldType49, fieldType50, new FieldType("MAP", 50, 50, b.f362665e, JavaType.VOID)};
        f362657j = new java.lang.reflect.Type[0];
        FieldType[] fieldTypeArrValues = values();
        f362656i = new FieldType[fieldTypeArrValues.length];
        for (FieldType fieldType51 : fieldTypeArrValues) {
            f362656i[fieldType51.f362659b] = fieldType51;
        }
    }

    public FieldType(String str, int i12, int i13, b bVar, JavaType javaType) {
        this.f362659b = i13;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            javaType.getClass();
        }
        if (bVar == b.f362662b) {
            javaType.ordinal();
        }
    }

    public static FieldType valueOf(String str) {
        return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) f362658k.clone();
    }

    public final int a() {
        return this.f362659b;
    }
}
