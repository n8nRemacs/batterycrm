package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.AdvertReport;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.text.AttributedText;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertReportDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertReportDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/AdvertReport;", "<init>", "()V", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertReportDeserializer implements com.google.gson.h<AdvertReport> {
    @Override // com.google.gson.h
    public final AdvertReport deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        ArrayList arrayList;
        com.google.gson.i iVarD;
        com.google.gson.i iVarD2;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD3 = kVarI.D("reportInfo");
        com.google.gson.k kVarI2 = iVarD3 != null ? iVarD3.i() : null;
        com.google.gson.i iVarD4 = kVarI.D("title");
        String strS = iVarD4 != null ? iVarD4.s() : null;
        com.google.gson.i iVarD5 = kVarI.D("header");
        String strS2 = iVarD5 != null ? iVarD5.s() : null;
        String strS3 = (kVarI2 == null || (iVarD2 = kVarI2.D("requisite")) == null) ? null : iVarD2.s();
        String strS4 = (kVarI2 == null || (iVarD = kVarI2.D("status")) == null) ? null : iVarD.s();
        com.google.gson.i iVarD6 = kVarI.D("date");
        String strS5 = iVarD6 != null ? iVarD6.s() : null;
        com.google.gson.i iVarD7 = kVarI.D("legalInfo");
        AttributedText attributedText = (AttributedText) (iVarD7 == null ? null : gVar.b(iVarD7, AttributedText.class));
        com.google.gson.i iVarD8 = kVarI.D(Navigation.ATTRIBUTES);
        com.google.gson.f fVarH = iVarD8 != null ? iVarD8.h() : null;
        if (fVarH == null) {
            arrayList = null;
        } else {
            int size = fVarH.f362000b.size();
            arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                com.google.gson.k kVarI3 = fVarH.w(i12).i();
                com.google.gson.i iVarD9 = kVarI3.D("icon");
                String strS6 = iVarD9 != null ? iVarD9.s() : null;
                if (strS6 != null) {
                    com.google.gson.i iVarD10 = kVarI3.D("title");
                    String strS7 = iVarD10 != null ? iVarD10.s() : null;
                    if (strS7 != null) {
                        if (strS6.equals("OK")) {
                            arrayList.add(new AdvertReport.OkResult(strS7));
                        } else if (strS6.equals("WARN")) {
                            arrayList.add(new AdvertReport.WarnResult(strS7));
                        }
                    }
                }
            }
        }
        return new AdvertReport(strS, strS2, strS3, strS4, strS5, attributedText, arrayList);
    }
}
