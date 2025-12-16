package com.google.common.cache;

import com.google.common.cache.x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: LongAdder.java */
@XY0.b
@h
/* loaded from: classes6.dex */
final class r extends x implements Serializable, p {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f359245d = 0;
        this.f359243b = null;
        this.f359244c = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(f());
    }

    @Override // com.google.common.cache.p
    public final void a() {
        add(1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b3, code lost:
    
        if (r13.f359243b != r6) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b5, code lost:
    
        r5 = new com.google.common.cache.x.b[r7 << 1];
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
    
        r13.f359243b = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    @Override // com.google.common.cache.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(long r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.r.add(long):void");
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return f();
    }

    public final long f() {
        long j12 = this.f359244c;
        x.b[] bVarArr = this.f359243b;
        if (bVarArr != null) {
            for (x.b bVar : bVarArr) {
                if (bVar != null) {
                    j12 += bVar.f359248a;
                }
            }
        }
        return j12;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return f();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) f();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return f();
    }

    public final String toString() {
        return Long.toString(f());
    }
}
