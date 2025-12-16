package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: SourceContext.java */
/* renamed from: androidx.datastore.preferences.protobuf.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22912l1 extends GeneratedMessageLite<C22912l1, b> implements InterfaceC22915m1 {
    private static final C22912l1 DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile X0<C22912l1> PARSER;
    private String fileName_ = "";

    /* compiled from: SourceContext.java */
    /* renamed from: androidx.datastore.preferences.protobuf.l1$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45873a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45873a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45873a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45873a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45873a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45873a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45873a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45873a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: SourceContext.java */
    /* renamed from: androidx.datastore.preferences.protobuf.l1$b */
    public static final class b extends GeneratedMessageLite.b<C22912l1, b> implements InterfaceC22915m1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C22912l1.DEFAULT_INSTANCE);
        }
    }

    static {
        C22912l1 c22912l1 = new C22912l1();
        DEFAULT_INSTANCE = c22912l1;
        GeneratedMessageLite.o(C22912l1.class, c22912l1);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 3:
                return new C22912l1();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<C22912l1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (C22912l1.class) {
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
