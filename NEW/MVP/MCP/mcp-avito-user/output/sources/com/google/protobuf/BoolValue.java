package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class BoolValue extends GeneratedMessageLite<BoolValue, b> implements InterfaceC37691o {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile L0<BoolValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362601a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362601a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362601a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362601a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362601a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362601a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362601a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362601a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<BoolValue, b> implements InterfaceC37691o {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(BoolValue.DEFAULT_INSTANCE);
        }
    }

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        GeneratedMessageLite.registerDefaultInstance(BoolValue.class, boolValue);
    }

    private BoolValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = false;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BoolValue of(boolean z12) {
        b bVarNewBuilder = newBuilder();
        bVarNewBuilder.n();
        ((BoolValue) bVarNewBuilder.f362681c).setValue(z12);
        return bVarNewBuilder.c5();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<BoolValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(boolean z12) {
        this.value_ = z12;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 3:
                return new BoolValue();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<BoolValue> cVar = PARSER;
                if (cVar == null) {
                    synchronized (BoolValue.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c<>(DEFAULT_INSTANCE);
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

    public boolean getValue() {
        return this.value_;
    }

    public static b newBuilder(BoolValue boolValue) {
        return DEFAULT_INSTANCE.createBuilder(boolValue);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, M m12) {
        return (BoolValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, M m12) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static BoolValue parseFrom(AbstractC37700t abstractC37700t) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    public static BoolValue parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static BoolValue parseFrom(byte[] bArr) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BoolValue parseFrom(byte[] bArr, M m12) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static BoolValue parseFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, M m12) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static BoolValue parseFrom(AbstractC37708x abstractC37708x) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static BoolValue parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
