package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.C41115a;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;

/* compiled from: CompletableOnAssemblyScalarSupplier.java */
/* renamed from: hu.akarnokd.rxjava3.debug.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41116b extends AbstractC41768a implements ScalarSupplier<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f397816b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397817c = new RxJavaAssemblyException();

    public C41116b(AbstractC41768a abstractC41768a) {
        this.f397816b = abstractC41768a;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f397816b.a(new C41115a.C11317a(interfaceC41771d, this.f397817c));
    }
}
