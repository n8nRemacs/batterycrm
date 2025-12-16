package defpackage;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ap0 extends i1f {
    public final Context n;
    public final int o;

    public ap0(Context context) {
        super(new ph4[1], new yo0[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.i1f
    public final ph4 f() {
        return new ph4(1);
    }

    @Override // defpackage.i1f
    public final qh4 g() {
        return new yo0(this);
    }

    @Override // defpackage.i1f
    public final DecoderException h(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.i1f
    public final DecoderException i(ph4 ph4Var, qh4 qh4Var, boolean z) throws NumberFormatException {
        yo0 yo0Var = (yo0) qh4Var;
        ByteBuffer byteBuffer = ph4Var.o;
        byteBuffer.getClass();
        hsi.g(byteBuffer.hasArray());
        hsi.b(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointY = zxg.y(context);
                    int i = pointY.x;
                    int i2 = pointY.y;
                    hf6 hf6Var = ph4Var.c;
                    if (hf6Var != null) {
                        int i3 = hf6Var.M;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = hf6Var.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            yo0Var.o = kvi.a(byteBuffer.array(), byteBuffer.remaining(), iMax, null);
            yo0Var.c = ph4Var.Y;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}
