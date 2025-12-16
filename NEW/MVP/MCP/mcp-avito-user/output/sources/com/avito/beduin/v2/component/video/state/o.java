package com.avito.beduin.v2.component.video.state;

import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/video/state/e;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/video/state/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class o extends N implements Y41.l<G, e> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f336384l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AbstractC36250j.b bVar) {
        super(1);
        this.f336384l = bVar;
    }

    @Override // Y41.l
    public final e invoke(G g12) {
        G g13 = g12;
        AbstractC36250j.b bVar = this.f336384l;
        com.avito.beduin.v2.component.common.utils.a aVarA = com.avito.beduin.v2.component.common.utils.h.a(bVar);
        a aVar = (a) g13.f(f.f336372l, "content", "content");
        Boolean boolC = g13.c("playWhenReady");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        Float fN2 = g13.n("volume");
        float fFloatValue = fN2 != null ? fN2.floatValue() : 0.0f;
        Boolean boolC2 = g13.c("loop");
        return new e(aVar, zBooleanValue, fFloatValue, boolC2 != null ? boolC2.booleanValue() : false, (Y41.l) g13.d(new j(bVar), "onPlayerStateChanged", "onPlayerStateChanged"), (Y41.l) g13.d(new l(bVar), "onMediaStateChanged", "onMediaStateChanged"), (Y41.l) g13.d(new h(bVar), "onError", "onError"), (Y41.a) g13.d(n.f336383l, "onClick", "onClick"), aVarA.f335704b, aVarA.f335705c, aVarA.f335706d, g13.getString("tag"));
    }
}
