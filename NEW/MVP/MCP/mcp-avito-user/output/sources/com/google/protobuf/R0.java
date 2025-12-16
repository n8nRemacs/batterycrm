package com.google.protobuf;

import com.google.protobuf.C37694p0;
import java.util.List;
import java.util.Map;

/* compiled from: Reader.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
interface R0 {
    <T> void a(T t12, T0<T> t02, M m12);

    <T> void b(List<T> list, T0<T> t02, M m12);

    @Deprecated
    <T> T c(Class<T> cls, M m12);

    <T> T d(Class<T> cls, M m12);

    <K, V> void e(Map<K, V> map, C37694p0.b<K, V> bVar, M m12);

    <T> void f(T t12, T0<T> t02, M m12);

    @Deprecated
    <T> void g(List<T> list, T0<T> t02, M m12);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List<Boolean> list);

    AbstractC37700t readBytes();

    void readBytesList(List<AbstractC37700t> list);

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
