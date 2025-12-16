package com.avito.beduin.v2.avito.component.accordion.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoAccordionStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/accordion/state/t;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/accordion/state/k;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t extends com.avito.beduin.v2.theme.o<k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final t f333747b = new t();

    public t() {
        super(a.f333714c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String string = g12.getString("themeName");
        String strC = f333747b.c(g12);
        com.avito.beduin.v2.avito.component.text.state.n nVar = com.avito.beduin.v2.avito.component.text.state.n.f335362b;
        return new k(string, strC, com.avito.beduin.v2.theme.h.c(g12, "titleTextStyle", nVar), com.avito.beduin.v2.theme.h.c(g12, "contentTextStyle", nVar), com.avito.beduin.v2.theme.h.a(g12, "contentTopPadding", l.f333739l), com.avito.beduin.v2.theme.h.a(g12, "bottomPadding", m.f333740l), com.avito.beduin.v2.theme.h.a(g12, "arrowIcon", n.f333741l), com.avito.beduin.v2.theme.h.a(g12, "arrowTextSpacing", o.f333742l), com.avito.beduin.v2.theme.h.a(g12, "arrowVerticalOffset", p.f333743l), com.avito.beduin.v2.theme.h.a(g12, "arrowLeftInset", q.f333744l), com.avito.beduin.v2.theme.h.a(g12, "arrowRightInset", r.f333745l), com.avito.beduin.v2.theme.h.c(g12, "spinnerStyle", com.avito.beduin.v2.avito.component.spinner.state.k.f335151b), com.avito.beduin.v2.theme.h.a(g12, "animationDuration", s.f333746l));
    }
}
