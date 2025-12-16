package com.avito.beduin.v2.avito.component.map.state;

import com.avito.beduin.v2.avito.component.map.state.RemotePinView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PinView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/I;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView$RemotePinText;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class I implements com.avito.beduin.v2.theme.d<RemotePinView.RemotePinText> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final I f334623a = new I();

    /* compiled from: PinView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<RemotePinView.RemotePinText.Position> f334624a = kotlin.enums.c.a(RemotePinView.RemotePinText.Position.values());
    }

    /* compiled from: PinView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView$RemotePinText$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView$RemotePinText$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, RemotePinView.RemotePinText.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f334625l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final RemotePinView.RemotePinText.a invoke(com.avito.beduin.v2.engine.component.G g12) {
            s.f334710a.getClass();
            return s.b(g12);
        }
    }

    /* compiled from: PinView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "LET0/b;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)LET0/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, ET0.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f334626l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final ET0.b invoke(com.avito.beduin.v2.engine.component.G g12) {
            int i12 = ET0.b.f4015e;
            return ET0.c.a(g12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.beduin.v2.avito.component.map.state.RemotePinView.RemotePinText b(@Y61.k com.avito.beduin.v2.engine.component.G r8) {
        /*
            java.lang.String r0 = "text"
            java.lang.String r2 = r8.getString(r0)
            r0 = 0
            if (r2 != 0) goto La
            goto L70
        La:
            java.lang.String r1 = "style"
            com.avito.beduin.v2.avito.component.text.state.n r3 = com.avito.beduin.v2.avito.component.text.state.n.f335362b
            com.avito.beduin.v2.theme.l r3 = com.avito.beduin.v2.theme.h.c(r8, r1, r3)
            java.lang.String r1 = "position"
            java.lang.String r1 = r8.getString(r1)
            if (r1 == 0) goto L3f
            kotlin.enums.a<com.avito.beduin.v2.avito.component.map.state.RemotePinView$RemotePinText$Position> r4 = com.avito.beduin.v2.avito.component.map.state.I.a.f334624a
            kotlin.collections.c r4 = (kotlin.collections.AbstractC42738c) r4
            java.util.Iterator r4 = r4.iterator()
        L22:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L38
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.avito.beduin.v2.avito.component.map.state.RemotePinView$RemotePinText$Position r6 = (com.avito.beduin.v2.avito.component.map.state.RemotePinView.RemotePinText.Position) r6
            java.lang.String r6 = r6.f334666b
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L22
            r0 = r5
        L38:
            com.avito.beduin.v2.avito.component.map.state.RemotePinView$RemotePinText$Position r0 = (com.avito.beduin.v2.avito.component.map.state.RemotePinView.RemotePinText.Position) r0
            if (r0 != 0) goto L3d
            goto L3f
        L3d:
            r4 = r0
            goto L42
        L3f:
            com.avito.beduin.v2.avito.component.map.state.RemotePinView$RemotePinText$Position r0 = com.avito.beduin.v2.avito.component.map.state.RemotePinView.RemotePinText.Position.f334663f
            goto L3d
        L42:
            com.avito.beduin.v2.avito.component.map.state.I$b r0 = com.avito.beduin.v2.avito.component.map.state.I.b.f334625l
            java.lang.String r1 = "background"
            java.lang.Object r0 = r8.f(r0, r1, r1)
            r5 = r0
            com.avito.beduin.v2.avito.component.map.state.RemotePinView$RemotePinText$a r5 = (com.avito.beduin.v2.avito.component.map.state.RemotePinView.RemotePinText.a) r5
            com.avito.beduin.v2.avito.component.map.state.I$c r0 = com.avito.beduin.v2.avito.component.map.state.I.c.f334626l
            java.lang.String r1 = "padding"
            java.lang.Object r0 = r8.f(r0, r1, r1)
            r6 = r0
            ET0.b r6 = (ET0.b) r6
            java.lang.String r0 = "marginToImage"
            java.lang.Integer r8 = r8.a(r0)
            if (r8 == 0) goto L65
            int r8 = r8.intValue()
            goto L66
        L65:
            r8 = 0
        L66:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            com.avito.beduin.v2.avito.component.map.state.RemotePinView$RemotePinText r0 = new com.avito.beduin.v2.avito.component.map.state.RemotePinView$RemotePinText
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.avito.component.map.state.I.b(com.avito.beduin.v2.engine.component.G):com.avito.beduin.v2.avito.component.map.state.RemotePinView$RemotePinText");
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ RemotePinView.RemotePinText a(com.avito.beduin.v2.engine.component.G g12) {
        return b(g12);
    }
}
