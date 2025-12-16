package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class s extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43108m f167023l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> f167024m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<IacUIAudioDevicesBottomSheetState> f167025n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T f167026o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C43108m c43108m, Y41.l lVar, InterfaceC22204y1 interfaceC22204y1, T t12) {
        super(2);
        this.f167023l = c43108m;
        this.f167024m = lVar;
        this.f167025n = interfaceC22204y1;
        this.f167026o = t12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, fillElement);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            K k12 = K.f28344a;
            StringBuilder sb2 = new StringBuilder("current: ");
            IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState = w.f167030a;
            InterfaceC22204y1<IacUIAudioDevicesBottomSheetState> interfaceC22204y1 = this.f167025n;
            sb2.append(interfaceC22204y1.getF42167b().getCurrent());
            String string = sb2.toString();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(string, com.akita.compose.theme.re23.b.f63988f.f65240k, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            float f12 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            com.akita.compose.component.button.t tVarF2 = com.akita.compose.theme.re23.b.c(a13).f2();
            C43108m c43108m = this.f167023l;
            T t12 = this.f167026o;
            com.akita.compose.component.button.m.c("Open bottom sheet", new n(t12, c43108m), tVarF2, null, null, null, null, false, false, null, a13, 518, 1016);
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            com.akita.compose.component.button.t tVarF22 = com.akita.compose.theme.re23.b.c(a13).f2();
            Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> lVar2 = this.f167024m;
            com.akita.compose.component.button.m.c("Open bottom sheet and change device in 3 sec", new p(t12, c43108m, lVar2), tVarF22, null, null, null, null, false, false, null, a13, 518, 1016);
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            com.akita.compose.component.button.m.c("Open bottom sheet and hide in 3 sec", new r(t12, c43108m), com.akita.compose.theme.re23.b.c(a13).f2(), null, null, null, null, false, false, null, a13, 518, 1016);
            a13.z();
            w.a(interfaceC22204y1.getF42167b(), c43108m, lVar2, a13, 3144);
        }
        return G0.f406611a;
    }
}
