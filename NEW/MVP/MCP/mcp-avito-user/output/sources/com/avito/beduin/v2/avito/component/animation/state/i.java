package com.avito.beduin.v2.avito.component.animation.state;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.beduin.v2.avito.component.animation.state.AvitoAnimationState;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.s;
import com.avito.beduin.v2.theme.t;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RemoteJSONDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/i;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c;", "<init>", "()V", "a", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements com.avito.beduin.v2.theme.d<AvitoAnimationState.c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f333787a = new i();

    /* compiled from: RemoteJSONDeclaration.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/i$a;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c$a;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.beduin.v2.theme.d<AvitoAnimationState.c.a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f333788a = new a();

        /* compiled from: RemoteJSONDeclaration.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/theme/r;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/theme/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.avito.component.animation.state.i$a$a, reason: collision with other inner class name */
        public static final class C10368a extends N implements l<G, r> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10368a f333789l = new C10368a();

            public C10368a() {
                super(1);
            }

            @Override // Y41.l
            public final r invoke(G g12) {
                r.a aVar = r.f338365d;
                return s.a(g12);
            }
        }

        @k
        public static AvitoAnimationState.c.a b(@k G g12) {
            String string = g12.getString("name");
            if (string == null) {
                string = "";
            }
            String string2 = g12.getString("themeName");
            r rVar = (r) g12.f(C10368a.f333789l, "color", "color");
            if (rVar == null) {
                rVar = t.f338374a;
            }
            return new AvitoAnimationState.c.a(string, string2, rVar);
        }

        @Override // com.avito.beduin.v2.theme.d
        public final /* bridge */ /* synthetic */ AvitoAnimationState.c.a a(G g12) {
            return b(g12);
        }
    }

    /* compiled from: RemoteJSONDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<G, AvitoAnimationState.c.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f333790l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final AvitoAnimationState.c.a invoke(G g12) {
            a.f333788a.getClass();
            return a.b(g12);
        }
    }

    /* compiled from: RemoteJSONDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<G, AvitoAnimationState.c.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f333791l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final AvitoAnimationState.c.a invoke(G g12) {
            a.f333788a.getClass();
            return a.b(g12);
        }
    }

    @k
    public static AvitoAnimationState.c b(@k G g12) {
        AvitoAnimationState.c.a aVar = (AvitoAnimationState.c.a) g12.f(b.f333790l, "error", "error");
        AvitoAnimationState.c.a aVar2 = (AvitoAnimationState.c.a) g12.f(c.f333791l, ChannelContext.Item.PLACEHOLDER, ChannelContext.Item.PLACEHOLDER);
        String string = g12.getString(ContextActionHandler.Link.URL);
        if (string == null) {
            string = "";
        }
        return new AvitoAnimationState.c(null, string, aVar, aVar2, 1, null);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ AvitoAnimationState.c a(G g12) {
        return b(g12);
    }
}
