package com.avito.beduin.v2.avito.component.map.state;

import com.avito.beduin.v2.avito.component.map.state.N;
import kotlin.Metadata;

/* compiled from: UserLocationDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/O;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/N;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class O implements com.avito.beduin.v2.theme.d<N> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final O f334639a = new O();

    /* compiled from: UserLocationDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/map/state/x;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/map/state/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, x> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334640l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final x invoke(com.avito.beduin.v2.engine.component.G g12) {
            y.f334761a.getClass();
            return y.b(g12);
        }
    }

    /* compiled from: UserLocationDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/map/state/x;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/map/state/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, x> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f334641l = new b();

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
    public static N b(@Y61.k com.avito.beduin.v2.engine.component.G g12) {
        x xVar;
        String string = g12.getString("type");
        if (kotlin.jvm.internal.L.f(string, "circle")) {
            x xVar2 = (x) g12.f(a.f334640l, "center", "center");
            if (xVar2 != null) {
                return new N.a(xVar2);
            }
        } else if (kotlin.jvm.internal.L.f(string, "point") && (xVar = (x) g12.f(b.f334641l, "point", "point")) != null) {
            Float fN2 = g12.n("zIndex");
            return new N.b(xVar, fN2 != null ? fN2.floatValue() : 0.0f);
        }
        return null;
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ N a(com.avito.beduin.v2.engine.component.G g12) {
        return b(g12);
    }
}
