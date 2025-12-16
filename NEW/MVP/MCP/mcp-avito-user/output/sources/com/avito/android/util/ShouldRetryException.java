package com.avito.android.util;

import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;

/* compiled from: ShouldRetryException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/ShouldRetryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShouldRetryException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TypedResult<?> f318735b;

    public ShouldRetryException(@Y61.k TypedResult<?> typedResult) {
        this.f318735b = typedResult;
    }
}
