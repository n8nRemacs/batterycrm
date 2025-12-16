package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.InterfaceC43543a;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.code_confirmation.code_confirmation.x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29410x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f119643b;

    public C29410x(T t12) {
        this.f119643b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        io.reactivex.rxjava3.core.q qVarH;
        T t12 = this.f119643b;
        CodeConfirmationPresenter.Mode mode = t12.f119464y;
        boolean zF2 = kotlin.jvm.internal.L.f(mode, CodeConfirmationPresenter.Mode.Default.f119406b);
        InterfaceC29394g interfaceC29394g = t12.f119440a;
        InterfaceC35745a5 interfaceC35745a5 = t12.f119442c;
        if (zF2 || kotlin.jvm.internal.L.f(mode, CodeConfirmationPresenter.Mode.PhoneVerification.f119407b)) {
            qVarH = interfaceC29394g.b(t12.f119458s, null, false);
        } else {
            if (!(mode instanceof CodeConfirmationPresenter.Mode.RecallMe)) {
                throw new NoWhenBranchMatchedException();
            }
            qVarH = new io.reactivex.rxjava3.internal.operators.single.T(t12.f119441b.get().b(((CodeConfirmationPresenter.Mode.RecallMe) mode).f119408b), new I(t12)).k(interfaceC35745a5.e()).h(new J(t12));
        }
        io.reactivex.rxjava3.internal.operators.maybe.c0 c0VarK = qVarH.k(interfaceC35745a5.e());
        K k12 = new K(t12);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        t12.f119454o.b(new io.reactivex.rxjava3.internal.operators.maybe.g0(new io.reactivex.rxjava3.internal.operators.maybe.g0(c0VarK, k12, gVar, gVar, interfaceC43543a, interfaceC43543a, interfaceC43543a), gVar, gVar, gVar, interfaceC43543a, new C29407u(t12, 3), interfaceC43543a).n(new L(t12), new M(t12), new C29407u(t12, 4)));
    }
}
