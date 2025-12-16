package com.avito.beduin.v2.avito.component.time_line.state;

import com.avito.beduin.v2.avito.component.text.state.n;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.o;
import com.avito.beduin.v2.theme.s;
import kotlin.Metadata;

/* compiled from: AvitoTimeLineStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/time_line/state/m;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/time_line/state/k;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m extends o<k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final m f335422b = new m();

    public m() {
        super(j.f335411c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String string = g12.getString("themeName");
        String strC = f335422b.c(g12);
        n nVar = n.f335362b;
        com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g12, "activeTextStyle", nVar);
        return new k(s.b(g12, "activeColor"), s.b(g12, "activeTextColor"), s.b(g12, "inactiveColor"), s.b(g12, "inactiveTextColor"), com.avito.beduin.v2.theme.h.a(g12, "lineThickness", l.f335421l), lVarC, com.avito.beduin.v2.theme.h.c(g12, "inactiveTextStyle", nVar), string, strC);
    }
}
