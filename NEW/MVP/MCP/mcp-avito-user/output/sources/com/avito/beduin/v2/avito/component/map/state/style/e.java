package com.avito.beduin.v2.avito.component.map.state.style;

import com.avito.beduin.v2.avito.component.map.state.r;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.o;
import kotlin.Metadata;

/* compiled from: AvitoMapStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/style/e;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/map/state/style/a;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends o<a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final e f334733b = new e();

    public e() {
        super(r.f334709c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        return new a(g12.getString("themeName"), f334733b.c(g12), com.avito.beduin.v2.theme.h.a(g12, "minZoomLevel", b.f334730l), com.avito.beduin.v2.theme.h.a(g12, "maxZoomLevel", c.f334731l), com.avito.beduin.v2.theme.h.a(g12, "logoAlignment", d.f334732l), com.avito.beduin.v2.theme.h.b(g12, "circleLocationStyle", i.f334740a), com.avito.beduin.v2.theme.h.b(g12, "polygonStyle", m.f334752a));
    }
}
