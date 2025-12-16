package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.CallOrderItemModel;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.ImageGalleryItemModel;
import com.avito.android.remote.model.MessengerItemModel;
import com.avito.android.remote.model.PhoneItemModel;
import com.avito.android.remote.model.SellerInfoItemModel;
import com.avito.android.remote.model.VideoGalleryItemModel;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.C2;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.Metadata;

/* compiled from: ConstructorAdvertGalleryItemAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ConstructorAdvertGalleryItemTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConstructorAdvertGalleryItemTypeAdapter extends TypeAdapter<ConstructorAdvertGalleryItemModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f254169a;

    public ConstructorAdvertGalleryItemTypeAdapter(@Y61.k Gson gson) {
        this.f254169a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ConstructorAdvertGalleryItemModel read(com.google.gson.stream.a aVar) {
        com.google.gson.i iVarD;
        com.google.gson.i iVarD2;
        com.google.gson.i iVarD3;
        com.google.gson.i iVarD4;
        com.google.gson.i iVarD5;
        com.google.gson.k kVarI = com.google.gson.internal.C.a(aVar).i();
        String strC = C2.c(kVarI, "type");
        if (strC == null) {
            return null;
        }
        int iHashCode = strC.hashCode();
        Gson gson = this.f254169a;
        switch (iHashCode) {
            case -1436108013:
                if (strC.equals(NotificationsSettings.Section.SECTION_MESSENGER) && (iVarD = kVarI.D("value")) != null) {
                    return (MessengerItemModel) gson.g(MessengerItemModel.class).fromJsonTree(iVarD);
                }
                return null;
            case -1060903024:
                if (strC.equals("callOrder") && (iVarD2 = kVarI.D("value")) != null) {
                    return (CallOrderItemModel) gson.g(CallOrderItemModel.class).fromJsonTree(iVarD2);
                }
                return null;
            case 100313435:
                if (!strC.equals("image")) {
                    return null;
                }
                com.google.gson.i iVarD6 = kVarI.D("value");
                return new ImageGalleryItemModel(iVarD6 != null ? (DimmedImage) gson.g(DimmedImage.class).fromJsonTree(iVarD6) : null);
            case 106642798:
                if (strC.equals("phone") && (iVarD3 = kVarI.D("value")) != null) {
                    return (PhoneItemModel) gson.g(PhoneItemModel.class).fromJsonTree(iVarD3);
                }
                return null;
            case 112202875:
                if (strC.equals("video") && (iVarD4 = kVarI.D("value")) != null) {
                    return (VideoGalleryItemModel) gson.g(VideoGalleryItemModel.class).fromJsonTree(iVarD4);
                }
                return null;
            case 316690637:
                if (strC.equals("sellerInfo") && (iVarD5 = kVarI.D("value")) != null) {
                    return (SellerInfoItemModel) gson.g(SellerInfoItemModel.class).fromJsonTree(iVarD5);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, ConstructorAdvertGalleryItemModel constructorAdvertGalleryItemModel) {
        throw new UnsupportedOperationException();
    }
}
