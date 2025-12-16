package com.google.crypto.tink.util;

import aZ0.j;
import com.google.crypto.tink.subtle.Hex;
import java.util.Arrays;

@j
/* loaded from: classes6.dex */
public final class Bytes {
    private final byte[] data;

    private Bytes(byte[] bArr, int i12, int i13) {
        byte[] bArr2 = new byte[i13];
        this.data = bArr2;
        System.arraycopy(bArr, i12, bArr2, 0, i13);
    }

    public static Bytes copyFrom(byte[] bArr) {
        if (bArr != null) {
            return copyFrom(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Bytes) {
            return Arrays.equals(((Bytes) obj).data, this.data);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public int size() {
        return this.data.length;
    }

    public byte[] toByteArray() {
        byte[] bArr = this.data;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public String toString() {
        return "Bytes(" + Hex.encode(this.data) + ")";
    }

    public static Bytes copyFrom(byte[] bArr, int i12, int i13) {
        if (bArr != null) {
            return new Bytes(bArr, i12, i13);
        }
        throw new NullPointerException("data must be non-null");
    }
}
