package androidx.media3.common.util;

/* compiled from: ConditionVariable.java */
@J
/* renamed from: androidx.media3.common.util.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23118i {

    /* renamed from: a, reason: collision with root package name */
    public final D f47908a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47909b;

    public C23118i() {
        this(InterfaceC23115f.f47901a);
    }

    public final synchronized void a() {
        while (!this.f47909b) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z12 = false;
        while (!this.f47909b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z12 = true;
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void c() {
        this.f47909b = false;
    }

    public final synchronized boolean d() {
        if (this.f47909b) {
            return false;
        }
        this.f47909b = true;
        notifyAll();
        return true;
    }

    public C23118i(D d12) {
        this.f47908a = d12;
    }
}
