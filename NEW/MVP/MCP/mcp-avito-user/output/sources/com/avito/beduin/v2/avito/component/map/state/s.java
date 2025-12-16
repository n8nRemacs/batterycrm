package com.avito.beduin.v2.avito.component.map.state;

import com.avito.beduin.v2.avito.component.map.state.RemotePinView;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;

/* compiled from: PinView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/s;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView$RemotePinText$a;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class s implements com.avito.beduin.v2.theme.d<RemotePinView.RemotePinText.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final s f334710a = new s();

    /* compiled from: PinView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/theme/r;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/theme/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, com.avito.beduin.v2.theme.r> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334711l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.beduin.v2.theme.r invoke(com.avito.beduin.v2.engine.component.G g12) {
            r.a aVar = com.avito.beduin.v2.theme.r.f338365d;
            return com.avito.beduin.v2.theme.s.a(g12);
        }
    }

    /* compiled from: PinView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/common/n;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/common/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, com.avito.beduin.v2.avito.component.common.n> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f334712l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.beduin.v2.avito.component.common.n invoke(com.avito.beduin.v2.engine.component.G g12) {
            com.avito.beduin.v2.avito.component.common.o.f334145a.getClass();
            return com.avito.beduin.v2.avito.component.common.o.c(g12);
        }
    }

    @Y61.k
    public static RemotePinView.RemotePinText.a b(@Y61.k com.avito.beduin.v2.engine.component.G g12) {
        com.avito.beduin.v2.theme.r rVar = (com.avito.beduin.v2.theme.r) g12.f(a.f334711l, "color", "color");
        if (rVar == null) {
            rVar = com.avito.beduin.v2.theme.t.f338374a;
        }
        com.avito.beduin.v2.avito.component.common.b bVar = (com.avito.beduin.v2.avito.component.common.b) com.avito.beduin.v2.theme.h.b(g12, "border", com.avito.beduin.v2.avito.component.common.d.f334121a).a();
        return new RemotePinView.RemotePinText.a(rVar, bVar != null ? new com.avito.beduin.v2.avito.component.common.a(bVar) : null, (com.avito.beduin.v2.avito.component.common.n) g12.f(b.f334712l, "shape", "shape"));
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ RemotePinView.RemotePinText.a a(com.avito.beduin.v2.engine.component.G g12) {
        return b(g12);
    }
}
