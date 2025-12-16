package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: StringValue.java */
/* loaded from: classes.dex */
public final class o1 extends GeneratedMessageLite<o1, b> implements p1 {
    private static final o1 DEFAULT_INSTANCE;
    private static volatile X0<o1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* compiled from: StringValue.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45882a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45882a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45882a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45882a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45882a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45882a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45882a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45882a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: StringValue.java */
    public static final class b extends GeneratedMessageLite.b<o1, b> implements p1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(o1.DEFAULT_INSTANCE);
        }
    }

    static {
        o1 o1Var = new o1();
        DEFAULT_INSTANCE = o1Var;
        GeneratedMessageLite.o(o1.class, o1Var);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 3:
                return new o1();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<o1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (o1.class) {
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
