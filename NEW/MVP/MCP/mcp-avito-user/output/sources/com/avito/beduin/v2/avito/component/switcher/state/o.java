package com.avito.beduin.v2.avito.component.switcher.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoSwitcherStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/switcher/state/o;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/switcher/state/j;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o extends com.avito.beduin.v2.theme.o<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final o f335262b = new o();

    public o() {
        super("switcher");
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String string = g12.getString("themeName");
        String strC = c(g12);
        com.avito.beduin.v2.theme.f fVarA = com.avito.beduin.v2.theme.h.a(g12, "borderWidth", k.f335258l);
        com.avito.beduin.v2.theme.f fVarA2 = com.avito.beduin.v2.theme.h.a(g12, "thumbSize", l.f335259l);
        com.avito.beduin.v2.avito.component.common.f fVar = com.avito.beduin.v2.avito.component.common.f.f334125a;
        return new j(string, strC, fVarA, fVarA2, com.avito.beduin.v2.theme.h.b(g12, "checkedThumbColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedThumbColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedBorderColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedBorderColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedErrorBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedErrorBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedErrorBorderColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedErrorBorderColor", fVar), com.avito.beduin.v2.theme.h.a(g12, "width", m.f335260l), com.avito.beduin.v2.theme.h.a(g12, "height", n.f335261l));
    }
}
