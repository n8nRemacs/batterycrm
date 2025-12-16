package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a0g implements i97 {
    public static final AtomicReference w0 = new AtomicReference();
    public ood X;
    public zmd Y;
    public boolean Z;
    public final String a;
    public final HashMap b;
    public final h01 c;
    public final vgg d;
    public ye4 o;
    public long s0;
    public long t0;
    public long u0;
    public long v0;

    public a0g(h01 h01Var, String str, vgg vggVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        this.d = vggVar;
        this.b = new HashMap();
        this.c = h01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    @Override // defpackage.qe4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long R(defpackage.ye4 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a0g.R(ye4):long");
    }

    @Override // defpackage.qe4
    public final void S(vgg vggVar) {
    }

    public final int b(int i, byte[] bArr, int i2) throws IOException {
        long j = this.t0;
        if (j != -1) {
            i2 = (int) Math.min(i2, j - this.v0);
        }
        if (i2 != 0) {
            int i3 = this.X.Y.l().read(bArr, i, i2);
            if (i3 != -1) {
                this.v0 += i3;
                vgg vggVar = this.d;
                if (vggVar != null) {
                    ((dk4) vggVar).d(this.o, true, i3);
                }
                return i3;
            }
            long j2 = this.t0;
            if (j2 != -1 && j2 != this.v0) {
                throw new EOFException();
            }
        }
        return -1;
    }

    public final void c() throws IOException {
        if (this.u0 == this.s0) {
            return;
        }
        AtomicReference atomicReference = w0;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j = this.u0;
            long j2 = this.s0;
            if (j == j2) {
                atomicReference.set(bArr);
                return;
            }
            int i = this.X.Y.l().read(bArr, 0, (int) Math.min(j2 - j, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i == -1) {
                throw new EOFException();
            }
            this.u0 += i;
            vgg vggVar = this.d;
            if (vggVar != null) {
                ((dk4) vggVar).d(this.o, true, i);
            }
        }
    }

    @Override // defpackage.qe4
    public final void close() throws Throwable {
        if (this.Z) {
            this.Z = false;
            vgg vggVar = this.d;
            if (vggVar != null) {
                ((dk4) vggVar).e(this.o, true);
            }
            yxg.c(this.X.Y);
            this.X = null;
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        zmd zmdVar = this.Y;
        if (zmdVar == null) {
            return null;
        }
        return Uri.parse(zmdVar.b.i);
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        try {
            c();
            return b(i, bArr, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.a(e, this.o, 2);
        }
    }

    @Override // defpackage.qe4
    public final Map x() {
        return Collections.EMPTY_MAP;
    }
}
