package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class FloatValue extends GeneratedMessageLite<FloatValue, b> implements X {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile L0<FloatValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362667a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362667a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362667a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362667a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362667a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362667a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362667a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362667a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<FloatValue, b> implements X {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(FloatValue.DEFAULT_INSTANCE);
        }
    }

    static {
        FloatValue floatValue = new FloatValue();
        DEFAULT_INSTANCE = floatValue;
        GeneratedMessageLite.registerDefaultInstance(FloatValue.class, floatValue);
    }

    private FloatValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FloatValue of(float f12) {
        b bVarNewBuilder = newBuilder();
        bVarNewBuilder.n();
        ((FloatValue) bVarNewBuilder.f362681c).setValue(f12);
        return bVarNewBuilder.c5();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) {
        return (FloatValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<FloatValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(float f12) {
        this.value_ = f12;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 3:
                return new FloatValue();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<FloatValue> cVar = PARSER;
                if (cVar == null) {
                    synchronized (FloatValue.class) {
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

    public float getValue() {
        return this.value_;
    }

    public static b newBuilder(FloatValue floatValue) {
        return DEFAULT_INSTANCE.createBuilder(floatValue);
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, M m12) {
        return (FloatValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, M m12) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static FloatValue parseFrom(AbstractC37700t abstractC37700t) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    public static FloatValue parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static FloatValue parseFrom(byte[] bArr) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FloatValue parseFrom(byte[] bArr, M m12) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static FloatValue parseFrom(InputStream inputStream) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, M m12) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static FloatValue parseFrom(AbstractC37708x abstractC37708x) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static FloatValue parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
