package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class Value extends GeneratedMessageLite<Value, b> implements M1 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile X0<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KindCase {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ KindCase[] f45754b = {new KindCase("NULL_VALUE", 0), new KindCase("NUMBER_VALUE", 1), new KindCase("STRING_VALUE", 2), new KindCase("BOOL_VALUE", 3), new KindCase("STRUCT_VALUE", 4), new KindCase("LIST_VALUE", 5), new KindCase("KIND_NOT_SET", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        KindCase EF5;

        public KindCase() {
            throw null;
        }

        public static KindCase valueOf(String str) {
            return (KindCase) Enum.valueOf(KindCase.class, str);
        }

        public static KindCase[] values() {
            return (KindCase[]) f45754b.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45755a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45755a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45755a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45755a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45755a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45755a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45755a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45755a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Value, b> implements M1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(Value.DEFAULT_INSTANCE);
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.o(Value.class, value);
    }

    public static Value q() {
        return DEFAULT_INSTANCE;
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", q1.class, C22931u0.class});
            case 3:
                return new Value();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<Value> cVar = PARSER;
                if (cVar == null) {
                    synchronized (Value.class) {
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
