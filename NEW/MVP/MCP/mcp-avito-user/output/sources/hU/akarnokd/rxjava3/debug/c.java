package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.C41115a;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;

/* compiled from: CompletableOnAssemblySupplier.java */
/* loaded from: classes8.dex */
final class c extends AbstractC41768a implements l41.s<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f397818b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397819c = new RxJavaAssemblyException();

    public c(AbstractC41768a abstractC41768a) {
        this.f397818b = abstractC41768a;
    }

    @Override // l41.s
    public final Object get() {
        try {
            return ((l41.s) this.f397818b).get();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            this.f397819c.a(th2);
            throw th2;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f397818b.a(new C41115a.C11317a(interfaceC41771d, this.f397819c));
    }
}
