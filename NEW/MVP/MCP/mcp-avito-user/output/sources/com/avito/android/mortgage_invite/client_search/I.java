package com.avito.android.mortgage_invite.client_search;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.focus.S;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.InterfaceC22489j2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.mvi.entity.PagingState;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import shark.AndroidResourceIdNames;

/* compiled from: MortgageClientSearchScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0003²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "onRequestNewPage", "_avito_mortgage-invite_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class I {

    /* compiled from: MortgageClientSearchScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PagingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PagingState pagingState = PagingState.f205437b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(W10.c r20, Y41.a r21, Y41.a r22, Y41.l r23, androidx.compose.ui.v r24, androidx.compose.runtime.A r25, int r26) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.client_search.I.a(W10.c, Y41.a, Y41.a, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1649601492);
        if ((((bE2.B(vVar) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66693b(), c20644z.d(androidx.compose.ui.v.f42878y1, InterfaceC22215f.a.f39080f), bE2, 0, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new B(vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k W10.c cVar, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar, @Y61.k Y41.a aVar3, @Y61.k Y41.l lVar2, @Y61.k Y41.a aVar4, @Y61.k Y41.a aVar5, @Y61.k Y41.a aVar6, @Y61.k Y41.l lVar3, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1083047289);
        v.a aVar7 = androidx.compose.ui.v.f42878y1;
        C22187u0.g(new Object[]{interfaceC43160i, aVar, aVar2, lVar}, new C(aVar, aVar2, lVar, null, interfaceC43160i), bE2);
        bE2.C(-914734761);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = new S();
            bE2.H(objT);
        }
        S s5 = (S) objT;
        bE2.X(false);
        InterfaceC22489j2 interfaceC22489j2 = (InterfaceC22489j2) bE2.o(Q0.f41207p);
        com.akita.compose.component.scaffold.g.a(aVar7, androidx.compose.runtime.internal.r.c(-1337884861, new E(cVar, aVar3, s5, lVar2), bE2), null, null, null, null, null, androidx.compose.runtime.internal.r.c(-395970086, new F(cVar, aVar4, aVar5, aVar6, lVar3), bE2), bE2, 12582960, 124);
        bE2.C(-914673931);
        boolean zB2 = bE2.B(interfaceC22489j2);
        Object objT2 = bE2.t();
        if (zB2 || objT2 == obj) {
            objT2 = new G(s5, interfaceC22489j2, null);
            bE2.H(objT2);
        }
        bE2.X(false);
        C22187u0.e(s5, interfaceC22489j2, (Y41.p) objT2, bE2);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new H(cVar, interfaceC43160i, aVar, aVar2, lVar, aVar3, lVar2, aVar4, aVar5, aVar6, lVar3, aVar7, i12);
        }
    }

    public static final void d(MortgageClient mortgageClient, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-1691584805);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(mortgageClient) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(12);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 6);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            R3.b(pVar, bE2, c20568f2A);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarT = C20588k2.t(C20588k2.f(aVar3, 42), 46);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarT, aVar4.f63973w1.c(bE2), androidx.compose.foundation.shape.o.a(16));
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
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
            R3.b(pVar, bE2, interfaceC22365i0D);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            Character chE = C43066x.E(C43066x.A0(mortgageClient.f205395c.f205403e).toString());
            String string = chE != null ? chE.toString() : null;
            if (string == null) {
                string = "";
            }
            String upperCase = string.toUpperCase(Locale.ROOT);
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(upperCase, iVar.f65235f, c20644z.d(aVar3, InterfaceC22215f.a.f39080f), false, aVar4.f63976x1.c(bE2), null, 0, 0, false, null, bE2, 0, 1000);
            bE2.X(true);
            C20585k.j jVarG2 = C20585k.g(2);
            androidx.compose.ui.v vVarA = c20576h2.a(aVar3, 1.0f, true);
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG2, InterfaceC22215f.a.f39088n, bE2, 6);
            int i16 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarA);
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
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            com.akita.compose.foundation.ui.p.b(mortgageClient.f205395c.f205403e, iVar.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            com.akita.compose.foundation.ui.p.b(mortgageClient.f205396d.f205398b, iVar.f65241l, null, false, aVar4.f63918e0.c(bE2), null, 0, 0, false, null, bE2, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            bE2.X(true);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new n(mortgageClient, vVar, i12);
        }
    }

    public static final void e(W10.c cVar, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, Y41.l lVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        boolean z12;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B b13;
        boolean z13;
        androidx.compose.runtime.B b14;
        boolean z14;
        androidx.compose.runtime.B b15;
        boolean z15;
        androidx.compose.runtime.B bE2 = a12.E(1591127538);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(cVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar3) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i13 |= bE2.u(lVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.B(vVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            com.avito.android.analytics.screens.mvi.r perfTrackerParams = cVar.getPerfTrackerParams();
            bE2.C(-976608008);
            bE2.C(2063036140);
            boolean zBooleanValue = ((Boolean) bE2.o(C22543x1.f41638a)).booleanValue();
            PagingState pagingState = cVar.f17563f;
            List<MortgageClient> list = cVar.f17562e;
            if (zBooleanValue) {
                bE2.C(421109671);
                if (list.isEmpty()) {
                    bE2.C(-996524129);
                    int iOrdinal = pagingState.ordinal();
                    if (iOrdinal == 0) {
                        z12 = false;
                        b13 = bE2;
                        b13.C(-1417617617);
                        b(vVar.d0(C20588k2.f28682c), b13, 0);
                        b13.X(false);
                    } else if (iOrdinal != 1) {
                        bE2.C(-1417599600);
                        androidx.compose.ui.v vVarD0 = vVar.d0(C20588k2.f28682c);
                        int i14 = i13 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i15 = i13 >> 3;
                        a(cVar, aVar, aVar3, lVar, vVarD0, bE2, i14 | (i15 & 896) | (i15 & 7168));
                        bE2.X(false);
                        z12 = false;
                        b13 = bE2;
                    } else {
                        bE2.C(-1417614680);
                        C32814a.f205357a.getClass();
                        z12 = false;
                        b13 = bE2;
                        com.akita.compose.component.content_placeholder.b.a(C32814a.f205358b, u0.i.c(bE2, R.string.contact_info_loading_failed_title), u0.i.c(bE2, R.string.contact_info_loading_failed_subtitle), u0.i.c(bE2, R.string.contact_info_loading_failed_action), aVar2, vVar.d0(C20588k2.f28682c), null, null, false, false, b13, ((i13 << 6) & 57344) | 6, 960);
                        b13.X(false);
                    }
                    b13.X(z12);
                    b12 = b13;
                } else {
                    z12 = false;
                    bE2.C(-995589262);
                    androidx.compose.ui.v vVarD02 = vVar.d0(C20588k2.f28682c);
                    int i16 = i13 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i17 = i13 >> 3;
                    b12 = bE2;
                    a(cVar, aVar, aVar3, lVar, vVarD02, bE2, i16 | (i17 & 896) | (i17 & 7168));
                    b12.X(false);
                }
                b12.X(z12);
            } else {
                bE2.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar4 = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
                if (perfTrackerParams != null) {
                    aVar4.m(perfTrackerParams.f90666a);
                }
                aVar4.l();
                androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(androidx.compose.ui.v.f42878y1, new o(perfTrackerParams, aVar4));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int i18 = bE2.f37888Q;
                O1 o1S = bE2.S();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
                if (bE2.f37890b == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar5);
                } else {
                    bE2.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                    AK.c.y(i18, bE2, i18, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
                C20644z c20644z = C20644z.f28804a;
                if (list.isEmpty()) {
                    bE2.C(-996524129);
                    int iOrdinal2 = pagingState.ordinal();
                    if (iOrdinal2 != 0) {
                        z13 = true;
                        if (iOrdinal2 != 1) {
                            bE2.C(-1417599600);
                            androidx.compose.ui.v vVarD03 = vVar.d0(C20588k2.f28682c);
                            int i19 = i13 & WebSocketProtocol.PAYLOAD_SHORT;
                            int i22 = i13 >> 3;
                            a(cVar, aVar, aVar3, lVar, vVarD03, bE2, i19 | (i22 & 896) | (i22 & 7168));
                            bE2.X(false);
                            z15 = false;
                            b15 = bE2;
                        } else {
                            bE2.C(-1417614680);
                            C32814a.f205357a.getClass();
                            z15 = false;
                            b15 = bE2;
                            com.akita.compose.component.content_placeholder.b.a(C32814a.f205358b, u0.i.c(bE2, R.string.contact_info_loading_failed_title), u0.i.c(bE2, R.string.contact_info_loading_failed_subtitle), u0.i.c(bE2, R.string.contact_info_loading_failed_action), aVar2, vVar.d0(C20588k2.f28682c), null, null, false, false, b15, ((i13 << 6) & 57344) | 6, 960);
                            b15.X(false);
                        }
                    } else {
                        b15 = bE2;
                        z15 = false;
                        z13 = true;
                        b15.C(-1417617617);
                        b(vVar.d0(C20588k2.f28682c), b15, 0);
                        b15.X(false);
                    }
                    b15.X(z15);
                    b14 = b15;
                    z14 = z15;
                } else {
                    z13 = true;
                    bE2.C(-995589262);
                    androidx.compose.ui.v vVarD04 = vVar.d0(C20588k2.f28682c);
                    int i23 = i13 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i24 = i13 >> 3;
                    b14 = bE2;
                    z14 = false;
                    a(cVar, aVar, aVar3, lVar, vVarD04, b14, i23 | (i24 & 896) | (i24 & 7168));
                    b14.X(false);
                }
                b14.X(z13);
                b14.X(z14);
                z12 = z14;
                b12 = b14;
            }
            b12.X(z12);
            b12.X(z12);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(cVar, aVar, aVar2, aVar3, lVar, vVar, i12);
        }
    }
}
