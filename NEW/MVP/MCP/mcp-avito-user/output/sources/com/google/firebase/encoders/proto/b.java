package com.google.firebase.encoders.proto;

import j.N;
import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* loaded from: classes6.dex */
final class b extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f361569b = 0;

    @Override // java.io.OutputStream
    public final void write(int i12) {
        this.f361569b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f361569b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@N byte[] bArr, int i12, int i13) {
        int i14;
        if (i12 >= 0 && i12 <= bArr.length && i13 >= 0 && (i14 = i12 + i13) <= bArr.length && i14 >= 0) {
            this.f361569b += i13;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
