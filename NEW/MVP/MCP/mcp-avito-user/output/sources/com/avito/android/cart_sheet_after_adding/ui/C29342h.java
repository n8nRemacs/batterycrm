package com.avito.android.cart_sheet_after_adding.ui;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.view.O0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.cart_sheet_after_adding.ui.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29342h extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CartSheetAfterAddingDialogFragment f115608l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29342h(CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment) {
        super(2);
        this.f115608l = cartSheetAfterAddingDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment = this.f115608l;
            O0 o02 = cartSheetAfterAddingDialogFragment.f115463i0;
            InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(((com.avito.android.cart_sheet_after_adding.mvi.p) o02.getValue()).getState(), a13);
            com.avito.android.analytics.screens.mvi.r perfTrackerParams = ((gn.e) interfaceC22204y1B.getF42167b()).getPerfTrackerParams();
            a13.C(-976608008);
            a13.C(2063036140);
            if (((Boolean) a13.o(C22543x1.f41638a)).booleanValue()) {
                a13.C(421109671);
                C22187u0.d(new C29340f(cartSheetAfterAddingDialogFragment, null), a13, ((com.avito.android.cart_sheet_after_adding.mvi.p) o02.getValue()).getEvents());
                M.b((gn.e) interfaceC22204y1B.getF42167b(), cartSheetAfterAddingDialogFragment.f5(), a13, 8);
                a13.h();
            } else {
                a13.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                if (perfTrackerParams != null) {
                    aVar.m(perfTrackerParams.f90666a);
                }
                aVar.l();
                androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(androidx.compose.ui.v.f42878y1, new C29341g(perfTrackerParams, aVar));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
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
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                C22187u0.d(new C29340f(cartSheetAfterAddingDialogFragment, null), a13, ((com.avito.android.cart_sheet_after_adding.mvi.p) o02.getValue()).getEvents());
                M.b((gn.e) interfaceC22204y1B.getF42167b(), cartSheetAfterAddingDialogFragment.f5(), a13, 8);
                a13.z();
                a13.h();
            }
            a13.h();
            a13.h();
        }
        return G0.f406611a;
    }
}
