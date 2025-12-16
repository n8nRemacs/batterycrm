package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final class rie implements yhe {
    public final z87 a;
    public final sa9 b;
    public final long c;
    public final tb3 d;
    public volatile qie e;
    public final Thread g;
    public Consumer h;
    public Consumer i;
    public BiConsumer j;
    public final ReentrantLock f = new ReentrantLock();
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue l = new ConcurrentLinkedQueue();

    public rie(y87 y87Var, sa9 sa9Var, sb3 sb3Var, sb3 sb3Var2, tb3 tb3Var) {
        this.a = y87Var;
        this.b = sa9Var;
        long j = ((d97) sa9Var.a).a.a;
        this.c = j;
        this.d = tb3Var;
        this.e = qie.a;
        this.h = (Consumer) Optional.ofNullable(sb3Var).orElse(new sb3(10));
        this.i = (Consumer) Optional.ofNullable(sb3Var2).orElse(new sb3(11));
        this.j = new oie();
        ((HashMap) sa9Var.b).put(10307L, new xga(11));
        Thread thread = new Thread(new aee(this, 1, sa9Var), vb9.e(j, "webtransport-connectstream-"));
        this.g = thread;
        thread.start();
    }

    public final boolean a(qie qieVar, Predicate predicate, Predicate predicate2) {
        this.f.lock();
        try {
            if (predicate2.test(this.e)) {
                this.f.unlock();
                return false;
            }
            if (predicate.test(this.e)) {
                this.e = qieVar;
                this.f.unlock();
                return true;
            }
            throw new IllegalStateException("Invalid state transition from " + this.e + " to " + qieVar);
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    public final void b(long j, String str) throws IOException {
        if (a(qie.c, new nie(1), new nie(2))) {
            if (j < 0 || j > 4294967295L) {
                throw new IllegalArgumentException("Application error code must be a 32-bit unsigned integer");
            }
            if (str.getBytes().length > 1024) {
                throw new IllegalArgumentException("Error message must not be longer than 1024 bytes");
            }
            int i = (int) j;
            Charset charset = StandardCharsets.UTF_8;
            if (str.getBytes(charset).length > 1024) {
                throw new IllegalArgumentException("Error message must not be longer than 1024 bytes");
            }
            d97 d97Var = (d97) this.b.a;
            owg owgVar = d97Var.b;
            byte[] bytes = str.getBytes(charset);
            int length = bytes.length + 4;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(epi.a(length) + epi.a(10307L) + length);
            epi.b(10307, byteBufferAllocate);
            epi.b(length, byteBufferAllocate);
            byteBufferAllocate.putInt(i);
            byteBufferAllocate.put(bytes);
            owgVar.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            byteBufferAllocate.position();
            d97Var.b.close();
            a(qie.d, new nie(3), new kk8(28));
            this.k.forEach(new sb3(8));
            this.l.forEach(new sb3(9));
            this.g.interrupt();
            this.j.accept(Long.valueOf(j), str);
            this.d.c(this);
        }
    }

    public final void c(long j, String str) {
        if (a(qie.c, new nie(3), new kk8(29))) {
            a(qie.d, new nie(3), new kk8(28));
            this.k.forEach(new sb3(8));
            this.l.forEach(new sb3(9));
            try {
                ((d97) this.b.a).b.close();
            } catch (IOException unused) {
            }
            this.d.c(this);
            this.j.accept(Long.valueOf(j), str);
        }
    }

    public final void d(ca7 ca7Var) {
        qie qieVar = qie.b;
        if (!ca7Var.c()) {
            if (this.e != qieVar) {
                ca7Var.d(386759528L);
                return;
            } else {
                this.l.add(ca7Var);
                this.h.accept(new pie(ca7Var, 1));
                return;
            }
        }
        if (this.e != qieVar) {
            ca7Var.d(386759528L);
            ca7Var.e(386759528L);
        } else {
            this.k.add(ca7Var);
            this.l.add(ca7Var);
            this.i.accept(new pie(ca7Var, 0));
        }
    }
}
