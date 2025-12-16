package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: FieldMask.java */
/* loaded from: classes.dex */
public final class Y extends GeneratedMessageLite<Y, b> implements Z {
    private static final Y DEFAULT_INSTANCE;
    private static volatile X0<Y> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private C22914m0.k<String> paths_ = C22879a1.f45801e;

    /* compiled from: FieldMask.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45796a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45796a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45796a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45796a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45796a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45796a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45796a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45796a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: FieldMask.java */
    public static final class b extends GeneratedMessageLite.b<Y, b> implements Z {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(Y.DEFAULT_INSTANCE);
        }
    }

    static {
        Y y12 = new Y();
        DEFAULT_INSTANCE = y12;
        GeneratedMessageLite.o(Y.class, y12);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 3:
                return new Y();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<Y> cVar = PARSER;
                if (cVar == null) {
                    synchronized (Y.class) {
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
