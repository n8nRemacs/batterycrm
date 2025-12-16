package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zcf implements Runnable {
    public static final Object Z = new Object();
    public final Executor a;
    public final uqa b;
    public final AtomicReference d;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public Object o = Z;
    public int X = -1;
    public boolean Y = false;

    public zcf(AtomicReference atomicReference, Executor executor, uqa uqaVar) {
        this.d = atomicReference;
        this.a = executor;
        this.b = uqaVar;
    }

    public final void a(int i) {
        synchronized (this) {
            try {
                if (this.c.get()) {
                    if (i <= this.X) {
                        return;
                    }
                    this.X = i;
                    if (this.Y) {
                        return;
                    }
                    this.Y = true;
                    try {
                        this.a.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.Y = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.c.get()) {
                    this.Y = false;
                    return;
                }
                Object obj = this.d.get();
                int i = this.X;
                while (true) {
                    if (!Objects.equals(this.o, obj)) {
                        this.o = obj;
                        if (obj instanceof mb0) {
                            this.b.onError(((mb0) obj).a);
                        } else {
                            this.b.a(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.X || !this.c.get()) {
                                break;
                            }
                            obj = this.d.get();
                            i = this.X;
                        } finally {
                        }
                    }
                }
                this.Y = false;
            } finally {
            }
        }
    }
}
