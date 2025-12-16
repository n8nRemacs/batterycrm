package hu.akarnokd.rxjava3.debug;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: CompletableOnAssembly.java */
/* renamed from: hu.akarnokd.rxjava3.debug.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41115a extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f397811b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397812c = new RxJavaAssemblyException();

    /* compiled from: CompletableOnAssembly.java */
    /* renamed from: hu.akarnokd.rxjava3.debug.a$a, reason: collision with other inner class name */
    public static final class C11317a implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f397813b;

        /* renamed from: c, reason: collision with root package name */
        public final RxJavaAssemblyException f397814c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397815d;

        public C11317a(InterfaceC41771d interfaceC41771d, RxJavaAssemblyException rxJavaAssemblyException) {
            this.f397813b = interfaceC41771d;
            this.f397814c = rxJavaAssemblyException;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397815d, dVar)) {
                this.f397815d = dVar;
                this.f397813b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f397815d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f397813b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f397815d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f397814c.a(th2);
            this.f397813b.onError(th2);
        }
    }

    public C41115a(AbstractC41768a abstractC41768a) {
        this.f397811b = abstractC41768a;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f397811b.a(new C11317a(interfaceC41771d, this.f397812c));
    }
}
