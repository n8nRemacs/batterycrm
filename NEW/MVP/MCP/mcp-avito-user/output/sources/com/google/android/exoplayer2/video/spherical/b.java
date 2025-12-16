package com.google.android.exoplayer2.video.spherical;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.AbstractC36523f;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: CameraMotionRenderer.java */
/* loaded from: classes6.dex */
public final class b extends AbstractC36523f {

    /* renamed from: n, reason: collision with root package name */
    public final DecoderInputBuffer f348325n;

    /* renamed from: o, reason: collision with root package name */
    public final F f348326o;

    /* renamed from: p, reason: collision with root package name */
    public long f348327p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public a f348328q;

    /* renamed from: r, reason: collision with root package name */
    public long f348329r;

    public b() {
        super(6);
        this.f348325n = new DecoderInputBuffer(1);
        this.f348326o = new F();
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void B() {
        a aVar = this.f348328q;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void D(long j12, boolean z12) {
        this.f348329r = Long.MIN_VALUE;
        a aVar = this.f348328q;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void H(I[] iArr, long j12, long j13) {
        this.f348327p = j13;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.e0.b
    public final void b(int i12, @P Object obj) {
        if (i12 == 8) {
            this.f348328q = (a) obj;
        }
    }

    @Override // com.google.android.exoplayer2.h0, com.google.android.exoplayer2.i0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void o(long j12, long j13) {
        float[] fArr;
        while (!t() && this.f348329r < 100000 + j12) {
            DecoderInputBuffer decoderInputBuffer = this.f348325n;
            decoderInputBuffer.h();
            J j14 = this.f345397c;
            j14.a();
            if (I(j14, decoderInputBuffer, 0) != -4 || decoderInputBuffer.f(4)) {
                return;
            }
            this.f348329r = decoderInputBuffer.f344207f;
            if (this.f348328q != null && !decoderInputBuffer.f(BeduinInputModel.MIN_TEXT_VERSION)) {
                decoderInputBuffer.k();
                ByteBuffer byteBuffer = decoderInputBuffer.f344205d;
                int i12 = U.f348106a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    F f12 = this.f348326o;
                    f12.z(iLimit, bArrArray);
                    f12.B(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i13 = 0; i13 < 3; i13++) {
                        fArr2[i13] = Float.intBitsToFloat(f12.f());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f348328q.d(this.f348329r - this.f348327p, fArr);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.i0
    public final int y(I i12) {
        return "application/x-camera-motion".equals(i12.f343476m) ? i0.e(4, 0, 0) : i0.e(0, 0, 0);
    }
}
