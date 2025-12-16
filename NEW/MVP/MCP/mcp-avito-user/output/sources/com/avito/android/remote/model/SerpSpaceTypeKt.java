package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: SerpSpaceType.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"orDefault", "Lcom/avito/android/remote/model/SerpSpaceType;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class SerpSpaceTypeKt {
    @k
    public static final SerpSpaceType orDefault(@l SerpSpaceType serpSpaceType) {
        return serpSpaceType == null ? SerpSpaceType.Default : serpSpaceType;
    }
}
