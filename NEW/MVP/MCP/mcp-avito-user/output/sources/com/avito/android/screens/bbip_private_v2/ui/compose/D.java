package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BbipPrivateV2Screen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class D extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f261135l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f261136m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261137n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State f261138o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261139p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f261140q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(androidx.compose.ui.v vVar, com.akita.compose.component.toast_bar.u uVar, InterfaceC22204y1 interfaceC22204y1, BbipPrivateV2State bbipPrivateV2State, InterfaceC22204y1 interfaceC22204y12, com.akita.compose.component.toast_bar.u uVar2) {
        super(2);
        this.f261135l = vVar;
        this.f261136m = uVar;
        this.f261137n = interfaceC22204y1;
        this.f261138o = bbipPrivateV2State;
        this.f261139p = interfaceC22204y12;
        this.f261140q = uVar2;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.ui.v vVarD0 = this.f261135l.d0(C20588k2.f28682c);
            InterfaceC22204y1 interfaceC22204y1 = this.f261137n;
            InterfaceC22204y1 interfaceC22204y12 = this.f261139p;
            BbipPrivateV2State bbipPrivateV2State = this.f261138o;
            com.akita.compose.component.scaffold.g.a(vVarD0, androidx.compose.runtime.internal.r.c(-2110832114, new t(interfaceC22204y1, bbipPrivateV2State, interfaceC22204y12), a13), androidx.compose.runtime.internal.r.c(-1057795347, new z(bbipPrivateV2State, interfaceC22204y1), a13), this.f261136m, null, null, null, androidx.compose.runtime.internal.r.c(186416421, new C(bbipPrivateV2State, interfaceC22204y1, this.f261140q), a13), a13, 12583344, 112);
        }
        return G0.f406611a;
    }
}
