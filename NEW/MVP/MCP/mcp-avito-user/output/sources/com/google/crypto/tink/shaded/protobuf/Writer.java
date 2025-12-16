package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes6.dex */
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    FieldOrder fieldOrder();

    void writeBool(int i12, boolean z12);

    void writeBoolList(int i12, List<Boolean> list, boolean z12);

    void writeBytes(int i12, ByteString byteString);

    void writeBytesList(int i12, List<ByteString> list);

    void writeDouble(int i12, double d12);

    void writeDoubleList(int i12, List<Double> list, boolean z12);

    @Deprecated
    void writeEndGroup(int i12);

    void writeEnum(int i12, int i13);

    void writeEnumList(int i12, List<Integer> list, boolean z12);

    void writeFixed32(int i12, int i13);

    void writeFixed32List(int i12, List<Integer> list, boolean z12);

    void writeFixed64(int i12, long j12);

    void writeFixed64List(int i12, List<Long> list, boolean z12);

    void writeFloat(int i12, float f12);

    void writeFloatList(int i12, List<Float> list, boolean z12);

    @Deprecated
    void writeGroup(int i12, Object obj);

    @Deprecated
    void writeGroup(int i12, Object obj, Schema schema);

    @Deprecated
    void writeGroupList(int i12, List<?> list);

    @Deprecated
    void writeGroupList(int i12, List<?> list, Schema schema);

    void writeInt32(int i12, int i13);

    void writeInt32List(int i12, List<Integer> list, boolean z12);

    void writeInt64(int i12, long j12);

    void writeInt64List(int i12, List<Long> list, boolean z12);

    <K, V> void writeMap(int i12, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map);

    void writeMessage(int i12, Object obj);

    void writeMessage(int i12, Object obj, Schema schema);

    void writeMessageList(int i12, List<?> list);

    void writeMessageList(int i12, List<?> list, Schema schema);

    void writeMessageSetItem(int i12, Object obj);

    void writeSFixed32(int i12, int i13);

    void writeSFixed32List(int i12, List<Integer> list, boolean z12);

    void writeSFixed64(int i12, long j12);

    void writeSFixed64List(int i12, List<Long> list, boolean z12);

    void writeSInt32(int i12, int i13);

    void writeSInt32List(int i12, List<Integer> list, boolean z12);

    void writeSInt64(int i12, long j12);

    void writeSInt64List(int i12, List<Long> list, boolean z12);

    @Deprecated
    void writeStartGroup(int i12);

    void writeString(int i12, String str);

    void writeStringList(int i12, List<String> list);

    void writeUInt32(int i12, int i13);

    void writeUInt32List(int i12, List<Integer> list, boolean z12);

    void writeUInt64(int i12, long j12);

    void writeUInt64List(int i12, List<Long> list, boolean z12);
}
