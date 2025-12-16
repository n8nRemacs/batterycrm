package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41770c;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41772e;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import m41.C43880b;
import s41.C47998a;

/* compiled from: CompletableCreate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41816g extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC41772e f402240b;

    /* compiled from: CompletableCreate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.g$a */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41770c, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402241b;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402241b = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final void e() {
            io.reactivex.rxjava3.disposables.d andSet;
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.f402241b.e();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final void f(l41.f fVar) {
            DisposableHelper.d(this, new C43880b(fVar));
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final boolean g(Throwable th2) {
            io.reactivex.rxjava3.disposables.d andSet;
            if (th2 == null) {
                th2 = io.reactivex.rxjava3.internal.util.h.b("onError called with a null Throwable.");
            }
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.f402241b.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final void onError(Throwable th2) {
            if (g(th2)) {
                return;
            }
            C47998a.b(th2);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return androidx.media3.exoplayer.analytics.m.l(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public C41816g(InterfaceC41772e interfaceC41772e) {
        this.f402240b = interfaceC41772e;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        a aVar = new a(interfaceC41771d);
        interfaceC41771d.b(aVar);
        try {
            this.f402240b.e(aVar);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            aVar.onError(th2);
        }
    }
}
