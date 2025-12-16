package com.google.common.util.concurrent;

import com.google.common.primitives.k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import okhttp3.HttpUrl;

/* compiled from: AtomicDoubleArray.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37573x implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient AtomicLongArray f360663b;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i12 = objectInputStream.readInt();
        k.c cVar = new k.c();
        cVar.f360397b = 0;
        cVar.f360396a = new long[10];
        for (int i13 = 0; i13 < i12; i13++) {
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(objectInputStream.readDouble());
            int i14 = cVar.f360397b;
            int i15 = i14 + 1;
            long[] jArr = cVar.f360396a;
            if (i15 > jArr.length) {
                int length = jArr.length;
                if (i15 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int iHighestOneBit = length + (length >> 1) + 1;
                if (iHighestOneBit < i15) {
                    iHighestOneBit = Integer.highestOneBit(i14) << 1;
                }
                if (iHighestOneBit < 0) {
                    iHighestOneBit = Integer.MAX_VALUE;
                }
                cVar.f360396a = Arrays.copyOf(jArr, iHighestOneBit);
            }
            long[] jArr2 = cVar.f360396a;
            int i16 = cVar.f360397b;
            jArr2[i16] = jDoubleToRawLongBits;
            cVar.f360397b = i16 + 1;
        }
        int i17 = cVar.f360397b;
        com.google.common.primitives.k kVar = i17 == 0 ? com.google.common.primitives.k.f360391e : new com.google.common.primitives.k(cVar.f360396a, 0, i17);
        this.f360663b = new AtomicLongArray(Arrays.copyOfRange(kVar.f360392b, kVar.f360393c, kVar.f360394d));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this.f360663b.length();
        objectOutputStream.writeInt(length);
        for (int i12 = 0; i12 < length; i12++) {
            objectOutputStream.writeDouble(Double.longBitsToDouble(this.f360663b.get(i12)));
        }
    }

    public final String toString() {
        int length = this.f360663b.length();
        int i12 = length - 1;
        if (i12 == -1) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(length * 19);
        sb2.append('[');
        int i13 = 0;
        while (true) {
            sb2.append(Double.longBitsToDouble(this.f360663b.get(i13)));
            if (i13 == i12) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            i13++;
        }
    }
}
