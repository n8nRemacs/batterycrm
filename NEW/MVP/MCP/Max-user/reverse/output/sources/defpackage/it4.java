package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class it4 extends i1f implements jof {
    public final tof n;

    public it4(tof tofVar) {
        super(new oof[2], new a72[2]);
        int i = this.g;
        ph4[] ph4VarArr = this.e;
        hsi.g(i == ph4VarArr.length);
        for (ph4 ph4Var : ph4VarArr) {
            ph4Var.y(1024);
        }
        this.n = tofVar;
    }

    @Override // defpackage.jof
    public final void a(long j) {
    }

    @Override // defpackage.i1f
    public final ph4 f() {
        return new oof(1);
    }

    @Override // defpackage.i1f
    public final qh4 g() {
        return new a72(this, 2);
    }

    @Override // defpackage.i1f
    public final DecoderException h(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.i1f
    public final DecoderException i(ph4 ph4Var, qh4 qh4Var, boolean z) {
        oof oofVar = (oof) ph4Var;
        a72 a72Var = (a72) qh4Var;
        try {
            ByteBuffer byteBuffer = oofVar.o;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            tof tofVar = this.n;
            if (z) {
                tofVar.reset();
            }
            a72Var.y(oofVar.Y, tofVar.o(0, bArrArray, iLimit), oofVar.t0);
            a72Var.d = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }
}
