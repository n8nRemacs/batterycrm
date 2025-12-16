package androidx.work.multiprocess;

import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.D0;
import j.N;

/* compiled from: ListenableCallback.java */
@RestrictTo
/* renamed from: androidx.work.multiprocess.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC23623d<I> {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f56138a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC23622c f56139b;

    /* renamed from: c, reason: collision with root package name */
    public final D0<I> f56140c;

    /* compiled from: ListenableCallback.java */
    @RestrictTo
    /* renamed from: androidx.work.multiprocess.d$a */
    public static class a<I> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC23623d<I> f56141b;

        static {
            androidx.work.G.b("ListenableCallbackRbl");
        }

        public a(@N AbstractC23623d<I> abstractC23623d) {
            this.f56141b = abstractC23623d;
        }

        public static void a(@N InterfaceC23622c interfaceC23622c, @N Throwable th2) {
            try {
                interfaceC23622c.onFailure(th2.getMessage());
            } catch (RemoteException unused) {
                androidx.work.G.a().getClass();
            }
        }

        public static void b(@N InterfaceC23622c interfaceC23622c, @N byte[] bArr) {
            try {
                interfaceC23622c.F0(bArr);
            } catch (RemoteException unused) {
                androidx.work.G.a().getClass();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC23623d<I> abstractC23623d = this.f56141b;
            try {
                b(abstractC23623d.f56139b, abstractC23623d.b(abstractC23623d.f56140c.get()));
            } catch (Throwable th2) {
                a(abstractC23623d.f56139b, th2);
            }
        }
    }

    public AbstractC23623d(@N androidx.work.impl.utils.taskexecutor.a aVar, @N InterfaceC23622c interfaceC23622c, @N D0 d02) {
        this.f56138a = aVar;
        this.f56139b = interfaceC23622c;
        this.f56140c = d02;
    }

    public final void a() {
        this.f56140c.N(new a(this), this.f56138a);
    }

    @N
    public abstract byte[] b(@N I i12);
}
