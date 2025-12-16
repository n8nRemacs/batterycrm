package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateV2Screen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261391l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State f261392m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261393n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(InterfaceC22204y1 interfaceC22204y1, BbipPrivateV2State bbipPrivateV2State, InterfaceC22204y1 interfaceC22204y12) {
        super(2);
        this.f261391l = interfaceC22204y1;
        this.f261392m = bbipPrivateV2State;
        this.f261393n = interfaceC22204y12;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r9, java.lang.Integer r10) {
        /*
            r8 = this;
            androidx.compose.runtime.A r9 = (androidx.compose.runtime.A) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r10 = r10 & 11
            r0 = 2
            if (r10 != r0) goto L19
            boolean r10 = r9.c()
            if (r10 != 0) goto L14
            goto L19
        L14:
            r9.f()
            goto Lda
        L19:
            androidx.compose.ui.v$a r10 = androidx.compose.ui.v.f42878y1
            Y41.l<androidx.compose.ui.platform.y1, kotlin.G0> r0 = androidx.compose.ui.platform.C22535v1.f41625a
            androidx.compose.foundation.layout.i3 r1 = new androidx.compose.foundation.layout.i3
            r1.<init>()
            androidx.compose.ui.v r0 = androidx.compose.ui.n.a(r10, r0, r1)
            androidx.compose.ui.f$a r1 = androidx.compose.ui.InterfaceC22215f.f39074a
            r1.getClass()
            androidx.compose.ui.i r1 = androidx.compose.ui.InterfaceC22215f.a.f39076b
            r2 = 0
            androidx.compose.ui.layout.i0 r1 = androidx.compose.foundation.layout.C20632w.d(r1, r2)
            int r2 = r9.getF37888Q()
            androidx.compose.runtime.O1 r3 = r9.y()
            androidx.compose.ui.v r0 = androidx.compose.ui.n.c(r9, r0)
            androidx.compose.ui.node.h$a r4 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r4.getClass()
            Y41.a<androidx.compose.ui.node.h> r4 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.i r5 = r9.F()
            if (r5 == 0) goto Ldd
            r9.A()
            boolean r5 = r9.getF37887P()
            if (r5 == 0) goto L58
            r9.b(r4)
            goto L5b
        L58:
            r9.d()
        L5b:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r4 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r4, r9, r1)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r1, r9, r3)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r3 = r9.getF37887P()
            if (r3 != 0) goto L7b
            java.lang.Object r3 = r9.t()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 != 0) goto L7e
        L7b:
            androidx.appcompat.app.r.B(r2, r9, r2, r1)
        L7e:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.v, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40793d
            androidx.compose.runtime.R3.b(r1, r9, r0)
            androidx.compose.foundation.layout.z r0 = androidx.compose.foundation.layout.C20644z.f28804a
            com.akita.compose.theme.re23.b r0 = com.akita.compose.theme.re23.b.f63983a
            r0.getClass()
            com.akita.compose.theme.re23.e r0 = com.akita.compose.theme.re23.b.f63985c
            r0.getClass()
            int r2 = com.akita.compose.theme.re23.e.f64237O3
            java.lang.String r0 = "BBIP_PRIVATE_V2_NAVBAR_TEST_TAG"
            androidx.compose.ui.v r0 = androidx.compose.ui.platform.C22501m2.a(r10, r0)
            r10 = 1102248448(0x41b2fa00, float:22.37207)
            r9.C(r10)
            androidx.compose.runtime.y1 r10 = r8.f261391l
            boolean r1 = r9.B(r10)
            java.lang.Object r3 = r9.t()
            if (r1 != 0) goto Lb2
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r1) goto Lba
        Lb2:
            com.avito.android.screens.bbip_private_v2.ui.compose.o r3 = new com.avito.android.screens.bbip_private_v2.ui.compose.o
            r3.<init>(r10)
            r9.H(r3)
        Lba:
            Y41.a r3 = (Y41.a) r3
            r9.h()
            com.avito.android.screens.bbip_private_v2.ui.compose.s r10 = new com.avito.android.screens.bbip_private_v2.ui.compose.s
            androidx.compose.runtime.y1 r1 = r8.f261393n
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State r4 = r8.f261392m
            r10.<init>(r4, r1)
            r1 = -1574376377(0xffffffffa228ec47, float:-2.289333E-18)
            androidx.compose.runtime.internal.n r4 = androidx.compose.runtime.internal.r.c(r1, r10, r9)
            r1 = 0
            r6 = 24582(0x6006, float:3.4447E-41)
            r7 = 2
            r5 = r9
            com.akita.compose.component.navbar.t.b(r0, r1, r2, r3, r4, r5, r6, r7)
            r9.z()
        Lda:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        Ldd:
            androidx.compose.runtime.C22190v.b()
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.ui.compose.t.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
