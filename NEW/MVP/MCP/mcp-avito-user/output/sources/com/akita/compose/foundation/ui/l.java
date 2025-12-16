package com.akita.compose.foundation.ui;

import androidx.compose.foundation.InterfaceC20834q1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Surface.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f63751l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f63752m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h1 f63753n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f63754o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f63755p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20834q1 f63756q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f63757r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63758s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C22096n f63759t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, float f12, h1 h1Var, long j12, androidx.compose.foundation.interaction.m mVar, InterfaceC20834q1 interfaceC20834q1, boolean z12, Y41.a aVar, C22096n c22096n) {
        super(2);
        this.f63751l = vVar;
        this.f63752m = f12;
        this.f63753n = h1Var;
        this.f63754o = j12;
        this.f63755p = mVar;
        this.f63756q = interfaceC20834q1;
        this.f63757r = z12;
        this.f63758s = aVar;
        this.f63759t = c22096n;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r12, java.lang.Integer r13) {
        /*
            r11 = this;
            androidx.compose.runtime.A r12 = (androidx.compose.runtime.A) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r13 = r13 & 11
            r0 = 2
            if (r13 != r0) goto L19
            boolean r13 = r12.c()
            if (r13 != 0) goto L14
            goto L19
        L14:
            r12.f()
            goto Le5
        L19:
            float r13 = r11.f63752m
            r0 = 24
            androidx.compose.ui.v r1 = r11.f63751l
            androidx.compose.ui.graphics.h1 r2 = r11.f63753n
            r3 = 0
            androidx.compose.ui.v r13 = androidx.compose.ui.draw.y.a(r1, r13, r2, r3, r0)
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            androidx.compose.ui.v r13 = r13.d0(r0)
            androidx.compose.ui.v r13 = androidx.compose.ui.draw.k.a(r13, r2)
            r1 = -129465995(0xfffffffff8488175, float:-1.6266954E34)
            r12.C(r1)
            long r1 = r11.f63754o
            boolean r4 = r12.n(r1)
            java.lang.Object r5 = r12.t()
            if (r4 != 0) goto L4b
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            r4.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r4) goto L53
        L4b:
            com.akita.compose.foundation.ui.k r5 = new com.akita.compose.foundation.ui.k
            r5.<init>(r1)
            r12.H(r5)
        L53:
            Y41.l r5 = (Y41.l) r5
            r12.h()
            androidx.compose.ui.v r13 = androidx.compose.ui.draw.o.b(r13, r5)
            androidx.compose.ui.f$a r1 = androidx.compose.ui.InterfaceC22215f.f39074a
            r1.getClass()
            androidx.compose.ui.i r1 = androidx.compose.ui.InterfaceC22215f.a.f39076b
            r2 = 1
            androidx.compose.ui.layout.i0 r1 = androidx.compose.foundation.layout.C20632w.d(r1, r2)
            int r2 = r12.getF37888Q()
            androidx.compose.runtime.O1 r4 = r12.y()
            androidx.compose.ui.v r13 = androidx.compose.ui.n.c(r12, r13)
            androidx.compose.ui.node.h$a r5 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r5.getClass()
            Y41.a<androidx.compose.ui.node.h> r5 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            androidx.compose.runtime.i r6 = r12.F()
            if (r6 == 0) goto Le8
            r12.A()
            boolean r6 = r12.getF37887P()
            if (r6 == 0) goto L8e
            r12.b(r5)
            goto L91
        L8e:
            r12.d()
        L91:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r5 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r5, r12, r1)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r1, r12, r4)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r4 = r12.getF37887P()
            if (r4 != 0) goto Lb1
            java.lang.Object r4 = r12.t()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 != 0) goto Lb4
        Lb1:
            androidx.appcompat.app.r.B(r2, r12, r2, r1)
        Lb4:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.v, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40793d
            androidx.compose.runtime.R3.b(r1, r12, r13)
            androidx.compose.foundation.layout.z r13 = androidx.compose.foundation.layout.C20644z.f28804a
            androidx.compose.ui.v r4 = r13.b(r0)
            androidx.compose.ui.semantics.i$a r13 = androidx.compose.ui.semantics.i.f41744b
            r13.getClass()
            androidx.compose.ui.semantics.i r8 = androidx.compose.ui.semantics.i.a(r3)
            boolean r7 = r11.f63757r
            r10 = 8
            androidx.compose.foundation.interaction.m r5 = r11.f63755p
            androidx.compose.foundation.q1 r6 = r11.f63756q
            Y41.a<kotlin.G0> r9 = r11.f63758s
            androidx.compose.ui.v r13 = androidx.compose.foundation.C21086w0.b(r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.foundation.layout.C20632w.a(r13, r12, r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            androidx.compose.runtime.internal.n r0 = r11.f63759t
            r0.invoke(r12, r13)
            r12.z()
        Le5:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        Le8:
            androidx.compose.runtime.C22190v.b()
            r12 = 0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.foundation.ui.l.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
