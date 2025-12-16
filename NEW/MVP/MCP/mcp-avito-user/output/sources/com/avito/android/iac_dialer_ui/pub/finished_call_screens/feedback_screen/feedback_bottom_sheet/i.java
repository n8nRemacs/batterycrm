package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIFeedbackBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f167571l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f167572m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<String> f167573n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Y41.l<? super String, G0> lVar, InterfaceC22204y1<Boolean> interfaceC22204y1, InterfaceC22204y1<String> interfaceC22204y12) {
        super(0);
        this.f167571l = lVar;
        this.f167572m = interfaceC22204y1;
        this.f167573n = interfaceC22204y12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f167572m;
        IacUIFeedbackBottomSheetState iacUIFeedbackBottomSheetState = A.f167550a;
        interfaceC22204y1.setValue(Boolean.FALSE);
        this.f167571l.invoke(this.f167573n.getF42167b());
        return G0.f406611a;
    }
}
