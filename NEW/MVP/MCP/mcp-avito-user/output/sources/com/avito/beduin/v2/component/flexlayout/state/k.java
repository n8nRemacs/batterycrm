package com.avito.beduin.v2.component.flexlayout.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FlexLayoutStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/flexlayout/state/b;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/flexlayout/state/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<G, b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.component.common.utils.a f335760l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.avito.beduin.v2.component.common.utils.a aVar) {
        super(1);
        this.f335760l = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.component.flexlayout.state.b invoke(com.avito.beduin.v2.engine.component.G r17) {
        /*
            r16 = this;
            r0 = r17
            com.avito.beduin.v2.engine.component.G r0 = (com.avito.beduin.v2.engine.component.G) r0
            com.avito.beduin.v2.component.flexlayout.state.f r1 = com.avito.beduin.v2.component.flexlayout.state.f.f335755l
            java.lang.String r2 = "children"
            java.util.List r1 = r0.g(r2, r2, r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r1 = kotlin.collections.C42745f0.C(r1)
            ET0.a r9 = new ET0.a
            r9.<init>(r1)
            java.lang.String r1 = "backgroundColor"
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto L21
            java.lang.String r1 = "#00000000"
        L21:
            r3 = r1
            r1 = r16
            com.avito.beduin.v2.component.common.utils.a r2 = r1.f335760l
            boolean r11 = r2.f335704b
            com.avito.beduin.v2.component.flexlayout.state.h r4 = com.avito.beduin.v2.component.flexlayout.state.h.f335757l
            java.lang.String r5 = "onClick"
            java.lang.Object r4 = r0.d(r4, r5, r5)
            r10 = r4
            Y41.a r10 = (Y41.a) r10
            java.lang.String r4 = "reverse"
            java.lang.Boolean r4 = r0.c(r4)
            r5 = 0
            if (r4 == 0) goto L41
            boolean r4 = r4.booleanValue()
            goto L42
        L41:
            r4 = r5
        L42:
            java.lang.String r6 = "arrangement"
            java.lang.String r6 = r0.getString(r6)
            com.avito.beduin.v2.component.common.Arrangement$a r7 = com.avito.beduin.v2.component.common.Arrangement.f335645c
            com.avito.beduin.v2.component.common.Arrangement r8 = com.avito.beduin.v2.component.common.Arrangement.f335647e
            r7.getClass()
            com.avito.beduin.v2.component.common.Arrangement r6 = com.avito.beduin.v2.component.common.Arrangement.a.a(r6, r8)
            com.avito.beduin.v2.component.flexlayout.state.i r7 = com.avito.beduin.v2.component.flexlayout.state.i.f335758l
            java.lang.String r8 = "spacing"
            java.lang.Object r7 = r0.f(r7, r8, r8)
            ET0.h r7 = (ET0.h) r7
            if (r7 != 0) goto L64
            ET0.h r7 = new ET0.h
            r7.<init>(r5, r5)
        L64:
            com.avito.beduin.v2.component.flexlayout.state.j r8 = com.avito.beduin.v2.component.flexlayout.state.j.f335759l
            java.lang.String r12 = "padding"
            java.lang.Object r8 = r0.f(r8, r12, r12)
            ET0.b r8 = (ET0.b) r8
            java.lang.String r12 = "crossAxisAlignment"
            java.lang.String r0 = r0.getString(r12)
            com.avito.beduin.v2.component.common.AxisAlignment$a r12 = com.avito.beduin.v2.component.common.AxisAlignment.f335651c
            com.avito.beduin.v2.component.common.AxisAlignment r13 = com.avito.beduin.v2.component.common.AxisAlignment.f335652d
            r12.getClass()
            if (r0 != 0) goto L7e
            goto L98
        L7e:
            com.avito.beduin.v2.component.common.AxisAlignment[] r12 = com.avito.beduin.v2.component.common.AxisAlignment.values()
            int r14 = r12.length
        L83:
            if (r5 >= r14) goto L95
            r15 = r12[r5]
            java.lang.String r1 = r15.f335655b
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L90
            goto L96
        L90:
            int r5 = r5 + 1
            r1 = r16
            goto L83
        L95:
            r15 = 0
        L96:
            if (r15 != 0) goto L99
        L98:
            r15 = r13
        L99:
            com.avito.beduin.v2.component.flexlayout.state.b r0 = new com.avito.beduin.v2.component.flexlayout.state.b
            Y41.a<kotlin.G0> r13 = r2.f335706d
            java.lang.String r14 = r2.f335703a
            Y41.a<kotlin.G0> r12 = r2.f335705c
            r2 = r0
            r5 = r6
            r6 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.flexlayout.state.k.invoke(java.lang.Object):java.lang.Object");
    }
}
