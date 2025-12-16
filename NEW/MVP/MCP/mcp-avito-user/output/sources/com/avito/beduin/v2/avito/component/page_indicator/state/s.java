package com.avito.beduin.v2.avito.component.page_indicator.state;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;

/* compiled from: AvitoPageIndicatorStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/page_indicator/state/s;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/page_indicator/state/m;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s extends com.avito.beduin.v2.theme.o<m> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final s f334815b = new s();

    public s() {
        super(l.f334796c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String string = g12.getString("themeName");
        String strC = f334815b.c(g12);
        com.avito.beduin.v2.theme.f<r.b> fVarB = com.avito.beduin.v2.theme.s.b(g12, "backgroundColor");
        com.avito.beduin.v2.theme.f fVarA = com.avito.beduin.v2.theme.h.a(g12, "cornerRadius", n.f334810l);
        com.avito.beduin.v2.theme.f fVarA2 = com.avito.beduin.v2.theme.h.a(g12, "horizontalInsets", o.f334811l);
        com.avito.beduin.v2.theme.f fVarA3 = com.avito.beduin.v2.theme.h.a(g12, "verticalInsets", p.f334812l);
        com.avito.beduin.v2.theme.f fVarA4 = com.avito.beduin.v2.theme.h.a(g12, "dotsSpacing", q.f334813l);
        com.avito.beduin.v2.theme.f<r.b> fVarB2 = com.avito.beduin.v2.theme.s.b(g12, "visitedDotsColor");
        e eVar = e.f334782a;
        return new m(string, strC, fVarB, fVarA, fVarA2, fVarA3, fVarA4, fVarB2, com.avito.beduin.v2.theme.h.b(g12, "currentDotStyle", eVar), com.avito.beduin.v2.theme.h.b(g12, "defaultDotStyle", eVar), com.avito.beduin.v2.theme.h.b(g12, "mediumDotStyle", eVar), com.avito.beduin.v2.theme.h.b(g12, "smallDotStyle", eVar), com.avito.beduin.v2.theme.h.a(g12, "pagingAnimationDuration", r.f334814l));
    }
}
