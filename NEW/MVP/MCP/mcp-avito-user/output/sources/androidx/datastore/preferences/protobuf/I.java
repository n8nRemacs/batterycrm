package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Empty.java */
/* loaded from: classes.dex */
public final class I extends GeneratedMessageLite<I, b> implements J {
    private static final I DEFAULT_INSTANCE;
    private static volatile X0<I> PARSER;

    /* compiled from: Empty.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45677a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45677a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45677a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45677a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45677a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45677a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45677a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45677a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Empty.java */
    public static final class b extends GeneratedMessageLite.b<I, b> implements J {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(I.DEFAULT_INSTANCE);
        }
    }

    static {
        I i12 = new I();
        DEFAULT_INSTANCE = i12;
        GeneratedMessageLite.o(I.class, i12);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new I();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<I> cVar = PARSER;
                if (cVar == null) {
                    synchronized (I.class) {
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
