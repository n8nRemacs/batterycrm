package com.avito.beduin.v2.avito.component.listitem.state;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.o;
import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.s;
import kotlin.Metadata;

/* compiled from: AvitoListItemStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/listitem/state/n;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/listitem/state/a;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n extends o<a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final n f334606b = new n();

    public n() {
        super("ListItem");
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String strC = c(g12);
        String string = g12.getString("themeName");
        com.avito.beduin.v2.theme.f<r.b> fVarB = s.b(g12, "backgroundColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB2 = s.b(g12, "titleColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB3 = s.b(g12, "subtitleColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB4 = s.b(g12, "detailsColor");
        com.avito.beduin.v2.theme.f<r.b> fVarB5 = s.b(g12, "linkColor");
        com.avito.beduin.v2.avito.component.text.state.n nVar = com.avito.beduin.v2.avito.component.text.state.n.f335362b;
        return new a(string, strC, fVarB, fVarB2, fVarB3, fVarB4, fVarB5, com.avito.beduin.v2.theme.h.c(g12, "titleTextStyle", nVar), com.avito.beduin.v2.theme.h.c(g12, "subtitleFont", nVar), com.avito.beduin.v2.theme.h.c(g12, "detailsFont", nVar), com.avito.beduin.v2.theme.h.c(g12, "linkFont", nVar), com.avito.beduin.v2.theme.h.a(g12, "textVerticalOffset", e.f334597l), com.avito.beduin.v2.theme.h.a(g12, "spaceBetweenLabels", f.f334598l), com.avito.beduin.v2.theme.h.a(g12, "minimumInsetTop", g.f334599l), com.avito.beduin.v2.theme.h.a(g12, "minimumInsetBottom", h.f334600l), com.avito.beduin.v2.theme.h.a(g12, "threshold", i.f334601l), com.avito.beduin.v2.theme.h.a(g12, "oneLabelMinimumHeight", j.f334602l), com.avito.beduin.v2.theme.h.a(g12, "twoLabelsMinimumHeight", k.f334603l), com.avito.beduin.v2.theme.h.a(g12, "threeLabelsMinimumHeight", l.f334604l), com.avito.beduin.v2.theme.h.a(g12, "firstLineAlignmentOffset", m.f334605l), com.avito.beduin.v2.theme.h.a(g12, "textInsetLeft", b.f334594l), com.avito.beduin.v2.theme.h.a(g12, "textInsetRight", c.f334595l), com.avito.beduin.v2.theme.h.a(g12, "textInsetLeftCompensation", d.f334596l), com.avito.beduin.v2.theme.h.c(g12, "spinnerStyle", com.avito.beduin.v2.avito.component.spinner.state.k.f335151b));
    }
}
