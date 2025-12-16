package com.avito.android.lib.beduin_v2.component.input;

import androidx.compose.foundation.layout.InterfaceC20640y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InputCompose.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class A extends N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f175632l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.input.v f175633m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f175634n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C c12, com.akita.compose.component.input.v vVar, Y41.a<G0> aVar) {
        super(3);
        this.f175632l = c12;
        this.f175633m = vVar;
        this.f175634n = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    @Override // Y41.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.InterfaceC20640y r16, androidx.compose.runtime.A r17, java.lang.Integer r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            androidx.compose.foundation.layout.y r1 = (androidx.compose.foundation.layout.InterfaceC20640y) r1
            r12 = r17
            androidx.compose.runtime.A r12 = (androidx.compose.runtime.A) r12
            r2 = r18
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r2 & 14
            if (r3 != 0) goto L1f
            boolean r3 = r12.B(r1)
            if (r3 == 0) goto L1d
            r3 = 4
            goto L1e
        L1d:
            r3 = 2
        L1e:
            r2 = r2 | r3
        L1f:
            r2 = r2 & 91
            r3 = 18
            if (r2 != r3) goto L31
            boolean r2 = r12.c()
            if (r2 != 0) goto L2c
            goto L31
        L2c:
            r12.f()
            goto Lc1
        L31:
            com.avito.android.lib.beduin_v2.component.input.C r2 = r0.f175632l
            java.lang.String r3 = r2.f175635a
            int r3 = r3.length()
            com.akita.compose.component.input.v r4 = r0.f175633m
            if (r3 != 0) goto L40
            com.akita.compose.component.input.v$a r3 = r4.f61830c
            goto L42
        L40:
            com.akita.compose.component.input.v$a r3 = r4.f61848u
        L42:
            com.akita.compose.component.input.v$a$a r5 = com.akita.compose.component.input.v.a.f61852e
            com.akita.compose.component.input.InputState r5 = r2.f175638d
            boolean r6 = r2.f175637c
            androidx.compose.runtime.I3 r3 = r3.a(r6, r5, r12)
            java.lang.Object r3 = r3.getF42167b()
            androidx.compose.ui.graphics.T r3 = (androidx.compose.ui.graphics.T) r3
            long r5 = r3.f39331a
            com.akita.compose.foundation.p r3 = com.akita.compose.foundation.q.a(r5)
            boolean r5 = r3.f63641d
            if (r5 == 0) goto L5d
            goto L5e
        L5d:
            r3 = 0
        L5e:
            androidx.compose.ui.v$a r5 = androidx.compose.ui.v.f42878y1
            androidx.compose.ui.f$a r6 = androidx.compose.ui.InterfaceC22215f.f39074a
            r6.getClass()
            androidx.compose.ui.i r6 = androidx.compose.ui.InterfaceC22215f.a.f39080f
            androidx.compose.ui.v r1 = r1.d(r5, r6)
            long r4 = r4.f61838k
            androidx.compose.ui.v r1 = androidx.compose.foundation.layout.C20588k2.p(r4, r1)
            androidx.compose.foundation.shape.n r4 = androidx.compose.foundation.shape.o.f30153a
            if (r3 != 0) goto L7e
            com.akita.compose.theme.re23.b r3 = com.akita.compose.theme.re23.b.f63983a
            r3.getClass()
            com.akita.compose.theme.re23.a r3 = com.akita.compose.theme.re23.b.f63984b
            com.akita.compose.foundation.p r3 = r3.f63938l
        L7e:
            r7 = r3
            r3 = -68126840(0xfffffffffbf07788, float:-2.4971513E36)
            r12.C(r3)
            Y41.a<kotlin.G0> r3 = r0.f175634n
            boolean r5 = r12.B(r3)
            java.lang.Object r6 = r12.t()
            if (r5 != 0) goto L9a
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            r5.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r5) goto La2
        L9a:
            com.avito.android.lib.beduin_v2.component.input.y r6 = new com.avito.android.lib.beduin_v2.component.input.y
            r6.<init>(r3)
            r12.H(r6)
        La2:
            r3 = r6
            Y41.a r3 = (Y41.a) r3
            r12.h()
            com.avito.android.lib.beduin_v2.component.input.z r5 = new com.avito.android.lib.beduin_v2.component.input.z
            r5.<init>(r2)
            r2 = -125928476(0xfffffffff87e7be4, float:-2.0646191E34)
            androidx.compose.runtime.internal.n r11 = androidx.compose.runtime.internal.r.c(r2, r5, r12)
            r9 = 0
            r14 = 984(0x3d8, float:1.379E-42)
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r13 = 0
            r2 = r3
            r3 = r1
            com.akita.compose.foundation.ui.n.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        Lc1:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.input.A.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
