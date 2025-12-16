package com.avito.beduin.v2.avito.component.animation.state;

import Y41.l;
import com.avito.beduin.v2.avito.component.animation.state.AvitoAnimationState;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.field.m;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoAnimationStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements l<G, AvitoAnimationState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f333783l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AbstractC36250j.b bVar) {
        super(1);
        this.f333783l = bVar;
    }

    @Override // Y41.l
    public final AvitoAnimationState invoke(G g12) {
        AvitoAnimationState.RepeatMode repeatMode;
        G g13 = g12;
        String string = g13.getString("repeatMode");
        AvitoAnimationState.State state = null;
        if (string != null) {
            AvitoAnimationState.RepeatMode.f333761c.getClass();
            Iterator it = ((AbstractC42738c) AvitoAnimationState.RepeatMode.f333764f).iterator();
            while (it.hasNext()) {
                repeatMode = (AvitoAnimationState.RepeatMode) it.next();
                if (repeatMode.f333765b.equals(string)) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        repeatMode = null;
        String string2 = g13.getString("animationState");
        if (string2 != null) {
            AvitoAnimationState.State.f333766c.getClass();
            Iterator it2 = ((AbstractC42738c) AvitoAnimationState.State.f333770g).iterator();
            while (it2.hasNext()) {
                AvitoAnimationState.State state2 = (AvitoAnimationState.State) it2.next();
                if (state2.f333771b.equals(string2)) {
                    state = state2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        h hVar = h.f333786c;
        AbstractC36250j.b bVar = this.f333783l;
        hVar.getClass();
        g gVar = new g("content");
        m mVar = bVar.f336563b;
        AvitoAnimationState.c cVar = (AvitoAnimationState.c) E.b(bVar, mVar, gVar);
        AvitoAnimationState.c cVar2 = (AvitoAnimationState.c) E.b(bVar, mVar, new g("contentDark"));
        Boolean boolC = g13.c("autoPlay");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        Integer numA = g13.a("repeatCount");
        int iIntValue = numA != null ? numA.intValue() : -1;
        if (repeatMode == null) {
            repeatMode = AvitoAnimationState.RepeatMode.f333762d;
        }
        AvitoAnimationState.RepeatMode repeatMode2 = repeatMode;
        Float fN2 = g13.n("progress");
        Float fN3 = g13.n("speed");
        float fFloatValue = fN3 != null ? fN3.floatValue() : 1.0f;
        if (state == null) {
            state = zBooleanValue ? AvitoAnimationState.State.f333767d : AvitoAnimationState.State.f333768e;
        }
        AvitoAnimationState.State state3 = state;
        String string3 = g13.getString("contentDescription");
        if (string3 == null) {
            string3 = "";
        }
        String str = string3;
        Boolean boolC2 = g13.c("visible");
        return new AvitoAnimationState(cVar, cVar2, iIntValue, repeatMode2, fN2, fFloatValue, zBooleanValue, state3, str, boolC2 != null ? boolC2.booleanValue() : true, (Y41.a) g13.d(b.f333780l, "onShow", "onShow"), (Y41.a) g13.d(d.f333782l, "onHide", "onHide"), g13.getString("tag"));
    }
}
