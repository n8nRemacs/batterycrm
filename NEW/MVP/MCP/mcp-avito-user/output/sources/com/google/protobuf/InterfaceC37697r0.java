package com.google.protobuf;

import com.google.protobuf.C37694p0;

/* compiled from: MapFieldSchema.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.r0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
interface InterfaceC37697r0 {
    C37696q0 a();

    C37696q0 forMapData(Object obj);

    C37694p0.b<?, ?> forMapMetadata(Object obj);

    C37696q0 forMutableMapData(Object obj);

    int getSerializedSize(int i12, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    @InterfaceC37704v
    C37696q0 mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
