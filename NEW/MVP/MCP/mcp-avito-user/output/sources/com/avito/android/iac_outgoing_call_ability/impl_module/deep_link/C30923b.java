package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallData;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.iac_dialer_models.abstract_module.IacItemInfo;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacCanRecallLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import nJ.M;
import tM.C48576a;

/* compiled from: IacCanRecallLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "canCallResult", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30923b extends N implements Y41.l<IacCanCallResult, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f168569l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30923b(d dVar) {
        super(1);
        this.f168569l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(IacCanCallResult iacCanCallResult) throws Resources.NotFoundException {
        DeepLink deepLink;
        IacCanCallResult iacCanCallResult2 = iacCanCallResult;
        boolean z12 = iacCanCallResult2 instanceof IacCanCallResult.Can;
        d dVar = this.f168569l;
        com.avito.android.deeplink_handler.handler.composite.a aVar = dVar.f168574h;
        a.g gVar = dVar.f168575i;
        AW.e eVar = dVar.f168579m;
        if (z12) {
            IacCanCallResult.Can can = (IacCanCallResult.Can) iacCanCallResult2;
            AW.e.a(eVar, "handleCanCallResult: " + can);
            gVar.g(null, false);
            Resources resources = dVar.f168578l;
            String string = resources.getString(R.string.iac_outgoing_call_ability_impl_can_recall_link_handler_bottom_sheet_title);
            AttributedText attributedText = new AttributedText(resources.getString(R.string.iac_outgoing_call_ability_impl_can_recall_link_handler_bottom_sheet_description), C42784z0.f406748b, 0, 4, null);
            DetailsSheetButton detailsSheetButton = new DetailsSheetButton(resources.getString(R.string.iac_outgoing_call_ability_impl_can_recall_link_handler_bottom_sheet_button), "accent", null, new IacMakeCallLink(can.getCallInfo()), null, null, 52, null);
            Boolean bool = Boolean.TRUE;
            DetailsSheetLinkBody detailsSheetLinkBody = new DetailsSheetLinkBody(string, null, null, null, attributedText, null, detailsSheetButton, null, bool, null, null, null, bool, null, null, null, null, false, null, 519854, null);
            String str = can.getCallInfo().f166836f;
            IacItemInfo iacItemInfo = can.getCallInfo().f166834d;
            String str2 = iacItemInfo != null ? iacItemInfo.f166858b : null;
            String str3 = can.getCallInfo().f166832b;
            IacCanCallData iacCanCallData = can.getCallInfo().f166842l;
            dVar.i(IacCanRecallLink.b.c.f168682b, aVar, new DetailsSheetLink(detailsSheetLinkBody, C48576a.a(new M(str, str2, str3, iacCanCallData != null ? iacCanCallData.f166855b : null, Boolean.valueOf(dVar.f168577k.b("android.permission.RECORD_AUDIO").b())))));
        } else if (iacCanCallResult2 instanceof IacCanCallResult.CanNot) {
            AW.e.a(eVar, "handleCanCallResult: " + ((IacCanCallResult.CanNot) iacCanCallResult2));
            gVar.g(null, false);
            IacCanRecallLink iacCanRecallLinkC = dVar.c();
            if (iacCanRecallLinkC != null && (deepLink = iacCanRecallLinkC.f168679e) != null) {
                dVar.i(IacCanRecallLink.b.C4986b.f168681b, aVar, deepLink);
            }
        }
        return G0.f406611a;
    }
}
