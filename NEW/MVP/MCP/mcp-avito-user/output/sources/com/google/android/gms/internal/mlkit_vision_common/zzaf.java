package com.google.android.gms.internal.mlkit_vision_common;

import j.N;
import java.io.OutputStream;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzaf extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f352583b = 0;

    @Override // java.io.OutputStream
    public final void write(int i12) {
        this.f352583b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f352583b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@N byte[] bArr, int i12, int i13) {
        int length;
        int i14;
        if (i12 >= 0 && i12 <= (length = bArr.length) && i13 >= 0 && (i14 = i12 + i13) <= length && i14 >= 0) {
            this.f352583b += i13;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
