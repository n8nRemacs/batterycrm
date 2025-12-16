package com.google.protobuf;

import com.google.protobuf.C37670d0;
import com.google.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes7.dex */
public final class ListValue extends GeneratedMessageLite<ListValue, b> implements InterfaceC37688m0 {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile L0<ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private C37670d0.k<Value> values_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362709a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362709a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362709a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362709a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362709a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362709a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362709a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362709a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<ListValue, b> implements InterfaceC37688m0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(ListValue.DEFAULT_INSTANCE);
        }
    }

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        GeneratedMessageLite.registerDefaultInstance(ListValue.class, listValue);
    }

    private ListValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends Value> iterable) {
        ensureValuesIsMutable();
        AbstractC37663a.addAll((Iterable) iterable, (List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        C37670d0.k<Value> kVar = this.values_;
        if (kVar.isModifiable()) {
            return;
        }
        this.values_ = GeneratedMessageLite.mutableCopy(kVar);
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i12) {
        ensureValuesIsMutable();
        this.values_.remove(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i12, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(i12, value);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 3:
                return new ListValue();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<ListValue> cVar = PARSER;
                if (cVar == null) {
                    synchronized (ListValue.class) {
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

    public Value getValues(int i12) {
        return this.values_.get(i12);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<Value> getValuesList() {
        return this.values_;
    }

    public t1 getValuesOrBuilder(int i12) {
        return this.values_.get(i12);
    }

    public List<? extends t1> getValuesOrBuilderList() {
        return this.values_;
    }

    public static b newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, M m12) {
        return (ListValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, M m12) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static ListValue parseFrom(AbstractC37700t abstractC37700t) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i12, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(i12, value);
    }

    public static ListValue parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static ListValue parseFrom(byte[] bArr) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListValue parseFrom(byte[] bArr, M m12) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static ListValue parseFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, M m12) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static ListValue parseFrom(AbstractC37708x abstractC37708x) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static ListValue parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
