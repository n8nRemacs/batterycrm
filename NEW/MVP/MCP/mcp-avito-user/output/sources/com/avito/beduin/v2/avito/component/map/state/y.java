package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;

/* compiled from: MapPointDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/y;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/x;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class y implements com.avito.beduin.v2.theme.d<x> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final y f334761a = new y();

    @Y61.l
    public static x b(@Y61.k com.avito.beduin.v2.engine.component.G g12) {
        Float fN2 = g12.n("latitude");
        if (fN2 == null) {
            return null;
        }
        float fFloatValue = fN2.floatValue();
        Float fN3 = g12.n("longitude");
        if (fN3 != null) {
            return new x(fFloatValue, fN3.floatValue());
        }
        return null;
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ x a(com.avito.beduin.v2.engine.component.G g12) {
        return b(g12);
    }
}
