package hu.akarnokd.rxjava3.retrofit;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.InterfaceC47646b;
import retrofit2.y;
import s41.C47998a;

/* compiled from: CallExecuteObservable.java */
/* loaded from: classes8.dex */
final class c<T> extends z<y<T>> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC47646b<T> f398209b;

    /* compiled from: CallExecuteObservable.java */
    public static final class a implements io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC47646b<?> f398210b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f398211c;

        public a(InterfaceC47646b<?> interfaceC47646b) {
            this.f398210b = interfaceC47646b;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398211c = true;
            this.f398210b.cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398211c;
        }
    }

    public c(InterfaceC47646b<T> interfaceC47646b) {
        this.f398209b = interfaceC47646b;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super y<T>> g12) {
        InterfaceC47646b<T> interfaceC47646bClone = this.f398209b.clone();
        a aVar = new a(interfaceC47646bClone);
        g12.b(aVar);
        if (aVar.f398211c) {
            return;
        }
        boolean z12 = false;
        try {
            y<T> yVarExecute = interfaceC47646bClone.execute();
            if (!aVar.f398211c) {
                g12.onNext(yVarExecute);
            }
            if (aVar.f398211c) {
                return;
            }
            try {
                g12.e();
            } catch (Throwable th2) {
                th = th2;
                z12 = true;
                io.reactivex.rxjava3.exceptions.a.a(th);
                if (z12) {
                    C47998a.b(th);
                    return;
                }
                if (aVar.f398211c) {
                    return;
                }
                try {
                    g12.onError(th);
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    C47998a.b(new CompositeException(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
