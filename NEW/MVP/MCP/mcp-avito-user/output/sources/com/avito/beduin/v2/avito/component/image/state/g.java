package com.avito.beduin.v2.avito.component.image.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoImageStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/image/state/k;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/image/state/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<G, k> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Scale f334420l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Scale scale) {
        super(1);
        this.f334420l = scale;
    }

    @Override // Y41.l
    public final k invoke(G g12) {
        l.f334424a.getClass();
        return l.b(g12, "mode", this.f334420l);
    }
}
