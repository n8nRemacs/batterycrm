package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.S;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BbipPrivateV2Screen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class E extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f261141l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f261142m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261143n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State f261144o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261145p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f261146q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(androidx.compose.ui.v vVar, com.akita.compose.component.toast_bar.u uVar, InterfaceC22204y1 interfaceC22204y1, BbipPrivateV2State bbipPrivateV2State, InterfaceC22204y1 interfaceC22204y12, com.akita.compose.component.toast_bar.u uVar2) {
        super(2);
        this.f261141l = vVar;
        this.f261142m = uVar;
        this.f261143n = interfaceC22204y1;
        this.f261144o = bbipPrivateV2State;
        this.f261145p = interfaceC22204y12;
        this.f261146q = uVar2;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C22143q0 c22143q0 = com.akita.compose.foundation.n.f63625a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            S.a(c22143q0.b(com.akita.compose.foundation.n.b(com.akita.compose.theme.re23.b.f63984b.f63936k0, false, a13, 0, 6)), androidx.compose.runtime.internal.r.c(-751930542, new D(this.f261141l, this.f261142m, this.f261143n, this.f261144o, this.f261145p, this.f261146q), a13), a13, 56);
        }
        return G0.f406611a;
    }
}
