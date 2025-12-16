package com.avito.beduin.v2.avito.component.tooltip.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoTooltipStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tooltip/state/o;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/tooltip/state/n;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o extends com.avito.beduin.v2.theme.o<n> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final o f335454b = new o();

    public o() {
        super(m.f335451c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        return new n(g12.getString("themeName"), f335454b.c(g12));
    }
}
