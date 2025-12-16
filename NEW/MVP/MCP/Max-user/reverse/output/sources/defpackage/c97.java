package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import tech.kwik.flupke.core.HttpError;

/* loaded from: classes3.dex */
public final class c97 extends InputStream {
    public ByteBuffer a;
    public final /* synthetic */ ctc b;
    public final /* synthetic */ d97 c;

    public c97(d97 d97Var, ctc ctcVar) {
        this.c = d97Var;
        this.b = ctcVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (l()) {
            return this.a.remaining();
        }
        return 0;
    }

    public final boolean l() throws IOException {
        byte[] bArrArray;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null && byteBuffer.position() != this.a.limit()) {
            return this.a.position() < this.a.limit();
        }
        try {
            tei teiVarP = this.c.d.p(this.b.e);
            if (!(teiVarP instanceof ge4)) {
                return false;
            }
            ge4 ge4Var = (ge4) teiVarP;
            int iLimit = ge4Var.b.limit();
            if (iLimit == ge4Var.b.array().length) {
                bArrArray = ge4Var.b.array();
            } else {
                byte[] bArr = new byte[iLimit];
                ge4Var.b.get(bArr);
                bArrArray = bArr;
            }
            this.a = ByteBuffer.wrap(bArrArray);
            return true;
        } catch (HttpError e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (l()) {
            return this.a.get();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (!l()) {
            return -1;
        }
        int iMin = Integer.min(this.a.remaining(), bArr.length);
        this.a.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!l()) {
            return -1;
        }
        int iMin = Integer.min(this.a.remaining(), i2);
        this.a.get(bArr, i, iMin);
        return iMin;
    }
}
