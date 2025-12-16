package com.google.protobuf;

import com.google.protobuf.C37670d0;
import com.google.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes7.dex */
public final class EnumValue extends GeneratedMessageLite<EnumValue, b> implements I {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile L0<EnumValue> PARSER;
    private int number_;
    private String name_ = "";
    private C37670d0.k<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362618a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362618a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362618a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362618a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362618a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362618a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362618a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362618a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<EnumValue, b> implements I {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(EnumValue.DEFAULT_INSTANCE);
        }
    }

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        GeneratedMessageLite.registerDefaultInstance(EnumValue.class, enumValue);
    }

    private EnumValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractC37663a.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureOptionsIsMutable() {
        C37670d0.k<Option> kVar = this.options_;
        if (kVar.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(kVar);
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<EnumValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i12) {
        ensureOptionsIsMutable();
        this.options_.remove(i12);
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
    public void setNumber(int i12) {
        this.number_ = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i12, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i12, option);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case 3:
                return new EnumValue();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<EnumValue> cVar = PARSER;
                if (cVar == null) {
                    synchronized (EnumValue.class) {
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

    public int getNumber() {
        return this.number_;
    }

    public Option getOptions(int i12) {
        return this.options_.get(i12);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<Option> getOptionsList() {
        return this.options_;
    }

    public K0 getOptionsOrBuilder(int i12) {
        return this.options_.get(i12);
    }

    public List<? extends K0> getOptionsOrBuilderList() {
        return this.options_;
    }

    public static b newBuilder(EnumValue enumValue) {
        return DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, M m12) {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, M m12) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static EnumValue parseFrom(AbstractC37700t abstractC37700t) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i12, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i12, option);
    }

    public static EnumValue parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static EnumValue parseFrom(byte[] bArr) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EnumValue parseFrom(byte[] bArr, M m12) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static EnumValue parseFrom(InputStream inputStream) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, M m12) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static EnumValue parseFrom(AbstractC37708x abstractC37708x) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static EnumValue parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
