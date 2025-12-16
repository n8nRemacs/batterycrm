package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class Field extends GeneratedMessageLite<Field, b> implements InterfaceC22881b0 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile X0<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private C22914m0.k<V0> options_ = C22879a1.f45801e;
    private String jsonName_ = "";
    private String defaultValue_ = "";

    public enum Cardinality implements C22914m0.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);


        /* renamed from: b, reason: collision with root package name */
        public final int f45618b;

        public static class a implements C22914m0.d<Cardinality> {
        }

        public static final class b implements C22914m0.e {
            static {
                new b();
            }

            @Override // androidx.datastore.preferences.protobuf.C22914m0.e
            public final boolean isInRange(int i12) {
                Cardinality cardinality;
                if (i12 == 0) {
                    cardinality = Cardinality.CARDINALITY_UNKNOWN;
                } else if (i12 == 1) {
                    cardinality = Cardinality.CARDINALITY_OPTIONAL;
                } else if (i12 == 2) {
                    cardinality = Cardinality.CARDINALITY_REQUIRED;
                } else if (i12 != 3) {
                    Cardinality cardinality2 = Cardinality.CARDINALITY_UNKNOWN;
                    cardinality = null;
                } else {
                    cardinality = Cardinality.CARDINALITY_REPEATED;
                }
                return cardinality != null;
            }
        }

        static {
            new a();
        }

        Cardinality(int i12) {
            this.f45618b = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.C22914m0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f45618b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum Kind implements C22914m0.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);


        /* renamed from: b, reason: collision with root package name */
        public final int f45640b;

        public static class a implements C22914m0.d<Kind> {
        }

        public static final class b implements C22914m0.e {
            static {
                new b();
            }

            @Override // androidx.datastore.preferences.protobuf.C22914m0.e
            public final boolean isInRange(int i12) {
                return Kind.a(i12) != null;
            }
        }

        static {
            new a();
        }

        Kind(int i12) {
            this.f45640b = i12;
        }

        public static Kind a(int i12) {
            switch (i12) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C22914m0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f45640b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45641a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45641a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45641a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45641a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45641a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45641a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45641a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45641a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Field, b> implements InterfaceC22881b0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(Field.DEFAULT_INSTANCE);
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.o(Field.class, field);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        a aVar = null;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", V0.class, "jsonName_", "defaultValue_"});
            case 3:
                return new Field();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<Field> cVar = PARSER;
                if (cVar == null) {
                    synchronized (Field.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c<>();
                                PARSER = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return cVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
