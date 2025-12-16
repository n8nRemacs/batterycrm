package com.avito.beduin.v2.avito.component.checkbox.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoCheckboxStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/checkbox/state/p;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/checkbox/state/j;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p extends com.avito.beduin.v2.theme.o<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final p f334046b = new p();

    public p() {
        super(i.f334023c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String string = g12.getString("themeName");
        String strC = c(g12);
        com.avito.beduin.v2.avito.component.common.f fVar = com.avito.beduin.v2.avito.component.common.f.f334125a;
        return new j(string, strC, com.avito.beduin.v2.theme.h.b(g12, "checkedIconColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedIconColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedBorderColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedBorderColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedErrorBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedErrorBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedErrorBorderColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedErrorBorderColor", fVar), com.avito.beduin.v2.theme.h.a(g12, "cornerRadius", k.f334041l), com.avito.beduin.v2.theme.h.a(g12, "borderWidth", l.f334042l), com.avito.beduin.v2.theme.h.a(g12, "width", m.f334043l), com.avito.beduin.v2.theme.h.a(g12, "height", n.f334044l), com.avito.beduin.v2.theme.h.a(g12, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, o.f334045l));
    }
}
