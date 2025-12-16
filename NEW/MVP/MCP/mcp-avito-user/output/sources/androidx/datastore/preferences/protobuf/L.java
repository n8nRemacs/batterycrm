package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Enum.java */
/* loaded from: classes.dex */
public final class L extends GeneratedMessageLite<L, b> implements M {
    private static final L DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile X0<L> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private C22914m0.k<N> enumvalue_;
    private String name_ = "";
    private C22914m0.k<V0> options_;
    private C22912l1 sourceContext_;
    private int syntax_;

    /* compiled from: Enum.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45727a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45727a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45727a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45727a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45727a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45727a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45727a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45727a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Enum.java */
    public static final class b extends GeneratedMessageLite.b<L, b> implements M {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(L.DEFAULT_INSTANCE);
        }
    }

    static {
        L l12 = new L();
        DEFAULT_INSTANCE = l12;
        GeneratedMessageLite.o(L.class, l12);
    }

    public L() {
        C22879a1<Object> c22879a1 = C22879a1.f45801e;
        this.enumvalue_ = c22879a1;
        this.options_ = c22879a1;
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", N.class, "options_", V0.class, "sourceContext_", "syntax_"});
            case 3:
                return new L();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<L> cVar = PARSER;
                if (cVar == null) {
                    synchronized (L.class) {
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
