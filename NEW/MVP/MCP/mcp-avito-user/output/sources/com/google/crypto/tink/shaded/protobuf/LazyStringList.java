package com.google.crypto.tink.shaded.protobuf;

import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends ByteString> collection);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int i12);

    ByteString getByteString(int i12);

    Object getRaw(int i12);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList lazyStringList);

    void set(int i12, ByteString byteString);

    void set(int i12, byte[] bArr);
}
