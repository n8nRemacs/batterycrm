package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22939y0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FieldOrder {

        /* renamed from: b, reason: collision with root package name */
        public static final FieldOrder f45792b;

        /* renamed from: c, reason: collision with root package name */
        public static final FieldOrder f45793c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ FieldOrder[] f45794d;

        static {
            FieldOrder fieldOrder = new FieldOrder("ASCENDING", 0);
            f45792b = fieldOrder;
            FieldOrder fieldOrder2 = new FieldOrder("DESCENDING", 1);
            f45793c = fieldOrder2;
            f45794d = new FieldOrder[]{fieldOrder, fieldOrder2};
        }

        public FieldOrder() {
            throw null;
        }

        public static FieldOrder valueOf(String str) {
            return (FieldOrder) Enum.valueOf(FieldOrder.class, str);
        }

        public static FieldOrder[] values() {
            return (FieldOrder[]) f45794d.clone();
        }
    }

    void a(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1);

    void b(int i12, AbstractC22934w abstractC22934w);

    <K, V> void c(int i12, C22939y0.b<K, V> bVar, Map<K, V> map);

    @Deprecated
    void d(int i12, List<?> list, InterfaceC22897g1 interfaceC22897g1);

    @Deprecated
    void e(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1);

    void f(int i12, List<?> list, InterfaceC22897g1 interfaceC22897g1);

    FieldOrder fieldOrder();

    void writeBool(int i12, boolean z12);

    void writeBoolList(int i12, List<Boolean> list, boolean z12);

    void writeBytesList(int i12, List<AbstractC22934w> list);

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
