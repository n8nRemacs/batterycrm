package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.iac_dialer_models.abstract_module.IacSupportData;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacMakeSupportCallLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacMakeSupportCallLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "canCallResult", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r extends N implements Y41.l<IacCanCallResult, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f168638l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacMakeSupportCallLink f168639m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, IacMakeSupportCallLink iacMakeSupportCallLink) {
        super(1);
        this.f168638l = sVar;
        this.f168639m = iacMakeSupportCallLink;
    }

    @Override // Y41.l
    public final G0 invoke(IacCanCallResult iacCanCallResult) {
        IacCanCallResult iacCanCallResult2 = iacCanCallResult;
        boolean z12 = iacCanCallResult2 instanceof IacCanCallResult.Can;
        s sVar = this.f168638l;
        IacMakeSupportCallLink iacMakeSupportCallLink = this.f168639m;
        if (z12) {
            IacCanCallResult.Can can = (IacCanCallResult.Can) iacCanCallResult2;
            IacCallInfo callInfo = can.getCallInfo();
            IacSupportData iacSupportData = new IacSupportData(iacMakeSupportCallLink.f168688b);
            DeepLink deepLink = can.getCallInfo().f166839i;
            if (deepLink == null) {
                deepLink = iacMakeSupportCallLink.f168689c;
            }
            IacMakeCallLink iacMakeCallLink = new IacMakeCallLink(IacCallInfo.a(callInfo, null, false, deepLink, iacSupportData, null, 7551));
            IacCallInfo iacCallInfo = iacMakeCallLink.f168711b;
            sVar.f168643i.P0(iacCallInfo.f166832b, iacCallInfo.f166836f);
            sVar.i(IacMakeSupportCallLink.b.c.f168692b, sVar.f168640f, iacMakeCallLink);
        } else if (iacCanCallResult2 instanceof IacCanCallResult.CanNot) {
            s.k(sVar, iacMakeSupportCallLink.f168689c);
        }
        return G0.f406611a;
    }
}
