package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Type.java */
/* loaded from: classes.dex */
public final class z1 extends GeneratedMessageLite<z1, b> implements A1 {
    private static final z1 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile X0<z1> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private C22914m0.k<Field> fields_;
    private String name_ = "";
    private C22914m0.k<String> oneofs_;
    private C22914m0.k<V0> options_;
    private C22912l1 sourceContext_;
    private int syntax_;

    /* compiled from: Type.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45988a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45988a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45988a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45988a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45988a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45988a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45988a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45988a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Type.java */
    public static final class b extends GeneratedMessageLite.b<z1, b> implements A1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(z1.DEFAULT_INSTANCE);
        }
    }

    static {
        z1 z1Var = new z1();
        DEFAULT_INSTANCE = z1Var;
        GeneratedMessageLite.o(z1.class, z1Var);
    }

    public z1() {
        C22879a1<Object> c22879a1 = C22879a1.f45801e;
        this.fields_ = c22879a1;
        this.oneofs_ = c22879a1;
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", V0.class, "sourceContext_", "syntax_"});
            case 3:
                return new z1();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<z1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (z1.class) {
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
