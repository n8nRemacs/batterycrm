package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.a;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: Id3Peeker.java */
/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final F f345342a = new F(10);

    @P
    public final Metadata a(f fVar, @P a.InterfaceC10587a interfaceC10587a) throws EOFException, InterruptedIOException {
        F f12 = this.f345342a;
        Metadata metadataC = null;
        int i12 = 0;
        while (true) {
            try {
                fVar.a(f12.f348070a, 0, 10, false);
                f12.B(0);
                if (f12.t() != 4801587) {
                    break;
                }
                f12.C(3);
                int iQ2 = f12.q();
                int i13 = iQ2 + 10;
                if (metadataC == null) {
                    byte[] bArr = new byte[i13];
                    System.arraycopy(f12.f348070a, 0, bArr, 0, 10);
                    fVar.a(bArr, 10, iQ2, false);
                    metadataC = new com.google.android.exoplayer2.metadata.id3.a(interfaceC10587a).c(i13, bArr);
                } else {
                    fVar.l(iQ2, false);
                }
                i12 += i13;
            } catch (EOFException unused) {
            }
        }
        fVar.f344497f = 0;
        fVar.l(i12, false);
        return metadataC;
    }
}
