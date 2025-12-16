package com.avito.android.iac_dialer_ui.pub.call_screen.wait_bottom_sheet;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.bottom_sheet.H;
import com.akita.compose.component.bottom_sheet.I;
import com.akita.compose.component.bottom_sheet.N;
import com.akita.compose.theme.re23.style.K;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: IacUIWaitBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/wait_bottom_sheet/IacUIWaitBottomSheetType;", "displayingType", "_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class B {

    /* compiled from: IacUIWaitBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[IacUIWaitBottomSheetType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IacUIWaitBottomSheetType iacUIWaitBottomSheetType = IacUIWaitBottomSheetType.f167398b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IacUIWaitBottomSheetType iacUIWaitBottomSheetType2 = IacUIWaitBottomSheetType.f167398b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C43108m c43108m, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.l lVar3, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(-1507042898);
        androidx.compose.ui.v vVar2 = (i13 & 16) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        bE2.C(-2118031522);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = C22126m3.g(null);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        Object objT2 = bE2.t();
        if (objT2 == obj) {
            objT2 = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT2);
        }
        T t12 = (T) objT2;
        I iA2 = N.a(false, 0.0f, bE2, 0, 7);
        bE2.C(-2118025196);
        boolean zB2 = bE2.B(t12) | bE2.B(iA2);
        Object objT3 = bE2.t();
        if (zB2 || objT3 == obj) {
            objT3 = new l(iA2, t12);
            bE2.H(objT3);
        }
        Y41.a aVar = (Y41.a) objT3;
        bE2.X(false);
        C22187u0.d(new f(c43108m, iA2, interfaceC22204y1, null), bE2, c43108m);
        IacUIWaitBottomSheetType iacUIWaitBottomSheetType = (IacUIWaitBottomSheetType) interfaceC22204y1.getF42167b();
        if (iacUIWaitBottomSheetType == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new j(c43108m, lVar, lVar2, lVar3, vVar2, i12, i13);
                return;
            }
            return;
        }
        bE2.C(-2117999729);
        boolean z12 = true;
        boolean zB3 = ((((i12 & 112) ^ 48) > 32 && bE2.B(lVar)) || (i12 & 48) == 32) | bE2.B(iacUIWaitBottomSheetType);
        Object objT4 = bE2.t();
        if (zB3 || objT4 == obj) {
            objT4 = new o(aVar, lVar, iacUIWaitBottomSheetType);
            bE2.H(objT4);
        }
        Y41.a aVar2 = (Y41.a) objT4;
        bE2.X(false);
        bE2.C(-2117993459);
        boolean zB4 = ((((i12 & 7168) ^ 3072) > 2048 && bE2.B(lVar3)) || (i12 & 3072) == 2048) | bE2.B(iacUIWaitBottomSheetType);
        Object objT5 = bE2.t();
        if (zB4 || objT5 == obj) {
            objT5 = new m(aVar, lVar3, iacUIWaitBottomSheetType);
            bE2.H(objT5);
        }
        Y41.a aVar3 = (Y41.a) objT5;
        bE2.X(false);
        bE2.C(-2117987149);
        if ((((i12 & 896) ^ 384) <= 256 || !bE2.B(lVar2)) && (i12 & 384) != 256) {
            z12 = false;
        }
        boolean zB5 = bE2.B(iacUIWaitBottomSheetType) | z12;
        Object objT6 = bE2.t();
        if (zB5 || objT6 == obj) {
            objT6 = new n(aVar, lVar2, iacUIWaitBottomSheetType);
            bE2.H(objT6);
        }
        Y41.a aVar4 = (Y41.a) objT6;
        Object objI = com.akita.compose.component.accordion.s.i(-2117979845, bE2, false);
        if (objI == obj) {
            objI = new g(interfaceC22204y1);
            bE2.H(objI);
        }
        bE2.X(false);
        H.a((Y41.a) objI, vVar2, iA2, null, null, null, null, false, false, null, null, null, androidx.compose.runtime.internal.r.c(1507826830, new h(iacUIWaitBottomSheetType, aVar, aVar2, aVar4, aVar3), bE2), bE2, ((i12 >> 9) & 112) | 6, 384, 4088);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new i(c43108m, lVar, lVar2, lVar3, vVar2, i12, i13);
        }
    }

    public static final void b(J j12, IacUIWaitBottomSheetType iacUIWaitBottomSheetType, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, Y41.a aVar4, androidx.compose.runtime.A a12, int i12) {
        int i13;
        int i14;
        String str;
        int i15;
        float f12;
        v.a aVar5;
        androidx.compose.runtime.B bE2 = a12.E(2062625571);
        if ((i12 & 112) == 0) {
            i13 = (bE2.B(iacUIWaitBottomSheetType) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar2) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(aVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(aVar4) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374481 & i13) == 74896 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar6 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarA = C22501m2.a(C20588k2.d(aVar6, 1.0f), "IacUITestTags.WaitBottomSheet.ROOT");
            float f13 = 16;
            h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(f13, 0.0f, 2, vVarA);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar8 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar8);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            int iOrdinal = iacUIWaitBottomSheetType.ordinal();
            if (iOrdinal == 0) {
                i14 = R.string.iac_dialer_ui_public___wait___dialing_title;
            } else if (iOrdinal == 1) {
                i14 = R.string.iac_dialer_ui_public___wait___ringing_title;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = R.string.iac_dialer_ui_public___wait___gsm_title;
            }
            String strC = u0.i.c(bE2, i14);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65234e;
            int iOrdinal2 = iacUIWaitBottomSheetType.ordinal();
            if (iOrdinal2 == 0) {
                str = "IacUITestTags.WaitBottomSheet.DIALING_TITLE";
            } else if (iOrdinal2 == 1) {
                str = "IacUITestTags.WaitBottomSheet.RINGING_TITLE";
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "IacUITestTags.WaitBottomSheet.GSM_TITLE";
            }
            com.akita.compose.foundation.ui.p.b(strC, rVar, C22501m2.a(aVar6, str), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
            C20608p2.a(bE2, c20576h2.a(aVar6, 1.0f, true));
            com.akita.compose.theme.re23.b.f63985c.getClass();
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64237O3, 0, bE2);
            com.akita.compose.component.button.t tVarK1 = com.akita.compose.theme.re23.b.c(bE2).k1();
            com.akita.compose.foundation.p pVar2 = ((com.akita.compose.theme.re23.style.H) bE2.o(K.f66132b)).getF65961a().f60541c;
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
            com.akita.compose.component.button.m.f(eVarA, aVar, com.akita.compose.component.button.t.c(tVarK1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVar2, null, null, null, null, null, X2.h.f18554b.f18563b, null, null, null, null, null, 33537791), null, 0.0f, false, false, null, bE2, ((i13 >> 3) & 112) | 520, 248);
            bE2.X(true);
            com.akita.compose.foundation.ui.g.a(12, null, bE2, 6);
            androidx.compose.ui.v vVarK2 = R1.k(f13, 0.0f, 2, aVar6);
            int iOrdinal3 = iacUIWaitBottomSheetType.ordinal();
            if (iOrdinal3 == 0) {
                i15 = R.string.iac_dialer_ui_public___wait___dialing_text;
            } else if (iOrdinal3 == 1) {
                i15 = R.string.iac_dialer_ui_public___wait___ringing_text;
            } else {
                if (iOrdinal3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = R.string.iac_dialer_ui_public___wait___gsm_text;
            }
            com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, i15), iVar.f65240k, vVarK2, false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
            int iOrdinal4 = iacUIWaitBottomSheetType.ordinal();
            if (iOrdinal4 == 0 || iOrdinal4 == 1) {
                f12 = 0.0f;
                bE2.C(-1538342258);
                aVar5 = aVar6;
                com.akita.compose.component.button.m.c(u0.i.c(bE2, R.string.iac_dialer_ui_public___wait___dialing_title), aVar2, com.akita.compose.theme.re23.b.c(bE2).f2(), C22501m2.a(C20588k2.d(R1.k(f13, 0.0f, 2, aVar5), 1.0f), "IacUITestTags.WaitBottomSheet.WAIT_BUTTON"), null, null, null, false, false, null, bE2, ((i13 >> 6) & 112) | 3584, 1008);
                bE2.X(false);
            } else {
                if (iOrdinal4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bE2.C(-1537921681);
                f12 = 0.0f;
                com.akita.compose.component.button.m.c(u0.i.c(bE2, R.string.iac_dialer_ui_public___wait___green_button_title), aVar4, com.akita.compose.component.button.t.c(com.akita.compose.theme.re23.b.c(bE2).m(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, null, null, iVar.f65245p, null, 33292287), C22501m2.a(C20588k2.d(R1.k(f13, 0.0f, 2, aVar6), 1.0f), "IacUITestTags.WaitBottomSheet.GSM_BUTTON"), u0.i.c(bE2, R.string.iac_dialer_ui_public___wait___green_button_subtitle), null, null, false, false, null, bE2, ((i13 >> 12) & 112) | 3584, 992);
                bE2.X(false);
                aVar5 = aVar6;
            }
            com.akita.compose.foundation.ui.g.a(6, null, bE2, 6);
            com.akita.compose.component.button.m.c(u0.i.c(bE2, R.string.iac_dialer_ui_public___wait___red_button_title), aVar3, com.akita.compose.theme.re23.b.c(bE2).p2(), C22501m2.a(C20588k2.d(R1.k(f13, f12, 2, aVar5), 1.0f), "IacUITestTags.WaitBottomSheet.HANGUP_BUTTON"), null, null, null, false, false, null, bE2, ((i13 >> 9) & 112) | 3584, 1008);
            com.akita.compose.foundation.ui.g.a(18, null, bE2, 6);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(j12, iacUIWaitBottomSheetType, aVar, aVar2, aVar3, aVar4, i12);
        }
    }
}
