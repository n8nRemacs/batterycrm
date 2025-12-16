package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: ByteArrayDataSink.java */
/* renamed from: com.google.android.exoplayer2.upstream.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36577g implements InterfaceC36582l {

    /* renamed from: a, reason: collision with root package name */
    public ByteArrayOutputStream f347915a;

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36582l
    public final void close() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.f347915a;
        int i12 = U.f348106a;
        byteArrayOutputStream.close();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36582l
    public final void e(p pVar) {
        long j12 = pVar.f347935g;
        if (j12 == -1) {
            this.f347915a = new ByteArrayOutputStream();
        } else {
            C36585a.b(j12 <= 2147483647L);
            this.f347915a = new ByteArrayOutputStream((int) j12);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36582l
    public final void write(byte[] bArr, int i12, int i13) {
        ByteArrayOutputStream byteArrayOutputStream = this.f347915a;
        int i14 = U.f348106a;
        byteArrayOutputStream.write(bArr, i12, i13);
    }
}
