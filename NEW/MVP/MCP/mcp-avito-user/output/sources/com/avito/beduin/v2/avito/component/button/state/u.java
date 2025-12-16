package com.avito.beduin.v2.avito.component.button.state;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;

/* compiled from: AvitoButtonStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/button/state/u;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/button/state/l;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u extends com.avito.beduin.v2.theme.o<l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final u f333992b = new u();

    public u() {
        super(k.f333956c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String string = g12.getString("themeName");
        String strC = f333992b.c(g12);
        com.avito.beduin.v2.theme.f fVarA = com.avito.beduin.v2.theme.h.a(g12, "height", m.f333984l);
        com.avito.beduin.v2.avito.component.text.state.n nVar = com.avito.beduin.v2.avito.component.text.state.n.f335362b;
        com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g12, "titleStyle", nVar);
        com.avito.beduin.v2.theme.f<r.b> fVarB = com.avito.beduin.v2.theme.s.b(g12, "titleColor");
        com.avito.beduin.v2.theme.l lVarC2 = com.avito.beduin.v2.theme.h.c(g12, "subtitleStyle", nVar);
        com.avito.beduin.v2.theme.f<r.b> fVarB2 = com.avito.beduin.v2.theme.s.b(g12, "subtitleColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB3 = com.avito.beduin.v2.theme.s.b(g12, "highlightedTextColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB4 = com.avito.beduin.v2.theme.s.b(g12, "disabledTextColor");
        com.avito.beduin.v2.theme.l lVarC3 = com.avito.beduin.v2.theme.h.c(g12, "spinnerStyle", com.avito.beduin.v2.avito.component.spinner.state.k.f335151b);
        com.avito.beduin.v2.theme.f<r.b> fVarB5 = com.avito.beduin.v2.theme.s.b(g12, "backgroundColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB6 = com.avito.beduin.v2.theme.s.b(g12, "highlightedBackgroundColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB7 = com.avito.beduin.v2.theme.s.b(g12, "disabledBackgroundColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB8 = com.avito.beduin.v2.theme.s.b(g12, "highlightedTitleColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB9 = com.avito.beduin.v2.theme.s.b(g12, "disabledTitleColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB10 = com.avito.beduin.v2.theme.s.b(g12, "iconColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB11 = com.avito.beduin.v2.theme.s.b(g12, "highlightedIconColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB12 = com.avito.beduin.v2.theme.s.b(g12, "disabledIconColor");
        com.avito.beduin.v2.theme.f fVarA2 = com.avito.beduin.v2.theme.h.a(g12, "cornerRadius", n.f333985l);
        com.avito.beduin.v2.theme.f fVarA3 = com.avito.beduin.v2.theme.h.a(g12, "paddingLeft", o.f333986l);
        com.avito.beduin.v2.theme.f fVarA4 = com.avito.beduin.v2.theme.h.a(g12, "paddingRight", p.f333987l);
        com.avito.beduin.v2.theme.f fVarA5 = com.avito.beduin.v2.theme.h.a(g12, "spacing", q.f333988l);
        com.avito.beduin.v2.theme.f fVarA6 = com.avito.beduin.v2.theme.h.a(g12, "titleVerticalOffset", r.f333989l);
        com.avito.beduin.v2.theme.f fVarA7 = com.avito.beduin.v2.theme.h.a(g12, "iconHorizontalOffset", s.f333990l);
        com.avito.beduin.v2.theme.f fVarA8 = com.avito.beduin.v2.theme.h.a(g12, "shadowEnabled", t.f333991l);
        com.avito.beduin.v2.avito.component.common.m mVar = com.avito.beduin.v2.avito.component.common.m.f334140a;
        return new l(string, strC, fVarA, lVarC, fVarB, lVarC2, fVarB2, fVarB3, fVarB4, lVarC3, fVarB5, fVarB6, fVarB7, fVarB8, fVarB9, fVarB10, fVarB11, fVarB12, fVarA2, fVarA3, fVarA4, fVarA5, fVarA6, fVarA7, fVarA8, com.avito.beduin.v2.theme.h.b(g12, "upperShadow", mVar), com.avito.beduin.v2.theme.h.b(g12, "bottomShadow", mVar));
    }
}
