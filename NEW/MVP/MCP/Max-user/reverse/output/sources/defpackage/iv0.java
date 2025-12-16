package defpackage;

import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class iv0 implements b60 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final qee d;
    public final Object e;
    public hv0 f;
    public final d60 g;
    public final int h;
    public final int i;
    public final int j;
    public final AtomicBoolean k;
    public int l;

    public iv0(d60 d60Var, f90 f90Var) {
        i30 i30Var;
        if (i30.c != null) {
            i30Var = i30.c;
        } else {
            synchronized (i30.class) {
                try {
                    if (i30.c == null) {
                        i30.c = new i30(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i30Var = i30.c;
        }
        this.d = new qee(i30Var);
        this.e = new Object();
        this.f = null;
        this.k = new AtomicBoolean(false);
        this.g = d60Var;
        int iA = f90Var.a();
        this.h = iA;
        int i = f90Var.b;
        this.i = i;
        z5j.a("mBytesPerFrame must be greater than 0.", ((long) iA) > 0);
        z5j.a("mSampleRate must be greater than 0.", ((long) i) > 0);
        this.j = 500;
        this.l = iA * 1024;
    }

    public final void a() {
        z5j.f("AudioStream has been released.", !this.b.get());
    }

    public final void b() {
        if (this.k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.l);
            hv0 hv0Var = new hv0(byteBufferAllocateDirect, this.g.read(byteBufferAllocateDirect), this.h, this.i);
            int i = this.j;
            synchronized (this.e) {
                try {
                    this.c.offer(hv0Var);
                    while (this.c.size() > i) {
                        this.c.poll();
                        gri.i("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.get()) {
                this.d.execute(new gv0(this, 2));
            }
        }
    }

    public final void c() {
        a();
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new gv0(this, 1), null);
        this.d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException(e);
        }
    }

    @Override // defpackage.b60
    public final i90 read(ByteBuffer byteBuffer) throws InterruptedException {
        boolean z;
        a();
        z5j.f("AudioStream has not been started.", this.a.get());
        this.d.execute(new l30(this, byteBuffer.remaining(), 2));
        i90 i90Var = new i90(0, 0L);
        do {
            synchronized (this.e) {
                try {
                    hv0 hv0Var = this.f;
                    this.f = null;
                    if (hv0Var == null) {
                        hv0Var = (hv0) this.c.poll();
                    }
                    if (hv0Var != null) {
                        i90Var = hv0Var.a(byteBuffer);
                        if (hv0Var.c.remaining() > 0) {
                            this.f = hv0Var;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = i90Var.a <= 0 && this.a.get() && !this.b.get();
            if (z) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {
                    gri.j("BufferedAudioStream", "Interruption while waiting for audio data", e);
                    return i90Var;
                }
            }
        } while (z);
        return i90Var;
    }
}
