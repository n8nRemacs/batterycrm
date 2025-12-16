package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common;

import Y41.q;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: NonOutgoingMessage.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/k0;", "Landroidx/compose/ui/layout/h0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/k0;Landroidx/compose/ui/layout/h0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements q<InterfaceC22369k0, InterfaceC22363h0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public static final i f192362l = new i();

    public i() {
        super(3);
    }

    @Override // Y41.q
    public final InterfaceC22367j0 invoke(InterfaceC22369k0 interfaceC22369k0, InterfaceC22363h0 interfaceC22363h0, C22712b c22712b) {
        InterfaceC22369k0 interfaceC22369k02 = interfaceC22369k0;
        InterfaceC22363h0 interfaceC22363h02 = interfaceC22363h0;
        long j12 = c22712b.f42843a;
        int iJ2 = C22712b.j(j12) - interfaceC22369k02.y0(m.f192379a);
        int iL2 = C22712b.l(j12);
        if (iJ2 < iL2) {
            iJ2 = iL2;
        }
        K0 k0I = interfaceC22363h02.I(C22712b.c(j12, 0, iJ2 < 1 ? 1 : iJ2, 0, 0, 13));
        return interfaceC22369k02.L0(k0I.f40345b, k0I.f40346c, P0.c(), new h(k0I));
    }
}
