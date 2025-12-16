package com.google.protobuf;

import java.io.Serializable;

/* loaded from: classes7.dex */
public final class WireFormat {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class FieldType {

        /* renamed from: d, reason: collision with root package name */
        public static final FieldType f362789d;

        /* renamed from: e, reason: collision with root package name */
        public static final FieldType f362790e;

        /* renamed from: f, reason: collision with root package name */
        public static final FieldType f362791f;

        /* renamed from: g, reason: collision with root package name */
        public static final FieldType f362792g;

        /* renamed from: h, reason: collision with root package name */
        public static final FieldType f362793h;

        /* renamed from: i, reason: collision with root package name */
        public static final FieldType f362794i;

        /* renamed from: j, reason: collision with root package name */
        public static final FieldType f362795j;

        /* renamed from: k, reason: collision with root package name */
        public static final FieldType f362796k;

        /* renamed from: l, reason: collision with root package name */
        public static final FieldType f362797l;

        /* renamed from: m, reason: collision with root package name */
        public static final FieldType f362798m;

        /* renamed from: n, reason: collision with root package name */
        public static final FieldType f362799n;

        /* renamed from: o, reason: collision with root package name */
        public static final FieldType f362800o;

        /* renamed from: p, reason: collision with root package name */
        public static final FieldType f362801p;

        /* renamed from: q, reason: collision with root package name */
        public static final FieldType f362802q;

        /* renamed from: r, reason: collision with root package name */
        public static final FieldType f362803r;

        /* renamed from: s, reason: collision with root package name */
        public static final FieldType f362804s;

        /* renamed from: t, reason: collision with root package name */
        public static final FieldType f362805t;

        /* renamed from: u, reason: collision with root package name */
        public static final FieldType f362806u;

        /* renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ FieldType[] f362807v;

        /* renamed from: b, reason: collision with root package name */
        public final JavaType f362808b;

        /* renamed from: c, reason: collision with root package name */
        public final int f362809c;

        public enum a extends FieldType {
        }

        public enum b extends FieldType {
            @Override // com.google.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        public enum c extends FieldType {
            @Override // com.google.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        public enum d extends FieldType {
            @Override // com.google.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f362789d = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            f362790e = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f362791f = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f362792g = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            f362793h = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            f362794i = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            f362795j = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            f362796k = fieldType8;
            a aVar = new a("STRING", 8, JavaType.STRING, 2, null);
            f362797l = aVar;
            JavaType javaType3 = JavaType.MESSAGE;
            b bVar = new b("GROUP", 9, javaType3, 3, null);
            f362798m = bVar;
            c cVar = new c("MESSAGE", 10, javaType3, 2, null);
            f362799n = cVar;
            d dVar = new d("BYTES", 11, JavaType.BYTE_STRING, 2, null);
            f362800o = dVar;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            f362801p = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            f362802q = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            f362803r = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            f362804s = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            f362805t = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            f362806u = fieldType14;
            f362807v = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, aVar, bVar, cVar, dVar, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        public /* synthetic */ FieldType(String str, int i12, JavaType javaType, int i13, a aVar) {
            this(str, i12, javaType, i13);
        }

        public static FieldType valueOf(String str) {
            return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) f362807v.clone();
        }

        public boolean a() {
            return !(this instanceof a);
        }

        public FieldType(String str, int i12, JavaType javaType, int i13) {
            this.f362808b = javaType;
            this.f362809c = i13;
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC37700t.f362954c),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: b, reason: collision with root package name */
        public final Serializable f362820b;

        JavaType(Serializable serializable) {
            this.f362820b = serializable;
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362821a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f362821a = iArr;
            try {
                iArr[FieldType.f362789d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362821a[FieldType.f362790e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362821a[FieldType.f362791f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362821a[FieldType.f362792g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362821a[FieldType.f362793h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362821a[FieldType.f362794i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362821a[FieldType.f362795j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f362821a[FieldType.f362796k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f362821a[FieldType.f362800o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f362821a[FieldType.f362801p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f362821a[FieldType.f362803r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f362821a[FieldType.f362804s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f362821a[FieldType.f362805t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f362821a[FieldType.f362806u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f362821a[FieldType.f362797l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f362821a[FieldType.f362798m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f362821a[FieldType.f362799n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f362821a[FieldType.f362802q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f362822b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b[] f362823c;

        public enum a extends b {
            @Override // com.google.protobuf.WireFormat.b
            public final Object a(AbstractC37708x abstractC37708x) {
                return abstractC37708x.D();
            }
        }

        /* renamed from: com.google.protobuf.WireFormat$b$b, reason: collision with other inner class name */
        public enum C10746b extends b {
            @Override // com.google.protobuf.WireFormat.b
            public final Object a(AbstractC37708x abstractC37708x) {
                return abstractC37708x.E();
            }
        }

        public enum c extends b {
            @Override // com.google.protobuf.WireFormat.b
            public final Object a(AbstractC37708x abstractC37708x) {
                return abstractC37708x.n();
            }
        }

        static {
            a aVar = new a("LOOSE", 0, null);
            f362822b = aVar;
            f362823c = new b[]{aVar, new C10746b("STRICT", 1, null), new c("LAZY", 2, null)};
        }

        public b() {
            throw null;
        }

        public b(String str, int i12, a aVar) {
        }

        public static b valueOf(String str) {
            return (b) java.lang.Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f362823c.clone();
        }

        public abstract Object a(AbstractC37708x abstractC37708x);
    }

    public static Object a(AbstractC37708x abstractC37708x, FieldType fieldType, b bVar) {
        switch (a.f362821a[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC37708x.o());
            case 2:
                return Float.valueOf(abstractC37708x.s());
            case 3:
                return Long.valueOf(abstractC37708x.v());
            case 4:
                return Long.valueOf(abstractC37708x.H());
            case 5:
                return Integer.valueOf(abstractC37708x.u());
            case 6:
                return Long.valueOf(abstractC37708x.r());
            case 7:
                return Integer.valueOf(abstractC37708x.q());
            case 8:
                return Boolean.valueOf(abstractC37708x.m());
            case 9:
                return abstractC37708x.n();
            case 10:
                return Integer.valueOf(abstractC37708x.G());
            case 11:
                return Integer.valueOf(abstractC37708x.z());
            case 12:
                return Long.valueOf(abstractC37708x.A());
            case 13:
                return Integer.valueOf(abstractC37708x.B());
            case 14:
                return Long.valueOf(abstractC37708x.C());
            case 15:
                return bVar.a(abstractC37708x);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
