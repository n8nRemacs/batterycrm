package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;

/* compiled from: Struct.java */
/* loaded from: classes.dex */
public final class q1 extends GeneratedMessageLite<q1, b> implements r1 {
    private static final q1 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile X0<q1> PARSER;
    private C22941z0<String, Value> fields_ = C22941z0.f45986c;

    /* compiled from: Struct.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45914a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45914a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45914a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45914a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45914a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45914a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45914a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45914a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Struct.java */
    public static final class b extends GeneratedMessageLite.b<q1, b> implements r1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(q1.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Struct.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final C22939y0<String, Value> f45915a = new C22939y0<>(WireFormat.FieldType.f45766l, WireFormat.FieldType.f45768n, Value.q());
    }

    static {
        q1 q1Var = new q1();
        DEFAULT_INSTANCE = q1Var;
        GeneratedMessageLite.o(q1.class, q1Var);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f45915a});
            case 3:
                return new q1();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<q1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (q1.class) {
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
