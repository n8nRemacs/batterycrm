package com.avito.beduin.v2.avito.component.map.state;

import com.avito.beduin.v2.avito.component.map.state.Pin;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PinDeclaration.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/B;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/Pin;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B implements com.avito.beduin.v2.theme.d<Pin> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final B f334614a = new B();

    /* compiled from: PinDeclaration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<Pin.Anchor> f334615a = kotlin.enums.c.a(Pin.Anchor.values());
    }

    /* compiled from: PinDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/map/state/x;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/map/state/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, x> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f334616l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final x invoke(com.avito.beduin.v2.engine.component.G g12) {
            y.f334761a.getClass();
            return y.b(g12);
        }
    }

    /* compiled from: PinDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/map/state/C;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/map/state/C;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, C> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f334617l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final C invoke(com.avito.beduin.v2.engine.component.G g12) {
            com.avito.beduin.v2.engine.component.G g13 = g12;
            D.f334618a.getClass();
            if (!kotlin.jvm.internal.L.f(g13.getString("pinType"), "Remote")) {
                return null;
            }
            M.f334630a.getClass();
            return M.b(g13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.beduin.v2.avito.component.map.state.Pin b(@Y61.k com.avito.beduin.v2.engine.component.G r8) {
        /*
            java.lang.String r0 = "pinId"
            java.lang.String r2 = r8.getString(r0)
            r0 = 0
            if (r2 != 0) goto La
            goto L62
        La:
            com.avito.beduin.v2.avito.component.map.state.B$b r1 = com.avito.beduin.v2.avito.component.map.state.B.b.f334616l
            java.lang.String r3 = "point"
            java.lang.Object r1 = r8.f(r1, r3, r3)
            r3 = r1
            com.avito.beduin.v2.avito.component.map.state.x r3 = (com.avito.beduin.v2.avito.component.map.state.x) r3
            if (r3 != 0) goto L18
            goto L62
        L18:
            com.avito.beduin.v2.avito.component.map.state.B$c r1 = com.avito.beduin.v2.avito.component.map.state.B.c.f334617l
            java.lang.String r4 = "pinView"
            java.lang.Object r1 = r8.f(r1, r4, r4)
            r4 = r1
            com.avito.beduin.v2.avito.component.map.state.C r4 = (com.avito.beduin.v2.avito.component.map.state.C) r4
            if (r4 != 0) goto L26
            goto L62
        L26:
            java.lang.String r1 = "zIndex"
            java.lang.Integer r5 = r8.a(r1)
            java.lang.String r1 = "anchor"
            java.lang.String r8 = r8.getString(r1)
            if (r8 == 0) goto L59
            kotlin.enums.a<com.avito.beduin.v2.avito.component.map.state.Pin$Anchor> r1 = com.avito.beduin.v2.avito.component.map.state.B.a.f334615a
            kotlin.collections.c r1 = (kotlin.collections.AbstractC42738c) r1
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L52
            java.lang.Object r6 = r1.next()
            r7 = r6
            com.avito.beduin.v2.avito.component.map.state.Pin$Anchor r7 = (com.avito.beduin.v2.avito.component.map.state.Pin.Anchor) r7
            java.lang.String r7 = r7.f334650b
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3c
            r0 = r6
        L52:
            com.avito.beduin.v2.avito.component.map.state.Pin$Anchor r0 = (com.avito.beduin.v2.avito.component.map.state.Pin.Anchor) r0
            if (r0 != 0) goto L57
            goto L59
        L57:
            r6 = r0
            goto L5c
        L59:
            com.avito.beduin.v2.avito.component.map.state.Pin$Anchor r8 = com.avito.beduin.v2.avito.component.map.state.Pin.Anchor.f334647c
            r6 = r8
        L5c:
            com.avito.beduin.v2.avito.component.map.state.Pin r0 = new com.avito.beduin.v2.avito.component.map.state.Pin
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.avito.component.map.state.B.b(com.avito.beduin.v2.engine.component.G):com.avito.beduin.v2.avito.component.map.state.Pin");
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ Pin a(com.avito.beduin.v2.engine.component.G g12) {
        return b(g12);
    }
}
