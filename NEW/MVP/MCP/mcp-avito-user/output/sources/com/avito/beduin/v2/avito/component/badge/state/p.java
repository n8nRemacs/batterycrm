package com.avito.beduin.v2.avito.component.badge.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoBadgeStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/badge/state/p;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/badge/state/l;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p extends com.avito.beduin.v2.theme.o<l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final p f333823b = new p();

    public p() {
        super(j.f333811c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        return new l(g12.getString("themeName"), f333823b.c(g12), com.avito.beduin.v2.theme.h.a(g12, "height", m.f333820l), com.avito.beduin.v2.theme.h.a(g12, "width", n.f333821l), com.avito.beduin.v2.theme.h.b(g12, "badgeTextStyle", u.f333831a), com.avito.beduin.v2.theme.h.a(g12, "cornerRadius", o.f333822l), com.avito.beduin.v2.theme.s.b(g12, "backgroundColor"));
    }
}
