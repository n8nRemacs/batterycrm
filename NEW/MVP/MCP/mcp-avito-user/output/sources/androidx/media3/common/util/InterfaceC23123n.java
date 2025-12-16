package androidx.media3.common.util;

import android.os.Looper;
import j.P;

/* compiled from: HandlerWrapper.java */
@J
/* renamed from: androidx.media3.common.util.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC23123n {

    /* compiled from: HandlerWrapper.java */
    /* renamed from: androidx.media3.common.util.n$a */
    public interface a {
        void a();
    }

    void a();

    a b(int i12, @P Object obj);

    a c(int i12, int i13, int i14);

    boolean d(Runnable runnable);

    boolean e(long j12);

    boolean f(int i12);

    boolean g();

    Looper getLooper();

    a h(int i12);

    boolean i(a aVar);

    a j(@P Object obj, int i12, int i13, int i14);

    void k(int i12);
}
