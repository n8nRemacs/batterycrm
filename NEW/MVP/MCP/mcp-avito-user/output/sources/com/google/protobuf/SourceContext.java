package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class SourceContext extends GeneratedMessageLite<SourceContext, b> implements Y0 {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile L0<SourceContext> PARSER;
    private String fileName_ = "";

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362754a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362754a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362754a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362754a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362754a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362754a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362754a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362754a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<SourceContext, b> implements Y0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(SourceContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        GeneratedMessageLite.registerDefaultInstance(SourceContext.class, sourceContext);
    }

    private SourceContext() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) {
        return (SourceContext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<SourceContext> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(AbstractC37700t abstractC37700t) {
        AbstractC37663a.checkByteStringIsUtf8(abstractC37700t);
        this.fileName_ = abstractC37700t.N();
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 3:
                return new SourceContext();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<SourceContext> cVar = PARSER;
                if (cVar == null) {
                    synchronized (SourceContext.class) {
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

    public String getFileName() {
        return this.fileName_;
    }

    public AbstractC37700t getFileNameBytes() {
        return AbstractC37700t.i(this.fileName_);
    }

    public static b newBuilder(SourceContext sourceContext) {
        return DEFAULT_INSTANCE.createBuilder(sourceContext);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, M m12) {
        return (SourceContext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, M m12) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static SourceContext parseFrom(AbstractC37700t abstractC37700t) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    public static SourceContext parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static SourceContext parseFrom(byte[] bArr) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SourceContext parseFrom(byte[] bArr, M m12) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static SourceContext parseFrom(InputStream inputStream) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(InputStream inputStream, M m12) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static SourceContext parseFrom(AbstractC37708x abstractC37708x) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static SourceContext parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
