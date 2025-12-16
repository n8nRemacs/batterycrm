package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: UInt32Value.java */
/* loaded from: classes.dex */
public final class C1 extends GeneratedMessageLite<C1, b> implements D1 {
    private static final C1 DEFAULT_INSTANCE;
    private static volatile X0<C1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* compiled from: UInt32Value.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45597a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45597a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45597a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45597a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45597a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45597a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45597a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45597a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: UInt32Value.java */
    public static final class b extends GeneratedMessageLite.b<C1, b> implements D1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C1.DEFAULT_INSTANCE);
        }
    }

    static {
        C1 c12 = new C1();
        DEFAULT_INSTANCE = c12;
        GeneratedMessageLite.o(C1.class, c12);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 3:
                return new C1();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<C1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (C1.class) {
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
