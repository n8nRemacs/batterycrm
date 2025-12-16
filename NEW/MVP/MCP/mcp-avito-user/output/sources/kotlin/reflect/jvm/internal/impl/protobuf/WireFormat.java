package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes8.dex */
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
        public static final FieldType f409296d;

        /* renamed from: e, reason: collision with root package name */
        public static final FieldType f409297e;

        /* renamed from: f, reason: collision with root package name */
        public static final FieldType f409298f;

        /* renamed from: g, reason: collision with root package name */
        public static final FieldType f409299g;

        /* renamed from: h, reason: collision with root package name */
        public static final FieldType f409300h;

        /* renamed from: i, reason: collision with root package name */
        public static final FieldType f409301i;

        /* renamed from: j, reason: collision with root package name */
        public static final FieldType f409302j;

        /* renamed from: k, reason: collision with root package name */
        public static final FieldType f409303k;

        /* renamed from: l, reason: collision with root package name */
        public static final FieldType f409304l;

        /* renamed from: m, reason: collision with root package name */
        public static final FieldType f409305m;

        /* renamed from: n, reason: collision with root package name */
        public static final FieldType f409306n;

        /* renamed from: o, reason: collision with root package name */
        public static final FieldType f409307o;

        /* renamed from: p, reason: collision with root package name */
        public static final FieldType f409308p;

        /* renamed from: q, reason: collision with root package name */
        public static final FieldType f409309q;

        /* renamed from: r, reason: collision with root package name */
        public static final FieldType f409310r;

        /* renamed from: s, reason: collision with root package name */
        public static final FieldType f409311s;

        /* renamed from: t, reason: collision with root package name */
        public static final FieldType f409312t;

        /* renamed from: u, reason: collision with root package name */
        public static final FieldType f409313u;

        /* renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ FieldType[] f409314v;

        /* renamed from: b, reason: collision with root package name */
        public final JavaType f409315b;

        /* renamed from: c, reason: collision with root package name */
        public final int f409316c;

        public enum a extends FieldType {
        }

        public enum b extends FieldType {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        public enum c extends FieldType {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        public enum d extends FieldType {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f409296d = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            f409297e = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f409298f = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f409299g = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            f409300h = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            f409301i = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            f409302j = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            f409303k = fieldType8;
            a aVar = new a("STRING", 8, JavaType.STRING, 2);
            f409304l = aVar;
            JavaType javaType3 = JavaType.MESSAGE;
            b bVar = new b("GROUP", 9, javaType3, 3);
            f409305m = bVar;
            c cVar = new c("MESSAGE", 10, javaType3, 2);
            f409306n = cVar;
            d dVar = new d("BYTES", 11, JavaType.BYTE_STRING, 2);
            f409307o = dVar;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            f409308p = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            f409309q = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            f409310r = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            f409311s = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            f409312t = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            f409313u = fieldType14;
            f409314v = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, aVar, bVar, cVar, dVar, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) f409314v.clone();
        }

        public boolean a() {
            return !(this instanceof a);
        }

        public FieldType(String str, int i12, JavaType javaType, int i13) {
            this.f409315b = javaType;
            this.f409316c = i13;
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(d.f409332b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: b, reason: collision with root package name */
        public final Object f409327b;

        JavaType(Object obj) {
            this.f409327b = obj;
        }
    }
}
