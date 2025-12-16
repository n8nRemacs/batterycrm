package com.avito.beduin.v2.avito.component.gradient.content;

import Y41.l;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.t;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.ranges.s;

/* compiled from: GradientContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/gradient/content/d;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/gradient/content/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements l<G, d> {

    /* renamed from: l, reason: collision with root package name */
    public static final h f334371l = new h();

    public h() {
        super(1);
    }

    @Override // Y41.l
    public final d invoke(G g12) {
        G g13 = g12;
        r rVar = (r) g13.f(g.f334370l, "color", "color");
        if (rVar == null) {
            rVar = t.f338374a;
        }
        Float fN2 = g13.n("position");
        return new d(fN2 != null ? s.f(fN2.floatValue(), 0.0f, 1.0f) : 0.5f, rVar);
    }
}
