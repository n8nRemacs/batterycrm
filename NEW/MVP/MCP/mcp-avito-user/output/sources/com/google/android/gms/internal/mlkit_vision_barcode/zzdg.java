package com.google.android.gms.internal.mlkit_vision_barcode;

import j.N;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzdg extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f351843b = 0;

    @Override // java.io.OutputStream
    public final void write(int i12) {
        this.f351843b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f351843b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@N byte[] bArr, int i12, int i13) {
        int length;
        int i14;
        if (i12 >= 0 && i12 <= (length = bArr.length) && i13 >= 0 && (i14 = i12 + i13) <= length && i14 >= 0) {
            this.f351843b += i13;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
