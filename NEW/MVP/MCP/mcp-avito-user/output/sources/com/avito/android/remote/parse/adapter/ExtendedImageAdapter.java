package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.ExtendedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedImageAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ExtendedImageAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ExtendedImage;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedImageAdapter implements com.google.gson.h<ExtendedImage> {
    @Override // com.google.gson.h
    public final ExtendedImage deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("id");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            return new ExtendedImage(null, (Image) gVar.b(kVarI, Image.class), null, 4, null);
        }
        Image image = (Image) gVar.b(kVarI.D(ContextActionHandler.Link.URL), Image.class);
        com.google.gson.i iVarD2 = kVarI.D("original");
        return new ExtendedImage(strS, image, iVarD2 != null ? (Image) gVar.b(iVarD2, Image.class) : null);
    }
}
