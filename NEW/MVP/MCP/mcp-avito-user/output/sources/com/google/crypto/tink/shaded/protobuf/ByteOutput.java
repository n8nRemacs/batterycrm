package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class ByteOutput {
    public abstract void write(byte b12);

    public abstract void write(ByteBuffer byteBuffer);

    public abstract void write(byte[] bArr, int i12, int i13);

    public abstract void writeLazy(ByteBuffer byteBuffer);

    public abstract void writeLazy(byte[] bArr, int i12, int i13);
}
