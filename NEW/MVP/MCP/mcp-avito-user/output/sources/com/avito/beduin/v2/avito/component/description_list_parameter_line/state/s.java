package com.avito.beduin.v2.avito.component.description_list_parameter_line.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoDescriptionListParameterLineStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/s;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/n;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s extends com.avito.beduin.v2.theme.o<n> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final s f334312b = new s();

    public s() {
        super(m.f334296c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String string = g12.getString("themeName");
        String strC = c(g12);
        com.avito.beduin.v2.avito.component.text.state.n nVar = com.avito.beduin.v2.avito.component.text.state.n.f335362b;
        return new n(string, strC, com.avito.beduin.v2.theme.h.c(g12, "leadingLabelStyle", nVar), com.avito.beduin.v2.theme.s.b(g12, "leadingLabelColor"), com.avito.beduin.v2.theme.h.a(g12, "leadingLabelWidthShare", o.f334308l), com.avito.beduin.v2.theme.h.a(g12, "trailingLabelWidthShare", p.f334309l), com.avito.beduin.v2.theme.h.c(g12, "trailingLabelStyle", nVar), com.avito.beduin.v2.theme.s.b(g12, "trailingLabelColor"), com.avito.beduin.v2.theme.h.a(g12, "itemVerticalInset", q.f334310l), com.avito.beduin.v2.theme.h.a(g12, "iconHorizontalInset", r.f334311l), com.avito.beduin.v2.theme.s.b(g12, "lineColor"));
    }
}
