package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.ExtendedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ImageUploadListWrapperDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ImageUploadListWrapperDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageUploadListWrapperDeserializer implements com.google.gson.h<PhotoParameter.ImageUploadListWrapper> {
    @Override // com.google.gson.h
    public final PhotoParameter.ImageUploadListWrapper deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        Iterable iterable = (Iterable) gVar.b(iVar, C.f254158a.getType());
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((ExtendedImage) obj).getId() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ExtendedImage extendedImage = (ExtendedImage) it.next();
            Image original = extendedImage.getOriginal();
            arrayList2.add(new ImageUploadResult(extendedImage.getId(), original != null ? new Image(P0.k(extendedImage.getImage().getVariants(), original.getVariants())) : extendedImage.getImage(), null, 4, null));
        }
        return new PhotoParameter.ImageUploadListWrapper(arrayList2);
    }
}
