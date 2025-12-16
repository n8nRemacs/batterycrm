package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: ListValue.java */
/* renamed from: androidx.datastore.preferences.protobuf.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22931u0 extends GeneratedMessageLite<C22931u0, b> implements InterfaceC22933v0 {
    private static final C22931u0 DEFAULT_INSTANCE;
    private static volatile X0<C22931u0> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private C22914m0.k<Value> values_ = C22879a1.f45801e;

    /* compiled from: ListValue.java */
    /* renamed from: androidx.datastore.preferences.protobuf.u0$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45923a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45923a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45923a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45923a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45923a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45923a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45923a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45923a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ListValue.java */
    /* renamed from: androidx.datastore.preferences.protobuf.u0$b */
    public static final class b extends GeneratedMessageLite.b<C22931u0, b> implements InterfaceC22933v0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C22931u0.DEFAULT_INSTANCE);
        }
    }

    static {
        C22931u0 c22931u0 = new C22931u0();
        DEFAULT_INSTANCE = c22931u0;
        GeneratedMessageLite.o(C22931u0.class, c22931u0);
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
                return new C22888d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 3:
                return new C22931u0();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X0<C22931u0> cVar = PARSER;
                if (cVar == null) {
                    synchronized (C22931u0.class) {
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
