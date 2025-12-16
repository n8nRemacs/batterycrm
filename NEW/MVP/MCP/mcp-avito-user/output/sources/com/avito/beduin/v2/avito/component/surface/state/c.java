package com.avito.beduin.v2.avito.component.surface.state;

import Y41.l;
import com.avito.beduin.v2.avito.component.gradient.content.i;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: AvitoSurfaceStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/gradient/content/b;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/gradient/content/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements l<G, com.avito.beduin.v2.avito.component.gradient.content.b> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f335221l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final com.avito.beduin.v2.avito.component.gradient.content.b invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("mode");
        if (L.f(string, "manual")) {
            i.f334372a.getClass();
            return i.b(g13);
        }
        if (!L.f(string, "token")) {
            return null;
        }
        com.avito.beduin.v2.avito.component.gradient.content.e.f334366a.getClass();
        return com.avito.beduin.v2.avito.component.gradient.content.e.b(g13);
    }
}
