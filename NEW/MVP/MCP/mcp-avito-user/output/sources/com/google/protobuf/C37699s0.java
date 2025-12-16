package com.google.protobuf;

import com.google.protobuf.C37694p0;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.s0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C37699s0 implements InterfaceC37697r0 {
    @Override // com.google.protobuf.InterfaceC37697r0
    public final C37696q0 a() {
        return C37696q0.f362942c.k();
    }

    @Override // com.google.protobuf.InterfaceC37697r0
    public final C37696q0 forMapData(Object obj) {
        return (C37696q0) obj;
    }

    @Override // com.google.protobuf.InterfaceC37697r0
    public final C37694p0.b<?, ?> forMapMetadata(Object obj) {
        return ((C37694p0) obj).f362933a;
    }

    @Override // com.google.protobuf.InterfaceC37697r0
    public final C37696q0 forMutableMapData(Object obj) {
        return (C37696q0) obj;
    }

    @Override // com.google.protobuf.InterfaceC37697r0
    public final int getSerializedSize(int i12, Object obj, Object obj2) {
        C37696q0 c37696q0 = (C37696q0) obj;
        C37694p0 c37694p0 = (C37694p0) obj2;
        int iH2 = 0;
        if (!c37696q0.isEmpty()) {
            for (Map.Entry entry : c37696q0.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c37694p0.getClass();
                int iB2 = CodedOutputStream.B(i12);
                int iA2 = C37694p0.a(c37694p0.f362933a, key, value);
                iH2 = com.google.firebase.components.g.h(iA2, iA2, iB2, iH2);
            }
        }
        return iH2;
    }

    @Override // com.google.protobuf.InterfaceC37697r0
    public final boolean isImmutable(Object obj) {
        return !((C37696q0) obj).f362943b;
    }

    @Override // com.google.protobuf.InterfaceC37697r0
    public final C37696q0 mergeFrom(Object obj, Object obj2) {
        C37696q0 c37696q0K = (C37696q0) obj;
        C37696q0 c37696q0 = (C37696q0) obj2;
        if (!c37696q0.isEmpty()) {
            if (!c37696q0K.f362943b) {
                c37696q0K = c37696q0K.k();
            }
            c37696q0K.e();
            if (!c37696q0.isEmpty()) {
                c37696q0K.putAll(c37696q0);
            }
        }
        return c37696q0K;
    }

    @Override // com.google.protobuf.InterfaceC37697r0
    public final Object toImmutable(Object obj) {
        ((C37696q0) obj).f362943b = false;
        return obj;
    }
}
