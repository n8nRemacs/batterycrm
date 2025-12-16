package com.akita.compose.component.chips.internal;

import Y41.q;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.F;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SingleLineStretchedLayout.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements q<F, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f60928l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f60929m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T1 f60930n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d2 f60931o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f60932p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C22096n c22096n, v.a aVar, T1 t12, d2 d2Var, float f12) {
        super(3);
        this.f60928l = c22096n;
        this.f60929m = aVar;
        this.f60930n = t12;
        this.f60931o = d2Var;
        this.f60932p = f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // Y41.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.F r9, androidx.compose.runtime.A r10, java.lang.Integer r11) {
        /*
            r8 = this;
            androidx.compose.foundation.layout.F r9 = (androidx.compose.foundation.layout.F) r9
            androidx.compose.runtime.A r10 = (androidx.compose.runtime.A) r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r0 = r11 & 14
            r1 = 4
            if (r0 != 0) goto L19
            boolean r0 = r10.B(r9)
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = 2
        L18:
            r11 = r11 | r0
        L19:
            r0 = r11 & 91
            r2 = 18
            if (r0 != r2) goto L2b
            boolean r0 = r10.c()
            if (r0 != 0) goto L26
            goto L2b
        L26:
            r10.f()
            goto Ld8
        L2b:
            androidx.compose.foundation.layout.T1 r0 = r8.f60930n
            float r4 = r0.getF28512b()
            float r6 = r0.getF28514d()
            androidx.compose.ui.v$a r2 = r8.f60929m
            r7 = 5
            r3 = 0
            r5 = 0
            androidx.compose.ui.v r2 = androidx.compose.foundation.layout.R1.m(r2, r3, r4, r5, r6, r7)
            androidx.compose.foundation.d2 r3 = r8.f60931o
            r4 = 0
            r5 = 1
            androidx.compose.ui.v r2 = androidx.compose.foundation.a2.b(r2, r3, r4, r5)
            r3 = 53613808(0x33214f0, float:5.2333534E-37)
            r10.C(r3)
            boolean r3 = r10.B(r0)
            r11 = r11 & 14
            if (r11 != r1) goto L55
            goto L56
        L55:
            r5 = r4
        L56:
            r11 = r3 | r5
            float r1 = r8.f60932p
            boolean r3 = r10.k(r1)
            r11 = r11 | r3
            java.lang.Object r3 = r10.t()
            if (r11 != 0) goto L6e
            androidx.compose.runtime.A$a r11 = androidx.compose.runtime.A.f37866a
            r11.getClass()
            androidx.compose.runtime.A$a$a r11 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r11) goto L76
        L6e:
            com.akita.compose.component.chips.internal.g r3 = new com.akita.compose.component.chips.internal.g
            r3.<init>(r0, r9, r1)
            r10.H(r3)
        L76:
            androidx.compose.ui.layout.i0 r3 = (androidx.compose.ui.layout.InterfaceC22365i0) r3
            r10.h()
            int r9 = r10.getF37888Q()
            androidx.compose.runtime.O1 r11 = r10.y()
            androidx.compose.ui.v r0 = androidx.compose.ui.n.c(r10, r2)
            androidx.compose.ui.node.h$a r1 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r1.getClass()
            Y41.a<androidx.compose.ui.node.h> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.i r2 = r10.F()
            if (r2 == 0) goto Ldb
            r10.A()
            boolean r2 = r10.getF37887P()
            if (r2 == 0) goto La1
            r10.b(r1)
            goto La4
        La1:
            r10.d()
        La4:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r1, r10, r3)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r1, r10, r11)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r11 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r1 = r10.getF37887P()
            if (r1 != 0) goto Lc4
            java.lang.Object r1 = r10.t()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            boolean r1 = kotlin.jvm.internal.L.f(r1, r2)
            if (r1 != 0) goto Lc7
        Lc4:
            androidx.appcompat.app.r.B(r9, r10, r9, r11)
        Lc7:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.v, kotlin.G0> r9 = androidx.compose.ui.node.InterfaceC22413h.a.f40793d
            androidx.compose.runtime.R3.b(r9, r10, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            androidx.compose.runtime.internal.n r11 = r8.f60928l
            r11.invoke(r10, r9)
            r10.z()
        Ld8:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        Ldb:
            androidx.compose.runtime.C22190v.b()
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.chips.internal.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
