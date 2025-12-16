package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Duration.java */
/* loaded from: classes.dex */
public final class F extends GeneratedMessageLite<F, b> implements G {
    private static final F DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile X0<F> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* compiled from: Duration.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45611a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45611a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45611a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45611a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45611a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45611a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45611a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45611a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Duration.java */
    public static final class b extends GeneratedMessageLite.b<F, b> implements G {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(F.DEFAULT_INSTANCE);
        }
    }

    static {
        F f12 = new F();
        DEFAULT_INSTANCE = f12;
        GeneratedMessageLite.o(F.class, f12);
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
                return new F();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<F> cVar = PARSER;
                if (cVar == null) {
                    synchronized (F.class) {
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
