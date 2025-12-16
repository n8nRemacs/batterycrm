package com.avito.android.iac_dialer_ui.pub.call_screen.wait_bottom_sheet;

import androidx.compose.foundation.layout.J;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIWaitBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.q<J, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUIWaitBottomSheetType f167416l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f167417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f167418n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f167419o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f167420p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(IacUIWaitBottomSheetType iacUIWaitBottomSheetType, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4) {
        super(3);
        this.f167416l = iacUIWaitBottomSheetType;
        this.f167417m = aVar;
        this.f167418n = aVar2;
        this.f167419o = aVar3;
        this.f167420p = aVar4;
    }

    @Override // Y41.q
    public final G0 invoke(J j12, androidx.compose.runtime.A a12, Integer num) {
        J j13 = j12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(j13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            B.b(j13, this.f167416l, this.f167417m, this.f167418n, this.f167419o, this.f167420p, a13, iIntValue & 14);
        }
        return G0.f406611a;
    }
}
