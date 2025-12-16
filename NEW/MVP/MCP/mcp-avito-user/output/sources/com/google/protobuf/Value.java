package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class Value extends GeneratedMessageLite<Value, b> implements t1 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile L0<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KindCase {

        /* renamed from: b, reason: collision with root package name */
        public static final KindCase f362777b;

        /* renamed from: c, reason: collision with root package name */
        public static final KindCase f362778c;

        /* renamed from: d, reason: collision with root package name */
        public static final KindCase f362779d;

        /* renamed from: e, reason: collision with root package name */
        public static final KindCase f362780e;

        /* renamed from: f, reason: collision with root package name */
        public static final KindCase f362781f;

        /* renamed from: g, reason: collision with root package name */
        public static final KindCase f362782g;

        /* renamed from: h, reason: collision with root package name */
        public static final KindCase f362783h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ KindCase[] f362784i;

        static {
            KindCase kindCase = new KindCase("NULL_VALUE", 0);
            f362777b = kindCase;
            KindCase kindCase2 = new KindCase("NUMBER_VALUE", 1);
            f362778c = kindCase2;
            KindCase kindCase3 = new KindCase("STRING_VALUE", 2);
            f362779d = kindCase3;
            KindCase kindCase4 = new KindCase("BOOL_VALUE", 3);
            f362780e = kindCase4;
            KindCase kindCase5 = new KindCase("STRUCT_VALUE", 4);
            f362781f = kindCase5;
            KindCase kindCase6 = new KindCase("LIST_VALUE", 5);
            f362782g = kindCase6;
            KindCase kindCase7 = new KindCase("KIND_NOT_SET", 6);
            f362783h = kindCase7;
            f362784i = new KindCase[]{kindCase, kindCase2, kindCase3, kindCase4, kindCase5, kindCase6, kindCase7};
        }

        public KindCase() {
            throw null;
        }

        public static KindCase valueOf(String str) {
            return (KindCase) java.lang.Enum.valueOf(KindCase.class, str);
        }

        public static KindCase[] values() {
            return (KindCase[]) f362784i.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362785a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362785a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362785a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362785a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362785a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362785a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362785a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362785a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Value, b> implements t1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(Value.DEFAULT_INSTANCE);
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.registerDefaultInstance(Value.class, value);
    }

    private Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(ListValue listValue) {
        listValue.getClass();
        if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
            this.kind_ = listValue;
        } else {
            ListValue.b bVarNewBuilder = ListValue.newBuilder((ListValue) this.kind_);
            bVarNewBuilder.p(listValue);
            this.kind_ = bVarNewBuilder.buildPartial();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(Struct struct) {
        struct.getClass();
        if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
            this.kind_ = struct;
        } else {
            Struct.b bVarNewBuilder = Struct.newBuilder((Struct) this.kind_);
            bVarNewBuilder.p(struct);
            this.kind_ = bVarNewBuilder.buildPartial();
        }
        this.kindCase_ = 5;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z12) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(NullValue nullValue) {
        this.kind_ = Integer.valueOf(nullValue.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i12) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double d12) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(AbstractC37700t abstractC37700t) {
        AbstractC37663a.checkByteStringIsUtf8(abstractC37700t);
        this.kind_ = abstractC37700t.N();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 3:
                return new Value();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<Value> cVar = PARSER;
                if (cVar == null) {
                    synchronized (Value.class) {
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

    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public KindCase getKindCase() {
        switch (this.kindCase_) {
            case 0:
                return KindCase.f362783h;
            case 1:
                return KindCase.f362777b;
            case 2:
                return KindCase.f362778c;
            case 3:
                return KindCase.f362779d;
            case 4:
                return KindCase.f362780e;
            case 5:
                return KindCase.f362781f;
            case 6:
                return KindCase.f362782g;
            default:
                return null;
        }
    }

    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    public NullValue getNullValue() {
        NullValue nullValue;
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        if (((Integer) this.kind_).intValue() != 0) {
            NullValue nullValue2 = NullValue.NULL_VALUE;
            nullValue = null;
        } else {
            nullValue = NullValue.NULL_VALUE;
        }
        return nullValue == null ? NullValue.UNRECOGNIZED : nullValue;
    }

    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    public AbstractC37700t getStringValueBytes() {
        return AbstractC37700t.i(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static b newBuilder(Value value) {
        return DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, M m12) {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, M m12) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static Value parseFrom(AbstractC37700t abstractC37700t) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    public static Value parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static Value parseFrom(byte[] bArr) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, M m12) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static Value parseFrom(InputStream inputStream) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, M m12) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static Value parseFrom(AbstractC37708x abstractC37708x) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static Value parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
