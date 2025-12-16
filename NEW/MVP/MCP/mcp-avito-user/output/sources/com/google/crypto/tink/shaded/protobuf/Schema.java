package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ArrayDecoders;

@CheckReturnValue
/* loaded from: classes6.dex */
interface Schema<T> {
    boolean equals(T t12, T t13);

    int getSerializedSize(T t12);

    int hashCode(T t12);

    boolean isInitialized(T t12);

    void makeImmutable(T t12);

    void mergeFrom(T t12, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    void mergeFrom(T t12, T t13);

    void mergeFrom(T t12, byte[] bArr, int i12, int i13, ArrayDecoders.Registers registers);

    T newInstance();

    void writeTo(T t12, Writer writer);
}
