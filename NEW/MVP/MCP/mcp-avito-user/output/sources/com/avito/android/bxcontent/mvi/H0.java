package com.avito.android.bxcontent.mvi;

import com.avito.android.remote.model.BxContentResult;
import com.avito.android.remote.model.HeaderElement;
import com.avito.android.remote.model.TypedResult;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BxContentInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_serp_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class H0 {
    public static final TypedResult.Success a(TypedResult.Success success, String str, String str2) {
        if (((BxContentResult) success.getResult()).getItems().isEmpty()) {
            return success;
        }
        return success.copy(BxContentResult.copy$default((BxContentResult) success.getResult(), C42745f0.h0(((BxContentResult) success.getResult()).getItems(), Collections.singletonList(new HeaderElement(str, str2 != null ? Collections.singletonList(str2) : null))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, -2, 7, null));
    }
}
