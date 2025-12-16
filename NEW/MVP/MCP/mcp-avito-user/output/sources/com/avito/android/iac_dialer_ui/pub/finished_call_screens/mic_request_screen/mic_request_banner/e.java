package com.avito.android.iac_dialer_ui.pub.finished_call_screens.mic_request_screen.mic_request_banner;

import Y41.p;
import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.akita.compose.foundation.ui.g;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import u0.i;

/* compiled from: IacUIMicRequestBanner.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* compiled from: IacUIMicRequestBanner.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f167725l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f167726m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f167727n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f167728o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z12, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3) {
            super(2);
            this.f167725l = z12;
            this.f167726m = (N) aVar;
            this.f167727n = (N) aVar2;
            this.f167728o = (N) aVar3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v18, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r3v8, types: [Y41.a] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = n.c(a13, aVar);
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
                p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
                R3.b(pVar, a13, iA2);
                p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
                R3.b(pVar2, a13, o1Y);
                p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar3);
                }
                p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
                R3.b(pVar4, a13, vVarC);
                K k12 = K.f28344a;
                String strC = i.c(a13, R.string.iac_dialer_ui_public___finished_mic_request___banner_title);
                androidx.compose.ui.text.style.i.f42675b.getClass();
                int i12 = androidx.compose.ui.text.style.i.f42680g;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.ui.p.b(strC, iVar.f65233d, null, false, 0L, androidx.compose.ui.text.style.i.a(i12), 0, 0, false, null, a13, 0, 988);
                h.a aVar3 = h.f42849c;
                g.a(12, null, a13, 6);
                com.akita.compose.foundation.ui.p.b(i.c(a13, R.string.iac_dialer_ui_public___finished_mic_request___banner_text), iVar.f65240k, null, false, 0L, androidx.compose.ui.text.style.i.a(i12), 0, 0, false, null, a13, 0, 988);
                g.a(16, null, a13, 6);
                C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, a13, 0);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                v vVarC2 = n.c(a13, aVar);
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
                R3.b(pVar, a13, c20568f2A);
                R3.b(pVar2, a13, o1Y2);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    r.B(f37888q2, a13, f37888q2, pVar3);
                }
                R3.b(pVar4, a13, vVarC2);
                v vVarA = C20576h2.f28641a.a(aVar, 1.0f, true);
                boolean z12 = this.f167725l;
                m.c(i.c(a13, z12 ? R.string.iac_dialer_ui_public___finished_mic_request___banner_button_request : R.string.iac_dialer_ui_public___finished_mic_request___banner_button_settings), z12 ? this.f167726m : this.f167727n, com.akita.compose.theme.re23.b.c(a13).X1(), C22501m2.a(vVarA, z12 ? "IacUIFinishedMicRequestScreenTestTags.MIC_REQUEST_BUTTON" : "IacUIFinishedMicRequestScreenTestTags.MIC_SETTINGS_BUTTON"), null, null, null, false, false, null, a13, 512, 1008);
                g.b(6, null, a13, 6, 2);
                m.c(i.c(a13, R.string.iac_dialer_ui_public___finished_mic_request___banner_button_cancel), this.f167728o, com.akita.compose.theme.re23.b.c(a13).r2(), C22501m2.a(aVar, "IacUIFinishedMicRequestScreenTestTags.MIC_CANCEL_BUTTON"), null, null, null, false, false, null, a13, 3584, 1008);
                a13.z();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIMicRequestBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f167729l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f167730m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f167731n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f167732o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ v f167733p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f167734q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f167735r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z12, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, v vVar, int i12, int i13) {
            super(2);
            this.f167729l = z12;
            this.f167730m = (N) aVar;
            this.f167731n = (N) aVar2;
            this.f167732o = (N) aVar3;
            this.f167733p = vVar;
            this.f167734q = i12;
            this.f167735r = i13;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f167734q | 1);
            ?? r32 = this.f167732o;
            ?? r12 = this.f167730m;
            ?? r22 = this.f167731n;
            e.a(this.f167729l, r12, r22, r32, this.f167733p, a12, iA2, this.f167735r);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r18, @Y61.k Y41.a<kotlin.G0> r19, @Y61.k Y41.a<kotlin.G0> r20, @Y61.k Y41.a<kotlin.G0> r21, @Y61.l androidx.compose.ui.v r22, @Y61.l androidx.compose.runtime.A r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.finished_call_screens.mic_request_screen.mic_request_banner.e.a(boolean, Y41.a, Y41.a, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }
}
