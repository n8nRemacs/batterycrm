package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.form.P;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import io.reactivex.rxjava3.internal.operators.observable.T0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PaymentGenericFormPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/payment/form/P;", "kotlin.jvm.PlatformType", "currentState", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/payment/form/P;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.payment.form.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33010m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33012o f214364b;

    public C33010m(C33012o c33012o) {
        this.f214364b = c33012o;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        P p12 = (P) obj;
        boolean z12 = p12 instanceof P.a;
        C33012o c33012o = this.f214364b;
        if (!z12) {
            if (p12 instanceof P.c) {
                return c33012o.f214367b.b().d0(new B(c33012o));
            }
            if (p12 instanceof P.b) {
                return c33012o.f214375j.d0(A.f214318b);
            }
            throw new NoWhenBranchMatchedException();
        }
        C32998a c32998a = c33012o.f214372g;
        if (c32998a == null) {
            c32998a = null;
        }
        ParametersTree parametersTree = c33012o.f214371f;
        ParametersTree parametersTree2 = parametersTree != null ? parametersTree : null;
        B0 b0D0 = c33012o.f214377l.B(r.f214393a).K(new s(parametersTree2)).d0(new t(c33012o, c32998a, parametersTree2));
        com.jakewharton.rxrelay3.b<P> bVar = c33012o.f214373h;
        io.reactivex.rxjava3.disposables.d dVarT0 = b0D0.t0(bVar);
        io.reactivex.rxjava3.disposables.d dVarT02 = c33012o.f214379n.d0(new q(c33012o, c32998a, parametersTree2)).t0(bVar);
        T0 t0P0 = c33012o.f214376k.y0(new y(c33012o, parametersTree2)).j0(c33012o.f214369d.e()).p0();
        io.reactivex.rxjava3.disposables.d dVarT03 = t0P0.K(new u(parametersTree2)).d0(new v(c33012o, c32998a, parametersTree2)).t0(bVar);
        io.reactivex.rxjava3.disposables.d dVarT04 = t0P0.N(w.f214473b).t0(new x(c33012o));
        io.reactivex.rxjava3.disposables.c cVar = c33012o.f214382q;
        cVar.b(dVarT0);
        cVar.b(dVarT03);
        cVar.b(dVarT02);
        cVar.b(dVarT04);
        return H0.f403644b;
    }
}
