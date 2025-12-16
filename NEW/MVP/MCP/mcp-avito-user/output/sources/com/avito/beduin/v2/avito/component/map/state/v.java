package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;

/* compiled from: MapBoundsDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/v;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/u;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class v implements com.avito.beduin.v2.theme.d<u> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final v f334756a = new v();

    /* compiled from: MapBoundsDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/map/state/x;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/map/state/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, x> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334757l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final x invoke(com.avito.beduin.v2.engine.component.G g12) {
            y.f334761a.getClass();
            return y.b(g12);
        }
    }

    /* compiled from: MapBoundsDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/map/state/x;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/map/state/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, x> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f334758l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final x invoke(com.avito.beduin.v2.engine.component.G g12) {
            y.f334761a.getClass();
            return y.b(g12);
        }
    }

    @Y61.l
    public static u b(@Y61.k com.avito.beduin.v2.engine.component.G g12) {
        x xVar;
        x xVar2 = (x) g12.f(a.f334757l, "topLeft", "topLeft");
        if (xVar2 == null || (xVar = (x) g12.f(b.f334758l, "bottomRight", "bottomRight")) == null) {
            return null;
        }
        return new u(xVar2, xVar);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ u a(com.avito.beduin.v2.engine.component.G g12) {
        return b(g12);
    }
}
