package com.avito.android.lib.compose.design.shared.stepsbar;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.shape.o;
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
import androidx.compose.ui.draw.k;
import androidx.compose.ui.graphics.Y0;
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

/* compiled from: StepsBarContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_compose_shared_stepsbar"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float f177708a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f177709b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f177710c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f177711d;

    /* compiled from: StepsBarContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f177712l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.foundation.p f177713m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f177714n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, com.akita.compose.foundation.p pVar, int i12) {
            super(2);
            this.f177712l = f12;
            this.f177713m = pVar;
            this.f177714n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f177714n | 1);
            d.a(this.f177712l, this.f177713m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: StepsBarContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f177715l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f177716m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.foundation.p f177717n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.foundation.p f177718o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f177719p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f12, float f13, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, int i12) {
            super(2);
            this.f177715l = f12;
            this.f177716m = f13;
            this.f177717n = pVar;
            this.f177718o = pVar2;
            this.f177719p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f177719p | 1);
            com.akita.compose.foundation.p pVar = this.f177717n;
            com.akita.compose.foundation.p pVar2 = this.f177718o;
            d.b(this.f177715l, this.f177716m, pVar, pVar2, a12, iA2);
            return G0.f406611a;
        }
    }

    static {
        h.a aVar = h.f42849c;
        f177708a = 8;
        f177709b = 6;
        float f12 = 2;
        f177710c = f12;
        f177711d = f12;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(float f12, com.akita.compose.foundation.p pVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(1821981489);
        if ((i12 & 14) == 0) {
            i13 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(pVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20608p2.a(bE2, androidx.compose.foundation.A.b(C20588k2.o(v.f42878y1, f12), pVar.c(bE2), o.f30153a));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(f12, pVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(float f12, float f13, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, A a12, int i12) {
        int i13;
        B bE2 = a12.E(-866277490);
        if ((i12 & 14) == 0) {
            i13 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.k(f13) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(pVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(pVar2) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = v.f42878y1;
            v vVarF = C20588k2.f(C20588k2.d(aVar, 1.0f), f13);
            float f14 = f13 / 2;
            h.a aVar2 = h.f42849c;
            v vVarB = androidx.compose.foundation.A.b(k.a(vVarF, o.a(f14)), pVar2.c(bE2), Y0.f39346a);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39079e, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarB);
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
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            C20608p2.a(bE2, androidx.compose.foundation.A.b(C20588k2.f(C20588k2.d(aVar, f12), f13), pVar.c(bE2), o.a(f14)));
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(f12, f13, pVar, pVar2, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0163  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.l androidx.compose.ui.v.a r32, @Y61.l java.util.List r33, int r34, int r35, @Y61.l java.lang.Float r36, boolean r37, boolean r38, float r39, boolean r40, float r41, @Y61.l com.avito.android.lib.compose.design.shared.stepsbar.g r42, @Y61.l androidx.compose.runtime.A r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.compose.design.shared.stepsbar.d.c(androidx.compose.ui.v$a, java.util.List, int, int, java.lang.Float, boolean, boolean, float, boolean, float, com.avito.android.lib.compose.design.shared.stepsbar.g, androidx.compose.runtime.A, int, int):void");
    }
}
