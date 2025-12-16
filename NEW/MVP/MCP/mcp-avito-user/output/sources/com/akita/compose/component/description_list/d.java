package com.akita.compose.component.description_list;

import Y41.p;
import Y61.l;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.style.n;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: DescriptionList.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"description-list_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* compiled from: DescriptionList.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f61463l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f61464m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f61465n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.description_list.a f61466o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ j f61467p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ v f61468q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f61469r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f61470s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f61471t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, boolean z12, com.akita.compose.component.description_list.a aVar, j jVar, v vVar, boolean z13, int i12, int i13) {
            super(2);
            this.f61463l = str;
            this.f61464m = str2;
            this.f61465n = z12;
            this.f61466o = aVar;
            this.f61467p = jVar;
            this.f61468q = vVar;
            this.f61469r = z13;
            this.f61470s = i12;
            this.f61471t = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f61470s | 1);
            j jVar = this.f61467p;
            d.d(this.f61463l, this.f61464m, this.f61465n, this.f61466o, jVar, this.f61468q, this.f61469r, a12, iA2, this.f61471t);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C22602e c22602e, @Y61.k C22602e c22602e2, @l com.akita.compose.component.description_list.a aVar, @Y61.k j jVar, @l v vVar, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1589055558);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c22602e) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(c22602e2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(jVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.B(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-1628806623);
            C22602e.b bVar = new C22602e.b(0, 1, null);
            int iL2 = bVar.l(new e0(jVar.f61491b.f63644a.c(bE2), 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65534, (C42822w) null));
            try {
                bVar.f(((Object) c22602e) + ": ");
                G0 g02 = G0.f406611a;
                bVar.h(iL2);
                bVar.d(c22602e2);
                C22602e c22602eM = bVar.m();
                bE2.X(false);
                if (aVar != null) {
                    bE2.C(1046790969);
                    v.a aVar2 = v.f42878y1;
                    v vVarD0 = C20588k2.d(aVar2, 1.0f).d0(vVar);
                    InterfaceC22215f.f39074a.getClass();
                    InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                    int i14 = bE2.f37888Q;
                    O1 o1S = bE2.S();
                    v vVarC = androidx.compose.ui.n.c(bE2, vVarD0);
                    InterfaceC22413h.f40789C1.getClass();
                    Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                    if (bE2.f37890b == null) {
                        C22190v.b();
                        throw null;
                    }
                    bE2.A();
                    if (bE2.f37887P) {
                        bE2.b(aVar3);
                    } else {
                        bE2.d();
                    }
                    R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
                    R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
                    p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                    if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                        AK.c.y(i14, bE2, i14, pVar);
                    }
                    R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
                    C20644z c20644z = C20644z.f28804a;
                    com.akita.compose.foundation.ui.p.a(c22602eM, jVar.f61492c, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
                    o.a(aVar.f61449a, jVar.f61492c, C21086w0.c(c20644z.d(aVar2, InterfaceC22215f.a.f39078d), false, null, null, aVar.f61451c, 7), aVar.f61450b, bE2, 0, 0);
                    bE2.X(true);
                    bE2.X(false);
                } else {
                    bE2.C(1047291650);
                    com.akita.compose.foundation.ui.p.a(c22602eM, jVar.f61492c, vVar, false, 0L, null, 0, 0, false, null, bE2, (i13 >> 6) & 896, 1016);
                    bE2 = bE2;
                    bE2.X(false);
                }
            } catch (Throwable th2) {
                bVar.h(iL2);
                throw th2;
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(c22602e, c22602e2, aVar, jVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k String str, @Y61.k String str2, @l com.akita.compose.component.description_list.a aVar, @Y61.k j jVar, @l v.a aVar2, @l A a12, int i12) {
        v.a aVar3;
        B bE2 = a12.E(240184864);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.B(aVar) ? 256 : 128) | (bE2.B(jVar) ? 2048 : 1024) | 24576;
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            v.a aVar4 = v.f42878y1;
            a(new C22602e(str, null, 2, null), new C22602e(str2, null, 2, null), aVar, jVar, aVar4, bE2, i13 & 65408);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(str, str2, aVar, jVar, aVar3, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k androidx.compose.ui.text.C22602e r34, @Y61.k androidx.compose.ui.text.C22602e r35, boolean r36, @Y61.l com.akita.compose.component.description_list.a r37, @Y61.k com.akita.compose.component.description_list.j r38, @Y61.l androidx.compose.ui.v r39, boolean r40, @Y61.l androidx.compose.runtime.A r41, int r42) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.description_list.d.c(androidx.compose.ui.text.e, androidx.compose.ui.text.e, boolean, com.akita.compose.component.description_list.a, com.akita.compose.component.description_list.j, androidx.compose.ui.v, boolean, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@Y61.k java.lang.String r20, @Y61.k java.lang.String r21, boolean r22, @Y61.l com.akita.compose.component.description_list.a r23, @Y61.k com.akita.compose.component.description_list.j r24, @Y61.l androidx.compose.ui.v r25, boolean r26, @Y61.l androidx.compose.runtime.A r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.description_list.d.d(java.lang.String, java.lang.String, boolean, com.akita.compose.component.description_list.a, com.akita.compose.component.description_list.j, androidx.compose.ui.v, boolean, androidx.compose.runtime.A, int, int):void");
    }
}
