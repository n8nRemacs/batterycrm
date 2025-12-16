package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.StsRecognitionResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StsRecognitionDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/StsRecognitionDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/StsRecognitionResult$Ok;", "<init>", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StsRecognitionDeserializer implements com.google.gson.h<StsRecognitionResult.Ok> {
    @Override // com.google.gson.h
    public final StsRecognitionResult.Ok deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return new StsRecognitionResult.Ok((CategoryParameters) gVar.b(iVar, CategoryParameters.class));
    }
}
