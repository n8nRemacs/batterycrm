package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: DoubleValue.java */
/* loaded from: classes.dex */
public final class D extends GeneratedMessageLite<D, b> implements E {
    private static final D DEFAULT_INSTANCE;
    private static volatile X0<D> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    /* compiled from: DoubleValue.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45609a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45609a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45609a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45609a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45609a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45609a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45609a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45609a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: DoubleValue.java */
    public static final class b extends GeneratedMessageLite.b<D, b> implements E {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(D.DEFAULT_INSTANCE);
        }
    }

    static {
        D d12 = new D();
        DEFAULT_INSTANCE = d12;
        GeneratedMessageLite.o(D.class, d12);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 3:
                return new D();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<D> cVar = PARSER;
                if (cVar == null) {
                    synchronized (D.class) {
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
