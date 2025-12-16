package com.avito.android.comfortable_deal_invite.lead;

import androidx.compose.ui.platform.InterfaceC22489j2;
import com.akita.compose.component.toggle.ToggleState;
import kotlin.G0;
import kotlin.Metadata;
import zq.C50611c;

/* compiled from: ComfortableDealInviteScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.comfortable_deal_invite.lead.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29515u extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C50611c f123728l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f123729m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22489j2 f123730n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f123731o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29515u(C50611c c50611c, Y41.l<? super Boolean, G0> lVar, InterfaceC22489j2 interfaceC22489j2, androidx.compose.ui.focus.r rVar) {
        super(2);
        this.f123728l = c50611c;
        this.f123729m = lVar;
        this.f123730n = interfaceC22489j2;
        this.f123731o = rVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C50611c c50611c = this.f123728l;
            boolean z12 = c50611c.f444297s;
            C29514t c29514t = new C29514t(this.f123729m, this.f123730n, this.f123731o);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.toggle.j.b(z12, c29514t, com.akita.compose.theme.re23.b.m(a13).getF66432c().f61954f, null, c50611c.f444298t ? ToggleState.f63313d : ToggleState.f63311b, null, a13, 0, 104);
        }
        return G0.f406611a;
    }
}
