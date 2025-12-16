package hu.akarnokd.rxjava3.debug.validator;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;

/* compiled from: CompletableValidator.java */
/* loaded from: classes8.dex */
final class a extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f397849b;

    /* compiled from: CompletableValidator.java */
    /* renamed from: hu.akarnokd.rxjava3.debug.validator.a$a, reason: collision with other inner class name */
    public static final class C11319a implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f397850b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397851c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f397852d;

        public C11319a(InterfaceC41771d interfaceC41771d) {
            this.f397850b = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (dVar == null) {
                new NullOnSubscribeParameterException();
                throw null;
            }
            if (this.f397851c != null) {
                new MultipleOnSubscribeCallsException();
                throw null;
            }
            this.f397851c = dVar;
            this.f397850b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f397851c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            if (this.f397851c == null) {
                new OnSubscribeNotCalledException();
                throw null;
            }
            if (this.f397852d) {
                new MultipleTerminationsException();
                throw null;
            }
            this.f397852d = true;
            this.f397850b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f397851c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            if (th2 == null) {
                new NullOnErrorParameterException();
                throw null;
            }
            if (this.f397851c == null) {
                new OnSubscribeNotCalledException(th2);
                throw null;
            }
            if (this.f397852d) {
                new MultipleTerminationsException(th2);
                throw null;
            }
            this.f397852d = true;
            this.f397850b.onError(th2);
        }
    }

    public a(AbstractC41768a abstractC41768a) {
        this.f397849b = abstractC41768a;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f397849b.a(new C11319a(interfaceC41771d));
    }
}
