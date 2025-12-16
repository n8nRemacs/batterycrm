package com.avito.android.comfortable_deal_invite.lead;

import androidx.compose.ui.platform.InterfaceC22489j2;
import com.akita.compose.component.chips.InterfaceC27333b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComfortableDealInviteScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Lcom/akita/compose/component/chips/b;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/chips/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class F extends kotlin.jvm.internal.N implements Y41.p<Integer, InterfaceC27333b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f123544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22489j2 f123545m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f123546n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(Y41.l<? super Boolean, G0> lVar, InterfaceC22489j2 interfaceC22489j2, androidx.compose.ui.focus.r rVar) {
        super(2);
        this.f123544l = lVar;
        this.f123545m = interfaceC22489j2;
        this.f123546n = rVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, InterfaceC27333b interfaceC27333b) {
        this.f123544l.invoke(Boolean.valueOf(num.intValue() == 0));
        InterfaceC22489j2 interfaceC22489j2 = this.f123545m;
        if (interfaceC22489j2 != null) {
            interfaceC22489j2.hide();
        }
        this.f123546n.u(false);
        return G0.f406611a;
    }
}
