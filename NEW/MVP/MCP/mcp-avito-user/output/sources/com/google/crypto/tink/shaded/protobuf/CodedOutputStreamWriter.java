package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes6.dex */
final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream output;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.output = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.wrapper;
        return codedOutputStreamWriter != null ? codedOutputStreamWriter : new CodedOutputStreamWriter(codedOutputStream);
    }

    private <V> void writeDeterministicBooleanMapEntry(int i12, boolean z12, V v12, MapEntryLite.Metadata<Boolean, V> metadata) {
        this.output.writeTag(i12, 2);
        this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Boolean.valueOf(z12), v12));
        MapEntryLite.writeTo(this.output, metadata, Boolean.valueOf(z12), v12);
    }

    private <V> void writeDeterministicIntegerMap(int i12, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            iArr[i13] = it.next().intValue();
            i13++;
        }
        Arrays.sort(iArr);
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = iArr[i14];
            V v12 = map.get(Integer.valueOf(i15));
            this.output.writeTag(i12, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i15), v12));
            MapEntryLite.writeTo(this.output, metadata, Integer.valueOf(i15), v12);
        }
    }

    private <V> void writeDeterministicLongMap(int i12, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            jArr[i13] = it.next().longValue();
            i13++;
        }
        Arrays.sort(jArr);
        for (int i14 = 0; i14 < size; i14++) {
            long j12 = jArr[i14];
            V v12 = map.get(Long.valueOf(j12));
            this.output.writeTag(i12, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j12), v12));
            MapEntryLite.writeTo(this.output, metadata, Long.valueOf(j12), v12);
        }
    }

    private <K, V> void writeDeterministicMap(int i12, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v12 = map.get(Boolean.FALSE);
                if (v12 != null) {
                    writeDeterministicBooleanMapEntry(i12, false, v12, metadata);
                }
                V v13 = map.get(Boolean.TRUE);
                if (v13 != null) {
                    writeDeterministicBooleanMapEntry(i12, true, v13, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i12, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i12, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(i12, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.keyType);
        }
    }

    private <V> void writeDeterministicStringMap(int i12, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            strArr[i13] = it.next();
            i13++;
        }
        Arrays.sort(strArr);
        for (int i14 = 0; i14 < size; i14++) {
            String str = strArr[i14];
            V v12 = map.get(str);
            this.output.writeTag(i12, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v12));
            MapEntryLite.writeTo(this.output, metadata, str, v12);
        }
    }

    private void writeLazyString(int i12, Object obj) {
        if (obj instanceof String) {
            this.output.writeString(i12, (String) obj);
        } else {
            this.output.writeBytes(i12, (ByteString) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBool(int i12, boolean z12) {
        this.output.writeBool(i12, z12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBoolList(int i12, List<Boolean> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeBool(i12, list.get(i13).booleanValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeBoolSizeNoTag += CodedOutputStream.computeBoolSizeNoTag(list.get(i14).booleanValue());
        }
        this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i13 < list.size()) {
            this.output.writeBoolNoTag(list.get(i13).booleanValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBytes(int i12, ByteString byteString) {
        this.output.writeBytes(i12, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBytesList(int i12, List<ByteString> list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.output.writeBytes(i12, list.get(i13));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDouble(int i12, double d12) {
        this.output.writeDouble(i12, d12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDoubleList(int i12, List<Double> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeDouble(i12, list.get(i13).doubleValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeDoubleSizeNoTag += CodedOutputStream.computeDoubleSizeNoTag(list.get(i14).doubleValue());
        }
        this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i13 < list.size()) {
            this.output.writeDoubleNoTag(list.get(i13).doubleValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public void writeEndGroup(int i12) {
        this.output.writeTag(i12, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnum(int i12, int i13) {
        this.output.writeEnum(i12, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnumList(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeEnum(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i14).intValue());
        }
        this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i13 < list.size()) {
            this.output.writeEnumNoTag(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32(int i12, int i13) {
        this.output.writeFixed32(i12, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeFixed32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeFixed32SizeNoTag += CodedOutputStream.computeFixed32SizeNoTag(list.get(i14).intValue());
        }
        this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeFixed32NoTag(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64(int i12, long j12) {
        this.output.writeFixed64(i12, j12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeFixed64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeFixed64SizeNoTag += CodedOutputStream.computeFixed64SizeNoTag(list.get(i14).longValue());
        }
        this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeFixed64NoTag(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloat(int i12, float f12) {
        this.output.writeFloat(i12, f12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloatList(int i12, List<Float> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeFloat(i12, list.get(i13).floatValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeFloatSizeNoTag += CodedOutputStream.computeFloatSizeNoTag(list.get(i14).floatValue());
        }
        this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i13 < list.size()) {
            this.output.writeFloatNoTag(list.get(i13).floatValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public void writeGroup(int i12, Object obj) {
        this.output.writeGroup(i12, (MessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public void writeGroupList(int i12, List<?> list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            writeGroup(i12, list.get(i13));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32(int i12, int i13) {
        this.output.writeInt32(i12, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeInt32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i14).intValue());
        }
        this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeInt32NoTag(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64(int i12, long j12) {
        this.output.writeInt64(i12, j12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeInt64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i14).longValue());
        }
        this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeInt64NoTag(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void writeMap(int i12, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i12, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i12, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessage(int i12, Object obj) {
        this.output.writeMessage(i12, (MessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessageList(int i12, List<?> list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            writeMessage(i12, list.get(i13));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int i12, Object obj) {
        if (obj instanceof ByteString) {
            this.output.writeRawMessageSetExtension(i12, (ByteString) obj);
        } else {
            this.output.writeMessageSetExtension(i12, (MessageLite) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32(int i12, int i13) {
        this.output.writeSFixed32(i12, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeSFixed32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeSFixed32SizeNoTag += CodedOutputStream.computeSFixed32SizeNoTag(list.get(i14).intValue());
        }
        this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeSFixed32NoTag(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64(int i12, long j12) {
        this.output.writeSFixed64(i12, j12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeSFixed64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeSFixed64SizeNoTag += CodedOutputStream.computeSFixed64SizeNoTag(list.get(i14).longValue());
        }
        this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeSFixed64NoTag(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32(int i12, int i13) {
        this.output.writeSInt32(i12, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeSInt32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i14).intValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeSInt32NoTag(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64(int i12, long j12) {
        this.output.writeSInt64(i12, j12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeSInt64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i14).longValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeSInt64NoTag(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public void writeStartGroup(int i12) {
        this.output.writeTag(i12, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeString(int i12, String str) {
        this.output.writeString(i12, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeStringList(int i12, List<String> list) {
        int i13 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i13 < list.size()) {
                this.output.writeString(i12, list.get(i13));
                i13++;
            }
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i13 < list.size()) {
                writeLazyString(i12, lazyStringList.getRaw(i13));
                i13++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32(int i12, int i13) {
        this.output.writeUInt32(i12, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeUInt32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i14).intValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeUInt32NoTag(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64(int i12, long j12) {
        this.output.writeUInt64(i12, j12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                this.output.writeUInt64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        this.output.writeTag(i12, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i14).longValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i13 < list.size()) {
            this.output.writeUInt64NoTag(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroup(int i12, Object obj, Schema schema) {
        this.output.writeGroup(i12, (MessageLite) obj, schema);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessage(int i12, Object obj, Schema schema) {
        this.output.writeMessage(i12, (MessageLite) obj, schema);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroupList(int i12, List<?> list, Schema schema) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            writeGroup(i12, list.get(i13), schema);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessageList(int i12, List<?> list, Schema schema) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            writeMessage(i12, list.get(i13), schema);
        }
    }
}
