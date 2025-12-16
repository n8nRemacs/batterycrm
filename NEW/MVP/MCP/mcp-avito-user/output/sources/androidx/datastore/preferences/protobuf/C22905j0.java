package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Int64Value.java */
/* renamed from: androidx.datastore.preferences.protobuf.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22905j0 extends GeneratedMessageLite<C22905j0, b> implements InterfaceC22908k0 {
    private static final C22905j0 DEFAULT_INSTANCE;
    private static volatile X0<C22905j0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* compiled from: Int64Value.java */
    /* renamed from: androidx.datastore.preferences.protobuf.j0$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45847a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45847a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45847a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45847a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45847a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45847a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45847a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45847a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Int64Value.java */
    /* renamed from: androidx.datastore.preferences.protobuf.j0$b */
    public static final class b extends GeneratedMessageLite.b<C22905j0, b> implements InterfaceC22908k0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C22905j0.DEFAULT_INSTANCE);
        }
    }

    static {
        C22905j0 c22905j0 = new C22905j0();
        DEFAULT_INSTANCE = c22905j0;
        GeneratedMessageLite.o(C22905j0.class, c22905j0);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 3:
                return new C22905j0();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<C22905j0> cVar = PARSER;
                if (cVar == null) {
                    synchronized (C22905j0.class) {
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
