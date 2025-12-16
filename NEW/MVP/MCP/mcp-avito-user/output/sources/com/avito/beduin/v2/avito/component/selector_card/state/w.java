package com.avito.beduin.v2.avito.component.selector_card.state;

import com.avito.beduin.v2.avito.component.selector_card.state.AvitoSelectorCardState;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoSelectorCardContentDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/w;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$c;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class w implements com.avito.beduin.v2.theme.d<AvitoSelectorCardState.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final w f335111a = new w();

    @Override // com.avito.beduin.v2.theme.d
    public final AvitoSelectorCardState.c a(G g12) {
        String string = g12.getString("title");
        if (string == null) {
            string = "";
        }
        String string2 = g12.getString("subtitle");
        return new AvitoSelectorCardState.c(string, string2 != null ? string2 : "");
    }
}
