package com.avito.android.comfortable_deal_invite.lead;

import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import zq.C50611c;

/* compiled from: ComfortableDealInviteScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class K extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C50611c f123584l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f123585m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C50611c c50611c, Y41.a<G0> aVar) {
        super(2);
        this.f123584l = c50611c;
        this.f123585m = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            String strC = u0.i.c(a13, R.string.comfortable_deal_invite_navbar_title);
            boolean z12 = this.f123584l.f444283e;
            if (z12) {
                strC = null;
            }
            if (strC == null) {
                strC = "";
            }
            String str = strC;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            if (z12) {
                com.akita.compose.theme.re23.b.f63985c.getClass();
                i12 = com.akita.compose.theme.re23.e.f64237O3;
            } else {
                com.akita.compose.theme.re23.b.f63985c.getClass();
                i12 = com.akita.compose.theme.re23.e.f64233O;
            }
            com.akita.compose.component.navbar.t.d(str, null, null, i12, this.f123585m, null, a13, 0, 38);
        }
        return G0.f406611a;
    }
}
