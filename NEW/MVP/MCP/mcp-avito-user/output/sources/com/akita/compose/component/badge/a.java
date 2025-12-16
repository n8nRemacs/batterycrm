package com.akita.compose.component.badge;

import Y41.p;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.M1;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Badge.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"badge_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: Badge.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.component.badge.a$a, reason: collision with other inner class name */
    public static final class C2080a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f60332l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f60333m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f60334n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2080a(i iVar, String str, int i12) {
            super(2);
            this.f60332l = iVar;
            this.f60333m = str;
            this.f60334n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            float f12;
            long jC2;
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28681b;
                aVar.d0(fillElement);
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = n.c(a13, fillElement);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                v vVarW = C20588k2.w(aVar, null, 3);
                i iVar = this.f60332l;
                androidx.compose.ui.unit.h hVar = iVar.f60411l;
                if (hVar != null) {
                    f12 = hVar.f42852b;
                } else {
                    f12 = 0;
                    h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                }
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                v vVarM = R1.m(M1.c(0.0f, -f12, 1, vVarW), iVar.f60407h, 0.0f, iVar.f60408i, 0.0f, 10);
                androidx.compose.ui.text.style.i.f42675b.getClass();
                int i12 = androidx.compose.ui.text.style.i.f42678e;
                com.akita.compose.foundation.r rVar = iVar.f60409j;
                if (rVar == null) {
                    com.akita.compose.foundation.r.f63642l.getClass();
                    rVar = com.akita.compose.foundation.r.f63643m;
                }
                a13.C(-107215487);
                com.akita.compose.foundation.p pVar2 = iVar.f60410k;
                T tA2 = pVar2 != null ? T.a(pVar2.c(a13)) : null;
                a13.h();
                a13.C(-107215800);
                if (tA2 == null) {
                    com.akita.compose.foundation.p.f63635e.getClass();
                    jC2 = com.akita.compose.foundation.p.f63636f.c(a13);
                } else {
                    jC2 = tA2.f39331a;
                }
                a13.h();
                com.akita.compose.foundation.ui.p.b(this.f60333m, rVar, vVarM, false, jC2, androidx.compose.ui.text.style.i.a(i12), this.f60334n, 0, false, null, a13, 0, 904);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Badge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f60335l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f60336m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f60337n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f60338o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f60339p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f60340q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f60341r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f60342s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, v vVar, String str, int i12, boolean z12, boolean z13, int i13, int i14) {
            super(2);
            this.f60335l = iVar;
            this.f60336m = vVar;
            this.f60337n = str;
            this.f60338o = i12;
            this.f60339p = z12;
            this.f60340q = z13;
            this.f60341r = i13;
            this.f60342s = i14;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f60341r | 1);
            int i12 = this.f60338o;
            a.a(this.f60335l, this.f60336m, this.f60337n, i12, this.f60339p, this.f60340q, a12, iA2, this.f60342s);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.akita.compose.component.badge.i r16, @Y61.l androidx.compose.ui.v r17, @Y61.l java.lang.String r18, int r19, boolean r20, boolean r21, @Y61.l androidx.compose.runtime.A r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.badge.a.a(com.akita.compose.component.badge.i, androidx.compose.ui.v, java.lang.String, int, boolean, boolean, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k com.akita.compose.component.badge.i r22, @Y61.l androidx.compose.ui.v r23, boolean r24, boolean r25, @Y61.l androidx.compose.runtime.internal.C22096n r26, @Y61.l androidx.compose.runtime.A r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.badge.a.b(com.akita.compose.component.badge.i, androidx.compose.ui.v, boolean, boolean, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void c(@Y61.k com.akita.compose.foundation.p pVar, float f12, @l v vVar, @l p pVar2, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(1356018518);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(pVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.k(f12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(pVar2) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            int i14 = (i13 >> 6) & 14;
            int i15 = i13 << 9;
            com.akita.compose.foundation.ui.n.a(vVar, o.a(f12), 0.0f, pVar, null, pVar2, bE2, i14 | (i15 & 7168) | (i15 & 3670016), 52);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(pVar, f12, vVar, pVar2, i12);
        }
    }
}
