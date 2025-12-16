package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC23136e;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.d0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: CameraMotionRenderer.java */
@J
/* loaded from: classes.dex */
public final class b extends AbstractC23136e {

    /* renamed from: p, reason: collision with root package name */
    public final DecoderInputBuffer f50323p;

    /* renamed from: q, reason: collision with root package name */
    public final z f50324q;

    /* renamed from: r, reason: collision with root package name */
    public long f50325r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public a f50326s;

    /* renamed from: t, reason: collision with root package name */
    public long f50327t;

    public b() {
        super(6);
        this.f50323p = new DecoderInputBuffer(1);
        this.f50324q = new z();
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void D() {
        a aVar = this.f50326s;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void F(long j12, boolean z12) {
        this.f50327t = Long.MIN_VALUE;
        a aVar = this.f50326s;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void K(C23108t[] c23108tArr, long j12, long j13) {
        this.f50325r = j13;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.Y.b
    public final void b(int i12, @P Object obj) {
        if (i12 == 8) {
            this.f50326s = (a) obj;
        }
    }

    @Override // androidx.media3.exoplayer.c0, androidx.media3.exoplayer.d0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.d0
    public final int i(C23108t c23108t) {
        return "application/x-camera-motion".equals(c23108t.f47757m) ? d0.e(4, 0, 0) : d0.e(0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean n() {
        return true;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void o(long j12, long j13) {
        float[] fArr;
        while (!t() && this.f50327t < 100000 + j12) {
            DecoderInputBuffer decoderInputBuffer = this.f50323p;
            decoderInputBuffer.h();
            F f12 = this.f49141d;
            f12.a();
            if (L(f12, decoderInputBuffer, 0) != -4 || decoderInputBuffer.f(4)) {
                return;
            }
            this.f50327t = decoderInputBuffer.f48325f;
            if (this.f50326s != null && !decoderInputBuffer.f(BeduinInputModel.MIN_TEXT_VERSION)) {
                decoderInputBuffer.k();
                ByteBuffer byteBuffer = decoderInputBuffer.f48323d;
                int i12 = M.f47887a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    z zVar = this.f50324q;
                    zVar.D(iLimit, bArrArray);
                    zVar.F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i13 = 0; i13 < 3; i13++) {
                        fArr2[i13] = Float.intBitsToFloat(zVar.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f50326s.d(this.f50327t - this.f50325r, fArr);
                }
            }
        }
    }
}
