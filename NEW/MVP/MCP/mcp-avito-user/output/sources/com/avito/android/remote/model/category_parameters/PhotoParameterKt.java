package com.avito.android.remote.model.category_parameters;

import Y61.l;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: PhotoParameter.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"maxPhotos", "", "Lcom/avito/android/remote/model/category_parameters/PhotoParameter;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class PhotoParameterKt {
    public static final int maxPhotos(@l PhotoParameter photoParameter) {
        if (photoParameter == null) {
            return 0;
        }
        return photoParameter.getMaxCount();
    }
}
