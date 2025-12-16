package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;

/* compiled from: CompositeException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/core/CompositeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CompositeException extends Exception {
    public CompositeException(@Y61.k String str, @Y61.k Throwable... thArr) {
        super(str, thArr.length == 0 ? null : thArr[0]);
    }
}
