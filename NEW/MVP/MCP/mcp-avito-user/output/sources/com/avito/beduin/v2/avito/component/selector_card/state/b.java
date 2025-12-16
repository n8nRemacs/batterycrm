package com.avito.beduin.v2.avito.component.selector_card.state;

import com.avito.beduin.v2.avito.component.selector_card.state.AvitoSelectorCardState;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoSelectorCardContentDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/b;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/a;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.beduin.v2.theme.d<a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f335068a = new b();

    @Y61.l
    public static a b(@Y61.k G g12) {
        String string = g12.getString("type");
        if (!L.f(string, "text")) {
            if (!L.f(string, "component")) {
                return null;
            }
            v.f335110a.getClass();
            return new AvitoSelectorCardState.a((AvitoSelectorCardState.b) g12.h("content", "content", u.f335109l));
        }
        w.f335111a.getClass();
        String string2 = g12.getString("title");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = g12.getString("subtitle");
        return new AvitoSelectorCardState.c(string2, string3 != null ? string3 : "");
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ a a(G g12) {
        return b(g12);
    }
}
