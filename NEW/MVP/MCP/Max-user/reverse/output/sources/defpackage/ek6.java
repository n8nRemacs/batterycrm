package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.EncodedImage;

/* loaded from: classes2.dex */
public final class ek6 implements uud {
    public volatile boolean a;
    public volatile ae4 b;
    public final ConcurrentLinkedQueue c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e;
    public final g9g f;
    public volatile j8i g;
    public volatile boolean h;

    public ek6() {
        new AtomicLong();
        this.e = new AtomicInteger();
        this.c = new ConcurrentLinkedQueue();
        this.f = new g9g();
    }

    public static void b(j8i j8iVar) {
        if (j8iVar != null) {
            synchronized (j8iVar.a) {
                j8iVar.a.notify();
            }
        }
    }

    @Override // defpackage.uud
    public final void a(ae4 ae4Var, byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.get();
        byte b = byteBufferWrap.get();
        byteBufferWrap.getShort();
        if (b == 1) {
            this.h = true;
        }
    }

    public final synchronized void c(boolean z) {
        try {
            if (this.a) {
                this.a = false;
                j8i j8iVar = this.g;
                if (j8iVar != null) {
                    j8iVar.d = true;
                    if (z) {
                        synchronized (j8iVar.b) {
                            j8iVar.c = null;
                        }
                    }
                }
                b(j8iVar);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    EncodedImage encodedImage = (EncodedImage) it.next();
                    this.d.addAndGet(-encodedImage.buffer.remaining());
                    encodedImage.release();
                    it.remove();
                }
            }
        } finally {
        }
    }

    public final synchronized void d(ae4 ae4Var) {
        try {
            if (this.b != null) {
                this.b.e.remove(this);
                this.b.c(this);
            }
            c(true);
            this.b = ae4Var;
            if (this.b != null) {
                this.b.e.add(this);
                this.b.a(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        c(true);
        this.a = true;
        j8i j8iVar = new j8i(this, this.b);
        this.g = j8iVar;
        j8iVar.start();
    }
}
