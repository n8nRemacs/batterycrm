package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Any.java */
/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22898h extends GeneratedMessageLite<C22898h, b> implements InterfaceC22901i {
    private static final C22898h DEFAULT_INSTANCE;
    private static volatile X0<C22898h> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private AbstractC22934w value_ = AbstractC22934w.f45925c;

    /* compiled from: Any.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45841a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45841a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45841a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45841a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45841a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45841a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45841a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45841a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Any.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    public static final class b extends GeneratedMessageLite.b<C22898h, b> implements InterfaceC22901i {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C22898h.DEFAULT_INSTANCE);
        }
    }

    static {
        C22898h c22898h = new C22898h();
        DEFAULT_INSTANCE = c22898h;
        GeneratedMessageLite.o(C22898h.class, c22898h);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 3:
                return new C22898h();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<C22898h> cVar = PARSER;
                if (cVar == null) {
                    synchronized (C22898h.class) {
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
