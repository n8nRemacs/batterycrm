package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageUploadResult;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ImageUploadResultsDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ImageUploadResultsDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ImageUploadResult;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageUploadResultsDeserializer implements com.google.gson.h<ImageUploadResult> {
    @Override // com.google.gson.h
    public final ImageUploadResult deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        Map.Entry entry = (Map.Entry) C42745f0.D(iVar.i().f362194b.entrySet());
        if (entry != null) {
            return new ImageUploadResult((String) entry.getKey(), (Image) gVar.b((com.google.gson.i) entry.getValue(), Image.class), null, 4, null);
        }
        return null;
    }
}
