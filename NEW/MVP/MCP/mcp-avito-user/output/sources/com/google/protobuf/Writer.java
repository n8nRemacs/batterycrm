package com.google.protobuf;

import com.google.protobuf.C37694p0;
import java.util.List;
import java.util.Map;

@InterfaceC37706w
/* loaded from: classes7.dex */
interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FieldOrder {

        /* renamed from: b, reason: collision with root package name */
        public static final FieldOrder f362824b;

        /* renamed from: c, reason: collision with root package name */
        public static final FieldOrder f362825c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ FieldOrder[] f362826d;

        static {
            FieldOrder fieldOrder = new FieldOrder("ASCENDING", 0);
            f362824b = fieldOrder;
            FieldOrder fieldOrder2 = new FieldOrder("DESCENDING", 1);
            f362825c = fieldOrder2;
            f362826d = new FieldOrder[]{fieldOrder, fieldOrder2};
        }

        public FieldOrder() {
            throw null;
        }

        public static FieldOrder valueOf(String str) {
            return (FieldOrder) java.lang.Enum.valueOf(FieldOrder.class, str);
        }

        public static FieldOrder[] values() {
            return (FieldOrder[]) f362826d.clone();
        }
    }

    void a(int i12, AbstractC37700t abstractC37700t);

    void b(int i12, List<?> list, T0 t02);

    @Deprecated
    void c(int i12, Object obj, T0 t02);

    @Deprecated
    void d(int i12, List<?> list, T0 t02);

    void e(int i12, Object obj, T0 t02);

    <K, V> void f(int i12, C37694p0.b<K, V> bVar, Map<K, V> map);

    FieldOrder fieldOrder();

    void writeBool(int i12, boolean z12);

    void writeBoolList(int i12, List<Boolean> list, boolean z12);

    void writeBytesList(int i12, List<AbstractC37700t> list);

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

    void writeInt32(int i12, int i13);

    void writeInt32List(int i12, List<Integer> list, boolean z12);

    void writeInt64(int i12, long j12);

    void writeInt64List(int i12, List<Long> list, boolean z12);

    void writeMessage(int i12, Object obj);

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
