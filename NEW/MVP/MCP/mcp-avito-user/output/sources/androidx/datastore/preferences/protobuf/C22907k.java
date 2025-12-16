package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Api.java */
/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22907k extends GeneratedMessageLite<C22907k, b> implements InterfaceC22910l {
    private static final C22907k DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile X0<C22907k> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private C22914m0.k<K0> methods_;
    private C22914m0.k<M0> mixins_;
    private String name_ = "";
    private C22914m0.k<V0> options_;
    private C22912l1 sourceContext_;
    private int syntax_;
    private String version_;

    /* compiled from: Api.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45848a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45848a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45848a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45848a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45848a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45848a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45848a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45848a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Api.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k$b */
    public static final class b extends GeneratedMessageLite.b<C22907k, b> implements InterfaceC22910l {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C22907k.DEFAULT_INSTANCE);
        }
    }

    static {
        C22907k c22907k = new C22907k();
        DEFAULT_INSTANCE = c22907k;
        GeneratedMessageLite.o(C22907k.class, c22907k);
    }

    public C22907k() {
        C22879a1<Object> c22879a1 = C22879a1.f45801e;
        this.methods_ = c22879a1;
        this.options_ = c22879a1;
        this.version_ = "";
        this.mixins_ = c22879a1;
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", K0.class, "options_", V0.class, "version_", "sourceContext_", "mixins_", M0.class, "syntax_"});
            case 3:
                return new C22907k();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<C22907k> cVar = PARSER;
                if (cVar == null) {
                    synchronized (C22907k.class) {
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
