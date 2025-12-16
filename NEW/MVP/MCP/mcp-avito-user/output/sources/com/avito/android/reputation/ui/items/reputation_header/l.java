package com.avito.android.reputation.ui.items.reputation_header;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReputationHeaderState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/reputation/ui/items/reputation_header/i;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/reputation/ui/items/reputation_header/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements Y41.l<G, i> {

    /* renamed from: l, reason: collision with root package name */
    public static final l f254892l = new l();

    public l() {
        super(1);
    }

    @Override // Y41.l
    public final i invoke(G g12) {
        G g13 = g12;
        Integer numA = g13.a("circleRadius");
        return new i(numA != null ? numA.intValue() : 0, (r) g13.f(j.f254890l, "leftColor", "leftColor"), (r) g13.f(k.f254891l, "rightColor", "rightColor"));
    }
}
