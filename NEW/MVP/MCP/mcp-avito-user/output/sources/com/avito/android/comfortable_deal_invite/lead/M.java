package com.avito.android.comfortable_deal_invite.lead;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.platform.InterfaceC22489j2;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import zq.C50611c;

/* compiled from: ComfortableDealInviteScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class M extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C50611c f123589l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f123590m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22489j2 f123591n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f123592o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C50611c c50611c, Y41.a<G0> aVar, InterfaceC22489j2 interfaceC22489j2, androidx.compose.ui.focus.r rVar) {
        super(2);
        this.f123589l = c50611c;
        this.f123590m = aVar;
        this.f123591n = interfaceC22489j2;
        this.f123592o = rVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C50611c c50611c = this.f123589l;
            String strC = u0.i.c(a13, c50611c.f444283e ? R.string.comfortable_deal_invite_to_cabinet : R.string.comfortable_deal_invite_add_client);
            com.akita.compose.component.button.t tVarO = com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a13);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            float f12 = 10;
            com.akita.compose.component.button.m.c(strC, new L(this.f123590m, this.f123592o, this.f123591n), tVarO, R1.k(f12, 0.0f, 2, R1.m(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 0.0f, f12, 0.0f, 16, 5)), null, null, null, c50611c.f444282d, false, null, a13, 512, 880);
        }
        return G0.f406611a;
    }
}
