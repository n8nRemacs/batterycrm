package com.avito.beduin.v2.avito.component.selector_card.state;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;

/* compiled from: AvitoSelectorCardStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/t;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/l;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t extends com.avito.beduin.v2.theme.o<l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final t f335108b = new t();

    public t() {
        super(k.f335080c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        ET0.b bVar = (ET0.b) g12.f(m.f335101l, "contentInsets", "contentInsets");
        ET0.b bVar2 = (ET0.b) g12.f(n.f335102l, "indicatorInsets", "indicatorInsets");
        com.avito.beduin.v2.theme.f<r.b> fVarB = com.avito.beduin.v2.theme.s.b(g12, "backgroundColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB2 = com.avito.beduin.v2.theme.s.b(g12, "disabledColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB3 = com.avito.beduin.v2.theme.s.b(g12, "borderColor");
        com.avito.beduin.v2.theme.f fVarA = com.avito.beduin.v2.theme.h.a(g12, "borderWidth", o.f335103l);
        com.avito.beduin.v2.theme.f fVarA2 = com.avito.beduin.v2.theme.h.a(g12, "blurRadius", p.f335104l);
        com.avito.beduin.v2.theme.f fVarA3 = com.avito.beduin.v2.theme.h.a(g12, "cornerRadius", q.f335105l);
        com.avito.beduin.v2.theme.f fVarA4 = com.avito.beduin.v2.theme.h.a(g12, "spaceBetweenTitleAndSubtitle", r.f335106l);
        com.avito.beduin.v2.theme.f fVarA5 = com.avito.beduin.v2.theme.h.a(g12, "spaceBetweenCardAndErrorText", s.f335107l);
        com.avito.beduin.v2.avito.component.text.state.n nVar = com.avito.beduin.v2.avito.component.text.state.n.f335362b;
        return new l(bVar, bVar2, fVarB, fVarB2, fVarB3, fVarA, fVarA2, fVarA3, fVarA4, fVarA5, com.avito.beduin.v2.theme.h.c(g12, "titleStyle", nVar), com.avito.beduin.v2.theme.s.b(g12, "titleColor"), com.avito.beduin.v2.theme.h.c(g12, "subtitleStyle", nVar), com.avito.beduin.v2.theme.s.b(g12, "subtitleColor"), com.avito.beduin.v2.theme.h.c(g12, "errorTextStyle", nVar), com.avito.beduin.v2.theme.s.b(g12, "errorTextColor"), com.avito.beduin.v2.theme.h.c(g12, "checkmarkStyle", com.avito.beduin.v2.avito.component.checkbox.state.p.f334046b), com.avito.beduin.v2.theme.h.c(g12, "switcherStyle", com.avito.beduin.v2.avito.component.switcher.state.o.f335262b), g12.getString("themeName"), f335108b.c(g12));
    }
}
