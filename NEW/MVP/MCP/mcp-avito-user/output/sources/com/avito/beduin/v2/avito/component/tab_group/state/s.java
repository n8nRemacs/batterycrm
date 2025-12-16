package com.avito.beduin.v2.avito.component.tab_group.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoTabGroupStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tab_group/state/s;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/tab_group/state/n;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s extends com.avito.beduin.v2.theme.o<n> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final s f335309b = new s();

    public s() {
        super(m.f335295c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        return new n(g12.getString("themeName"), f335309b.c(g12), com.avito.beduin.v2.theme.h.a(g12, "verticalPadding", o.f335305l), com.avito.beduin.v2.theme.h.a(g12, "horizontalPadding", p.f335306l), com.avito.beduin.v2.theme.s.b(g12, "selectedLineColor"), com.avito.beduin.v2.theme.s.b(g12, "bottomLineColor"), com.avito.beduin.v2.theme.h.a(g12, "compensation", q.f335307l), com.avito.beduin.v2.theme.h.a(g12, "spacing", r.f335308l), com.avito.beduin.v2.theme.h.b(g12, "itemsStyle", b.f335272a));
    }
}
