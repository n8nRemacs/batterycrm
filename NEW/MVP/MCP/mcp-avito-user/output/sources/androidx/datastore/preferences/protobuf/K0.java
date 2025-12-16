package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: Method.java */
/* loaded from: classes.dex */
public final class K0 extends GeneratedMessageLite<K0, b> implements L0 {
    private static final K0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile X0<K0> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private C22914m0.k<V0> options_ = C22879a1.f45801e;

    /* compiled from: Method.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45716a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45716a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45716a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45716a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45716a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45716a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45716a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45716a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Method.java */
    public static final class b extends GeneratedMessageLite.b<K0, b> implements L0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(K0.DEFAULT_INSTANCE);
        }
    }

    static {
        K0 k02 = new K0();
        DEFAULT_INSTANCE = k02;
        GeneratedMessageLite.o(K0.class, k02);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", V0.class, "syntax_"});
            case 3:
                return new K0();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<K0> cVar = PARSER;
                if (cVar == null) {
                    synchronized (K0.class) {
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
