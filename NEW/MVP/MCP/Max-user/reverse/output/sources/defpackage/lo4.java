package defpackage;

import androidx.media3.muxer.MuxerException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class lo4 implements s9a {
    public static final String b = mk6.X;
    public final mk6 a;

    public lo4(mk6 mk6Var) {
        this.a = mk6Var;
    }

    @Override // defpackage.s9a
    public final void A(ry9 ry9Var) {
        this.a.A(ry9Var);
    }

    @Override // defpackage.s9a
    public final void J(int i, ByteBuffer byteBuffer, zu0 zu0Var) throws MuxerException {
        this.a.J(i, byteBuffer, zu0Var);
    }

    @Override // defpackage.s9a
    public final int c0(hf6 hf6Var) {
        return this.a.c0(hf6Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        this.a.close();
    }
}
