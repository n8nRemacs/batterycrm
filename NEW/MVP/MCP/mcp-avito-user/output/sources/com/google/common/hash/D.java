package com.google.common.hash;

import com.google.common.hash.L;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: LongAdder.java */
@InterfaceC37497l
/* loaded from: classes6.dex */
final class D extends L implements Serializable, B {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f360238d = 0;
        this.f360236b = null;
        this.f360237c = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b3, code lost:
    
        if (r13.f360236b != r6) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b5, code lost:
    
        r5 = new com.google.common.hash.L.b[r7 << 1];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        if (r8 >= r7) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bc, code lost:
    
        r5[r8] = r6[r8];
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c5, code lost:
    
        r13.f360236b = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    @Override // com.google.common.hash.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(long r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.D.add(long):void");
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return e();
    }

    public final long e() {
        long j12 = this.f360237c;
        L.b[] bVarArr = this.f360236b;
        if (bVarArr != null) {
            for (L.b bVar : bVarArr) {
                if (bVar != null) {
                    j12 += bVar.f360241a;
                }
            }
        }
        return j12;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return e();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) e();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return e();
    }

    public final String toString() {
        return Long.toString(e());
    }
}
