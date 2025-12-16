package com.avito.beduin.v2.avito.component.text.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoTextStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/n;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/text/state/j;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n extends com.avito.beduin.v2.theme.o<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final n f335362b = new n();

    public n() {
        super(i.f335350c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        return new j(g12.getString("themeName"), f335362b.c(g12), com.avito.beduin.v2.theme.h.a(g12, "size", k.f335359l), com.avito.beduin.v2.theme.h.a(g12, "lineHeight", l.f335360l), com.avito.beduin.v2.theme.h.a(g12, "font", m.f335361l), com.avito.beduin.v2.theme.s.b(g12, "color"), com.avito.beduin.v2.theme.s.b(g12, "iconColor"), com.avito.beduin.v2.theme.s.b(g12, "linkColor"));
    }
}
