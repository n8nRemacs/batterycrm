package com.avito.beduin.v2.avito.component.progress_bar.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: ProgressDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/progress_bar/state/p;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/progress_bar/state/o;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p implements com.avito.beduin.v2.theme.d<o> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final p f334844a = new p();

    @Y61.l
    public static o b(@Y61.k G g12) {
        String string = g12.getString("mode");
        if (L.f(string, "single")) {
            Float fN2 = g12.n("value");
            return new v(fN2 != null ? fN2.floatValue() : 0.0f);
        }
        if (L.f(string, "segments")) {
            return new u(new ET0.a(C42745f0.C(g12.g("segments", "segments", s.f334847l))));
        }
        return null;
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ o a(G g12) {
        return b(g12);
    }
}
