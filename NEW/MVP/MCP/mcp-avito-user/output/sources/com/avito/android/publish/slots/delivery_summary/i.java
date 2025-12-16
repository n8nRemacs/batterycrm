package com.avito.android.publish.slots.delivery_summary;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.BadgeData;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.CncData;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.CptEstimateResultV2;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DbsData;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliveryData;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.FbsFeeBlock;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.FeeBlock;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.IncludingFeeData;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.PriceBlockV2;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.SubsidyBlock;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import ml0.C44095b;
import ml0.C44096c;
import ml0.p;
import ml0.q;
import ml0.r;

/* compiled from: DeliverySummarySlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lml0/p;", "it", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/CptEstimateResultV2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final i<T, R> f243571b = new i<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        DeliveryData deliveryData;
        DbsData dbsData;
        CncData cncData;
        IncludingFeeData includingFeeData;
        String title;
        FeeBlock feeBlock;
        FeeBlock feeBlock2;
        ArrayList arrayList;
        FeeBlock feeBlock3;
        FbsFeeBlock fbsFeeBlock;
        ArrayList arrayList2;
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        p pVar = (p) ((TypedResult.Success) typedResult).getResult();
        String titleSlotId = pVar.getTitleSlotId();
        ml0.h deliveryData2 = pVar.getDeliveryData();
        BadgeData badgeData = null;
        if (deliveryData2 != null) {
            AttributedText title2 = deliveryData2.getTitle();
            ml0.j fee = deliveryData2.getFee();
            if (fee != null) {
                AttributedText label = fee.getLabel();
                long amountPenny = fee.getAmountPenny();
                String value = fee.getValue();
                DeepLink extraInfoUri = fee.getExtraInfoUri();
                List<q> listC = fee.c();
                if (listC != null) {
                    List<q> list = listC;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(a.a((q) it.next()));
                    }
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = null;
                }
                AttributedText amountAttributed = fee.getAmountAttributed();
                Boolean withHelpIcon = fee.getWithHelpIcon();
                r helpContent = fee.getHelpContent();
                feeBlock3 = new FeeBlock(label, amountPenny, value, extraInfoUri, amountAttributed, withHelpIcon, helpContent != null ? a.b(helpContent) : null, arrayList2);
            } else {
                feeBlock3 = null;
            }
            ml0.i fbsFee = deliveryData2.getFbsFee();
            if (fbsFee != null) {
                AttributedText label2 = fbsFee.getLabel();
                long amountPenny2 = fbsFee.getAmountPenny();
                String value2 = fbsFee.getValue();
                DeepLink extraInfoUri2 = fbsFee.getExtraInfoUri();
                AttributedText amountAttributed2 = fbsFee.getAmountAttributed();
                Boolean withHelpIcon2 = fbsFee.getWithHelpIcon();
                r helpContent2 = fbsFee.getHelpContent();
                fbsFeeBlock = new FbsFeeBlock(value2, amountPenny2, label2, amountAttributed2, withHelpIcon2, helpContent2 != null ? a.b(helpContent2) : null, extraInfoUri2);
            } else {
                fbsFeeBlock = null;
            }
            ml0.l subsidy = deliveryData2.getSubsidy();
            SubsidyBlock subsidyBlock = subsidy != null ? new SubsidyBlock(subsidy.getLabel(), subsidy.getValue(), subsidy.getAmountPenny()) : null;
            ml0.k overall = deliveryData2.getOverall();
            deliveryData = new DeliveryData(title2, feeBlock3, fbsFeeBlock, subsidyBlock, new PriceBlockV2(overall.getLabel(), overall.getValue()));
        } else {
            deliveryData = null;
        }
        ml0.e dbsData2 = pVar.getDbsData();
        if (dbsData2 != null) {
            AttributedText title3 = dbsData2.getTitle();
            ml0.f fee2 = dbsData2.getFee();
            if (fee2 != null) {
                AttributedText label3 = fee2.getLabel();
                long amountPenny3 = fee2.getAmountPenny();
                String value3 = fee2.getValue();
                DeepLink extraInfoUri3 = fee2.getExtraInfoUri();
                List<q> listC2 = fee2.c();
                if (listC2 != null) {
                    List<q> list2 = listC2;
                    ArrayList arrayList4 = new ArrayList(C42745f0.q(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(a.a((q) it2.next()));
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                AttributedText amountAttributed3 = fee2.getAmountAttributed();
                Boolean withHelpIcon3 = fee2.getWithHelpIcon();
                r helpContent3 = fee2.getHelpContent();
                feeBlock2 = new FeeBlock(label3, amountPenny3, value3, extraInfoUri3, amountAttributed3, withHelpIcon3, helpContent3 != null ? a.b(helpContent3) : null, arrayList);
            } else {
                feeBlock2 = null;
            }
            ml0.g overall2 = dbsData2.getOverall();
            dbsData = new DbsData(title3, feeBlock2, new PriceBlockV2(overall2.getLabel(), overall2.getValue()), dbsData2.getAdditionalInfo());
        } else {
            dbsData = null;
        }
        C44095b cncData2 = pVar.getCncData();
        if (cncData2 != null) {
            AttributedText title4 = cncData2.getTitle();
            C44096c fee3 = cncData2.getFee();
            if (fee3 != null) {
                AttributedText label4 = fee3.getLabel();
                long amountPenny4 = fee3.getAmountPenny();
                String value4 = fee3.getValue();
                DeepLink extraInfoUri4 = fee3.getExtraInfoUri();
                AttributedText amountAttributed4 = fee3.getAmountAttributed();
                Boolean withHelpIcon4 = fee3.getWithHelpIcon();
                r helpContent4 = fee3.getHelpContent();
                feeBlock = new FeeBlock(label4, amountPenny4, value4, extraInfoUri4, amountAttributed4, withHelpIcon4, helpContent4 != null ? a.b(helpContent4) : null, null);
            } else {
                feeBlock = null;
            }
            ml0.d overall3 = cncData2.getOverall();
            cncData = new CncData(title4, feeBlock, new PriceBlockV2(overall3.getLabel(), overall3.getValue()));
        } else {
            cncData = null;
        }
        AttributedText agreement = pVar.getAgreement();
        if (agreement == null) {
            agreement = new AttributedText("", C42784z0.f406748b, 0, 4, null);
        }
        AttributedText attributedText = agreement;
        String cptToken = pVar.getCptToken();
        ml0.m includingFeeWidget = pVar.getIncludingFeeWidget();
        if (includingFeeWidget != null) {
            UniversalImage universalImage = new UniversalImage(includingFeeWidget.getImage(), null);
            ml0.n badge = includingFeeWidget.getBadge();
            if (badge != null && (title = badge.getTitle()) != null) {
                badgeData = new BadgeData(title);
            }
            includingFeeData = new IncludingFeeData(universalImage, badgeData, includingFeeWidget.getDescription(), includingFeeWidget.getItemPriceWithFee(), includingFeeWidget.getFeeAfterIncluding(), null, null, includingFeeWidget.getDisableSubsidyIfFeeIsNotIncluded(), 96, null);
        } else {
            includingFeeData = null;
        }
        return new TypedResult.Success(new CptEstimateResultV2(titleSlotId, deliveryData, dbsData, attributedText, cptToken, cncData, includingFeeData));
    }
}
