package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask;

import android.content.DialogInterface;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_permission_mic_ask.IacPermissionMicAskLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import nJ.C44276k;

/* compiled from: IacPermissionMicAskLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f168261l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacPermissionMicAskLink f168262m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f168263n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, IacPermissionMicAskLink iacPermissionMicAskLink, DialogInterface dialogInterface) {
        super(0);
        this.f168261l = aVar;
        this.f168262m = iacPermissionMicAskLink;
        this.f168263n = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f168261l;
        aVar.f168248i.c(new C44276k(CallsPopupType.f164278c, null, this.f168262m.f168402c, 2, null));
        aVar.f168245f.R(aVar.f168250k.i(), com.avito.android.deeplink_handler.view.b.f134588l);
        this.f168263n.dismiss();
        return G0.f406611a;
    }
}
