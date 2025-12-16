package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.CallOrderItemModel;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.ImageGalleryItemModel;
import com.avito.android.remote.model.ImageV2GalleryItemModel;
import com.avito.android.remote.model.MessengerItemModel;
import com.avito.android.remote.model.PhoneItemModel;
import com.avito.android.remote.model.SellerInfoItemModel;
import com.avito.android.remote.model.VideoGalleryItemModel;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.C2;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorAdvertGalleryItemDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ConstructorAdvertGalleryItemDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConstructorAdvertGalleryItemDeserializer implements com.google.gson.h<ConstructorAdvertGalleryItemModel> {
    @Override // com.google.gson.h
    public final ConstructorAdvertGalleryItemModel deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.i iVarD;
        com.google.gson.i iVarD2;
        com.google.gson.i iVarD3;
        com.google.gson.i iVarD4;
        com.google.gson.i iVarD5;
        com.google.gson.i iVarD6;
        com.google.gson.k kVarI = iVar.i();
        String strC = C2.c(kVarI, "type");
        if (strC == null) {
            return null;
        }
        switch (strC.hashCode()) {
            case -1436108013:
                if (strC.equals(NotificationsSettings.Section.SECTION_MESSENGER) && (iVarD = kVarI.D("value")) != null) {
                    return (MessengerItemModel) gVar.b(iVarD, MessengerItemModel.class);
                }
                return null;
            case -1060903024:
                if (strC.equals("callOrder") && (iVarD2 = kVarI.D("value")) != null) {
                    return (CallOrderItemModel) gVar.b(iVarD2, CallOrderItemModel.class);
                }
                return null;
            case -878156577:
                if (strC.equals("imageURLs") && (iVarD3 = kVarI.D("value")) != null) {
                    return (ImageV2GalleryItemModel) gVar.b(iVarD3, ImageV2GalleryItemModel.class);
                }
                return null;
            case 100313435:
                if (!strC.equals("image")) {
                    return null;
                }
                com.google.gson.i iVarD7 = kVarI.D("value");
                return new ImageGalleryItemModel(iVarD7 != null ? (DimmedImage) gVar.b(iVarD7, DimmedImage.class) : null);
            case 106642798:
                if (strC.equals("phone") && (iVarD4 = kVarI.D("value")) != null) {
                    return (PhoneItemModel) gVar.b(iVarD4, PhoneItemModel.class);
                }
                return null;
            case 112202875:
                if (strC.equals("video") && (iVarD5 = kVarI.D("value")) != null) {
                    return (VideoGalleryItemModel) gVar.b(iVarD5, VideoGalleryItemModel.class);
                }
                return null;
            case 316690637:
                if (strC.equals("sellerInfo") && (iVarD6 = kVarI.D("value")) != null) {
                    return (SellerInfoItemModel) gVar.b(iVarD6, SellerInfoItemModel.class);
                }
                return null;
            default:
                return null;
        }
    }
}
