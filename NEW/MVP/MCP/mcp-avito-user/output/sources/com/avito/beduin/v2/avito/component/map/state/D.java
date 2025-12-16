package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;

/* compiled from: PinView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/D;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/C;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class D implements com.avito.beduin.v2.theme.d<C> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final D f334618a = new D();

    @Override // com.avito.beduin.v2.theme.d
    public final C a(com.avito.beduin.v2.engine.component.G g12) {
        if (!kotlin.jvm.internal.L.f(g12.getString("pinType"), "Remote")) {
            return null;
        }
        M.f334630a.getClass();
        return M.b(g12);
    }
}
