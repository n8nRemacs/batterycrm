package com.google.protobuf;

import com.google.protobuf.C37685l;

/* compiled from: Schema.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
interface T0<T> {
    int a(GeneratedMessageLite generatedMessageLite);

    void b(T t12, Writer writer);

    int c(AbstractC37663a abstractC37663a);

    void d(T t12, byte[] bArr, int i12, int i13, C37685l.b bVar);

    void e(T t12, R0 r02, M m12);

    boolean f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    boolean isInitialized(T t12);

    void makeImmutable(T t12);

    void mergeFrom(T t12, T t13);

    T newInstance();
}
