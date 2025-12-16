package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class Option extends GeneratedMessageLite<Option, b> implements K0 {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile L0<Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private Any value_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362728a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362728a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362728a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362728a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362728a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362728a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362728a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362728a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Option, b> implements K0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(Option.DEFAULT_INSTANCE);
        }
    }

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        GeneratedMessageLite.registerDefaultInstance(Option.class, option);
    }

    private Option() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(Any any) {
        any.getClass();
        Any any2 = this.value_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.value_ = any;
            return;
        }
        Any.b bVarNewBuilder = Any.newBuilder(this.value_);
        bVarNewBuilder.p(any);
        this.value_ = bVarNewBuilder.buildPartial();
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Option parseDelimitedFrom(InputStream inputStream) {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<Option> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC37700t abstractC37700t) {
        AbstractC37663a.checkByteStringIsUtf8(abstractC37700t);
        this.name_ = abstractC37700t.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(Any any) {
        any.getClass();
        this.value_ = any;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 3:
                return new Option();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<Option> cVar = PARSER;
                if (cVar == null) {
                    synchronized (Option.class) {
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

    public String getName() {
        return this.name_;
    }

    public AbstractC37700t getNameBytes() {
        return AbstractC37700t.i(this.name_);
    }

    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public boolean hasValue() {
        return this.value_ != null;
    }

    public static b newBuilder(Option option) {
        return DEFAULT_INSTANCE.createBuilder(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream, M m12) {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static Option parseFrom(ByteBuffer byteBuffer, M m12) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static Option parseFrom(AbstractC37700t abstractC37700t) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    public static Option parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static Option parseFrom(byte[] bArr) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Option parseFrom(byte[] bArr, M m12) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static Option parseFrom(InputStream inputStream) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, M m12) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static Option parseFrom(AbstractC37708x abstractC37708x) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static Option parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
