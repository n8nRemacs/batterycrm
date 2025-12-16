package com.avito.android.remote.parse.adapter;

import com.avito.android.deep_linking.links.AdvertDetailsScrollToPositionEmptyLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertEquipments;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.ExpandItemsButton;
import com.avito.android.remote.model.price_list.AdvertPriceListPreviewResponse;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.remote.model.service_education.ServiceEducation;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertParametersDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertParametersDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/AdvertParameters;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertParametersDeserializer implements com.google.gson.h<AdvertParameters> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31, types: [kotlin.collections.z0] */
    public static List a(com.google.gson.f fVar, com.google.gson.g gVar) {
        ArrayList arrayList;
        DeepLink advertDetailsScrollToPositionEmptyLink;
        if (fVar == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList2 = fVar.f362000b;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.google.gson.k kVarI = ((com.google.gson.i) it.next()).i();
            String strS = kVarI.D("title").s();
            com.google.gson.i iVarD = kVarI.D("subtitles");
            com.google.gson.f fVarH = iVarD != null ? iVarD.h() : null;
            if (fVarH == null) {
                arrayList = C42784z0.f406748b;
            } else {
                ArrayList arrayList4 = fVarH.f362000b;
                arrayList = new ArrayList(arrayList4.size());
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((com.google.gson.i) it2.next()).s());
                }
            }
            com.google.gson.i iVarD2 = kVarI.D("description");
            String strS2 = iVarD2 != null ? iVarD2.s() : null;
            com.google.gson.i iVarD3 = kVarI.D("descriptionColor");
            String strS3 = iVarD3 != null ? iVarD3.s() : null;
            com.google.gson.i iVarD4 = kVarI.D("scrollTo");
            String strS4 = iVarD4 != null ? iVarD4.s() : null;
            if (strS4 != null) {
                advertDetailsScrollToPositionEmptyLink = new AdvertDetailsScrollToPositionEmptyLink(null, strS4, 1, null);
            } else {
                com.google.gson.i iVarD5 = kVarI.D(TooltipAttribute.PARAM_DEEP_LINK);
                advertDetailsScrollToPositionEmptyLink = (DeepLink) (iVarD5 == null ? null : gVar.b(iVarD5, DeepLink.class));
            }
            com.google.gson.i iVarD6 = kVarI.D("button");
            AdvertParameters.Button button = (AdvertParameters.Button) (iVarD6 == null ? null : gVar.b(iVarD6, AdvertParameters.Button.class));
            com.google.gson.i iVarD7 = kVarI.D("attributeId");
            arrayList3.add(new AdvertParameters.Parameter(strS, arrayList, strS2, strS3, advertDetailsScrollToPositionEmptyLink, button, iVarD7 != null ? iVarD7.s() : null));
        }
        return arrayList3;
    }

    @Override // com.google.gson.h
    public final AdvertParameters deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2;
        com.google.gson.k kVarI = iVar.i();
        List listA = a(kVarI.E("flat"), gVar);
        com.google.gson.f fVarE = kVarI.E("flatSections");
        int i12 = 0;
        if (fVarE == null) {
            arrayList = null;
        } else {
            int size = fVarE.f362000b.size();
            arrayList = new ArrayList(size);
            int iC2 = 0;
            while (iC2 < size) {
                com.google.gson.i iVarW = fVarE.w(iC2);
                iC2 = com.avito.android.authorization.auto_recovery.phone_confirm.b.c(gVar, iVarW != null ? iVarW.i() : null, AdvertParameters.FlatSection.class, arrayList, iC2, 1);
            }
        }
        com.google.gson.f fVarE2 = kVarI.E("groups");
        if (fVarE2 == null) {
            list = C42784z0.f406748b;
        } else {
            ArrayList arrayList3 = fVarE2.f362000b;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                com.google.gson.k kVarI2 = ((com.google.gson.i) it.next()).i();
                arrayList4.add(new AdvertParameters.Group(kVarI2.D("title").s(), a(kVarI2.E("values"), gVar)));
            }
            list = arrayList4;
        }
        com.google.gson.i iVarD = kVarI.D("flatTitle");
        AttributedText attributedText = (AttributedText) (iVarD == null ? null : gVar.b(iVarD, AttributedText.class));
        com.google.gson.i iVarD2 = kVarI.D(ServiceTransportationWidget.DisclaimerField.TYPE);
        AttributedText attributedText2 = (AttributedText) (iVarD2 == null ? null : gVar.b(iVarD2, AttributedText.class));
        com.google.gson.i iVarD3 = kVarI.D("equipments");
        AdvertEquipments advertEquipments = (AdvertEquipments) (iVarD3 == null ? null : gVar.b(iVarD3, AdvertEquipments.class));
        com.google.gson.i iVarD4 = kVarI.D("priceList");
        PriceList priceList = (PriceList) (iVarD4 == null ? null : gVar.b(iVarD4, PriceList.class));
        com.google.gson.i iVarD5 = kVarI.D("priceListPreview");
        AdvertPriceListPreviewResponse advertPriceListPreviewResponse = (AdvertPriceListPreviewResponse) (iVarD5 == null ? null : gVar.b(iVarD5, AdvertPriceListPreviewResponse.class));
        com.google.gson.i iVarD6 = kVarI.D("serviceEducation");
        ServiceEducation serviceEducation = (ServiceEducation) (iVarD6 == null ? null : gVar.b(iVarD6, ServiceEducation.class));
        com.google.gson.f fVarE3 = kVarI.E("workingConditions");
        if (fVarE3 == null) {
            arrayList2 = null;
        } else {
            int size2 = fVarE3.f362000b.size();
            ArrayList arrayList5 = new ArrayList(size2);
            while (i12 < size2) {
                com.google.gson.i iVarW2 = fVarE3.w(i12);
                int iC3 = com.avito.android.authorization.auto_recovery.phone_confirm.b.c(gVar, iVarW2 != null ? iVarW2.i() : null, AdvertParameters.WorkingCondition.class, arrayList5, i12, 1);
                size2 = size2;
                arrayList5 = arrayList5;
                i12 = iC3;
            }
            arrayList2 = arrayList5;
        }
        com.google.gson.i iVarD7 = kVarI.D("expandButton");
        return new AdvertParameters(listA, list, arrayList, attributedText, attributedText2, advertEquipments, priceList, serviceEducation, advertPriceListPreviewResponse, (ExpandItemsButton) (iVarD7 != null ? gVar.b(iVarD7, ExpandItemsButton.class) : null), arrayList2);
    }
}
