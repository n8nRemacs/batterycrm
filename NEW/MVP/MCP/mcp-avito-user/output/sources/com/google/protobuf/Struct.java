package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes7.dex */
public final class Struct extends GeneratedMessageLite<Struct, b> implements b1 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile L0<Struct> PARSER;
    private C37696q0<String, Value> fields_ = C37696q0.f362942c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362756a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362756a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362756a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362756a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362756a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362756a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362756a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362756a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Struct, b> implements b1 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(Struct.DEFAULT_INSTANCE);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final C37694p0<String, Value> f362757a = new C37694p0<>(WireFormat.FieldType.f362797l, WireFormat.FieldType.f362799n, Value.getDefaultInstance());
    }

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        GeneratedMessageLite.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private C37696q0<String, Value> internalGetFields() {
        return this.fields_;
    }

    private C37696q0<String, Value> internalGetMutableFields() {
        C37696q0<String, Value> c37696q0 = this.fields_;
        if (!c37696q0.f362943b) {
            this.fields_ = c37696q0.k();
        }
        return this.fields_;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<Struct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f362757a});
            case 3:
                return new Struct();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<Struct> cVar = PARSER;
                if (cVar == null) {
                    synchronized (Struct.class) {
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

    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return internalGetFields().size();
    }

    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        C37696q0<String, Value> c37696q0InternalGetFields = internalGetFields();
        return c37696q0InternalGetFields.containsKey(str) ? c37696q0InternalGetFields.get(str) : value;
    }

    public Value getFieldsOrThrow(String str) {
        str.getClass();
        C37696q0<String, Value> c37696q0InternalGetFields = internalGetFields();
        if (c37696q0InternalGetFields.containsKey(str)) {
            return c37696q0InternalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static b newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, M m12) {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, M m12) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static Struct parseFrom(AbstractC37700t abstractC37700t) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    public static Struct parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static Struct parseFrom(byte[] bArr) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Struct parseFrom(byte[] bArr, M m12) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static Struct parseFrom(InputStream inputStream) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, M m12) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static Struct parseFrom(AbstractC37708x abstractC37708x) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static Struct parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
