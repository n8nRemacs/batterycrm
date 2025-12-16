package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.v;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.exception.RendererBeduinException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: InnerComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l {

    /* compiled from: InnerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<m, n> f338080l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f338081m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f338082n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f338080l = lVar;
            this.f338081m = interfaceC36249i;
            this.f338082n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws RendererBeduinException.UnregisteredComponentException {
            num.intValue();
            int iA2 = C22066f2.a(this.f338082n | 1);
            l.a(this.f338080l, this.f338081m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: InnerComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/render/compose/m;", "params", "Lcom/avito/beduin/v2/render/compose/n;", "invoke", "(Lcom/avito/beduin/v2/render/compose/m;)Lcom/avito/beduin/v2/render/compose/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<m, n> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<m, n> f338083l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super m, n> lVar) {
            super(1);
            this.f338083l = lVar;
        }

        @Override // Y41.l
        public final n invoke(m mVar) {
            n nVarInvoke = this.f338083l.invoke(mVar);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVar = z.f338110a;
            aVar.getClass();
            return new n(vVar.d0(nVarInvoke.f338090a), nVarInvoke.f338091b, nVarInvoke.f338092c, nVarInvoke.f338093d);
        }
    }

    /* compiled from: InnerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<m, n> f338084l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f338085m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AbstractC36347d<?> f338086n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f338087o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, AbstractC36347d<?> abstractC36347d, int i12) {
            super(2);
            this.f338084l = lVar;
            this.f338085m = interfaceC36249i;
            this.f338086n = abstractC36347d;
            this.f338087o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f338087o | 1);
            InterfaceC36249i interfaceC36249i = this.f338085m;
            AbstractC36347d<?> abstractC36347d = this.f338086n;
            l.b(this.f338084l, interfaceC36249i, abstractC36347d, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    public static final void a(@Y61.k Y41.l<? super m, n> lVar, @Y61.k InterfaceC36249i interfaceC36249i, @Y61.l androidx.compose.runtime.A a12, int i12) throws RendererBeduinException.UnregisteredComponentException {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1895807598);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(lVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(interfaceC36249i) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-1185814713);
            AbstractC36347d abstractC36347dB = ((G) bE2.o(C36345b.f338050a)).b(interfaceC36249i.getF336566c(), bE2);
            bE2.X(false);
            b(lVar, interfaceC36249i, abstractC36347dB, bE2, i13 & WebSocketProtocol.PAYLOAD_SHORT);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(lVar, interfaceC36249i, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> r7, @Y61.k com.avito.beduin.v2.engine.component.InterfaceC36249i r8, @Y61.k com.avito.beduin.v2.render.compose.AbstractC36347d<?> r9, @Y61.l androidx.compose.runtime.A r10, int r11) {
        /*
            r0 = -1936362918(0xffffffff8c95725a, float:-2.3025908E-31)
            androidx.compose.runtime.B r10 = r10.E(r0)
            r0 = r11 & 14
            r1 = 4
            if (r0 != 0) goto L17
            boolean r0 = r10.u(r7)
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r11
            goto L18
        L17:
            r0 = r11
        L18:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L28
            boolean r2 = r10.B(r8)
            if (r2 == 0) goto L25
            r2 = 32
            goto L27
        L25:
            r2 = 16
        L27:
            r0 = r0 | r2
        L28:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L38
            boolean r2 = r10.B(r9)
            if (r2 == 0) goto L35
            r2 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r2 = 128(0x80, float:1.8E-43)
        L37:
            r0 = r0 | r2
        L38:
            r2 = r0 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L49
            boolean r2 = r10.c()
            if (r2 != 0) goto L45
            goto L49
        L45:
            r10.f()
            goto Lb7
        L49:
            androidx.compose.runtime.J3 r2 = com.avito.beduin.v2.render.compose.C36345b.f338053d
            java.lang.Object r2 = r10.o(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 127555354(0x79a571a, float:2.3222538E-34)
            r10.C(r3)
            r3 = 0
            if (r2 == 0) goto L79
            java.lang.String r4 = "state"
            java.util.Map r4 = java.util.Collections.singletonMap(r4, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "InnerComponent: "
            r5.<init>(r6)
            java.lang.String r6 = r8.getF336566c()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.avito.beduin.v2.render.compose.v.a(r4, r5, r10, r3)
        L79:
            r10.X(r3)
            r4 = 127562053(0x79a7145, float:2.3237918E-34)
            r10.C(r4)
            if (r2 == 0) goto Lae
            r2 = 127562897(0x79a7491, float:2.3239856E-34)
            r10.C(r2)
            r2 = r0 & 14
            if (r2 != r1) goto L90
            r1 = 1
            goto L91
        L90:
            r1 = r3
        L91:
            java.lang.Object r2 = r10.t()
            if (r1 != 0) goto La0
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto La8
        La0:
            com.avito.beduin.v2.render.compose.l$b r2 = new com.avito.beduin.v2.render.compose.l$b
            r2.<init>(r7)
            r10.H(r2)
        La8:
            Y41.l r2 = (Y41.l) r2
            r10.X(r3)
            goto Laf
        Lae:
            r2 = r7
        Laf:
            r10.X(r3)
            r0 = r0 & 1008(0x3f0, float:1.413E-42)
            r9.a(r2, r8, r10, r0)
        Lb7:
            androidx.compose.runtime.c2 r10 = r10.Z()
            if (r10 == 0) goto Lc4
            com.avito.beduin.v2.render.compose.l$c r0 = new com.avito.beduin.v2.render.compose.l$c
            r0.<init>(r7, r8, r9, r11)
            r10.f38184d = r0
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.render.compose.l.b(Y41.l, com.avito.beduin.v2.engine.component.i, com.avito.beduin.v2.render.compose.d, androidx.compose.runtime.A, int):void");
    }
}
