package com.fasterxml.jackson.databind.node;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* compiled from: NodeSerialization.java */
/* loaded from: classes4.dex */
class q implements Serializable, Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f342214b;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        int i12;
        byte[] bArrG;
        int i13 = objectInput.readInt();
        if (i13 <= 100000) {
            bArrG = new byte[i13];
            objectInput.readFully(bArrG, 0, i13);
        } else {
            com.fasterxml.jackson.core.util.c cVar = new com.fasterxml.jackson.core.util.c((com.fasterxml.jackson.core.util.a) null, 100000);
            cVar.f();
            byte[] bArr = cVar.f341287e;
            loop0: while (true) {
                i12 = 0;
                do {
                    int iMin = Math.min(bArr.length - i12, i13);
                    objectInput.readFully(bArr, 0, iMin);
                    i13 -= iMin;
                    i12 += iMin;
                    if (i13 == 0) {
                        break loop0;
                    }
                } while (i12 != bArr.length);
                cVar.a();
                bArr = cVar.f341287e;
            }
            cVar.f341288f = i12;
            bArrG = cVar.g();
        }
        this.f342214b = bArrG;
    }

    public Object readResolve() {
        try {
            return k.a(this.f342214b);
        } catch (IOException e12) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e12.getMessage(), e12);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.f342214b.length);
        objectOutput.write(this.f342214b);
    }
}
