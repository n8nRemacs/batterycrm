package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class DoubleValue extends GeneratedMessageLite<DoubleValue, b> implements C {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile L0<DoubleValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362614a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362614a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362614a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362614a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362614a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362614a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362614a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362614a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<DoubleValue, b> implements C {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(DoubleValue.DEFAULT_INSTANCE);
        }
    }

    static {
        DoubleValue doubleValue = new DoubleValue();
        DEFAULT_INSTANCE = doubleValue;
        GeneratedMessageLite.registerDefaultInstance(DoubleValue.class, doubleValue);
    }

    private DoubleValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0d;
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DoubleValue of(double d12) {
        b bVarNewBuilder = newBuilder();
        bVarNewBuilder.n();
        ((DoubleValue) bVarNewBuilder.f362681c).setValue(d12);
        return bVarNewBuilder.c5();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) {
        return (DoubleValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<DoubleValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(double d12) {
        this.value_ = d12;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 3:
                return new DoubleValue();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<DoubleValue> cVar = PARSER;
                if (cVar == null) {
                    synchronized (DoubleValue.class) {
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

    public double getValue() {
        return this.value_;
    }

    public static b newBuilder(DoubleValue doubleValue) {
        return DEFAULT_INSTANCE.createBuilder(doubleValue);
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, M m12) {
        return (DoubleValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, M m12) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static DoubleValue parseFrom(AbstractC37700t abstractC37700t) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    public static DoubleValue parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static DoubleValue parseFrom(byte[] bArr) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DoubleValue parseFrom(byte[] bArr, M m12) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static DoubleValue parseFrom(InputStream inputStream) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, M m12) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static DoubleValue parseFrom(AbstractC37708x abstractC37708x) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static DoubleValue parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
