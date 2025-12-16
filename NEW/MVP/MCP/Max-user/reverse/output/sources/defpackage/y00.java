package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class y00 implements b60 {
    public int a = 1;
    public int b = 1;
    public long c;
    public Serializable d;
    public Serializable e;
    public Object f;

    public void a() {
        z5j.f("AudioStream has been released.", !((AtomicBoolean) this.e).get());
    }

    @Override // defpackage.b60
    public i90 read(ByteBuffer byteBuffer) throws InterruptedException {
        a();
        z5j.f("AudioStream has not been started.", ((AtomicBoolean) this.d).get());
        long jRemaining = byteBuffer.remaining();
        int i = this.a;
        long jK = eti.k(i, jRemaining);
        long j = i;
        z5j.a("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * jK);
        if (i2 <= 0) {
            return new i90(0, this.c);
        }
        long jB = this.c + eti.b(this.b, jK);
        long jNanoTime = jB - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            } catch (InterruptedException e) {
                gri.j("SilentAudioStream", "Ignore interruption", e);
            }
        }
        z5j.f(null, i2 <= byteBuffer.remaining());
        byte[] bArr = (byte[]) this.f;
        if (bArr == null || bArr.length < i2) {
            this.f = new byte[i2];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put((byte[]) this.f, 0, i2).limit(iPosition + i2).position(iPosition);
        i90 i90Var = new i90(i2, this.c);
        this.c = jB;
        return i90Var;
    }
}
