package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.foundation.interaction.m;
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
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.n;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: IacUIRatingPanel.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f167674a = new i(true, 3);

    /* compiled from: IacUIRatingPanel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f167675l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<Integer, G0> f167676m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f167677n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f167678o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f167679p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f167680q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i iVar, l<? super Integer, G0> lVar, v vVar, String str, int i12, int i13) {
            super(2);
            this.f167675l = iVar;
            this.f167676m = lVar;
            this.f167677n = vVar;
            this.f167678o = str;
            this.f167679p = i12;
            this.f167680q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f167679p | 1);
            l<Integer, G0> lVar = this.f167676m;
            g.b(this.f167675l, lVar, this.f167677n, this.f167678o, a12, iA2, this.f167680q);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, boolean z12, boolean z13, l lVar, v vVar, A a12, int i13) {
        int i14;
        int i15;
        B bE2 = a12.E(480127506);
        if ((i13 & 14) == 0) {
            i14 = (bE2.m(i12) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= bE2.j(z13) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i14 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((57344 & i13) == 0) {
            i14 |= bE2.B(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i14) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            if (z12) {
                if (i12 == 0) {
                    i15 = R.drawable.iac_dialer_ui_public_img_emoji_very_unsatisfied_checked;
                } else if (i12 == 1) {
                    i15 = R.drawable.iac_dialer_ui_public_img_emoji_unsatisfied_checked;
                } else if (i12 == 2) {
                    i15 = R.drawable.iac_dialer_ui_public_img_emoji_neutral_checked;
                } else if (i12 == 3) {
                    i15 = R.drawable.iac_dialer_ui_public_img_emoji_satisfied_checked;
                } else {
                    if (i12 != 4) {
                        C22039c2 c22039c2Z = bE2.Z();
                        if (c22039c2Z != null) {
                            c22039c2Z.f38184d = new e(i12, z12, z13, lVar, vVar, i13);
                            return;
                        }
                        return;
                    }
                    i15 = R.drawable.iac_dialer_ui_public_img_emoji_very_satisfied_checked;
                }
            } else if (i12 == 0) {
                i15 = R.drawable.iac_dialer_ui_public_img_emoji_very_unsatisfied_unchecked;
            } else if (i12 == 1) {
                i15 = R.drawable.iac_dialer_ui_public_img_emoji_unsatisfied_unchecked;
            } else if (i12 == 2) {
                i15 = R.drawable.iac_dialer_ui_public_img_emoji_neutral_unchecked;
            } else if (i12 == 3) {
                i15 = R.drawable.iac_dialer_ui_public_img_emoji_satisfied_unchecked;
            } else {
                if (i12 != 4) {
                    C22039c2 c22039c2Z2 = bE2.Z();
                    if (c22039c2Z2 != null) {
                        c22039c2Z2.f38184d = new f(i12, z12, z13, lVar, vVar, i13);
                        return;
                    }
                    return;
                }
                i15 = R.drawable.iac_dialer_ui_public_img_emoji_very_satisfied_unchecked;
            }
            ToggleableState toggleableState = z12 ? ToggleableState.f41896b : ToggleableState.f41897c;
            androidx.compose.ui.semantics.i.f41744b.getClass();
            int i16 = androidx.compose.ui.semantics.i.f41745c;
            bE2.C(1924993766);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            m mVar = (m) objT;
            bE2.X(false);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            int i17 = i15;
            InterfaceC21084v1 interfaceC21084v1D = n.d(28, 5, 0L, false);
            androidx.compose.ui.semantics.i iVarA = androidx.compose.ui.semantics.i.a(i16);
            bE2.C(1924989396);
            boolean z14 = ((i14 & 14) == 4) | ((i14 & 7168) == 2048);
            Object objT2 = bE2.t();
            if (z14 || objT2 == c1651a) {
                objT2 = new c(i12, lVar);
                bE2.H(objT2);
            }
            bE2.X(false);
            v vVarO = C20588k2.o(androidx.compose.foundation.selection.g.c(vVar, toggleableState, mVar, interfaceC21084v1D, z13, iVarA, (Y41.a) objT2), 56);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i18 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarO);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            v vVarD = C20644z.f28804a.d(C20588k2.o(v.f42878y1, 50), InterfaceC22215f.a.f39080f);
            InterfaceC22374n.f40491a.getClass();
            C20806p1.a(u0.e.a(i17, 0, bE2), null, vVarD, null, InterfaceC22374n.a.f40493b, 0.0f, null, bE2, 24632, 104);
            bE2.X(true);
        }
        C22039c2 c22039c2Z3 = bE2.Z();
        if (c22039c2Z3 != null) {
            c22039c2Z3.f38184d = new d(i12, z12, z13, lVar, vVar, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating.i r20, @Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r21, @Y61.l androidx.compose.ui.v r22, @Y61.l java.lang.String r23, @Y61.l androidx.compose.runtime.A r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating.g.b(com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating.i, Y41.l, androidx.compose.ui.v, java.lang.String, androidx.compose.runtime.A, int, int):void");
    }
}
