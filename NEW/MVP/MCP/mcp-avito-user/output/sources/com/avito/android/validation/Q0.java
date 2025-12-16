package com.avito.android.validation;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.item_map.view.C31075l;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;

/* compiled from: ParametersListPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/items/a;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/g;", "invoke", "(Lcom/avito/android/items/a;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class Q0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.items.a, InterfaceC41774g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y0 f319288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(Y0 y02) {
        super(1);
        this.f319288l = y02;
    }

    @Override // Y41.l
    public final InterfaceC41774g invoke(com.avito.android.items.a aVar) {
        AbstractC41768a abstractC41768aX;
        final PriceParameter.AbnormalPriceData abnormalPriceData;
        int i12 = 0;
        final com.avito.android.items.a aVar2 = aVar;
        final Y0 y02 = this.f319288l;
        y02.getClass();
        boolean zO2 = Y0.o(aVar2);
        InterfaceC36026p interfaceC36026p = y02.f319322a;
        InterfaceC35745a5 interfaceC35745a5 = y02.f319323b;
        AbstractC41768a vVar = zO2 ? new io.reactivex.rxjava3.internal.operators.completable.v(interfaceC36026p.d(aVar2.getF76517c(), aVar2).s(interfaceC35745a5.e()).k(new C36034t0(2, new X0(y02, aVar2)))) : C41823n.f402260b.q(interfaceC35745a5.e()).k(new InterfaceC43543a() { // from class: com.avito.android.validation.u0
            @Override // l41.InterfaceC43543a
            public final void run() {
                com.avito.android.items.a aVar3 = aVar2;
                Y0 y03 = y02;
                y03.j(new F0(y03, aVar3));
            }
        });
        if (aVar2 instanceof ParameterElement.p) {
            ParameterElement.p pVar = (ParameterElement.p) aVar2;
            abstractC41768aX = ((pVar.f117487l instanceof ParameterElement.m.a) && (abnormalPriceData = pVar.f117478F) != null) ? new C41826q(new InterfaceC43543a() { // from class: com.avito.android.validation.v0
                @Override // l41.InterfaceC43543a
                public final void run() {
                    com.avito.android.items.a aVar3 = aVar2;
                    ParameterElement.p pVar2 = (ParameterElement.p) aVar3;
                    if (pVar2.f117492q instanceof ItemWithState.State.Normal) {
                        String f117481f = aVar3.getF117481f();
                        Integer numY0 = f117481f != null ? C43066x.y0(f117481f) : null;
                        PriceParameter.AbnormalPriceData abnormalPriceData2 = abnormalPriceData;
                        String errorMessage = abnormalPriceData2.getErrorMessage();
                        if (numY0 == null || numY0.intValue() >= abnormalPriceData2.getMinValue()) {
                            errorMessage = null;
                        }
                        Y0 y03 = y02;
                        if (errorMessage != null) {
                            ItemWithState.State state = pVar2.f117492q;
                            ItemWithState.State.Normal normal = state instanceof ItemWithState.State.Normal ? (ItemWithState.State.Normal) state : null;
                            if ((normal != null ? normal.f173899b : null) == null) {
                                y03.f319325d.a();
                            }
                        }
                        y03.j(new U0(y03, y03.l(aVar3.getF76517c()), aVar3, new ItemWithState.State.Normal(errorMessage)));
                    }
                }
            }).l(new C31075l(24, V0.f319309l)).r().x(interfaceC35745a5.e()) : C41823n.f402260b;
        } else {
            abstractC41768aX = C41823n.f402260b;
        }
        C41811b c41811bG = vVar.g(abstractC41768aX);
        LinkedHashMap linkedHashMapF = interfaceC36026p.f(aVar2.getF76517c());
        return AbstractC41768a.p(C42745f0.U(c41811bG, linkedHashMapF.isEmpty() ? C41823n.f402260b : new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC36032s0(i12, y02, linkedHashMapF)).x(interfaceC35745a5.e())));
    }
}
