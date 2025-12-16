package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.core.O;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.maybe.r0;
import io.reactivex.rxjava3.internal.operators.single.c0;
import java.util.Objects;

/* compiled from: ScalarXMapZHelper.java */
/* loaded from: classes8.dex */
final class y {
    public y() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> boolean a(Object obj, l41.o<? super T, ? extends InterfaceC41774g> oVar, InterfaceC41771d interfaceC41771d) {
        InterfaceC41774g interfaceC41774g;
        if (!(obj instanceof l41.s)) {
            return false;
        }
        try {
            A00.a aVar = (Object) ((l41.s) obj).get();
            if (aVar != null) {
                InterfaceC41774g interfaceC41774gApply = oVar.apply(aVar);
                Objects.requireNonNull(interfaceC41774gApply, "The mapper returned a null CompletableSource");
                interfaceC41774g = interfaceC41774gApply;
            } else {
                interfaceC41774g = null;
            }
            if (interfaceC41774g == null) {
                interfaceC41771d.b(EmptyDisposable.f401988b);
                interfaceC41771d.e();
            } else {
                interfaceC41774g.a(interfaceC41771d);
            }
            return true;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.b(th2, interfaceC41771d);
            return true;
        }
    }

    public static <T, R> boolean b(Object obj, l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> oVar, G<? super R> g12) {
        io.reactivex.rxjava3.core.w<? extends R> wVar;
        if (!(obj instanceof l41.s)) {
            return false;
        }
        try {
            A00.a aVar = (Object) ((l41.s) obj).get();
            if (aVar != null) {
                io.reactivex.rxjava3.core.w<? extends R> wVarApply = oVar.apply(aVar);
                Objects.requireNonNull(wVarApply, "The mapper returned a null MaybeSource");
                wVar = wVarApply;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                EmptyDisposable.a(g12);
            } else {
                wVar.a(r0.M0(g12));
            }
            return true;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
            return true;
        }
    }

    public static <T, R> boolean c(Object obj, l41.o<? super T, ? extends O<? extends R>> oVar, G<? super R> g12) {
        O<? extends R> o12;
        if (!(obj instanceof l41.s)) {
            return false;
        }
        try {
            A00.a aVar = (Object) ((l41.s) obj).get();
            if (aVar != null) {
                O<? extends R> oApply = oVar.apply(aVar);
                Objects.requireNonNull(oApply, "The mapper returned a null SingleSource");
                o12 = oApply;
            } else {
                o12 = null;
            }
            if (o12 == null) {
                EmptyDisposable.a(g12);
            } else {
                o12.a(c0.M0(g12));
            }
            return true;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
            return true;
        }
    }
}
