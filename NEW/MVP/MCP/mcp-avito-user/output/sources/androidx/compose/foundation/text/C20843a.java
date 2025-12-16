package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.text.selection.C21019j0;
import androidx.compose.foundation.text.selection.C21021k0;
import androidx.compose.foundation.text.selection.InterfaceC21039u;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: AndroidCursorHandle.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20843a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f30633a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f30634b;

    /* compiled from: AndroidCursorHandle.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.a$a, reason: collision with other inner class name */
    public static final class C1605a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f30635l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f30636m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1605a(long j12, androidx.compose.ui.v vVar) {
            super(2);
            this.f30635l = j12;
            this.f30636m = vVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
                long j12 = this.f30635l;
                if (j12 != 9205357640488583168L) {
                    a13.C(1828931592);
                    androidx.compose.ui.v vVarM = C20588k2.m(this.f30636m, androidx.compose.ui.unit.l.d(j12), androidx.compose.ui.unit.l.c(j12), 0.0f, 0.0f, 12);
                    InterfaceC22215f.f39074a.getClass();
                    InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39077c, false);
                    int f37888q = a13.getF37888Q();
                    androidx.compose.runtime.O1 o1Y = a13.y();
                    androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarM);
                    InterfaceC22413h.f40789C1.getClass();
                    Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar);
                    } else {
                        a13.d();
                    }
                    R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                    Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                        androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                    }
                    R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                    C20644z c20644z = C20644z.f28804a;
                    C20843a.b(null, a13, 0, 1);
                    a13.z();
                    a13.h();
                } else {
                    a13.C(1829298756);
                    C20843a.b(this.f30636m, a13, 0, 0);
                    a13.h();
                }
            } else {
                a13.f();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidCursorHandle.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.a$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21039u f30637l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f30638m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f30639n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f30640o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f30641p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC21039u interfaceC21039u, androidx.compose.ui.v vVar, long j12, int i12, int i13) {
            super(2);
            this.f30637l = interfaceC21039u;
            this.f30638m = vVar;
            this.f30639n = j12;
            this.f30640o = i12;
            this.f30641p = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
            num.intValue();
            int iA2 = C22066f2.a(this.f30640o | 1);
            InterfaceC21039u interfaceC21039u = this.f30637l;
            C20843a.a(interfaceC21039u, this.f30638m, this.f30639n, a12, iA2, this.f30641p);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidCursorHandle.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.a$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21039u f30642l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC21039u interfaceC21039u) {
            super(1);
            this.f30642l = interfaceC21039u;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
            f12.a(C21021k0.f32054c, new C21019j0(Handle.f30328b, this.f30642l.a(), SelectionHandleAnchor.f31869c, true, null));
            return kotlin.G0.f406611a;
        }
    }

    static {
        float f12 = 25;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f30633a = f12;
        f30634b = (f12 * 2.0f) / 2.4142137f;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.foundation.text.selection.InterfaceC21039u r12, @Y61.k androidx.compose.ui.v r13, long r14, @Y61.l androidx.compose.runtime.A r16, int r17, int r18) throws java.lang.Throwable {
        /*
            r1 = r12
            r2 = r13
            r5 = r17
            r0 = 1776202187(0x69deb1cb, float:3.3652642E25)
            r3 = r16
            androidx.compose.runtime.B r0 = r3.E(r0)
            boolean r3 = r0.B(r12)
            r4 = 4
            if (r3 == 0) goto L16
            r3 = r4
            goto L17
        L16:
            r3 = 2
        L17:
            r3 = r3 | r5
            boolean r6 = r0.B(r13)
            if (r6 == 0) goto L21
            r6 = 32
            goto L23
        L21:
            r6 = 16
        L23:
            r3 = r3 | r6
            r6 = r5 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L3b
            r6 = r18 & 4
            if (r6 != 0) goto L36
            r6 = r14
            boolean r8 = r0.n(r14)
            if (r8 == 0) goto L37
            r8 = 256(0x100, float:3.59E-43)
            goto L39
        L36:
            r6 = r14
        L37:
            r8 = 128(0x80, float:1.8E-43)
        L39:
            r3 = r3 | r8
            goto L3c
        L3b:
            r6 = r14
        L3c:
            r8 = r3 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            r10 = 0
            r11 = 1
            if (r8 == r9) goto L46
            r8 = r11
            goto L47
        L46:
            r8 = r10
        L47:
            r9 = r3 & 1
            boolean r8 = r0.p(r9, r8)
            if (r8 == 0) goto Lb2
            r0.y0()
            r8 = r5 & 1
            if (r8 == 0) goto L67
            boolean r8 = r0.g0()
            if (r8 == 0) goto L5d
            goto L67
        L5d:
            r0.f()
            r8 = r18 & 4
            if (r8 == 0) goto L73
        L64:
            r3 = r3 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L73
        L67:
            r8 = r18 & 4
            if (r8 == 0) goto L73
            androidx.compose.ui.unit.l$a r6 = androidx.compose.ui.unit.l.f42859b
            r6.getClass()
            long r6 = androidx.compose.ui.unit.l.f42860c
            goto L64
        L73:
            r0.Y()
            r3 = r3 & 14
            if (r3 == r4) goto L7b
            r11 = r10
        L7b:
            java.lang.Object r4 = r0.t()
            if (r11 != 0) goto L8a
            androidx.compose.runtime.A$a r8 = androidx.compose.runtime.A.f37866a
            r8.getClass()
            androidx.compose.runtime.A$a$a r8 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r8) goto L92
        L8a:
            androidx.compose.foundation.text.a$c r4 = new androidx.compose.foundation.text.a$c
            r4.<init>(r12)
            r0.H(r4)
        L92:
            Y41.l r4 = (Y41.l) r4
            androidx.compose.ui.v r4 = androidx.compose.ui.semantics.r.b(r13, r10, r4)
            androidx.compose.ui.f$a r8 = androidx.compose.ui.InterfaceC22215f.f39074a
            r8.getClass()
            androidx.compose.ui.i r8 = androidx.compose.ui.InterfaceC22215f.a.f39077c
            androidx.compose.foundation.text.a$a r9 = new androidx.compose.foundation.text.a$a
            r9.<init>(r6, r4)
            r4 = -1653527038(0xffffffff9d712e02, float:-3.191987E-21)
            androidx.compose.runtime.internal.n r4 = androidx.compose.runtime.internal.r.c(r4, r9, r0)
            r3 = r3 | 432(0x1b0, float:6.05E-43)
            androidx.compose.foundation.text.selection.C21006e.a(r12, r8, r4, r0, r3)
        Lb0:
            r3 = r6
            goto Lb6
        Lb2:
            r0.f()
            goto Lb0
        Lb6:
            androidx.compose.runtime.c2 r7 = r0.Z()
            if (r7 == 0) goto Lca
            androidx.compose.foundation.text.a$b r8 = new androidx.compose.foundation.text.a$b
            r0 = r8
            r1 = r12
            r2 = r13
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r5, r6)
            r7.f38184d = r8
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C20843a.a(androidx.compose.foundation.text.selection.u, androidx.compose.ui.v, long, androidx.compose.runtime.A, int, int):void");
    }

    public static final void b(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(694251107);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if (bE2.p(i14 & 1, (i14 & 3) != 2)) {
            if (i15 != 0) {
                vVar = androidx.compose.ui.v.f42878y1;
            }
            C20608p2.a(bE2, androidx.compose.ui.n.a(C20588k2.q(vVar, f30634b, f30633a), C22535v1.f41625a, C20859e.f30695l));
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C20847b(vVar, i12, i13);
        }
    }
}
