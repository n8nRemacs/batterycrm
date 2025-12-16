package com.avito.beduin.v2.avito.component.spinner.state;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.o;
import com.avito.beduin.v2.theme.s;
import kotlin.Metadata;

/* compiled from: AvitoSpinnerStylePatch.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/spinner/state/k;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/spinner/state/h;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k extends o<h> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final k f335151b = new k();

    public k() {
        super(g.f335143c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        return new h(g12.getString("themeName"), c(g12), com.avito.beduin.v2.theme.h.a(g12, "height", i.f335149l), com.avito.beduin.v2.theme.h.a(g12, "lineThickness", j.f335150l), s.b(g12, "color"));
    }
}
