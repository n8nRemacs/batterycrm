package com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIActiveFallbackModal.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166948l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f166949m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y41.a<G0> aVar, InterfaceC22204y1<Boolean> interfaceC22204y1) {
        super(2);
        this.f166948l = aVar;
        this.f166949m = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            a13.C(328113774);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new g(this.f166949m);
                a13.H(objT);
            }
            a13.h();
            t.b((Y41.a) objT, this.f166948l, a13, 6);
        }
        return G0.f406611a;
    }
}
