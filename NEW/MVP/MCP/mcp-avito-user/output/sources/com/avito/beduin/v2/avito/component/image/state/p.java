package com.avito.beduin.v2.avito.component.image.state;

import com.avito.beduin.v2.avito.component.image.state.Scale;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContentDeclaration.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/p;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/image/state/o;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class p implements com.avito.beduin.v2.theme.d<o> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final p f334430a = new p();

    /* compiled from: ContentDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/theme/r;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/theme/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<G, com.avito.beduin.v2.theme.r> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334431l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.beduin.v2.theme.r invoke(G g12) {
            r.a aVar = com.avito.beduin.v2.theme.r.f338365d;
            return com.avito.beduin.v2.theme.s.a(g12);
        }
    }

    @Y61.k
    @InterfaceC42830m
    public static o b(@Y61.k G g12, @Y61.l Scale scale) {
        String string = g12.getString("name");
        if (string == null) {
            string = "";
        }
        String string2 = g12.getString("themeName");
        com.avito.beduin.v2.theme.r rVar = (com.avito.beduin.v2.theme.r) g12.f(a.f334431l, "color", "color");
        String string3 = g12.getString("scale");
        if (string3 != null) {
            Scale.f334399d.getClass();
            scale = Scale.a.a(string3);
        } else if (scale == null) {
            scale = Scale.f334400e;
        }
        return new o(string, string2, rVar, scale);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final o a(G g12) {
        return b(g12, null);
    }
}
