package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22939y0;
import java.util.List;
import java.util.Map;

/* compiled from: Reader.java */
/* renamed from: androidx.datastore.preferences.protobuf.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
interface InterfaceC22891e1 {
    <T> T a(InterfaceC22897g1<T> interfaceC22897g1, T t12);

    <T> void b(List<T> list, InterfaceC22897g1<T> interfaceC22897g1, T t12);

    @Deprecated
    <T> T c(InterfaceC22897g1<T> interfaceC22897g1, T t12);

    <K, V> void d(Map<K, V> map, C22939y0.b<K, V> bVar, T t12);

    @Deprecated
    <T> void e(List<T> list, InterfaceC22897g1<T> interfaceC22897g1, T t12);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List<Boolean> list);

    AbstractC22934w readBytes();

    void readBytesList(List<AbstractC22934w> list);

    double readDouble();

    void readDoubleList(List<Double> list);

    int readEnum();

    void readEnumList(List<Integer> list);

    int readFixed32();

    void readFixed32List(List<Integer> list);

    long readFixed64();

    void readFixed64List(List<Long> list);

    float readFloat();

    void readFloatList(List<Float> list);

    int readInt32();

    void readInt32List(List<Integer> list);

    long readInt64();

    void readInt64List(List<Long> list);

    int readSFixed32();

    void readSFixed32List(List<Integer> list);

    long readSFixed64();

    void readSFixed64List(List<Long> list);

    int readSInt32();

    void readSInt32List(List<Integer> list);

    long readSInt64();

    void readSInt64List(List<Long> list);

    String readString();

    void readStringList(List<String> list);

    void readStringListRequireUtf8(List<String> list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List<Integer> list);

    long readUInt64();

    void readUInt64List(List<Long> list);

    boolean skipField();
}
