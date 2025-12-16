package com.google.protobuf;

import com.google.protobuf.C37670d0;
import com.google.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes7.dex */
public final class Field extends GeneratedMessageLite<Field, b> implements U {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile L0<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private C37670d0.k<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    public enum Cardinality implements C37670d0.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);


        /* renamed from: b, reason: collision with root package name */
        public final int f362625b;

        public class a implements C37670d0.d<Cardinality> {
            @Override // com.google.protobuf.C37670d0.d
            public final C37670d0.c findValueByNumber(int i12) {
                return Cardinality.a(i12);
            }
        }

        public static final class b implements C37670d0.e {
            static {
                new b();
            }

            @Override // com.google.protobuf.C37670d0.e
            public final boolean isInRange(int i12) {
                return Cardinality.a(i12) != null;
            }
        }

        static {
            new a();
        }

        Cardinality(int i12) {
            this.f362625b = i12;
        }

        public static Cardinality a(int i12) {
            if (i12 == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i12 == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i12 == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i12 != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        @Override // com.google.protobuf.C37670d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f362625b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum Kind implements C37670d0.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);


        /* renamed from: b, reason: collision with root package name */
        public final int f362647b;

        public class a implements C37670d0.d<Kind> {
            @Override // com.google.protobuf.C37670d0.d
            public final C37670d0.c findValueByNumber(int i12) {
                return Kind.a(i12);
            }
        }

        public static final class b implements C37670d0.e {
            static {
                new b();
            }

            @Override // com.google.protobuf.C37670d0.e
            public final boolean isInRange(int i12) {
                return Kind.a(i12) != null;
            }
        }

        static {
            new a();
        }

        Kind(int i12) {
            this.f362647b = i12;
        }

        public static Kind a(int i12) {
            switch (i12) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.C37670d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f362647b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362648a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f362648a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362648a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362648a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362648a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362648a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362648a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362648a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Field, b> implements U {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(Field.DEFAULT_INSTANCE);
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.registerDefaultInstance(Field.class, field);
    }

    private Field() {
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
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
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
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    private void ensureOptionsIsMutable() {
        C37670d0.k<Option> kVar = this.options_;
        if (kVar.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(kVar);
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static L0<Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i12) {
        ensureOptionsIsMutable();
        this.options_.remove(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(Cardinality cardinality) {
        this.cardinality_ = cardinality.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinalityValue(int i12) {
        this.cardinality_ = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(AbstractC37700t abstractC37700t) {
        AbstractC37663a.checkByteStringIsUtf8(abstractC37700t);
        this.defaultValue_ = abstractC37700t.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(AbstractC37700t abstractC37700t) {
        AbstractC37663a.checkByteStringIsUtf8(abstractC37700t);
        this.jsonName_ = abstractC37700t.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(Kind kind) {
        this.kind_ = kind.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i12) {
        this.kind_ = i12;
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
    public void setOneofIndex(int i12) {
        this.oneofIndex_ = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i12, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i12, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z12) {
        this.packed_ = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(AbstractC37700t abstractC37700t) {
        AbstractC37663a.checkByteStringIsUtf8(abstractC37700t);
        this.typeUrl_ = abstractC37700t.N();
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 3:
                return new Field();
            case 4:
                return new b(aVar);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L0<Field> cVar = PARSER;
                if (cVar == null) {
                    synchronized (Field.class) {
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

    public Cardinality getCardinality() {
        Cardinality cardinalityA = Cardinality.a(this.cardinality_);
        return cardinalityA == null ? Cardinality.UNRECOGNIZED : cardinalityA;
    }

    public int getCardinalityValue() {
        return this.cardinality_;
    }

    public String getDefaultValue() {
        return this.defaultValue_;
    }

    public AbstractC37700t getDefaultValueBytes() {
        return AbstractC37700t.i(this.defaultValue_);
    }

    public String getJsonName() {
        return this.jsonName_;
    }

    public AbstractC37700t getJsonNameBytes() {
        return AbstractC37700t.i(this.jsonName_);
    }

    public Kind getKind() {
        Kind kindA = Kind.a(this.kind_);
        return kindA == null ? Kind.UNRECOGNIZED : kindA;
    }

    public int getKindValue() {
        return this.kind_;
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

    public int getOneofIndex() {
        return this.oneofIndex_;
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

    public boolean getPacked() {
        return this.packed_;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public AbstractC37700t getTypeUrlBytes() {
        return AbstractC37700t.i(this.typeUrl_);
    }

    public static b newBuilder(Field field) {
        return DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, M m12) {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, M m12) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
    }

    public static Field parseFrom(AbstractC37700t abstractC37700t) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i12, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i12, option);
    }

    public static Field parseFrom(AbstractC37700t abstractC37700t, M m12) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
    }

    public static Field parseFrom(byte[] bArr) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, M m12) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
    }

    public static Field parseFrom(InputStream inputStream) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, M m12) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
    }

    public static Field parseFrom(AbstractC37708x abstractC37708x) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
    }

    public static Field parseFrom(AbstractC37708x abstractC37708x, M m12) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
    }
}
