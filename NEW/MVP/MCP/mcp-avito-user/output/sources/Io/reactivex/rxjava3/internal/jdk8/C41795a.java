package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.jdk8.C41801g;
import java.util.function.BiConsumer;

/* compiled from: CompletableFromCompletionStage.java */
/* renamed from: io.reactivex.rxjava3.internal.jdk8.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41795a<T> extends AbstractC41768a {

    /* compiled from: CompletableFromCompletionStage.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.a$a, reason: collision with other inner class name */
    public static final class C11442a<T> implements io.reactivex.rxjava3.disposables.d, BiConsumer<T, Throwable> {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402031b;

        /* renamed from: c, reason: collision with root package name */
        public final C41801g.a<T> f402032c;

        public C11442a(InterfaceC41771d interfaceC41771d, C41801g.a<T> aVar) {
            this.f402031b = interfaceC41771d;
            this.f402032c = aVar;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            InterfaceC41771d interfaceC41771d = this.f402031b;
            if (th3 != null) {
                interfaceC41771d.onError(th3);
            } else {
                interfaceC41771d.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402032c.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402032c.get() == null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        C41801g.a aVar = new C41801g.a();
        C11442a c11442a = new C11442a(interfaceC41771d, aVar);
        aVar.lazySet(c11442a);
        interfaceC41771d.b(c11442a);
        throw null;
    }
}
