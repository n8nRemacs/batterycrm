package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e47 extends b93 {
    public byte[] t0;
    public volatile boolean u0;
    public byte[] v0;

    @Override // defpackage.dc8
    public final void c() {
        this.u0 = true;
    }

    @Override // defpackage.dc8
    public final void load() {
        try {
            this.s0.R(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.u0) {
                byte[] bArr = this.t0;
                if (bArr.length < i2 + 16384) {
                    this.t0 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.s0.read(this.t0, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.u0) {
                this.v0 = Arrays.copyOf(this.t0, i2);
            }
            y7j.b(this.s0);
        } catch (Throwable th) {
            y7j.b(this.s0);
            throw th;
        }
    }
}
