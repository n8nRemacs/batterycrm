package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: BytesValue.java */
/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22936x extends GeneratedMessageLite<C22936x, b> implements InterfaceC22938y {
    private static final C22936x DEFAULT_INSTANCE;
    private static volatile X0<C22936x> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private AbstractC22934w value_ = AbstractC22934w.f45925c;

    /* compiled from: BytesValue.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45939a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45939a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45939a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45939a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45939a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45939a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45939a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45939a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BytesValue.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x$b */
    public static final class b extends GeneratedMessageLite.b<C22936x, b> implements InterfaceC22938y {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C22936x.DEFAULT_INSTANCE);
        }
    }

    static {
        C22936x c22936x = new C22936x();
        DEFAULT_INSTANCE = c22936x;
        GeneratedMessageLite.o(C22936x.class, c22936x);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 3:
                return new C22936x();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<C22936x> cVar = PARSER;
                if (cVar == null) {
                    synchronized (C22936x.class) {
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
