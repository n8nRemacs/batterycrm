package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: UInt64Value.java */
/* loaded from: classes.dex */
public final class E1 extends GeneratedMessageLite<E1, b> implements F1 {
    private static final E1 DEFAULT_INSTANCE;
    private static volatile X0<E1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* compiled from: UInt64Value.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45610a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45610a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45610a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45610a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45610a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45610a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45610a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45610a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: UInt64Value.java */
    public static final class b extends GeneratedMessageLite.b<E1, b> implements F1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(E1.DEFAULT_INSTANCE);
        }
    }

    static {
        E1 e12 = new E1();
        DEFAULT_INSTANCE = e12;
        GeneratedMessageLite.o(E1.class, e12);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 3:
                return new E1();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<E1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (E1.class) {
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
