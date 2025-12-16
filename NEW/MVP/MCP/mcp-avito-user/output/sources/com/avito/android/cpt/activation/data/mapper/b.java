package com.avito.android.cpt.activation.data.mapper;

import Sr.C15215a;
import Sr.C15216b;
import Sr.g;
import Sr.h;
import Sr.j;
import Sr.m;
import Sr.o;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpt.remote.model.ActivationAlertBanner;
import com.avito.android.cpt.remote.model.ActivationEstimateResponseV2;
import com.avito.android.cpt.remote.model.CncData;
import com.avito.android.cpt.remote.model.DbsData;
import com.avito.android.cpt.remote.model.DeliveryData;
import com.avito.android.cpt.remote.model.FeeBlock;
import com.avito.android.cpt.remote.model.ItemData;
import com.avito.android.cpt.remote.model.OverallBlock;
import com.avito.android.cpt.remote.model.SubsidyBlock;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.e;
import com.avito.android.lib.util.f;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CptActivationMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/activation/data/mapper/b;", "Lcom/avito/android/cpt/activation/data/mapper/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DecimalFormat f126223a;

    @Inject
    public b() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingSize(3);
        decimalFormat.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("ru", "RU")));
        this.f126223a = decimalFormat;
    }

    @Override // com.avito.android.cpt.activation.data.mapper.a
    @k
    public final ArrayList a(@k ActivationEstimateResponseV2 activationEstimateResponseV2) {
        String value;
        OverallBlock overallBlockD;
        OverallBlock overallBlockE;
        String strC;
        String name;
        OverallBlock overallBlockD2;
        FeeBlock feeBlockD;
        SubsidyBlock subsidyBlockE;
        FeeBlock feeBlockC;
        ArrayList arrayList = new ArrayList();
        long j12 = 100;
        long jC2 = activationEstimateResponseV2.getItemData().getPricePenny() / j12;
        DeliveryData deliveryData = activationEstimateResponseV2.getDeliveryData();
        Long lValueOf = (deliveryData == null || (feeBlockC = deliveryData.getFee()) == null) ? null : Long.valueOf(feeBlockC.getAmountPenny() / j12);
        DeliveryData deliveryData2 = activationEstimateResponseV2.getDeliveryData();
        Long lValueOf2 = (deliveryData2 == null || (subsidyBlockE = deliveryData2.getSubsidy()) == null) ? null : Long.valueOf(subsidyBlockE.getAmountPenny() / j12);
        DbsData dbsData = activationEstimateResponseV2.getDbsData();
        Long lValueOf3 = (dbsData == null || (feeBlockD = dbsData.getFee()) == null) ? null : Long.valueOf(feeBlockD.getAmountPenny() / j12);
        arrayList.add(new com.avito.android.cpt.activation.ui.items.header.a(activationEstimateResponseV2.getTitle(), activationEstimateResponseV2.getDescription()));
        Image image = activationEstimateResponseV2.getItemData().getImage();
        String title = activationEstimateResponseV2.getItemData().getTitle();
        DeliveryData deliveryData3 = activationEstimateResponseV2.getDeliveryData();
        if (deliveryData3 == null || (overallBlockD2 = deliveryData3.getOverall()) == null || (value = overallBlockD2.getValue()) == null) {
            DbsData dbsData2 = activationEstimateResponseV2.getDbsData();
            if (dbsData2 == null || (overallBlockE = dbsData2.getOverall()) == null) {
                CncData cncData = activationEstimateResponseV2.getCncData();
                value = (cncData == null || (overallBlockD = cncData.getOverall()) == null) ? null : overallBlockD.getValue();
            } else {
                value = overallBlockE.getValue();
            }
        }
        arrayList.add(new com.avito.android.cpt.activation.ui.items.advert.a(image, title, c(Long.valueOf(jC2), value)));
        DeliveryData deliveryData4 = activationEstimateResponseV2.getDeliveryData();
        if (deliveryData4 != null) {
            FeeBlock feeBlockC2 = deliveryData4.getFee();
            String strC2 = c(lValueOf, feeBlockC2 != null ? feeBlockC2.getValue() : null);
            SubsidyBlock subsidyBlockE2 = deliveryData4.getSubsidy();
            String strC3 = c(lValueOf2, subsidyBlockE2 != null ? subsidyBlockE2.getValue() : null);
            if (lValueOf2 != null && lValueOf2.longValue() == 0) {
                strC3 = null;
            }
            String strC4 = c(Long.valueOf((jC2 - (lValueOf != null ? lValueOf.longValue() : 0L)) - (lValueOf2 != null ? lValueOf2.longValue() : 0L)), deliveryData4.getOverall().getValue());
            AttributedText attributedTextF = deliveryData4.getTitle();
            FeeBlock feeBlockC3 = deliveryData4.getFee();
            Q q12 = new Q(feeBlockC3 != null ? feeBlockC3.getLabel() : null, strC2);
            FeeBlock feeBlockC4 = deliveryData4.getFee();
            DeepLink deeplink = feeBlockC4 != null ? feeBlockC4.getDeeplink() : null;
            SubsidyBlock subsidyBlockE3 = deliveryData4.getSubsidy();
            arrayList.add(new com.avito.android.cpt.activation.ui.items.delivery.a(attributedTextF, q12, deeplink, new Q(subsidyBlockE3 != null ? subsidyBlockE3.getLabel() : null, strC3), new Q(deliveryData4.getOverall().getLabel(), strC4)));
        }
        DbsData dbsData3 = activationEstimateResponseV2.getDbsData();
        if (dbsData3 != null) {
            FeeBlock feeBlockD2 = dbsData3.getFee();
            String strC5 = c(lValueOf3, feeBlockD2 != null ? feeBlockD2.getValue() : null);
            String strC6 = c(Long.valueOf(jC2 - (lValueOf3 != null ? lValueOf3.longValue() : 0L)), dbsData3.getOverall().getValue());
            AttributedText attributedTextF2 = dbsData3.getTitle();
            FeeBlock feeBlockD3 = dbsData3.getFee();
            Q q13 = new Q(feeBlockD3 != null ? feeBlockD3.getLabel() : null, strC5);
            FeeBlock feeBlockD4 = dbsData3.getFee();
            arrayList.add(new com.avito.android.cpt.activation.ui.items.dbs.a(attributedTextF2, q13, feeBlockD4 != null ? feeBlockD4.getDeeplink() : null, new Q(dbsData3.getOverall().getLabel(), strC6), dbsData3.getAdditionalInfo()));
        }
        CncData cncData2 = activationEstimateResponseV2.getCncData();
        if (cncData2 != null) {
            FeeBlock feeBlockC5 = cncData2.getFee();
            Long lValueOf4 = feeBlockC5 != null ? Long.valueOf(feeBlockC5.getAmountPenny() / j12) : null;
            FeeBlock feeBlockC6 = cncData2.getFee();
            String strC7 = c(lValueOf4, feeBlockC6 != null ? feeBlockC6.getValue() : null);
            String strC8 = c(Long.valueOf(jC2 - (lValueOf4 != null ? lValueOf4.longValue() : 0L)), cncData2.getOverall().getValue());
            AttributedText attributedTextE = cncData2.getTitle();
            FeeBlock feeBlockC7 = cncData2.getFee();
            Q q14 = new Q(feeBlockC7 != null ? feeBlockC7.getLabel() : null, strC7);
            FeeBlock feeBlockC8 = cncData2.getFee();
            arrayList.add(new com.avito.android.cpt.activation.ui.items.cnc.a(attributedTextE, q14, feeBlockC8 != null ? feeBlockC8.getDeeplink() : null, new Q(cncData2.getOverall().getLabel(), strC8)));
        }
        ActivationAlertBanner alertBanner = activationEstimateResponseV2.getAlertBanner();
        if (alertBanner != null) {
            String title2 = alertBanner.getTitle();
            AttributedText description = alertBanner.getDescription();
            int iB2 = f.b(alertBanner.getStyle());
            ActivationAlertBanner.Icon iconC = alertBanner.getIcon();
            Integer numA = (iconC == null || (name = iconC.getName()) == null) ? null : q.a(name);
            ActivationAlertBanner.Icon iconC2 = alertBanner.getIcon();
            arrayList.add(new com.avito.android.cpt.activation.ui.items.alert.a("cpt_activation_alert", title2, description, numA, (iconC2 == null || (strC = iconC2.getColor()) == null) ? null : e.a(strC), iB2, alertBanner.getActions()));
        }
        return arrayList;
    }

    @Override // com.avito.android.cpt.activation.data.mapper.a
    @k
    public final ActivationEstimateResponseV2 b(@k o oVar) {
        DeliveryData deliveryData;
        DbsData dbsData;
        CncData cncData;
        ActivationAlertBanner activationAlertBanner;
        AttributedText title = oVar.getTitle();
        AttributedText description = oVar.getDescription();
        ItemData itemData = new ItemData(oVar.getItemData().getImage(), oVar.getItemData().getTitle(), oVar.getItemData().getPricePenny());
        j deliveryData2 = oVar.getDeliveryData();
        if (deliveryData2 != null) {
            AttributedText attributedTextD = deliveryData2.getTitle();
            Sr.k kVarA = deliveryData2.getFee();
            FeeBlock feeBlock = kVarA != null ? new FeeBlock(kVarA.getLabel(), kVarA.getAmountPenny(), kVarA.getValue(), kVarA.getExtraInfoUri()) : null;
            m mVarC = deliveryData2.getSubsidy();
            deliveryData = new DeliveryData(attributedTextD, feeBlock, mVarC != null ? new SubsidyBlock(mVarC.getLabel(), mVarC.getAmountPenny(), mVarC.getValue()) : null, new OverallBlock(deliveryData2.getOverall().getLabel(), deliveryData2.getOverall().getValue()));
        } else {
            deliveryData = null;
        }
        g dbsData2 = oVar.getDbsData();
        if (dbsData2 != null) {
            AttributedText attributedTextD2 = dbsData2.getTitle();
            h hVarB = dbsData2.getFee();
            dbsData = new DbsData(attributedTextD2, hVarB != null ? new FeeBlock(hVarB.getLabel(), hVarB.getAmountPenny(), hVarB.getValue(), hVarB.getExtraInfoUri()) : null, new OverallBlock(dbsData2.getOverall().getLabel(), dbsData2.getOverall().getValue()), dbsData2.getAdditionalInfo());
        } else {
            dbsData = null;
        }
        Sr.d cncData2 = oVar.getCncData();
        if (cncData2 != null) {
            AttributedText attributedTextC = cncData2.getTitle();
            Sr.e eVarA = cncData2.getFee();
            cncData = new CncData(attributedTextC, eVarA != null ? new FeeBlock(eVarA.getLabel(), eVarA.getAmountPenny(), eVarA.getValue(), eVarA.getExtraInfoUri()) : null, new OverallBlock(cncData2.getOverall().getLabel(), cncData2.getOverall().getValue()));
        } else {
            cncData = null;
        }
        AttributedText agreement = oVar.getAgreement();
        if (agreement == null) {
            agreement = new AttributedText("", C42784z0.f406748b, 0, 4, null);
        }
        AttributedText attributedText = agreement;
        ButtonAction buttonAction = new ButtonAction(oVar.getButton().getTitle(), oVar.getButton().getUri(), null, null, 12, null);
        C15215a alert = oVar.getAlert();
        if (alert != null) {
            String strC = alert.getStyle();
            String strD = alert.getTitle();
            AttributedText attributedTextB = alert.getDescription();
            List<C15216b> listA = alert.a();
            ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
            for (C15216b c15216b : listA) {
                arrayList.add(new ButtonAction(c15216b.getTitle(), c15216b.getUri(), c15216b.getStyle(), null, 8, null));
            }
            activationAlertBanner = new ActivationAlertBanner(strC, strD, attributedTextB, null, arrayList);
        } else {
            activationAlertBanner = null;
        }
        return new ActivationEstimateResponseV2(title, description, itemData, deliveryData, dbsData, cncData, attributedText, buttonAction, activationAlertBanner);
    }

    public final String c(Long l12, String str) {
        if (l12 == null || str == null) {
            return null;
        }
        return C43066x.a0(str, "%price", this.f126223a.format(l12.longValue()), false);
    }
}
