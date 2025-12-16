package com.avito.beduin.v2.avito.component.animation.state;

import Y41.l;
import com.avito.beduin.v2.avito.component.animation.state.AvitoAnimationState;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: AvitoAnimationStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements l<G, AvitoAnimationState.c> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f333784l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final AvitoAnimationState.c invoke(G g12) {
        G g13 = g12;
        if (!L.f(g13.getString("mode"), "remote")) {
            return null;
        }
        i.f333787a.getClass();
        return i.b(g13);
    }
}
