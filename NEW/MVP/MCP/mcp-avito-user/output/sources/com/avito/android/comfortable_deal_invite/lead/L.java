package com.avito.android.comfortable_deal_invite.lead;

import androidx.compose.ui.platform.InterfaceC22489j2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComfortableDealInviteScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class L extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f123586l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22489j2 f123587m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f123588n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Y41.a aVar, androidx.compose.ui.focus.r rVar, InterfaceC22489j2 interfaceC22489j2) {
        super(0);
        this.f123586l = aVar;
        this.f123587m = interfaceC22489j2;
        this.f123588n = rVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f123586l.invoke();
        InterfaceC22489j2 interfaceC22489j2 = this.f123587m;
        if (interfaceC22489j2 != null) {
            interfaceC22489j2.hide();
        }
        this.f123588n.u(false);
        return G0.f406611a;
    }
}
