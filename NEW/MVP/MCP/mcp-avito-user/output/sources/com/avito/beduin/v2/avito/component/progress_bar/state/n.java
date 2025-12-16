package com.avito.beduin.v2.avito.component.progress_bar.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: AvitoProgressBarStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/progress_bar/state/n;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/progress_bar/state/i;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n extends com.avito.beduin.v2.theme.o<i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final n f334843b = new n();

    public n() {
        super(h.f334830c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        return new i(g12.getString("themeName"), f334843b.c(g12), com.avito.beduin.v2.theme.s.b(g12, "trackColor"), com.avito.beduin.v2.theme.s.b(g12, "progressColor"), com.avito.beduin.v2.theme.h.a(g12, "height", j.f334839l), com.avito.beduin.v2.theme.h.a(g12, "cornerRadius", k.f334840l), com.avito.beduin.v2.theme.h.a(g12, "minEdgeWidth", l.f334841l), com.avito.beduin.v2.theme.h.a(g12, "segmentSpacing", m.f334842l));
    }
}
