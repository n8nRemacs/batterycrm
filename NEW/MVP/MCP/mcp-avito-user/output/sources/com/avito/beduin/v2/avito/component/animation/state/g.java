package com.avito.beduin.v2.avito.component.animation.state;

import Y41.l;
import com.avito.beduin.v2.avito.component.animation.state.AvitoAnimationState;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoAnimationStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements l<G, AvitoAnimationState.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f333785l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(1);
        this.f333785l = str;
    }

    @Override // Y41.l
    public final AvitoAnimationState.c invoke(G g12) {
        f fVar = f.f333784l;
        String str = this.f333785l;
        return (AvitoAnimationState.c) g12.f(fVar, str, str);
    }
}
