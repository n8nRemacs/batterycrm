package com.avito.android.publish.slots.delivery_summary_edit;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.CptEstimateEditResultV2;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.FbsFeeBlock;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.FeeBlock;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.HelpContent;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.HelpContentAction;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.HelpContentDescription;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.SellFasterBanner;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import ll0.C43791b;

/* compiled from: DeliverySummaryEditSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lll0/f;", "it", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/CptEstimateEditResultV2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f243778b;

    public i(f fVar) {
        this.f243778b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        FeeBlock feeBlock;
        FbsFeeBlock fbsFeeBlock;
        ll0.i description;
        ll0.h action;
        ll0.h action2;
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        ll0.f fVar = (ll0.f) ((TypedResult.Success) typedResult).getResult();
        x xVar = this.f243778b.f243763h;
        String cptToken = fVar.getCptToken();
        ll0.d fee = fVar.getFee();
        if (fee != null) {
            AttributedText label = fee.getLabel();
            long amountPenny = fee.getAmountPenny();
            String value = fee.getValue();
            DeepLink extraInfoUri = fee.getExtraInfoUri();
            AttributedText amountAttributed = fee.getAmountAttributed();
            Boolean withHelpIcon = fee.getWithHelpIcon();
            ll0.g helpContent = fee.getHelpContent();
            String label2 = (helpContent == null || (action2 = helpContent.getAction()) == null) ? null : action2.getLabel();
            ll0.g helpContent2 = fee.getHelpContent();
            HelpContentAction helpContentAction = new HelpContentAction(label2, (helpContent2 == null || (action = helpContent2.getAction()) == null) ? null : action.getUrl());
            ll0.g helpContent3 = fee.getHelpContent();
            feeBlock = new FeeBlock(label, amountPenny, value, extraInfoUri, amountAttributed, withHelpIcon, new HelpContent(helpContentAction, new HelpContentDescription((helpContent3 == null || (description = helpContent3.getDescription()) == null) ? null : description.getText())));
        } else {
            feeBlock = null;
        }
        C43791b fbsFee = fVar.getFbsFee();
        if (fbsFee != null) {
            fbsFeeBlock = new FbsFeeBlock(fbsFee.getValue(), fbsFee.getAmountPenny(), fbsFee.getLabel(), fbsFee.getAmountAttributed(), fbsFee.getExtraInfoUri());
        } else {
            fbsFeeBlock = null;
        }
        AttributedText agreement = fVar.getAgreement();
        Boolean delivery = fVar.getDelivery();
        boolean zBooleanValue = delivery != null ? delivery.booleanValue() : false;
        ll0.j sellFasterBanner = fVar.getSellFasterBanner();
        return new TypedResult.Success(new CptEstimateEditResultV2(cptToken, feeBlock, fbsFeeBlock, agreement, zBooleanValue, sellFasterBanner != null ? new SellFasterBanner(sellFasterBanner.getTitle(), sellFasterBanner.getSubtitle(), xVar.b(sellFasterBanner.getMoreLink())) : null));
    }
}
