package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.FieldSet;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

@CheckReturnValue
/* loaded from: classes6.dex */
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> PROTO2_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(false);
    private static final UnknownFieldSchema<?, ?> PROTO3_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(true);
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    public static int computeSizeBoolList(int i12, List<?> list, boolean z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z12) {
            return CodedOutputStream.computeBoolSize(i12, true) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size) + CodedOutputStream.computeTagSize(i12);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i12, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i12) * size;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i13));
        }
        return iComputeTagSize;
    }

    public static int computeSizeEnumList(int i12, List<Integer> list, boolean z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (!z12) {
            return (CodedOutputStream.computeTagSize(i12) * size) + iComputeSizeEnumListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) + CodedOutputStream.computeTagSize(i12);
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeEnumSizeNoTag = 0;
            while (i12 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i12));
                i12++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i12 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i12).intValue());
                i12++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    public static int computeSizeFixed32List(int i12, List<?> list, boolean z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z12) {
            return CodedOutputStream.computeFixed32Size(i12, 0) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) + CodedOutputStream.computeTagSize(i12);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i12, List<?> list, boolean z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z12) {
            return CodedOutputStream.computeFixed64Size(i12, 0L) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) + CodedOutputStream.computeTagSize(i12);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i12, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i12, list.get(i13));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeInt32List(int i12, List<Integer> list, boolean z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (!z12) {
            return (CodedOutputStream.computeTagSize(i12) * size) + iComputeSizeInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) + CodedOutputStream.computeTagSize(i12);
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeInt32SizeNoTag = 0;
            while (i12 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i12));
                i12++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i12 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i12).intValue());
                i12++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    public static int computeSizeInt64List(int i12, List<Long> list, boolean z12) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z12) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) + CodedOutputStream.computeTagSize(i12);
        }
        return (CodedOutputStream.computeTagSize(i12) * list.size()) + iComputeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            iComputeInt64SizeNoTag = 0;
            while (i12 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i12));
                i12++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i12 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i12).longValue());
                i12++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    public static int computeSizeMessage(int i12, Object obj, Schema schema) {
        return obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i12, (LazyFieldLite) obj) : CodedOutputStream.computeMessageSize(i12, (MessageLite) obj, schema);
    }

    public static int computeSizeMessageList(int i12, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i12) * size;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            iComputeTagSize = (obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj)) + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static int computeSizeSInt32List(int i12, List<Integer> list, boolean z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (!z12) {
            return (CodedOutputStream.computeTagSize(i12) * size) + iComputeSizeSInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) + CodedOutputStream.computeTagSize(i12);
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeSInt32SizeNoTag = 0;
            while (i12 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i12));
                i12++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i12 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i12).intValue());
                i12++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    public static int computeSizeSInt64List(int i12, List<Long> list, boolean z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (!z12) {
            return (CodedOutputStream.computeTagSize(i12) * size) + iComputeSizeSInt64ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) + CodedOutputStream.computeTagSize(i12);
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            iComputeSInt64SizeNoTag = 0;
            while (i12 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i12));
                i12++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i12 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i12).longValue());
                i12++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    public static int computeSizeStringList(int i12, List<?> list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i12) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i13 < size) {
                Object raw = lazyStringList.getRaw(i13);
                iComputeTagSize = (raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw)) + iComputeTagSize;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                iComputeTagSize = (obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj)) + iComputeTagSize;
                i13++;
            }
        }
        return iComputeTagSize;
    }

    public static int computeSizeUInt32List(int i12, List<Integer> list, boolean z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (!z12) {
            return (CodedOutputStream.computeTagSize(i12) * size) + iComputeSizeUInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) + CodedOutputStream.computeTagSize(i12);
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeUInt32SizeNoTag = 0;
            while (i12 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i12));
                i12++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i12 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i12).intValue());
                i12++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    public static int computeSizeUInt64List(int i12, List<Long> list, boolean z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (!z12) {
            return (CodedOutputStream.computeTagSize(i12) * size) + iComputeSizeUInt64ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) + CodedOutputStream.computeTagSize(i12);
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            iComputeUInt64SizeNoTag = 0;
            while (i12 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i12));
                i12++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i12 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i12).longValue());
                i12++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i12, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                Integer num = list.get(i14);
                int iIntValue = num.intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) != null) {
                    if (i14 != i13) {
                        list.set(i13, num);
                    }
                    i13++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i12, iIntValue, ub2, unknownFieldSchema);
                }
            }
            if (i13 != size) {
                list.subList(i13, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue2) == null) {
                    ub2 = (UB) storeUnknownEnum(obj, i12, iIntValue2, ub2, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema(boolean z12) {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z12));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t12, T t13) {
        FieldSet<T> extensions = extensionSchema.getExtensions(t13);
        if (extensions.isEmpty()) {
            return;
        }
        extensionSchema.getMutableExtensions(t12).mergeFrom(extensions);
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t12, T t13, long j12) {
        UnsafeUtil.putObject(t12, j12, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(t12, j12), UnsafeUtil.getObject(t13, j12)));
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t12, T t13) {
        unknownFieldSchema.setToMessage(t12, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(t12), unknownFieldSchema.getFromMessage(t13)));
    }

    public static UnknownFieldSchema<?, ?> proto2UnknownFieldSetSchema() {
        return PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> proto3UnknownFieldSetSchema() {
        return PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean shouldUseTableSwitch(int i12, int i13, int i14) {
        if (i13 < DEFAULT_LOOK_UP_START_NUMBER) {
            return true;
        }
        long j12 = i13 - i12;
        long j13 = i14;
        return j12 + 10 <= ((j13 + 3) * 3) + ((2 * j13) + 3);
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB storeUnknownEnum(Object obj, int i12, int i13, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub2 == null) {
            ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub2, i12, i13);
        return ub2;
    }

    public static String toCamelCase(String str, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    z12 = true;
                } else if (i12 != 0 || z12) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (z12) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            z12 = false;
        }
        return sb2.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i12, boolean z12, Writer writer) {
        if (z12) {
            writer.writeBool(i12, true);
        }
    }

    public static void writeBoolList(int i12, List<Boolean> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i12, list, z12);
    }

    public static void writeBytes(int i12, ByteString byteString, Writer writer) {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        writer.writeBytes(i12, byteString);
    }

    public static void writeBytesList(int i12, List<ByteString> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i12, list);
    }

    public static void writeDouble(int i12, double d12, Writer writer) {
        if (Double.doubleToRawLongBits(d12) != 0) {
            writer.writeDouble(i12, d12);
        }
    }

    public static void writeDoubleList(int i12, List<Double> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i12, list, z12);
    }

    public static void writeEnum(int i12, int i13, Writer writer) {
        if (i13 != 0) {
            writer.writeEnum(i12, i13);
        }
    }

    public static void writeEnumList(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i12, list, z12);
    }

    public static void writeFixed32(int i12, int i13, Writer writer) {
        if (i13 != 0) {
            writer.writeFixed32(i12, i13);
        }
    }

    public static void writeFixed32List(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i12, list, z12);
    }

    public static void writeFixed64(int i12, long j12, Writer writer) {
        if (j12 != 0) {
            writer.writeFixed64(i12, j12);
        }
    }

    public static void writeFixed64List(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i12, list, z12);
    }

    public static void writeFloat(int i12, float f12, Writer writer) {
        if (Float.floatToRawIntBits(f12) != 0) {
            writer.writeFloat(i12, f12);
        }
    }

    public static void writeFloatList(int i12, List<Float> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i12, list, z12);
    }

    public static void writeGroupList(int i12, List<?> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i12, list);
    }

    public static void writeInt32(int i12, int i13, Writer writer) {
        if (i13 != 0) {
            writer.writeInt32(i12, i13);
        }
    }

    public static void writeInt32List(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i12, list, z12);
    }

    public static void writeInt64(int i12, long j12, Writer writer) {
        if (j12 != 0) {
            writer.writeInt64(i12, j12);
        }
    }

    public static void writeInt64List(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i12, list, z12);
    }

    public static void writeLazyFieldList(int i12, List<?> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(writer, i12);
        }
    }

    public static void writeMessage(int i12, Object obj, Writer writer) {
        if (obj != null) {
            writer.writeMessage(i12, obj);
        }
    }

    public static void writeMessageList(int i12, List<?> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i12, list);
    }

    public static void writeSFixed32(int i12, int i13, Writer writer) {
        if (i13 != 0) {
            writer.writeSFixed32(i12, i13);
        }
    }

    public static void writeSFixed32List(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i12, list, z12);
    }

    public static void writeSFixed64(int i12, long j12, Writer writer) {
        if (j12 != 0) {
            writer.writeSFixed64(i12, j12);
        }
    }

    public static void writeSFixed64List(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i12, list, z12);
    }

    public static void writeSInt32(int i12, int i13, Writer writer) {
        if (i13 != 0) {
            writer.writeSInt32(i12, i13);
        }
    }

    public static void writeSInt32List(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i12, list, z12);
    }

    public static void writeSInt64(int i12, long j12, Writer writer) {
        if (j12 != 0) {
            writer.writeSInt64(i12, j12);
        }
    }

    public static void writeSInt64List(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i12, list, z12);
    }

    public static void writeString(int i12, Object obj, Writer writer) {
        if (obj instanceof String) {
            writeStringInternal(i12, (String) obj, writer);
        } else {
            writeBytes(i12, (ByteString) obj, writer);
        }
    }

    private static void writeStringInternal(int i12, String str, Writer writer) {
        if (str == null || str.isEmpty()) {
            return;
        }
        writer.writeString(i12, str);
    }

    public static void writeStringList(int i12, List<String> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i12, list);
    }

    public static void writeUInt32(int i12, int i13, Writer writer) {
        if (i13 != 0) {
            writer.writeUInt32(i12, i13);
        }
    }

    public static void writeUInt32List(int i12, List<Integer> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i12, list, z12);
    }

    public static void writeUInt64(int i12, long j12, Writer writer) {
        if (j12 != 0) {
            writer.writeUInt64(i12, j12);
        }
    }

    public static void writeUInt64List(int i12, List<Long> list, Writer writer, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i12, list, z12);
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
        if (fieldInfoArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fieldInfoArr[0].getFieldNumber(), fieldInfoArr[fieldInfoArr.length - 1].getFieldNumber(), fieldInfoArr.length);
    }

    public static int computeSizeGroupList(int i12, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i12, list.get(i13), schema);
        }
        return iComputeGroupSize;
    }

    public static void writeGroupList(int i12, List<?> list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i12, list, schema);
    }

    public static void writeMessageList(int i12, List<?> list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i12, list, schema);
    }

    public static int computeSizeMessageList(int i12, List<?> list, Schema schema) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i12) * size;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            if (obj instanceof LazyFieldLite) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            iComputeTagSize = iComputeMessageSizeNoTag + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i12, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                Integer num = list.get(i14);
                int iIntValue = num.intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i14 != i13) {
                        list.set(i13, num);
                    }
                    i13++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i12, iIntValue, ub2, unknownFieldSchema);
                }
            }
            if (i13 != size) {
                list.subList(i13, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!enumVerifier.isInRange(iIntValue2)) {
                    ub2 = (UB) storeUnknownEnum(obj, i12, iIntValue2, ub2, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
