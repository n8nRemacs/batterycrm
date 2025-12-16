package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
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
        public static final FieldType f45758d;

        /* renamed from: e, reason: collision with root package name */
        public static final FieldType f45759e;

        /* renamed from: f, reason: collision with root package name */
        public static final FieldType f45760f;

        /* renamed from: g, reason: collision with root package name */
        public static final FieldType f45761g;

        /* renamed from: h, reason: collision with root package name */
        public static final FieldType f45762h;

        /* renamed from: i, reason: collision with root package name */
        public static final FieldType f45763i;

        /* renamed from: j, reason: collision with root package name */
        public static final FieldType f45764j;

        /* renamed from: k, reason: collision with root package name */
        public static final FieldType f45765k;

        /* renamed from: l, reason: collision with root package name */
        public static final FieldType f45766l;

        /* renamed from: m, reason: collision with root package name */
        public static final FieldType f45767m;

        /* renamed from: n, reason: collision with root package name */
        public static final FieldType f45768n;

        /* renamed from: o, reason: collision with root package name */
        public static final FieldType f45769o;

        /* renamed from: p, reason: collision with root package name */
        public static final FieldType f45770p;

        /* renamed from: q, reason: collision with root package name */
        public static final FieldType f45771q;

        /* renamed from: r, reason: collision with root package name */
        public static final FieldType f45772r;

        /* renamed from: s, reason: collision with root package name */
        public static final FieldType f45773s;

        /* renamed from: t, reason: collision with root package name */
        public static final FieldType f45774t;

        /* renamed from: u, reason: collision with root package name */
        public static final FieldType f45775u;

        /* renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ FieldType[] f45776v;

        /* renamed from: b, reason: collision with root package name */
        public final JavaType f45777b;

        /* renamed from: c, reason: collision with root package name */
        public final int f45778c;

        public enum a extends FieldType {
        }

        public enum b extends FieldType {
        }

        public enum c extends FieldType {
        }

        public enum d extends FieldType {
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f45758d = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            f45759e = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f45760f = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f45761g = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            f45762h = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            f45763i = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            f45764j = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            f45765k = fieldType8;
            a aVar = new a("STRING", 8, JavaType.STRING, 2, null);
            f45766l = aVar;
            JavaType javaType3 = JavaType.MESSAGE;
            b bVar = new b("GROUP", 9, javaType3, 3, null);
            f45767m = bVar;
            c cVar = new c("MESSAGE", 10, javaType3, 2, null);
            f45768n = cVar;
            d dVar = new d("BYTES", 11, JavaType.BYTE_STRING, 2, null);
            f45769o = dVar;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            f45770p = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            f45771q = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            f45772r = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            f45773s = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            f45774t = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            f45775u = fieldType14;
            f45776v = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, aVar, bVar, cVar, dVar, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        public /* synthetic */ FieldType(String str, int i12, JavaType javaType, int i13, a aVar) {
            this(str, i12, javaType, i13);
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) f45776v.clone();
        }

        public FieldType(String str, int i12, JavaType javaType, int i13) {
            this.f45777b = javaType;
            this.f45778c = i13;
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC22934w.f45925c),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: b, reason: collision with root package name */
        public final Serializable f45789b;

        JavaType(Serializable serializable) {
            this.f45789b = serializable;
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45790a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f45790a = iArr;
            try {
                iArr[FieldType.f45758d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45790a[FieldType.f45759e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45790a[FieldType.f45760f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45790a[FieldType.f45761g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45790a[FieldType.f45762h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45790a[FieldType.f45763i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45790a[FieldType.f45764j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45790a[FieldType.f45765k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45790a[FieldType.f45769o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45790a[FieldType.f45770p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45790a[FieldType.f45772r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45790a[FieldType.f45773s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45790a[FieldType.f45774t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45790a[FieldType.f45775u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45790a[FieldType.f45766l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45790a[FieldType.f45767m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f45790a[FieldType.f45768n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f45790a[FieldType.f45771q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f45791b = {new a("LOOSE", 0, null), new C1778b("STRICT", 1, null), new c("LAZY", 2, null)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF8;

        public enum a extends b {
        }

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$b$b, reason: collision with other inner class name */
        public enum C1778b extends b {
        }

        public enum c extends b {
        }

        public b() {
            throw null;
        }

        public b(String str, int i12, a aVar) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f45791b.clone();
        }
    }
}
