package com.avito.android.search.filter;

import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.remote.model.counter.CounterButton;
import com.avito.android.remote.model.counter.MapButton;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34592q0 extends kotlin.jvm.internal.N implements Y41.l<P2<? super ChangingParametersForButtons>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k1 f263794l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263795m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34592q0(k1 k1Var, C34574h0 c34574h0) {
        super(1);
        this.f263794l = k1Var;
        this.f263795m = c34574h0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final kotlin.G0 invoke(P2<? super ChangingParametersForButtons> p22) {
        PresentationType presentationType;
        P2<? super ChangingParametersForButtons> p23 = p22;
        boolean z12 = p23 instanceof P2.c;
        k1 k1Var = this.f263794l;
        if (z12) {
            Button button = k1Var.f263374f;
            D6.H(button);
            Button button2 = k1Var.f263375g;
            if (D6.y(button2)) {
                button2.setLoading(true);
            }
            button.setLoading(true);
        } else {
            boolean z13 = p23 instanceof P2.b;
            C34574h0 c34574h0 = this.f263795m;
            if (z13) {
                ChangingParametersForButtons changingParametersForButtons = (ChangingParametersForButtons) ((P2.b) p23).f318720a;
                CounterButton counterButton = changingParametersForButtons.getCounterButton();
                if (counterButton != null) {
                    C34574h0.d(c34574h0, counterButton.getTitle(), counterButton.getEnabled());
                    PresentationType presentationType2 = counterButton.getPresentationType();
                    if (presentationType2 != null) {
                        c34574h0.f263324V = presentationType2;
                    }
                }
                MapButton mapButton = changingParametersForButtons.getMapButton();
                C34574h0.g(c34574h0, mapButton != null ? mapButton.getEnabled() : null);
                if (mapButton != null && (presentationType = mapButton.getPresentationType()) != null) {
                    c34574h0.f263325W = presentationType;
                }
                k1Var.b();
            } else if (p23 instanceof P2.a) {
                C34574h0.d(c34574h0, null, Boolean.TRUE);
                C34574h0.g(c34574h0, null);
                c34574h0.f263324V = PresentationType.INSTANCE.defaultValue();
                k1Var.b();
            }
        }
        return kotlin.G0.f406611a;
    }
}
