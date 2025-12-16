package com.avito.beduin.v2.avito.component.chips.state;

import com.avito.beduin.v2.avito.component.button.state.u;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoChipsStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/chips/state/q;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/chips/state/n;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q extends com.avito.beduin.v2.theme.o<n> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final q f334088b = new q();

    public q() {
        super(m.f334078c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String string = g12.getString("themeName");
        String strC = f334088b.c(g12);
        com.avito.beduin.v2.theme.f fVarA = com.avito.beduin.v2.theme.h.a(g12, "interLineSpacing", o.f334086l);
        com.avito.beduin.v2.theme.f fVarA2 = com.avito.beduin.v2.theme.h.a(g12, "interItemSpacing", p.f334087l);
        u uVar = u.f333992b;
        return new n(string, strC, fVarA, fVarA2, com.avito.beduin.v2.theme.h.c(g12, "selectedButton", uVar), com.avito.beduin.v2.theme.h.c(g12, "normalButton", uVar), com.avito.beduin.v2.theme.h.c(g12, "notActiveButton", uVar));
    }
}
