package com.avito.android.wallet.pin.impl.settings.mvi;

import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.a;
import kP0.InterfaceC42615a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletSecuritySettingsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "paddingValues", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C10210a f328878l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC42615a, G0> f328879m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(a.C10210a c10210a, Y41.l<? super InterfaceC42615a, G0> lVar) {
        super(3);
        this.f328878l = c10210a;
        this.f328879m = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    @Override // Y41.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r8, androidx.compose.runtime.A r9, java.lang.Integer r10) {
        /*
            r7 = this;
            androidx.compose.foundation.layout.T1 r8 = (androidx.compose.foundation.layout.T1) r8
            androidx.compose.runtime.A r9 = (androidx.compose.runtime.A) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0 = r10 & 14
            r1 = 2
            if (r0 != 0) goto L19
            boolean r0 = r9.B(r8)
            if (r0 == 0) goto L17
            r0 = 4
            goto L18
        L17:
            r0 = r1
        L18:
            r10 = r10 | r0
        L19:
            r10 = r10 & 91
            r0 = 18
            if (r10 != r0) goto L2b
            boolean r10 = r9.c()
            if (r10 != 0) goto L26
            goto L2b
        L26:
            r9.f()
            goto Ldd
        L2b:
            androidx.compose.ui.v$a r10 = androidx.compose.ui.v.f42878y1
            androidx.compose.foundation.layout.FillElement r0 = androidx.compose.foundation.layout.C20588k2.f28682c
            r10.getClass()
            androidx.compose.ui.v r8 = androidx.compose.foundation.layout.R1.h(r0, r8)
            r10 = 16
            float r10 = (float) r10
            androidx.compose.ui.unit.h$a r0 = androidx.compose.ui.unit.h.f42849c
            r0 = 0
            androidx.compose.ui.v r8 = androidx.compose.foundation.layout.R1.k(r10, r0, r1, r8)
            androidx.compose.foundation.layout.k r0 = androidx.compose.foundation.layout.C20585k.f28659a
            r0.getClass()
            androidx.compose.foundation.layout.k$l r0 = androidx.compose.foundation.layout.C20585k.f28662d
            androidx.compose.ui.f$a r1 = androidx.compose.ui.InterfaceC22215f.f39074a
            r1.getClass()
            androidx.compose.ui.i$a r1 = androidx.compose.ui.InterfaceC22215f.a.f39088n
            r2 = 6
            androidx.compose.foundation.layout.I r0 = androidx.compose.foundation.layout.H.a(r0, r1, r9, r2)
            int r1 = r9.getF37888Q()
            androidx.compose.runtime.O1 r3 = r9.y()
            androidx.compose.ui.v r8 = androidx.compose.ui.n.c(r9, r8)
            androidx.compose.ui.node.h$a r4 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r4.getClass()
            Y41.a<androidx.compose.ui.node.h> r4 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.i r5 = r9.F()
            r6 = 0
            if (r5 == 0) goto Le0
            r9.A()
            boolean r5 = r9.getF37887P()
            if (r5 == 0) goto L7a
            r9.b(r4)
            goto L7d
        L7a:
            r9.d()
        L7d:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r4 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r4, r9, r0)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r0 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r0, r9, r3)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r0 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r3 = r9.getF37887P()
            if (r3 != 0) goto L9d
            java.lang.Object r3 = r9.t()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 != 0) goto La0
        L9d:
            androidx.appcompat.app.r.B(r1, r9, r1, r0)
        La0:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.v, kotlin.G0> r0 = androidx.compose.ui.node.InterfaceC22413h.a.f40793d
            androidx.compose.runtime.R3.b(r0, r9, r8)
            androidx.compose.foundation.layout.K r8 = androidx.compose.foundation.layout.K.f28344a
            com.akita.compose.foundation.ui.g.a(r10, r6, r9, r2)
            com.avito.android.wallet.pin.impl.settings.mvi.entity.a$a r8 = r7.f328878l
            kP0.c r8 = r8.f328872b
            r10 = 179318031(0xab02d0f, float:1.6965133E-32)
            r9.C(r10)
            Y41.l<kP0.a, kotlin.G0> r10 = r7.f328879m
            boolean r0 = r9.B(r10)
            java.lang.Object r1 = r9.t()
            if (r0 != 0) goto Lc9
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto Ld1
        Lc9:
            com.avito.android.wallet.pin.impl.settings.mvi.g r1 = new com.avito.android.wallet.pin.impl.settings.mvi.g
            r1.<init>(r10)
            r9.H(r1)
        Ld1:
            Y41.a r1 = (Y41.a) r1
            r9.h()
            r10 = 0
            com.avito.android.wallet.pin.impl.settings.mvi.o.d(r8, r1, r9, r10)
            r9.z()
        Ldd:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Le0:
            androidx.compose.runtime.C22190v.b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.settings.mvi.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
