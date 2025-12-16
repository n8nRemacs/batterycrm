package com.avito.beduin.v2.avito.component.image.state;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.beduin.v2.avito.component.image.state.Scale;
import com.avito.beduin.v2.engine.component.G;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContentDeclaration.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/r;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/image/state/q;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class r implements com.avito.beduin.v2.theme.d<q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final r f334447a = new r();

    /* compiled from: ContentDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/image/state/s;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/image/state/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<G, s> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334448l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final s invoke(G g12) {
            t.f334450a.getClass();
            return t.b(g12);
        }
    }

    /* compiled from: ContentDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/image/state/s;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/image/state/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<G, s> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f334449l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final s invoke(G g12) {
            t.f334450a.getClass();
            return t.b(g12);
        }
    }

    @Y61.k
    @InterfaceC42830m
    public static q b(@Y61.k G g12, @Y61.l Scale scale) {
        m mVar = m.f334425l;
        Map mapC = (Map) g12.f(mVar, "img", "img");
        if (mapC == null) {
            mapC = P0.c();
        }
        Map map = mapC;
        Map map2 = (Map) g12.f(mVar, "imgDark", "imgDark");
        Map map3 = map2 == null ? map : map2;
        String string = g12.getString("scale");
        if (string != null) {
            Scale.f334399d.getClass();
            scale = Scale.a.a(string);
        } else if (scale == null) {
            scale = Scale.f334400e;
        }
        return new q(map, map3, scale, (s) g12.f(a.f334448l, "error", "error"), (s) g12.f(b.f334449l, ChannelContext.Item.PLACEHOLDER, ChannelContext.Item.PLACEHOLDER));
    }

    @Override // com.avito.beduin.v2.theme.d
    public final q a(G g12) {
        return b(g12, null);
    }
}
