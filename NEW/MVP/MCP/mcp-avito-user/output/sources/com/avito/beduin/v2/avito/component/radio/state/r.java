package com.avito.beduin.v2.avito.component.radio.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoRadioStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/radio/state/r;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/radio/state/l;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r extends com.avito.beduin.v2.theme.o<l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final r f334921b = new r();

    public r() {
        super(k.f334898c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        String string = g12.getString("themeName");
        String strC = c(g12);
        com.avito.beduin.v2.avito.component.common.f fVar = com.avito.beduin.v2.avito.component.common.f.f334125a;
        return new l(string, strC, com.avito.beduin.v2.theme.h.b(g12, "checkedIconColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedIconColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedBorderColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedBorderColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedErrorBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedErrorBackgroundColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "checkedErrorBorderColor", fVar), com.avito.beduin.v2.theme.h.b(g12, "uncheckedErrorBorderColor", fVar), com.avito.beduin.v2.theme.h.a(g12, "cornerRadius", m.f334916l), com.avito.beduin.v2.theme.h.a(g12, "borderWidth", n.f334917l), com.avito.beduin.v2.theme.h.a(g12, "width", o.f334918l), com.avito.beduin.v2.theme.h.a(g12, "height", p.f334919l), com.avito.beduin.v2.theme.h.a(g12, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, q.f334920l));
    }
}
