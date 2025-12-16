package com.avito.beduin.v2.avito.component.map.state.style;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.s;
import kotlin.Metadata;

/* compiled from: PolygonStyleDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/style/m;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/style/k;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements com.avito.beduin.v2.theme.d<k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final m f334752a = new m();

    @Override // com.avito.beduin.v2.theme.d
    public final k a(G g12) {
        return new k(s.b(g12, "fillColor"), s.b(g12, "polylineColor"), com.avito.beduin.v2.theme.h.a(g12, "polylineWidth", l.f334751l));
    }
}
