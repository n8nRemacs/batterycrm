package com.akita.compose.component.tooltip;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.modifier.f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Tooltip.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"tooltip_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k {

    /* compiled from: Tooltip.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f63503l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f63504m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f63505n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f63506o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f63507p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f63508q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f63509r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f63510s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f63511t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f63512u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, androidx.compose.ui.v vVar, String str, String str2, String str3, Y41.a<G0> aVar, Y41.a<G0> aVar2, boolean z12, int i12, int i13) {
            super(2);
            this.f63503l = rVar;
            this.f63504m = vVar;
            this.f63505n = str;
            this.f63506o = str2;
            this.f63507p = str3;
            this.f63508q = aVar;
            this.f63509r = aVar2;
            this.f63510s = z12;
            this.f63511t = i12;
            this.f63512u = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f63511t | 1);
            Y41.a<G0> aVar = this.f63509r;
            Y41.a<G0> aVar2 = this.f63508q;
            k.d(this.f63503l, this.f63504m, this.f63505n, this.f63506o, this.f63507p, aVar2, aVar, this.f63510s, a12, iA2, this.f63512u);
            return G0.f406611a;
        }
    }

    /* compiled from: Tooltip.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[TooltipToAnchorPosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TooltipToAnchorPosition tooltipToAnchorPosition = TooltipToAnchorPosition.f63461b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TooltipToAnchorPosition tooltipToAnchorPosition2 = TooltipToAnchorPosition.f63461b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TooltipToAnchorPosition tooltipToAnchorPosition3 = TooltipToAnchorPosition.f63461b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[TooltipTailPosition.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TooltipTailPosition tooltipTailPosition = TooltipTailPosition.f63452b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TooltipTailPosition tooltipTailPosition2 = TooltipTailPosition.f63452b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(C20644z c20644z, w wVar, A a12, int i12) {
        androidx.compose.ui.i iVar;
        androidx.compose.ui.v vVarM;
        B bE2 = a12.E(1977430091);
        if ((i12 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            g gVar = (g) bE2.o(c.f63471a);
            if (gVar == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new i(c20644z, wVar, i12);
                    return;
                }
                return;
            }
            v.a aVar = androidx.compose.ui.v.f42878y1;
            TooltipToAnchorPosition tooltipToAnchorPosition = gVar.f63491b;
            int iOrdinal = tooltipToAnchorPosition.ordinal();
            TooltipTailPosition tooltipTailPosition = gVar.f63492c;
            if (iOrdinal == 0) {
                int iOrdinal2 = tooltipTailPosition.ordinal();
                if (iOrdinal2 == 0) {
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39078d;
                } else if (iOrdinal2 == 1) {
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39081g;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39084j;
                }
            } else if (iOrdinal == 1) {
                int iOrdinal3 = tooltipTailPosition.ordinal();
                if (iOrdinal3 == 0) {
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39082h;
                } else if (iOrdinal3 == 1) {
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39083i;
                } else {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39084j;
                }
            } else if (iOrdinal == 2) {
                int iOrdinal4 = tooltipTailPosition.ordinal();
                if (iOrdinal4 == 0) {
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39076b;
                } else if (iOrdinal4 == 1) {
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39079e;
                } else {
                    if (iOrdinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39082h;
                }
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int iOrdinal5 = tooltipTailPosition.ordinal();
                if (iOrdinal5 == 0) {
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39076b;
                } else if (iOrdinal5 == 1) {
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39077c;
                } else {
                    if (iOrdinal5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC22215f.f39074a.getClass();
                    iVar = InterfaceC22215f.a.f39078d;
                }
            }
            androidx.compose.ui.v vVarD = c20644z.d(aVar, iVar);
            int iOrdinal6 = tooltipToAnchorPosition.ordinal();
            if (iOrdinal6 == 0) {
                float f12 = wVar.f63570r;
                vVarM = R1.m(aVar, 0.0f, f12, wVar.f63568p, f12, 1);
            } else if (iOrdinal6 == 1) {
                float f13 = wVar.f63570r;
                vVarM = R1.m(aVar, f13, 0.0f, f13, wVar.f63568p, 2);
            } else if (iOrdinal6 == 2) {
                float f14 = wVar.f63568p;
                float f15 = wVar.f63570r;
                vVarM = R1.m(aVar, f14, f15, 0.0f, f15, 4);
            } else {
                if (iOrdinal6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                float f16 = wVar.f63570r;
                vVarM = R1.m(aVar, f16, wVar.f63568p, f16, 0.0f, 8);
            }
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.o(vVarD.d0(vVarM), wVar.f63566n), wVar.f63565m.c(bE2), wVar.f63564l), bE2, 0);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new h(c20644z, wVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.k r rVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l Y41.a aVar, boolean z12, @Y61.k C22096n c22096n, @Y61.l A a12, int i12) {
        int i13;
        float f12;
        androidx.compose.ui.v vVarM;
        androidx.compose.ui.v vVarA;
        w wVar;
        B bE2 = a12.E(985717530);
        if ((i12 & 112) == 0) {
            i13 = (bE2.B(vVar) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.j(z12) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46801 & i13) == 9360 && bE2.c()) {
            bE2.f();
        } else {
            g gVar = (g) bE2.o(c.f63471a);
            if (gVar == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new p(rVar, vVar, aVar, z12, c22096n, i12);
                    return;
                }
                return;
            }
            bE2.C(-232348489);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = C20274e.a(0.0f);
                bE2.H(objT);
            }
            C20268c c20268c = (C20268c) objT;
            bE2.X(false);
            C22187u0.d(new n(c20268c, null), bE2, G0.f406611a);
            androidx.compose.ui.v vVarA2 = C22274n0.a(vVar, new o(c20268c));
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA2);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            w wVar2 = gVar.f63490a;
            float f13 = wVar2.f63568p;
            if (z12) {
                f12 = wVar2.f63567o + wVar2.f63566n;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            } else {
                f12 = 0;
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            }
            float f14 = f13 + f12;
            int iOrdinal = gVar.f63491b.ordinal();
            if (iOrdinal == 0) {
                vVarM = R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, f14, 0.0f, 11);
            } else if (iOrdinal == 1) {
                vVarM = R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, 0.0f, f14, 7);
            } else if (iOrdinal == 2) {
                vVarM = R1.m(androidx.compose.ui.v.f42878y1, f14, 0.0f, 0.0f, 0.0f, 14);
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vVarM = R1.m(androidx.compose.ui.v.f42878y1, 0.0f, f14, 0.0f, 0.0f, 13);
            }
            com.akita.compose.foundation.modifier.f fVar = wVar2.f63563k;
            boolean z13 = fVar != null;
            float f15 = wVar2.f63553a;
            if (z13) {
                v.a aVar5 = androidx.compose.ui.v.f42878y1;
                float f16 = com.akita.compose.foundation.modifier.d.f63611a;
                vVarA = com.akita.compose.foundation.modifier.d.a(aVar5, fVar.f63623a, fVar.f63624b, f15);
            } else {
                vVarA = androidx.compose.ui.v.f42878y1;
            }
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarM.d0(vVarA), wVar2.f63554b.c(bE2), androidx.compose.foundation.shape.o.a(f15));
            InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarB);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, interfaceC22365i0D2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            v.a aVar6 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarH = R1.h(aVar6, wVar2.f63558f);
            InterfaceC22365i0 interfaceC22365i0D3 = C20632w.d(iVar, false);
            int i16 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarH);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, interfaceC22365i0D3);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            c22096n.invoke(c20644z, bE2, Integer.valueOf(((i13 >> 9) & 112) | 6));
            bE2.X(true);
            if (aVar != null) {
                int i17 = (i13 >> 6) & 14;
                wVar = wVar2;
                com.akita.compose.component.close_button.b.a(aVar, wVar2.f63569q, R1.h(c20644z.d(aVar6, InterfaceC22215f.a.f39078d), wVar2.f63562j), false, null, null, bE2, i17, 56);
            } else {
                wVar = wVar2;
            }
            bE2.X(true);
            if (z12) {
                f.a aVar7 = com.akita.compose.foundation.modifier.f.f63621c;
                a(c20644z, wVar, bE2, 70);
            }
            bE2.X(true);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new j(rVar, vVar, aVar, z12, c22096n, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k r rVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l C22602e c22602e, @Y61.l C22602e c22602e2, @Y61.l String str, @Y61.l Y41.a aVar, @Y61.l Y41.a aVar2, boolean z12, @Y61.l A a12, int i12) {
        int i13;
        w wVar;
        B bE2 = a12.E(1284723502);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(rVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(c22602e) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(c22602e2) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.B(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(aVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i13 |= bE2.u(aVar2) ? 1048576 : 524288;
        }
        if ((29360128 & i12) == 0) {
            i13 |= bE2.j(z12) ? 8388608 : 4194304;
        }
        int i14 = i13;
        if ((i14 & 23967451) == 4793490 && bE2.c()) {
            bE2.f();
        } else {
            g gVar = (g) bE2.o(c.f63471a);
            if (gVar == null || (wVar = gVar.f63490a) == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new q(rVar, vVar, c22602e, c22602e2, str, aVar, aVar2, z12, i12);
                    return;
                }
                return;
            }
            if ((str == null || aVar == null) && !(str == null && aVar == null)) {
                throw new IllegalStateException("buttonText and onButtonClick should both be either null or defined");
            }
            int i15 = i14 >> 12;
            b(rVar, vVar, aVar2, z12, androidx.compose.runtime.internal.r.c(1119766892, new l(c22602e, wVar, c22602e2, str, aVar), bE2), bE2, (i14 & 14) | 24576 | (i14 & 112) | (i15 & 896) | (i15 & 7168));
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new m(rVar, vVar, c22602e, c22602e2, str, aVar, aVar2, z12, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@Y61.k com.akita.compose.component.tooltip.r r20, @Y61.l androidx.compose.ui.v r21, @Y61.l java.lang.String r22, @Y61.l java.lang.String r23, @Y61.l java.lang.String r24, @Y61.l Y41.a<kotlin.G0> r25, @Y61.l Y41.a<kotlin.G0> r26, boolean r27, @Y61.l androidx.compose.runtime.A r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.tooltip.k.d(com.akita.compose.component.tooltip.r, androidx.compose.ui.v, java.lang.String, java.lang.String, java.lang.String, Y41.a, Y41.a, boolean, androidx.compose.runtime.A, int, int):void");
    }
}
