package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.app.r;
import androidx.camera.view.k;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.android.gms.common.internal.P0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.google.crypto.tink.shaded.protobuf.ArrayDecoders;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
/* loaded from: classes6.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i12, int i13, MessageLite messageLite, boolean z12, boolean z13, int[] iArr2, int i14, int i15, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i12;
        this.maxFieldNumber = i13;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z12;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z13;
        this.intArray = iArr2;
        this.checkInitializedCount = i14;
        this.repeatedFieldOffsetStart = i15;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t12, T t13, int i12) {
        return isFieldPresent(t12, i12) == isFieldPresent(t13, i12);
    }

    private static <T> boolean booleanAt(T t12, long j12) {
        return UnsafeUtil.getBoolean(t12, j12);
    }

    private static void checkMutable(Object obj) {
        if (!isMutable(obj)) {
            throw new IllegalArgumentException(k.a(obj, "Mutating immutable message: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] bArr, int i12, int i13, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32;
        int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i12, registers);
        int i14 = registers.int1;
        if (i14 < 0 || i14 > i13 - iDecodeVarint322) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i15 = iDecodeVarint322 + i14;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint322 < i15) {
            int i16 = iDecodeVarint322 + 1;
            byte b12 = bArr[iDecodeVarint322];
            if (b12 < 0) {
                iDecodeVarint32 = ArrayDecoders.decodeVarint32(b12, bArr, i16, registers);
                b12 = registers.int1;
            } else {
                iDecodeVarint32 = i16;
            }
            int i17 = b12 >>> 3;
            int i18 = b12 & 7;
            if (i17 != 1) {
                if (i17 == 2 && i18 == metadata.valueType.getWireType()) {
                    iDecodeVarint322 = decodeMapEntryValue(bArr, iDecodeVarint32, i13, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint322 = ArrayDecoders.skipField(b12, bArr, iDecodeVarint32, i13, registers);
                }
            } else if (i18 == metadata.keyType.getWireType()) {
                iDecodeVarint322 = decodeMapEntryValue(bArr, iDecodeVarint32, i13, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint322 = ArrayDecoders.skipField(b12, bArr, iDecodeVarint32, i13, registers);
            }
        }
        if (iDecodeVarint322 != i15) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i15;
    }

    private int decodeMapEntryValue(byte[] bArr, int i12, int i13, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i12, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i12, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i12));
                return i12 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i12));
                return i12 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i12));
                return i12 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i12));
                return i12 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i12, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i12, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i12, i13, registers);
            case 15:
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i12, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i12, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i12, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t12, long j12) {
        return UnsafeUtil.getDouble(t12, j12);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i12, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i12);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i12)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i12)) == null) ? ub2 : (UB) filterUnknownEnumMap(i12, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i12, int i13, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i12));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub2, i13, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e12) {
                    throw new RuntimeException(e12);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t12, long j12) {
        return UnsafeUtil.getFloat(t12, j12);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i12) {
        return (Internal.EnumVerifier) this.objects[e.x(i12, 3, 2, 1)];
    }

    private Object getMapFieldDefaultEntry(int i12) {
        return this.objects[(i12 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i12) {
        int i13 = (i12 / 3) * 2;
        Schema schema = (Schema) this.objects[i13];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i13 + 1]);
        this.objects[i13] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getSerializedSizeProto2(T t12) {
        int i12;
        int i13;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeBytesSize;
        int iComputeSizeMessage;
        int iComputeSFixed32Size;
        boolean z12;
        int iComputeSizeFixed32List;
        Unsafe unsafe = UNSAFE;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int iK2 = 0;
        int i17 = 0;
        while (i16 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i16);
            int iNumberAt = numberAt(i16);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                i12 = this.buffer[i16 + 2];
                int i18 = i12 & i14;
                i13 = 1 << (i12 >>> OFFSET_BITS);
                if (i18 != i15) {
                    i17 = unsafe.getInt(t12, i18);
                    i15 = i18;
                }
            } else {
                i12 = (!this.useCachedSizeField || iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i16 + 2] & i14;
                i13 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i17 & i13) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iK2 += iComputeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i17 & i13) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iK2 += iComputeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i17 & i13) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i17 & i13) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i17 & i13) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i17 & i13) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iK2 += iComputeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i17 & i13) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iK2 += iComputeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i17 & i13) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i17 & i13) != 0) {
                        Object object = unsafe.getObject(t12, jOffset);
                        iComputeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        iK2 = iComputeBytesSize + iK2;
                    }
                    break;
                case 9:
                    if ((i17 & i13) != 0) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t12, jOffset), getMessageFieldSchema(i16));
                        iK2 += iComputeSizeMessage;
                    }
                    break;
                case 10:
                    if ((i17 & i13) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i17 & i13) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i17 & i13) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i17 & i13) != 0) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iK2 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i17 & i13) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i17 & i13) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i17 & i13) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i17 & i13) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t12, jOffset), getMessageFieldSchema(i16));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 19:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case OFFSET_BITS /* 20 */:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case 21:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case 22:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case 23:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t12, jOffset));
                    iK2 += iComputeSizeMessage;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t12, jOffset), getMessageFieldSchema(i16));
                    iK2 += iComputeSizeMessage;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t12, jOffset));
                    iK2 += iComputeSizeMessage;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 30:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case 31:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case 32:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case 33:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case 34:
                    z12 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    iK2 += iComputeSizeFixed32List;
                    break;
                case 35:
                    int iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeFixed64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag, iK2);
                    }
                    break;
                case 36:
                    int iComputeSizeFixed32ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeFixed32ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeFixed32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag, iK2);
                    }
                    break;
                case 37:
                    int iComputeSizeInt64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeInt64ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt64ListNoTag, iK2);
                    }
                    break;
                case 38:
                    int iComputeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeUInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeUInt64ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeUInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt64ListNoTag, iK2);
                    }
                    break;
                case 39:
                    int iComputeSizeInt32ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeInt32ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt32ListNoTag, iK2);
                    }
                    break;
                case 40:
                    int iComputeSizeFixed64ListNoTag2 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeFixed64ListNoTag2);
                        }
                        iK2 = P0.k(iComputeSizeFixed64ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag2, iK2);
                    }
                    break;
                case 41:
                    int iComputeSizeFixed32ListNoTag2 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed32ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeFixed32ListNoTag2);
                        }
                        iK2 = P0.k(iComputeSizeFixed32ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag2, iK2);
                    }
                    break;
                case 42:
                    int iComputeSizeBoolListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeBoolListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeBoolListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeBoolListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeBoolListNoTag, iK2);
                    }
                    break;
                case 43:
                    int iComputeSizeUInt32ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeUInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeUInt32ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeUInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt32ListNoTag, iK2);
                    }
                    break;
                case 44:
                    int iComputeSizeEnumListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeEnumListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeEnumListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeEnumListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeEnumListNoTag, iK2);
                    }
                    break;
                case 45:
                    int iComputeSizeFixed32ListNoTag3 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed32ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeFixed32ListNoTag3);
                        }
                        iK2 = P0.k(iComputeSizeFixed32ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag3, iK2);
                    }
                    break;
                case 46:
                    int iComputeSizeFixed64ListNoTag3 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeFixed64ListNoTag3);
                        }
                        iK2 = P0.k(iComputeSizeFixed64ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag3, iK2);
                    }
                    break;
                case 47:
                    int iComputeSizeSInt32ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeSInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeSInt32ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeSInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt32ListNoTag, iK2);
                    }
                    break;
                case 48:
                    int iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i12, iComputeSizeSInt64ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeSInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt64ListNoTag, iK2);
                    }
                    break;
                case 49:
                    iComputeSizeMessage = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t12, jOffset), getMessageFieldSchema(i16));
                    iK2 += iComputeSizeMessage;
                    break;
                case 50:
                    iComputeSizeMessage = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t12, jOffset), getMapFieldDefaultEntry(i16));
                    iK2 += iComputeSizeMessage;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeSFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iK2 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        Object object2 = unsafe.getObject(t12, jOffset);
                        iComputeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        iK2 = iComputeBytesSize + iK2;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t12, jOffset), getMessageFieldSchema(i16));
                        iK2 += iComputeSizeMessage;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iK2 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t12, jOffset));
                        iK2 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t12, iNumberAt, i16)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t12, jOffset), getMessageFieldSchema(i16));
                        iK2 += iComputeBoolSize;
                    }
                    break;
            }
            i16 += 3;
            i14 = 1048575;
        }
        int unknownFieldsSerializedSize = iK2 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t12);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t12).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t12) {
        int iComputeDoubleSize;
        int iComputeBytesSize;
        int iComputeSizeMessage;
        Unsafe unsafe = UNSAFE;
        int iK2 = 0;
        for (int i12 = 0; i12 < this.buffer.length; i12 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i12);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i12);
            long jOffset = offset(iTypeAndOffsetAt);
            int i13 = (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i12 + 2] & 1048575;
            switch (iType) {
                case 0:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, UnsafeUtil.getLong(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, UnsafeUtil.getLong(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, UnsafeUtil.getInt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(t12, i12)) {
                        Object object = UnsafeUtil.getObject(t12, jOffset);
                        iComputeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        iK2 = iComputeBytesSize + iK2;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(t12, i12)) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, UnsafeUtil.getObject(t12, jOffset), getMessageFieldSchema(i12));
                        iK2 += iComputeSizeMessage;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.getObject(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, UnsafeUtil.getInt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, UnsafeUtil.getInt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, UnsafeUtil.getInt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, UnsafeUtil.getLong(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(t12, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.getObject(t12, jOffset), getMessageFieldSchema(i12));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 19:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case OFFSET_BITS /* 20 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt64List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 21:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt64List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 22:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt32List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 23:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeBoolList(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeStringList(iNumberAt, listAt(t12, jOffset));
                    iK2 += iComputeSizeMessage;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeMessageList(iNumberAt, listAt(t12, jOffset), getMessageFieldSchema(i12));
                    iK2 += iComputeSizeMessage;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeByteStringList(iNumberAt, listAt(t12, jOffset));
                    iK2 += iComputeSizeMessage;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt32List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 30:
                    iComputeSizeMessage = SchemaUtil.computeSizeEnumList(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 31:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 32:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 33:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt32List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 34:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt64List(iNumberAt, listAt(t12, jOffset), false);
                    iK2 += iComputeSizeMessage;
                    break;
                case 35:
                    int iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeFixed64ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeFixed64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag, iK2);
                        break;
                    }
                case 36:
                    int iComputeSizeFixed32ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeFixed32ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeFixed32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag, iK2);
                        break;
                    }
                case 37:
                    int iComputeSizeInt64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeInt64ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt64ListNoTag, iK2);
                        break;
                    }
                case 38:
                    int iComputeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeUInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeUInt64ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeUInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt64ListNoTag, iK2);
                        break;
                    }
                case 39:
                    int iComputeSizeInt32ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeInt32ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt32ListNoTag, iK2);
                        break;
                    }
                case 40:
                    int iComputeSizeFixed64ListNoTag2 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag2 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeFixed64ListNoTag2);
                        }
                        iK2 = P0.k(iComputeSizeFixed64ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag2, iK2);
                        break;
                    }
                case 41:
                    int iComputeSizeFixed32ListNoTag2 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed32ListNoTag2 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeFixed32ListNoTag2);
                        }
                        iK2 = P0.k(iComputeSizeFixed32ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag2, iK2);
                        break;
                    }
                case 42:
                    int iComputeSizeBoolListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeBoolListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeBoolListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeBoolListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeBoolListNoTag, iK2);
                        break;
                    }
                case 43:
                    int iComputeSizeUInt32ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeUInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeUInt32ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeUInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt32ListNoTag, iK2);
                        break;
                    }
                case 44:
                    int iComputeSizeEnumListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeEnumListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeEnumListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeEnumListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeEnumListNoTag, iK2);
                        break;
                    }
                case 45:
                    int iComputeSizeFixed32ListNoTag3 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed32ListNoTag3 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeFixed32ListNoTag3);
                        }
                        iK2 = P0.k(iComputeSizeFixed32ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag3, iK2);
                        break;
                    }
                case 46:
                    int iComputeSizeFixed64ListNoTag3 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag3 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeFixed64ListNoTag3);
                        }
                        iK2 = P0.k(iComputeSizeFixed64ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag3, iK2);
                        break;
                    }
                case 47:
                    int iComputeSizeSInt32ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeSInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeSInt32ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeSInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt32ListNoTag, iK2);
                        break;
                    }
                case 48:
                    int iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeSInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t12, i13, iComputeSizeSInt64ListNoTag);
                        }
                        iK2 = P0.k(iComputeSizeSInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt64ListNoTag, iK2);
                        break;
                    }
                case 49:
                    iComputeSizeMessage = SchemaUtil.computeSizeGroupList(iNumberAt, listAt(t12, jOffset), getMessageFieldSchema(i12));
                    iK2 += iComputeSizeMessage;
                    break;
                case 50:
                    iComputeSizeMessage = this.mapFieldSchema.getSerializedSize(iNumberAt, UnsafeUtil.getObject(t12, jOffset), getMapFieldDefaultEntry(i12));
                    iK2 += iComputeSizeMessage;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        Object object2 = UnsafeUtil.getObject(t12, jOffset);
                        iComputeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        iK2 = iComputeBytesSize + iK2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, UnsafeUtil.getObject(t12, jOffset), getMessageFieldSchema(i12));
                        iK2 += iComputeSizeMessage;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.getObject(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t12, jOffset));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t12, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.getObject(t12, jOffset), getMessageFieldSchema(i12));
                        iK2 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return iK2 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t12);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t12) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t12));
    }

    private static <T> int intAt(T t12, long j12) {
        return UnsafeUtil.getInt(t12, j12);
    }

    private static boolean isEnforceUtf8(int i12) {
        return (i12 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t12, int i12, int i13, int i14, int i15) {
        return i13 == 1048575 ? isFieldPresent(t12, i12) : (i14 & i15) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i12, int i13) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i12));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i13);
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (!messageFieldSchema.isInitialized(list.get(i14))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.crypto.tink.shaded.protobuf.Schema] */
    private boolean isMapInitialized(T t12, int i12, int i13) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t12, offset(i12)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i13)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t12, T t13, int i12) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i12) & 1048575;
        return UnsafeUtil.getInt(t12, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t13, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t12, int i12, int i13) {
        return UnsafeUtil.getInt(t12, (long) (presenceMaskAndOffsetAt(i13) & 1048575)) == i12;
    }

    private static boolean isRequired(int i12) {
        return (i12 & REQUIRED_MASK) != 0;
    }

    private static List<?> listAt(Object obj, long j12) {
        return (List) UnsafeUtil.getObject(obj, j12);
    }

    private static <T> long longAt(T t12, long j12) {
        return UnsafeUtil.getLong(t12, j12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        r0 = r18.checkInitializedCount;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (r0 >= r18.repeatedFieldOffsetStart) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r4 = filterMapUnknownEnumValues(r21, r18.intArray[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        if (r4 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        r7.setBuilderToMessage(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x064f A[Catch: all -> 0x0675, TRY_LEAVE, TryCatch #9 {all -> 0x0675, blocks: (B:170:0x0649, B:172:0x064f, B:184:0x0679, B:185:0x067e), top: B:213:0x0649 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06b5 A[LOOP:4: B:198:0x06b1->B:200:0x06b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r19, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<ET> r20, T r21, com.google.crypto.tink.shaded.protobuf.Reader r22, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.mergeFromHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema, com.google.crypto.tink.shaded.protobuf.ExtensionSchema, java.lang.Object, com.google.crypto.tink.shaded.protobuf.Reader, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i12, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long jOffset = offset(typeAndOffsetAt(i12));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t12, T t13, int i12) {
        if (isFieldPresent(t13, i12)) {
            long jOffset = offset(typeAndOffsetAt(i12));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t13, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i12) + " is present but null: " + t13);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i12);
            if (!isFieldPresent(t12, i12)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t12, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t12, jOffset, object);
                }
                setFieldPresent(t12, i12);
                return;
            }
            Object object2 = unsafe.getObject(t12, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t12, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t12, T t13, int i12) {
        int iNumberAt = numberAt(i12);
        if (isOneofPresent(t13, iNumberAt, i12)) {
            long jOffset = offset(typeAndOffsetAt(i12));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t13, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i12) + " is present but null: " + t13);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i12);
            if (!isOneofPresent(t12, iNumberAt, i12)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t12, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t12, jOffset, object);
                }
                setOneofPresent(t12, iNumberAt, i12);
                return;
            }
            Object object2 = unsafe.getObject(t12, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t12, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t12, T t13, int i12) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i12);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i12);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putDouble(t12, jOffset, UnsafeUtil.getDouble(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putFloat(t12, jOffset, UnsafeUtil.getFloat(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putLong(t12, jOffset, UnsafeUtil.getLong(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putLong(t12, jOffset, UnsafeUtil.getLong(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putInt(t12, jOffset, UnsafeUtil.getInt(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putLong(t12, jOffset, UnsafeUtil.getLong(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putInt(t12, jOffset, UnsafeUtil.getInt(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putBoolean(t12, jOffset, UnsafeUtil.getBoolean(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putObject(t12, jOffset, UnsafeUtil.getObject(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 9:
                mergeMessage(t12, t13, i12);
                break;
            case 10:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putObject(t12, jOffset, UnsafeUtil.getObject(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putInt(t12, jOffset, UnsafeUtil.getInt(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putInt(t12, jOffset, UnsafeUtil.getInt(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putInt(t12, jOffset, UnsafeUtil.getInt(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putLong(t12, jOffset, UnsafeUtil.getLong(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putInt(t12, jOffset, UnsafeUtil.getInt(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(t13, i12)) {
                    UnsafeUtil.putLong(t12, jOffset, UnsafeUtil.getLong(t13, jOffset));
                    setFieldPresent(t12, i12);
                    break;
                }
                break;
            case 17:
                mergeMessage(t12, t13, i12);
                break;
            case 18:
            case 19:
            case OFFSET_BITS /* 20 */:
            case 21:
            case 22:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t12, t13, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t12, t13, jOffset);
                break;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t13, iNumberAt, i12)) {
                    UnsafeUtil.putObject(t12, jOffset, UnsafeUtil.getObject(t13, jOffset));
                    setOneofPresent(t12, iNumberAt, i12);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(t12, t13, i12);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t13, iNumberAt, i12)) {
                    UnsafeUtil.putObject(t12, jOffset, UnsafeUtil.getObject(t13, jOffset));
                    setOneofPresent(t12, iNumberAt, i12);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(t12, t13, i12);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t12, int i12) {
        Schema messageFieldSchema = getMessageFieldSchema(i12);
        long jOffset = offset(typeAndOffsetAt(i12));
        if (!isFieldPresent(t12, i12)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t12, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t12, int i12, int i13) {
        Schema messageFieldSchema = getMessageFieldSchema(i13);
        if (!isOneofPresent(t12, i12, i13)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t12, offset(typeAndOffsetAt(i13)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i12;
        boolean z12 = structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i13 = 0;
        int i14 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i13++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i14++;
            }
        }
        int[] iArr2 = i13 > 0 ? new int[i13] : null;
        int[] iArr3 = i14 > 0 ? new int[i14] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i15 < fields.length) {
            FieldInfo fieldInfo2 = fields[i15];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i16, objArr);
            if (i17 < checkInitialized.length && checkInitialized[i17] == fieldNumber3) {
                checkInitialized[i17] = i16;
                i17++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i18] = i16;
                i18++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    i12 = i16;
                    iArr3[i19] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i19++;
                }
                i15++;
                i16 = i12 + 3;
            }
            i12 = i16;
            i15++;
            i16 = i12 + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z12, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.crypto.tink.shaded.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.crypto.tink.shaded.protobuf.RawMessageInfo r33, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r34, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r35, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r36, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r37, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r38) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.newSchemaForRawMessageInfo(com.google.crypto.tink.shaded.protobuf.RawMessageInfo, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema, com.google.crypto.tink.shaded.protobuf.ListFieldSchema, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema, com.google.crypto.tink.shaded.protobuf.ExtensionSchema, com.google.crypto.tink.shaded.protobuf.MapFieldSchema):com.google.crypto.tink.shaded.protobuf.MessageSchema");
    }

    private int numberAt(int i12) {
        return this.buffer[i12];
    }

    private static long offset(int i12) {
        return i12 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t12, long j12) {
        return ((Boolean) UnsafeUtil.getObject(t12, j12)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t12, long j12) {
        return ((Double) UnsafeUtil.getObject(t12, j12)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t12, long j12) {
        return ((Float) UnsafeUtil.getObject(t12, j12)).floatValue();
    }

    private static <T> int oneofIntAt(T t12, long j12) {
        return ((Integer) UnsafeUtil.getObject(t12, j12)).intValue();
    }

    private static <T> long oneofLongAt(T t12, long j12) {
        return ((Long) UnsafeUtil.getObject(t12, j12)).longValue();
    }

    private <K, V> int parseMapField(T t12, byte[] bArr, int i12, int i13, int i14, long j12, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i14);
        Object object = unsafe.getObject(t12, j12);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t12, j12, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i12, i13, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t12, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        Unsafe unsafe = UNSAFE;
        long j13 = this.buffer[i19 + 2] & 1048575;
        switch (i18) {
            case ONEOF_TYPE_OFFSET /* 51 */:
                if (i16 == 1) {
                    unsafe.putObject(t12, j12, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i12)));
                    int i22 = i12 + 8;
                    unsafe.putInt(t12, j13, i15);
                    return i22;
                }
                break;
            case 52:
                if (i16 == 5) {
                    unsafe.putObject(t12, j12, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i12)));
                    int i23 = i12 + 4;
                    unsafe.putInt(t12, j13, i15);
                    return i23;
                }
                break;
            case 53:
            case 54:
                if (i16 == 0) {
                    int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i12, registers);
                    unsafe.putObject(t12, j12, Long.valueOf(registers.long1));
                    unsafe.putInt(t12, j13, i15);
                    return iDecodeVarint64;
                }
                break;
            case 55:
            case 62:
                if (i16 == 0) {
                    int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i12, registers);
                    unsafe.putObject(t12, j12, Integer.valueOf(registers.int1));
                    unsafe.putInt(t12, j13, i15);
                    return iDecodeVarint32;
                }
                break;
            case 56:
            case 65:
                if (i16 == 1) {
                    unsafe.putObject(t12, j12, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i12)));
                    int i24 = i12 + 8;
                    unsafe.putInt(t12, j13, i15);
                    return i24;
                }
                break;
            case 57:
            case 64:
                if (i16 == 5) {
                    unsafe.putObject(t12, j12, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i12)));
                    int i25 = i12 + 4;
                    unsafe.putInt(t12, j13, i15);
                    return i25;
                }
                break;
            case 58:
                if (i16 == 0) {
                    int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i12, registers);
                    unsafe.putObject(t12, j12, Boolean.valueOf(registers.long1 != 0));
                    unsafe.putInt(t12, j13, i15);
                    return iDecodeVarint642;
                }
                break;
            case 59:
                if (i16 == 2) {
                    int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i12, registers);
                    int i26 = registers.int1;
                    if (i26 == 0) {
                        unsafe.putObject(t12, j12, "");
                    } else {
                        if ((i17 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i26)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        unsafe.putObject(t12, j12, new String(bArr, iDecodeVarint322, i26, Internal.UTF_8));
                        iDecodeVarint322 += i26;
                    }
                    unsafe.putInt(t12, j13, i15);
                    return iDecodeVarint322;
                }
                break;
            case 60:
                if (i16 == 2) {
                    Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t12, i15, i19);
                    int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i19), bArr, i12, i13, registers);
                    storeOneofMessageField(t12, i15, i19, objMutableOneofMessageFieldForMerge);
                    return iMergeMessageField;
                }
                break;
            case 61:
                if (i16 == 2) {
                    int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i12, registers);
                    unsafe.putObject(t12, j12, registers.object1);
                    unsafe.putInt(t12, j13, i15);
                    return iDecodeBytes;
                }
                break;
            case 63:
                if (i16 == 0) {
                    int iDecodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i12, registers);
                    int i27 = registers.int1;
                    Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i19);
                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i27)) {
                        unsafe.putObject(t12, j12, Integer.valueOf(i27));
                        unsafe.putInt(t12, j13, i15);
                    } else {
                        getMutableUnknownFields(t12).storeField(i14, Long.valueOf(i27));
                    }
                    return iDecodeVarint323;
                }
                break;
            case 66:
                if (i16 == 0) {
                    int iDecodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i12, registers);
                    unsafe.putObject(t12, j12, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                    unsafe.putInt(t12, j13, i15);
                    return iDecodeVarint324;
                }
                break;
            case 67:
                if (i16 == 0) {
                    int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i12, registers);
                    unsafe.putObject(t12, j12, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                    unsafe.putInt(t12, j13, i15);
                    return iDecodeVarint643;
                }
                break;
            case 68:
                if (i16 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t12, i15, i19);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i19), bArr, i12, i13, (i14 & (-8)) | 4, registers);
                    storeOneofMessageField(t12, i15, i19, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b2, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e8, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0307, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0298, code lost:
    
        if (r0 != r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029a, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r8 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0089. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @com.google.crypto.tink.shaded.protobuf.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int parseProto3Message(T r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r34) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.parseProto3Message(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers):int");
    }

    private int parseRepeatedField(T t12, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, long j12, int i18, long j13, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t12, j13);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t12, j13, protobufListMutableCopyWithCapacity2);
        }
        switch (i18) {
            case 18:
            case 35:
                if (i16 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                }
                if (i16 == 1) {
                    return ArrayDecoders.decodeDoubleList(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 19:
            case 36:
                if (i16 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                }
                if (i16 == 5) {
                    return ArrayDecoders.decodeFloatList(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case OFFSET_BITS /* 20 */:
            case 21:
            case 37:
            case 38:
                if (i16 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                }
                if (i16 == 0) {
                    return ArrayDecoders.decodeVarint64List(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 22:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 39:
            case 43:
                if (i16 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                }
                if (i16 == 0) {
                    return ArrayDecoders.decodeVarint32List(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i16 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                }
                if (i16 == 1) {
                    return ArrayDecoders.decodeFixed64List(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i16 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                }
                if (i16 == 5) {
                    return ArrayDecoders.decodeFixed32List(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case 42:
                if (i16 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                }
                if (i16 == 0) {
                    return ArrayDecoders.decodeBoolList(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (i16 == 2) {
                    return (j12 & 536870912) == 0 ? ArrayDecoders.decodeStringList(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers) : ArrayDecoders.decodeStringListRequireUtf8(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (i16 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i17), i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (i16 == 2) {
                    return ArrayDecoders.decodeBytesList(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 30:
            case 44:
                if (i16 == 2) {
                    iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                } else if (i16 == 0) {
                    iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                SchemaUtil.filterUnknownEnumList((Object) t12, i15, (List<Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i17), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i16 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                }
                if (i16 == 0) {
                    return ArrayDecoders.decodeSInt32List(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 34:
            case 48:
                if (i16 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i12, protobufListMutableCopyWithCapacity2, registers);
                }
                if (i16 == 0) {
                    return ArrayDecoders.decodeSInt64List(i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 49:
                if (i16 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i17), i14, bArr, i12, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
        }
        return i12;
    }

    private int positionForFieldNumber(int i12) {
        if (i12 < this.minFieldNumber || i12 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i12, 0);
    }

    private int presenceMaskAndOffsetAt(int i12) {
        return this.buffer[i12 + 2];
    }

    private <E> void readGroupList(Object obj, long j12, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j12), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i12, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i12)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i12, Reader reader) {
        if (isEnforceUtf8(i12)) {
            UnsafeUtil.putObject(obj, offset(i12), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i12), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i12), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i12, Reader reader) {
        if (isEnforceUtf8(i12)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i12)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i12)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = r.A("Field ", str, " for ");
            e.u(cls, sbA, " not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    private void setFieldPresent(T t12, int i12) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i12);
        long j12 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j12 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t12, j12, (1 << (iPresenceMaskAndOffsetAt >>> OFFSET_BITS)) | UnsafeUtil.getInt(t12, j12));
    }

    private void setOneofPresent(T t12, int i12, int i13) {
        UnsafeUtil.putInt(t12, presenceMaskAndOffsetAt(i13) & 1048575, i12);
    }

    private int slowPositionForFieldNumber(int i12, int i13) {
        int length = (this.buffer.length / 3) - 1;
        while (i13 <= length) {
            int i14 = (length + i13) >>> 1;
            int i15 = i14 * 3;
            int iNumberAt = numberAt(i15);
            if (i12 == iNumberAt) {
                return i15;
            }
            if (i12 < iNumberAt) {
                length = i14 - 1;
            } else {
                i13 = i14 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(com.google.crypto.tink.shaded.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.crypto.tink.shaded.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.crypto.tink.shaded.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto Lbd
            int r10 = r10 / r1
            int r10 = r10 * r2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + r3
            r11[r10] = r9
            goto Ld6
        Laf:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ld6
            int r10 = r10 + r3
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            goto Ld6
        Lbd:
            if (r9 == 0) goto Lc6
            int r8 = androidx.compose.ui.graphics.colorspace.e.x(r10, r1, r2, r3)
            r11[r8] = r9
            goto Ld6
        Lc6:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ld6
            int r9 = androidx.compose.ui.graphics.colorspace.e.x(r10, r1, r2, r3)
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r9] = r8
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.storeFieldData(com.google.crypto.tink.shaded.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t12, int i12, Object obj) {
        UNSAFE.putObject(t12, offset(typeAndOffsetAt(i12)), obj);
        setFieldPresent(t12, i12);
    }

    private void storeOneofMessageField(T t12, int i12, int i13, Object obj) {
        UNSAFE.putObject(t12, offset(typeAndOffsetAt(i13)), obj);
        setOneofPresent(t12, i12, i13);
    }

    private static int type(int i12) {
        return (i12 & FIELD_TYPE_MASK) >>> OFFSET_BITS;
    }

    private int typeAndOffsetAt(int i12) {
        return this.buffer[i12 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrderProto2(T r18, com.google.crypto.tink.shaded.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.writeFieldsInAscendingOrderProto2(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrderProto3(T r13, com.google.crypto.tink.shaded.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.writeFieldsInAscendingOrderProto3(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, com.google.crypto.tink.shaded.protobuf.Writer r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i12, Object obj, int i13) {
        if (obj != null) {
            writer.writeMap(i12, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i13)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i12, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i12, (String) obj);
        } else {
            writer.writeBytes(i12, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t12, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t12), writer);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public boolean equals(T t12, T t13) {
        int length = this.buffer.length;
        for (int i12 = 0; i12 < length; i12 += 3) {
            if (!equals(t12, t13, i12)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t12).equals(this.unknownFieldSchema.getFromMessage(t13))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t12).equals(this.extensionSchema.getExtensions(t13));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int getSerializedSize(T t12) {
        return this.proto3 ? getSerializedSizeProto3(t12) : getSerializedSizeProto2(t12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int hashCode(T t12) {
        int i12;
        int iHashLong;
        int i13;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i15);
            int iNumberAt = numberAt(i15);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i12 = i14 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t12, jOffset)));
                    i14 = iHashLong + i12;
                    break;
                case 1:
                    i12 = i14 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t12, jOffset));
                    i14 = iHashLong + i12;
                    break;
                case 2:
                    i12 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t12, jOffset));
                    i14 = iHashLong + i12;
                    break;
                case 3:
                    i12 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t12, jOffset));
                    i14 = iHashLong + i12;
                    break;
                case 4:
                    i13 = i14 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t12, jOffset);
                    i14 = i13 + iOneofIntAt;
                    break;
                case 5:
                    i12 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t12, jOffset));
                    i14 = iHashLong + i12;
                    break;
                case 6:
                    i13 = i14 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t12, jOffset);
                    i14 = i13 + iOneofIntAt;
                    break;
                case 7:
                    i12 = i14 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t12, jOffset));
                    i14 = iHashLong + i12;
                    break;
                case 8:
                    i12 = i14 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t12, jOffset)).hashCode();
                    i14 = iHashLong + i12;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t12, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i12 = i14 * 53;
                    iHashLong = UnsafeUtil.getObject(t12, jOffset).hashCode();
                    i14 = iHashLong + i12;
                    break;
                case 11:
                    i13 = i14 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t12, jOffset);
                    i14 = i13 + iOneofIntAt;
                    break;
                case 12:
                    i13 = i14 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t12, jOffset);
                    i14 = i13 + iOneofIntAt;
                    break;
                case 13:
                    i13 = i14 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t12, jOffset);
                    i14 = i13 + iOneofIntAt;
                    break;
                case 14:
                    i12 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t12, jOffset));
                    i14 = iHashLong + i12;
                    break;
                case 15:
                    i13 = i14 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t12, jOffset);
                    i14 = i13 + iOneofIntAt;
                    break;
                case 16:
                    i12 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t12, jOffset));
                    i14 = iHashLong + i12;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t12, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case OFFSET_BITS /* 20 */:
                case 21:
                case 22:
                case 23:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i12 = i14 * 53;
                    iHashLong = UnsafeUtil.getObject(t12, jOffset).hashCode();
                    i14 = iHashLong + i12;
                    break;
                case 50:
                    i12 = i14 * 53;
                    iHashLong = UnsafeUtil.getObject(t12, jOffset).hashCode();
                    i14 = iHashLong + i12;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t12, jOffset)));
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t12, jOffset));
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t12, jOffset));
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t12, jOffset));
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iOneofIntAt = oneofIntAt(t12, jOffset);
                        i14 = i13 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t12, jOffset));
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iOneofIntAt = oneofIntAt(t12, jOffset);
                        i14 = i13 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t12, jOffset));
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t12, jOffset)).hashCode();
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = UnsafeUtil.getObject(t12, jOffset).hashCode();
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = UnsafeUtil.getObject(t12, jOffset).hashCode();
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iOneofIntAt = oneofIntAt(t12, jOffset);
                        i14 = i13 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iOneofIntAt = oneofIntAt(t12, jOffset);
                        i14 = i13 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iOneofIntAt = oneofIntAt(t12, jOffset);
                        i14 = i13 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t12, jOffset));
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iOneofIntAt = oneofIntAt(t12, jOffset);
                        i14 = i13 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t12, jOffset));
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t12, iNumberAt, i15)) {
                        i12 = i14 * 53;
                        iHashLong = UnsafeUtil.getObject(t12, jOffset).hashCode();
                        i14 = iHashLong + i12;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(t12).hashCode() + (i14 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t12).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(T r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = r8
            r1 = r9
            r10 = r1
        Lb:
            int r2 = r6.checkInitializedCount
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.intArray
            r11 = r2[r10]
            int r12 = r6.numberAt(r11)
            int r13 = r6.typeAndOffsetAt(r11)
            int[] r2 = r6.buffer
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L33:
            r16 = r1
            r15 = r4
            goto L3a
        L37:
            r15 = r0
            r16 = r1
        L3a:
            boolean r0 = isRequired(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = type(r13)
            r1 = 9
            if (r0 == r1) goto L90
            r1 = 17
            if (r0 == r1) goto L90
            r1 = 27
            if (r0 == r1) goto L89
            r1 = 60
            if (r0 == r1) goto L78
            r1 = 68
            if (r0 == r1) goto L78
            r1 = 49
            if (r0 == r1) goto L89
            r1 = 50
            if (r0 == r1) goto L71
            goto Laa
        L71:
            boolean r0 = r6.isMapInitialized(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.isOneofPresent(r7, r12, r11)
            if (r0 == 0) goto Laa
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.isListInitialized(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.hasExtensions
            if (r0 == 0) goto Lc2
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r6.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.getExtensions(r7)
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void makeImmutable(T r8) {
        /*
            r7 = this;
            boolean r0 = isMutable(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L17
            r0 = r8
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L17:
            int[] r0 = r7.buffer
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L5f
            int r2 = r7.typeAndOffsetAt(r1)
            long r3 = offset(r2)
            int r2 = type(r2)
            r5 = 9
            if (r2 == r5) goto L49
            switch(r2) {
                case 17: goto L49;
                case 18: goto L43;
                case 19: goto L43;
                case 20: goto L43;
                case 21: goto L43;
                case 22: goto L43;
                case 23: goto L43;
                case 24: goto L43;
                case 25: goto L43;
                case 26: goto L43;
                case 27: goto L43;
                case 28: goto L43;
                case 29: goto L43;
                case 30: goto L43;
                case 31: goto L43;
                case 32: goto L43;
                case 33: goto L43;
                case 34: goto L43;
                case 35: goto L43;
                case 36: goto L43;
                case 37: goto L43;
                case 38: goto L43;
                case 39: goto L43;
                case 40: goto L43;
                case 41: goto L43;
                case 42: goto L43;
                case 43: goto L43;
                case 44: goto L43;
                case 45: goto L43;
                case 46: goto L43;
                case 47: goto L43;
                case 48: goto L43;
                case 49: goto L43;
                case 50: goto L31;
                default: goto L30;
            }
        L30:
            goto L5c
        L31:
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = r7.mapFieldSchema
            java.lang.Object r5 = r6.toImmutable(r5)
            r2.putObject(r8, r3, r5)
            goto L5c
        L43:
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r2 = r7.listFieldSchema
            r2.makeImmutableListAt(r8, r3)
            goto L5c
        L49:
            boolean r2 = r7.isFieldPresent(r8, r1)
            if (r2 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.Schema r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
        L5c:
            int r1 = r1 + 3
            goto L1b
        L5f:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r7.unknownFieldSchema
            r0.makeImmutable(r8)
            boolean r0 = r7.hasExtensions
            if (r0 == 0) goto L6d
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r7.extensionSchema
            r0.makeImmutable(r8)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T t12, T t13) {
        checkMutable(t12);
        t13.getClass();
        for (int i12 = 0; i12 < this.buffer.length; i12 += 3) {
            mergeSingleField(t12, t13, i12);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t12, t13);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t12, t13);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x037b, code lost:
    
        if (r0 != r13) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x037d, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r36;
        r8 = r18;
        r6 = r19;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0397, code lost:
    
        r2 = r0;
        r8 = r20;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03cd, code lost:
    
        if (r0 != r15) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03f0, code lost:
    
        if (r0 != r15) goto L117;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x008d. Please report as an issue. */
    @com.google.crypto.tink.shaded.protobuf.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int parseProto2Message(T r31, byte[] r32, int r33, int r34, int r35, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r36) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.parseProto2Message(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void writeTo(T t12, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t12, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t12, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t12, writer);
        }
    }

    private boolean isFieldPresent(T t12, int i12) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i12);
        long j12 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j12 != 1048575) {
            return (UnsafeUtil.getInt(t12, j12) & (1 << (iPresenceMaskAndOffsetAt >>> OFFSET_BITS))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i12);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t12, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t12, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t12, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t12, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t12, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t12, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t12, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t12, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t12, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t12, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t12, jOffset));
            case 11:
                return UnsafeUtil.getInt(t12, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t12, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t12, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t12, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t12, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t12, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t12, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i12, int i13) {
        if (i12 < this.minFieldNumber || i12 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i12, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T t12, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        checkMutable(t12);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t12, reader, extensionRegistryLite);
    }

    private boolean equals(T t12, T t13, int i12) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i12);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (arePresentForEquals(t12, t13, i12) && Double.doubleToLongBits(UnsafeUtil.getDouble(t12, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t13, jOffset))) {
                    break;
                }
                break;
            case 1:
                if (arePresentForEquals(t12, t13, i12) && Float.floatToIntBits(UnsafeUtil.getFloat(t12, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t13, jOffset))) {
                    break;
                }
                break;
            case 2:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getLong(t12, jOffset) == UnsafeUtil.getLong(t13, jOffset)) {
                    break;
                }
                break;
            case 3:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getLong(t12, jOffset) == UnsafeUtil.getLong(t13, jOffset)) {
                    break;
                }
                break;
            case 4:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getInt(t12, jOffset) == UnsafeUtil.getInt(t13, jOffset)) {
                    break;
                }
                break;
            case 5:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getLong(t12, jOffset) == UnsafeUtil.getLong(t13, jOffset)) {
                    break;
                }
                break;
            case 6:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getInt(t12, jOffset) == UnsafeUtil.getInt(t13, jOffset)) {
                    break;
                }
                break;
            case 7:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getBoolean(t12, jOffset) == UnsafeUtil.getBoolean(t13, jOffset)) {
                    break;
                }
                break;
            case 8:
                if (arePresentForEquals(t12, t13, i12) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t12, jOffset), UnsafeUtil.getObject(t13, jOffset))) {
                    break;
                }
                break;
            case 9:
                if (arePresentForEquals(t12, t13, i12) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t12, jOffset), UnsafeUtil.getObject(t13, jOffset))) {
                    break;
                }
                break;
            case 10:
                if (arePresentForEquals(t12, t13, i12) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t12, jOffset), UnsafeUtil.getObject(t13, jOffset))) {
                    break;
                }
                break;
            case 11:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getInt(t12, jOffset) == UnsafeUtil.getInt(t13, jOffset)) {
                    break;
                }
                break;
            case 12:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getInt(t12, jOffset) == UnsafeUtil.getInt(t13, jOffset)) {
                    break;
                }
                break;
            case 13:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getInt(t12, jOffset) == UnsafeUtil.getInt(t13, jOffset)) {
                    break;
                }
                break;
            case 14:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getLong(t12, jOffset) == UnsafeUtil.getLong(t13, jOffset)) {
                    break;
                }
                break;
            case 15:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getInt(t12, jOffset) == UnsafeUtil.getInt(t13, jOffset)) {
                    break;
                }
                break;
            case 16:
                if (arePresentForEquals(t12, t13, i12) && UnsafeUtil.getLong(t12, jOffset) == UnsafeUtil.getLong(t13, jOffset)) {
                    break;
                }
                break;
            case 17:
                if (arePresentForEquals(t12, t13, i12) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t12, jOffset), UnsafeUtil.getObject(t13, jOffset))) {
                    break;
                }
                break;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (isOneofCaseEqual(t12, t13, i12) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t12, jOffset), UnsafeUtil.getObject(t13, jOffset))) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T t12, byte[] bArr, int i12, int i13, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        if (this.proto3) {
            parseProto3Message(t12, bArr, i12, i13, registers);
        } else {
            parseProto2Message(t12, bArr, i12, i13, 0, registers);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i12, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i12)));
    }
}
