package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ja2 extends xi0 {
    public final SparseArray i = new SparseArray();

    @Override // defpackage.l50
    public final void c(ByteBuffer byteBuffer) {
        ka2 ka2Var = (ka2) this.i.get(this.b.b);
        hsi.h(ka2Var);
        int iRemaining = byteBuffer.remaining() / this.b.d;
        ByteBuffer byteBufferK = k(this.c.d * iRemaining);
        wsi.d(byteBuffer, this.b, byteBufferK, this.c, ka2Var, iRemaining, false);
        byteBufferK.flip();
    }

    @Override // defpackage.xi0
    public final i50 g(i50 i50Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (i50Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(i50Var);
        }
        ka2 ka2Var = (ka2) this.i.get(i50Var.b);
        if (ka2Var != null) {
            return ka2Var.e ? i50.e : new i50(i50Var.a, ka2Var.b, 2);
        }
        throw new AudioProcessor$UnhandledAudioFormatException("No mixing matrix for input channel count", i50Var);
    }
}
