package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.ContactAccessService;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: ContactAccessServiceServiceDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ContactAccessServiceServiceDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ContactAccessService$Service;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactAccessServiceServiceDeserializer implements com.google.gson.h<ContactAccessService.Service> {
    @Override // com.google.gson.h
    public final ContactAccessService.Service deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.k kVarI2 = kVarI.D("value").i();
        String strS = kVarI2.D("id").s();
        String strS2 = kVarI2.D("title").s();
        String strS3 = kVarI2.D("price").s();
        int iG2 = kVarI2.D("priceValue").g();
        String strS4 = kVarI.D("title").s();
        com.google.gson.i iVarD = kVarI.D("subtitle");
        String strE = iVarD != null ? C34328m0.e(iVarD) : null;
        com.google.gson.i iVarD2 = kVarI2.D("size");
        return new ContactAccessService.Service(strS, strS2, strS3, iG2, strS4, strE, iVarD2 != null ? C34328m0.b(iVarD2) : null);
    }
}
