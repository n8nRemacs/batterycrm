package com.google.android.gms.internal.mlkit_vision_face_bundled;

import j.N;
import java.io.OutputStream;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzby extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f353523b = 0;

    @Override // java.io.OutputStream
    public final void write(int i12) {
        this.f353523b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f353523b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@N byte[] bArr, int i12, int i13) {
        int length;
        int i14;
        if (i12 >= 0 && i12 <= (length = bArr.length) && i13 >= 0 && (i14 = i12 + i13) <= length && i14 >= 0) {
            this.f353523b += i13;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
