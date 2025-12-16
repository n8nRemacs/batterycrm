package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: BoolValue.java */
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22923q extends GeneratedMessageLite<C22923q, b> implements r {
    private static final C22923q DEFAULT_INSTANCE;
    private static volatile X0<C22923q> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    /* compiled from: BoolValue.java */
    /* renamed from: androidx.datastore.preferences.protobuf.q$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45911a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45911a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45911a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45911a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45911a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45911a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45911a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45911a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BoolValue.java */
    /* renamed from: androidx.datastore.preferences.protobuf.q$b */
    public static final class b extends GeneratedMessageLite.b<C22923q, b> implements r {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C22923q.DEFAULT_INSTANCE);
        }
    }

    static {
        C22923q c22923q = new C22923q();
        DEFAULT_INSTANCE = c22923q;
        GeneratedMessageLite.o(C22923q.class, c22923q);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 3:
                return new C22923q();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<C22923q> cVar = PARSER;
                if (cVar == null) {
                    synchronized (C22923q.class) {
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
