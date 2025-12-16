package com.akita.compose.component.toggle;

import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.M0;
import androidx.compose.animation.core.V;
import androidx.compose.runtime.A;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckToggle.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/i1$b;", "Landroidx/compose/ui/state/ToggleableState;", "Landroidx/compose/animation/core/V;", "", "invoke", "(Landroidx/compose/animation/core/i1$b;Landroidx/compose/runtime/A;I)Landroidx/compose/animation/core/V;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.q<C20288i1.b<ToggleableState>, A, Integer, V<Float>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f63359l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.N f63360m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i12, androidx.compose.animation.core.N n12) {
        super(3);
        this.f63359l = i12;
        this.f63360m = n12;
    }

    @Override // Y41.q
    public final V<Float> invoke(C20288i1.b<ToggleableState> bVar, A a12, Integer num) {
        V<Float> m02;
        C20288i1.b<ToggleableState> bVar2 = bVar;
        A a13 = a12;
        num.intValue();
        a13.C(-759529016);
        ToggleableState toggleableStateA = bVar2.a();
        ToggleableState toggleableState = ToggleableState.f41897c;
        if (toggleableStateA == toggleableState) {
            m02 = C20310q.c();
        } else {
            ToggleableState toggleableStateD = bVar2.d();
            int i12 = this.f63359l;
            m02 = toggleableStateD == toggleableState ? new M0<>(i12) : C20310q.e(i12, 0, this.f63360m, 2);
        }
        a13.h();
        return m02;
    }
}
