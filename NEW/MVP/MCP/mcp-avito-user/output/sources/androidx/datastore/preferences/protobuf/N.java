package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: EnumValue.java */
/* loaded from: classes.dex */
public final class N extends GeneratedMessageLite<N, b> implements O {
    private static final N DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile X0<N> PARSER;
    private int number_;
    private String name_ = "";
    private C22914m0.k<V0> options_ = C22879a1.f45801e;

    /* compiled from: EnumValue.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45730a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45730a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45730a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45730a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45730a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45730a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45730a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45730a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: EnumValue.java */
    public static final class b extends GeneratedMessageLite.b<N, b> implements O {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(N.DEFAULT_INSTANCE);
        }
    }

    static {
        N n12 = new N();
        DEFAULT_INSTANCE = n12;
        GeneratedMessageLite.o(N.class, n12);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", V0.class});
            case 3:
                return new N();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<N> cVar = PARSER;
                if (cVar == null) {
                    synchronized (N.class) {
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
