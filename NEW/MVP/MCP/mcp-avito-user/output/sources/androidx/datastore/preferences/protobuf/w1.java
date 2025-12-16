package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Timestamp.java */
/* loaded from: classes.dex */
public final class w1 extends GeneratedMessageLite<w1, b> implements x1 {
    private static final w1 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile X0<w1> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* compiled from: Timestamp.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45938a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45938a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45938a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45938a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45938a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45938a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45938a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45938a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Timestamp.java */
    public static final class b extends GeneratedMessageLite.b<w1, b> implements x1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(w1.DEFAULT_INSTANCE);
        }
    }

    static {
        w1 w1Var = new w1();
        DEFAULT_INSTANCE = w1Var;
        GeneratedMessageLite.o(w1.class, w1Var);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new w1();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<w1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (w1.class) {
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
