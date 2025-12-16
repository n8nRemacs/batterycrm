package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Mixin.java */
/* loaded from: classes.dex */
public final class M0 extends GeneratedMessageLite<M0, b> implements N0 {
    private static final M0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile X0<M0> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* compiled from: Mixin.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45729a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45729a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45729a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45729a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45729a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45729a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45729a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45729a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Mixin.java */
    public static final class b extends GeneratedMessageLite.b<M0, b> implements N0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(M0.DEFAULT_INSTANCE);
        }
    }

    static {
        M0 m02 = new M0();
        DEFAULT_INSTANCE = m02;
        GeneratedMessageLite.o(M0.class, m02);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 3:
                return new M0();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<M0> cVar = PARSER;
                if (cVar == null) {
                    synchronized (M0.class) {
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
