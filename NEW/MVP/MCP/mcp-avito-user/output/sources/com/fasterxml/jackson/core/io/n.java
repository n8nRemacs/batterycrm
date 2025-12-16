package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: SerializedString.java */
/* loaded from: classes3.dex */
public class n implements com.fasterxml.jackson.core.l, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final h f341185g = h.f341173c;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f341186b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f341187c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f341188d;

    /* renamed from: e, reason: collision with root package name */
    public char[] f341189e;

    /* renamed from: f, reason: collision with root package name */
    public transient String f341190f;

    public n(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f341186b = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f341190f = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f341186b);
    }

    @Override // com.fasterxml.jackson.core.l
    public final char[] a() {
        char[] cArr = this.f341189e;
        if (cArr != null) {
            return cArr;
        }
        f341185g.getClass();
        char[] cArrD = h.d(this.f341186b);
        this.f341189e = cArrD;
        return cArrD;
    }

    @Override // com.fasterxml.jackson.core.l
    public final int b(int i12, char[] cArr) {
        char[] cArrD = this.f341189e;
        if (cArrD == null) {
            f341185g.getClass();
            cArrD = h.d(this.f341186b);
            this.f341189e = cArrD;
        }
        int length = cArrD.length;
        if (i12 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrD, 0, cArr, i12, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.l
    public final int c(int i12, byte[] bArr) {
        byte[] bArrC = this.f341188d;
        if (bArrC == null) {
            f341185g.getClass();
            bArrC = h.c(this.f341186b);
            this.f341188d = bArrC;
        }
        int length = bArrC.length;
        if (i12 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrC, 0, bArr, i12, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.l
    public final int d(int i12, byte[] bArr) {
        byte[] bArrE = this.f341187c;
        if (bArrE == null) {
            f341185g.getClass();
            bArrE = h.e(this.f341186b);
            this.f341187c = bArrE;
        }
        int length = bArrE.length;
        if (i12 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrE, 0, bArr, i12, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.l
    public final int e(int i12, char[] cArr) {
        String str = this.f341186b;
        int length = str.length();
        if (i12 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i12);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f341186b.equals(((n) obj).f341186b);
    }

    @Override // com.fasterxml.jackson.core.l
    public final byte[] f() {
        byte[] bArr = this.f341187c;
        if (bArr != null) {
            return bArr;
        }
        f341185g.getClass();
        byte[] bArrE = h.e(this.f341186b);
        this.f341187c = bArrE;
        return bArrE;
    }

    @Override // com.fasterxml.jackson.core.l
    public final byte[] g() {
        byte[] bArr = this.f341188d;
        if (bArr != null) {
            return bArr;
        }
        f341185g.getClass();
        byte[] bArrC = h.c(this.f341186b);
        this.f341188d = bArrC;
        return bArrC;
    }

    @Override // com.fasterxml.jackson.core.l
    public final String getValue() {
        return this.f341186b;
    }

    public final int hashCode() {
        return this.f341186b.hashCode();
    }

    public Object readResolve() {
        return new n(this.f341190f);
    }

    public final String toString() {
        return this.f341186b;
    }
}
