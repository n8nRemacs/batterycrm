package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BbipPrivateV2Screen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ButtonAction f261385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261386m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ButtonAction buttonAction, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f261385l = buttonAction;
        this.f261386m = interfaceC22204y1;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink = this.f261385l.getDeeplink();
        if (deeplink != null) {
            ((Y41.l) this.f261386m.getF42167b()).invoke(deeplink);
        }
        return G0.f406611a;
    }
}
