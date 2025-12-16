package com.yandex.runtime.bindings;

import android.graphics.PointF;
import com.yandex.runtime.TypeDictionary;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public interface Archive {
    byte add(byte b12);

    double add(double d12);

    float add(float f12);

    int add(int i12);

    long add(long j12);

    PointF add(PointF pointF, boolean z12);

    <T> TypeDictionary<T> add(TypeDictionary<T> typeDictionary, boolean z12, ArchivingHandler<T> archivingHandler);

    <T extends Serializable> T add(T t12, boolean z12, Class<T> cls);

    Boolean add(Boolean bool, boolean z12);

    Byte add(Byte b12, boolean z12);

    Double add(Double d12, boolean z12);

    <T extends Enum<T>> T add(T t12, boolean z12, Class<T> cls);

    Float add(Float f12, boolean z12);

    Integer add(Integer num, boolean z12);

    Long add(Long l12, boolean z12);

    <T> T add(T t12, ArchivingHandler<T> archivingHandler);

    String add(String str, boolean z12);

    ByteBuffer add(ByteBuffer byteBuffer);

    <T> List<T> add(List<T> list, boolean z12, ArchivingHandler<T> archivingHandler);

    <Key, Value> Map<Key, Value> add(Map<Key, Value> map, boolean z12, ArchivingHandler<Key> archivingHandler, ArchivingHandler<Value> archivingHandler2);

    boolean add(boolean z12);

    byte[] add(byte[] bArr, boolean z12);

    boolean isReader();
}
