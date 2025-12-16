package com.avito.android.util;

import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import kotlin.Metadata;

/* compiled from: ParametersListChangePayloadCreator.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_publish-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B3 {
    public static final boolean a(TV0.a aVar) {
        if (aVar != null && (aVar instanceof com.avito.android.items.d)) {
            DisplayingOptions f117489n = ((com.avito.android.items.d) aVar).getF117489n();
            if (kotlin.jvm.internal.L.f(f117489n != null ? f117489n.getType() : null, "vehicleRegNumber")) {
                return true;
            }
        }
        return false;
    }
}
